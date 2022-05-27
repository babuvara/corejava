package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointment;

public class TestAppointment {

	public static void testgetAllAppointments() {
		List<Appointment> allAppointment = AppointmentDao.getAllAppointment();
		Iterator<Appointment> appIterator = allAppointment.iterator();
		while (appIterator.hasNext()) {
			Appointment app = appIterator.next();
			System.out.println(app.getAPPOIMENT_ID() + " " + app.getAPPOIMENT_DATE() + " " + app.getDOC_ID() + " "
					+ app.getPATIENT_NAME() + " " + app.getFEES_COLLECTED());
		}
	}

	public static void testGetAppointmentsById() {
		Appointment app = AppointmentDao.getAppointmentById(100);
		System.out.println(app.getAPPOIMENT_ID() + " " + app.getAPPOIMENT_DATE() + " " + app.getDOC_ID() + " "
				+ app.getPATIENT_NAME() + " " + app.getFEES_COLLECTED());
	}

	public static void testInsertAppointment() {
		Appointment newapp = new Appointment();
		newapp.setAPPOIMENT_ID(103);
		Calendar c1 = Calendar.getInstance();
		java.util.Date newdate = c1.getTime();
		newapp.setAPPOIMENT_DATE(newdate);
		newapp.setDOC_ID(1);
		newapp.setPATIENT_NAME("Praveena");
		newapp.setFEES_COLLECTED(2000);
		int result = AppointmentDao.insertAppointment(newapp);
		System.out.println(result);
	}

	public static void testUpdateAppointment() {
		Appointment oldApp = AppointmentDao.getAppointmentById(100);
		System.out.println(oldApp.getAPPOIMENT_ID() + " " + oldApp.getAPPOIMENT_DATE() + " " + oldApp.getDOC_ID() + " "
				+ oldApp.getPATIENT_NAME() + " " + oldApp.getFEES_COLLECTED());
		oldApp.setAPPOIMENT_ID(101);
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		oldApp.setAPPOIMENT_DATE(newDate);
		oldApp.setDOC_ID(2);
		oldApp.setPATIENT_NAME("jerusa");
		oldApp.setFEES_COLLECTED(5000);
		int result = AppointmentDao.updateAppointment(oldApp);
		System.out.println(result);

	}

	public static void testDeleteAppointment() {
		int result = AppointmentDao.deleteAppointment(103);
		System.out.println(result);
	}
}
