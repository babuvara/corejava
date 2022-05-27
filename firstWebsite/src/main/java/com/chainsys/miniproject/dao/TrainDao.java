package com.chainsys.miniproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.chainsys.miniproject.pojo.Train;

public class TrainDao {
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

	// To insert new row to the table TRAIN
	public static int insertTRAIN(Train newtrain) {
		String insertquery = "insert into TRAIN(NAME,AGE,FROM_CITY,DESTINATION_CITY,JOURNY_DATE,PHONE_NO,TICKET_AMOUNT) values (?,?,?,?,?,?,?)";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(insertquery);
			ps.setString(1, newtrain.getName());
			ps.setInt(2, newtrain.getAge());
			ps.setString(3, newtrain.getFrom_city());
			ps.setString(4, newtrain.getDestination_city());
//			 convert java.util.Date to java.sql.date
			ps.setDate(5, convertTosqlDate(newtrain.getJourny_date()));
			ps.setLong(6, newtrain.getPhone_no());
			ps.setFloat(7, newtrain.getTicket_amount());

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

	// for updating all the columns of the table
	public static int updateTRAIN(Train newtrain) {
		String updatequery = "update TRAIN set AGE=?,FROM_CITY=?,DESTINATION_CITY=?,JOURNY_DATE=?,PHONE_NO=?,TICKET_AMOUNT=? where TRAIN_NAME=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setString(7, newtrain.getName());
			ps.setInt(1, newtrain.getAge());
			ps.setString(2, newtrain.getFrom_city());
			ps.setString(3, newtrain.getDestination_city());
			// convert java.util.Date to java.sql.date
			ps.setDate(4, convertTosqlDate(newtrain.getJourny_date()));
			ps.setLong(5, newtrain.getPhone_no());
			ps.setFloat(6, newtrain.getTicket_amount());

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
	public static int updateTRAINNAME(String NAME, int AGE) {
		String updatequery = "update TRAIN set AGE=? where NAME=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setString(1, NAME);
			ps.setInt(2, AGE);
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

	public static int updateTRAINTICKET_AMOUNT(String NAME, float TICKET_AMOUNT) {
		String updatequery = "update TRAIN set TICKET_AMOUNT=? where NAME=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setString(1, NAME);
			ps.setFloat(2, TICKET_AMOUNT);
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

	public static int deleteTRAIN(String NAME) {
		String deletequery = "delete from TRAIN where NAME=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;

		try {
			con = getConnection();
			ps = con.prepareStatement(deletequery);
			ps.setString(1, NAME);
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

	// To retrive specific TRAIN data using NAME
	public static Train getTRAINByNAME(String NAME) {
		Train tr = null;
		String selectquery = "NAME,AGE,FROM_CITY,DESTINATION_CITY,JOURNY_DATE,PHONE_NO,TICKET_AMOUNT  from TRAIN where NAME = ? ";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setString(1, NAME);
			rs = ps.executeQuery();
			tr = new Train();
			if (rs.next()) {
				tr.setName(rs.getString(1));
				tr.setAge(rs.getInt(2));
				tr.setFrom_city(rs.getString(3));
				tr.setDestination_city(rs.getString(4));
				java.util.Date date = new java.util.Date(rs.getDate(5).getTime());
				tr.setJourny_date(date);
				tr.setPhone_no(rs.getLong(6));
				tr.setTicket_amount(rs.getFloat(7));
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
		return tr;

	}

	// To retrieve all TRAIN data
	public static List<Train> getAllTRAIN() {
		List<Train> listOfTrain = new ArrayList<Train>();
		Train tr = null;
		String selectquery = "select NAME,AGE,FROM_CITY,DESTINATION_CITY,JOURNY_DATE,PHONE_NO,TICKET_AMOUNT  from TRAIN";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			rs = ps.executeQuery();
			tr = new Train();
			while (rs.next()) {
				tr = new Train();
				tr.setName(rs.getString(1));
				tr.setAge(rs.getInt(2));
				tr.setFrom_city(rs.getString(3));
				tr.setDestination_city(rs.getString(4));
				java.util.Date date = new java.util.Date(rs.getDate(5).getTime());
				tr.setJourny_date(date);
				tr.setPhone_no(rs.getLong(6));
				tr.setTicket_amount(rs.getFloat(7));
				listOfTrain.add(tr);
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
		return listOfTrain;
	}

}
