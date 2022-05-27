package com.chainsys.miniproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.chainsys.miniproject.pojo.Appointment;

public class AppointmentDao {
	private static Connection getConnection() {
		String drivername = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "123";
		try {
			Class.forName(drivername);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	private static java.sql.Date convertTosqlDate(java.util.Date date) {
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		return sqldate;
	}

	public static int insertAppointment(Appointment newapp) {
		String insertquery = "insert into appointment (Appoiment_id,Appoiment_Date,DOC_ID,Patient_Name,Fees_Collected) values (?,?,?,?,?)";
		Connection con = null;
		int rows = 0;
//		int rows ;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(insertquery);
			ps.setInt(1, newapp.getAPPOIMENT_ID());
			// convert java.util.Date to java.sql.date
			ps.setDate(2, convertTosqlDate(newapp.getAPPOIMENT_DATE()));
			ps.setString(4, newapp.getPATIENT_NAME());
			ps.setInt(3, newapp.getDOC_ID());
			ps.setFloat(5, newapp.getFEES_COLLECTED());
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public static int updateAppointment(Appointment newapp) {
		String updatequery = "update Appointment set DOC_ID=?,Appoiment_Date=?,Patient_Name=?,Fees_Collected=? where Appoiment_id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setInt(5, newapp.getAPPOIMENT_ID());
			// convert java.util.Date to java.sql.date
			ps.setDate(2, convertTosqlDate(newapp.getAPPOIMENT_DATE()));
			ps.setString(3, newapp.getPATIENT_NAME());
			ps.setInt(1, newapp.getDOC_ID());
			ps.setFloat(4, newapp.getFEES_COLLECTED());
			ps.executeUpdate();
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return rows;
	}

	public static int deleteAppointment(int id) {
		String deletequery = "delete from Appointment where Appoiment_id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;

		try {
			con = getConnection();
			ps = con.prepareStatement(deletequery);
			ps.setInt(1, id);
			ps.executeUpdate();
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	public static Appointment getAppointmentById(int id) {
		Appointment app = null;
		String selectquery = "select Appoiment_id,Appoiment_Date,DOC_ID,Patient_Name,Fees_Collected from appointment where Appoiment_id=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setInt(1, id);
			rs = ps.executeQuery();

			if (rs.next()) {
				app = new Appointment();
				app.setAPPOIMENT_ID(rs.getInt(1));
				java.util.Date date = new java.util.Date(rs.getDate(2).getTime());
				app.setAPPOIMENT_DATE(date);
				app.setDOC_ID(rs.getInt(3));
				app.setPATIENT_NAME(rs.getString(4));
				app.setFEES_COLLECTED(rs.getFloat(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return app;
	}

	public static List<Appointment> getAllAppointment() {
		List<Appointment> listOfAppointments = new ArrayList<Appointment>();
		Appointment app = null;
		String selectquery = "select Appoiment_id,Appoiment_Date,DOC_ID,Patient_Name,Fees_Collected from appointment";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			rs = ps.executeQuery();

			while (rs.next()) {
				app = new Appointment();
				app.setAPPOIMENT_ID(rs.getInt(1));
				java.util.Date date = new java.util.Date(rs.getDate(2).getTime());
				app.setAPPOIMENT_DATE(date);
				app.setDOC_ID(rs.getInt(3));
				app.setPATIENT_NAME(rs.getString(4));
				app.setFEES_COLLECTED(rs.getFloat(5));
				listOfAppointments.add(app);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listOfAppointments;
	}

}
