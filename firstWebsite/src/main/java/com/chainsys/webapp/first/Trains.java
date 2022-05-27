package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.dao.TrainDao;
import com.chainsys.miniproject.pojo.Employee;
import com.chainsys.miniproject.pojo.Train;

/**
 * Servlet implementation class Trains
 */
public class Trains extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Trains() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		List<Train> allTrain = TrainDao.getAllTRAIN();
		Iterator<Train> trIterator = allTrain.iterator();
		while (trIterator.hasNext()) {
			Train result = trIterator.next();
			pw.println("<hr/>");

			pw.println(result.getName() + "," + result.getAge() + "," + result.getFrom_city() + ","
					+ result.getDestination_city() + "," + result.getJourny_date() + "," + result.getPhone_no() + ","
					+ result.getTicket_amount() + "</p>");
		}

	}

	/**
	 * @param amt
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Train newtr = new Train();
		String name = request.getParameter("name");
		try {
			Validator.checkStringOnly(name);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}

		try {
			Validator.checkStringSpacesLength(name);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newtr.setName(name);
//		-------------------------
		String age = request.getParameter("age");
		try {
			Validator.checkStringForParse(age);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		int ageA = Integer.parseInt(age);
		try {
			Validator.CheckNumberForGreaterThanZero(ageA);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newtr.setAge(ageA);
		// --------------------------------------------
		String from = request.getParameter("sfrom");
		try {
			Validator.checkStringOnly(from);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}

		try {
			Validator.checkStringSpacesLength(from);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newtr.setFrom_city(from);
		// ------------------------------------------------
		String to = request.getParameter("sto");
		try {
			Validator.checkStringOnly(to);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}

		try {
			Validator.checkStringSpacesLength(to);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newtr.setDestination_city(to);
		// ----------------------------------------------------
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		String date = request.getParameter("date");
		try {
			Validator.checkDateFormat(date);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		Date newDate = null;
		try {
			newDate = dateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		newtr.setJourny_date(newDate);
		// ------------------------------------------------
		String phone = request.getParameter("phone");
		try {
			Validator.checkStringForParse(phone);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		try {
			Validator.checklengthOfPhno(phone);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		long phone1 = Long.parseLong(phone);

		newtr.setPhone_no(phone1);
		// --------------------------------------------------
		String amount = request.getParameter("amt");
		try {
			Validator.checkStringForParse(amount);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		int amount1 = Integer.parseInt(amount);
		try {
			Validator.CheckNumberForGreaterThanZero(amount1);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}

		newtr.setTicket_amount(amount1);
        int result=TrainDao.insertTRAIN(newtr);
		out.println(+ result + " row added");
	}
}
