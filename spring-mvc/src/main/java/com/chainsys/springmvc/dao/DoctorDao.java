package com.chainsys.springmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.springmvc.pojo.Doctor;

import java.sql.PreparedStatement;

public class DoctorDao {

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

	public static int insertDoctor(Doctor newdoc) {
		String insertquery = "insert into doctor(DOCTOR_ID,DOCTOR_NAME,DOB,SPECIALITY,CITY,PHONE_NO,STANDARD_FEES) values (?,?,?,?,?,?,?)";
		Connection con = null;
		int rows = 0;
//			int rows ;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(insertquery);
			ps.setInt(1, newdoc.getDoctor_id());
			ps.setString(2, newdoc.getDoctor_name());
			// convert java.util.Date to java.sql.date
			ps.setDate(3, convertTosqlDate(newdoc.getDob()));
			ps.setString(4, newdoc.getSpeciality());
			ps.setString(5, newdoc.getCity());
			ps.setLong(6, newdoc.getPhone_no());
			ps.setFloat(7, newdoc.getStandard_fees());

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

	public static int updateDoctor(Doctor newdoc) {
		String updatequery = "update doctor set DOCTOR_NAME=?,DOB=?,SPECIALITY=?,CITY=?,PHONE_NO=?,STANDARD_FEES=? where DOCTOR_ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setInt(7, newdoc.getDoctor_id());
			ps.setString(1, newdoc.getDoctor_name());
			// convert java.util.Date to java.sql.date
			ps.setDate(2, convertTosqlDate(newdoc.getDob()));
			ps.setString(3, newdoc.getSpeciality());
			ps.setString(4, newdoc.getCity());
			ps.setLong(5, newdoc.getPhone_no());
			ps.setFloat(6, newdoc.getStandard_fees());
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

	// to update only one column of the table
	public static int updateDoctorFirstName(int id, String docname) {
		String updatequery = "update doctor set DOC_NAME=? where DOC_id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setString(1, docname);
			ps.setInt(2, id);
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

	public static int updateDoctorSalary(int id, float fees) {
		String updatequery = "update doctor set fees=? where doc_id=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setDouble(1, fees);
			ps.setInt(2, id);
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

	public static int deleteDoctor(int id) {
		String deletequery = "delete from doctor where DOCTOR_ID=?";
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

	public static Doctor getDoctorById(int id) {
		Doctor doc = null;
		String selectquery = "select  DOCTOR_ID,DOCTOR_NAME,DOB,SPECIALITY,CITY,PHONE_NO,STANDARD_FEES from doctor where DOCTOR_ID=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			doc = new Doctor();
			if (rs.next()) {
				doc.setDoctor_id(rs.getInt(1));
				doc.setDoctor_name(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				doc.setDob(date);
				doc.setSpeciality(rs.getString(4));
				doc.setCity(rs.getString(5));
				doc.setPhone_no(rs.getLong(6));
				doc.setStandard_fees(rs.getFloat(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			}catch(SQLException e)
			{
				e.printStackTrace();
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
		return doc;

	}

	public static List<Doctor> getAllDoctor() {
		List<Doctor> listOfDoctor = new ArrayList<Doctor>();
		Doctor doc = null;
		String selectquery = "select DOCTOR_ID,DOCTOR_NAME,DOB,SPECIALITY,CITY,PHONE_NO,STANDARD_FEES  from Doctor ";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			rs = ps.executeQuery();
			doc = new Doctor();
			while (rs.next()) {
				doc = new Doctor();
				doc.setDoctor_id(rs.getInt(1));
				doc.setDoctor_name(rs.getString(2));
				java.util.Date date = new java.util.Date(rs.getDate(3).getTime());
				doc.setDob(date);
				doc.setSpeciality(rs.getString(4));
				doc.setCity(rs.getString(5));
				doc.setPhone_no(rs.getLong(6));
				doc.setStandard_fees(rs.getFloat(7));
				listOfDoctor.add(doc);
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
		return listOfDoctor;
	}

}
