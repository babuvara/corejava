package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

public class TestDoctor {
	public static void testgetAllDoctors() {
		List<Doctor> allDoctors = DoctorDao.getAllDoctor();
		Iterator<Doctor> docIterator = allDoctors.iterator();
		while (docIterator.hasNext()) {
			Doctor doc = docIterator.next();
			System.out.println(doc.getDOC_ID() + " " + doc.getDOC_NAME() + " " + doc.getDOB() + " "
					+ doc.getSPECIALITY() + " " + doc.getPHONE_NO() + " " + doc.getCITY() + " " + doc.getFEES());
		}
	}

	public static void testGetDoctorById() {
		Doctor doc = DoctorDao.getDoctorById(1);
		System.out.println(doc.getDOC_ID() + " " + doc.getDOC_NAME() + " " + doc.getDOB() + " " + doc.getSPECIALITY()
				+ " " + doc.getPHONE_NO() + " " + doc.getCITY() + " " + doc.getFEES());
	}

	public static void testInsertDoctor() {
		Doctor newdoc = new Doctor();
		newdoc.setDOC_ID(11);
		newdoc.setDOC_NAME("Sanjay");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newdate = c1.getTime();
		newdoc.setDOB(newdate);
		newdoc.setSPECIALITY("Heart Specilyst");
		newdoc.setPHONE_NO(97872345);
		newdoc.setCITY("Chennai");
		newdoc.setFEES(1400);
		int result = DoctorDao.insertDoctor(newdoc);
		System.out.println(result);
	}

	public static void testUpdateDoctor() {
		Doctor oldDoctor = DoctorDao.getDoctorById(1);
		System.out.println(oldDoctor.getDOC_ID() + " " + oldDoctor.getDOC_NAME() + " " + oldDoctor.getDOB() + " "
				+ oldDoctor.getSPECIALITY() + " " + oldDoctor.getPHONE_NO() + " " + oldDoctor.getCITY() + " "
				+ oldDoctor.getFEES());
		oldDoctor.setDOC_ID(1);
		oldDoctor.setDOC_NAME("Gokul");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		oldDoctor.setDOB(newDate);
		oldDoctor.setSPECIALITY("Brain");
		oldDoctor.setPHONE_NO(9877653);
		oldDoctor.setCITY("Madurai");
		oldDoctor.setFEES(2000);
		int result = DoctorDao.updateDoctor(oldDoctor);
		System.out.println(result);
	}

	public static void testDeleteDoctor() {
		int result = DoctorDao.deleteDoctor(11);
		System.out.println(result);
	}
}
