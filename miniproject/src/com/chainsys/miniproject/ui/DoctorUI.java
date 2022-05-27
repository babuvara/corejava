package com.chainsys.miniproject.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.*;
import com.chainsys.miniproject.pojo.*;

public class DoctorUI {
	
	public static void addNewDoctorInformation() {
		try {
			Scanner sc = new Scanner(System.in);
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor ID : ");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();				
			}
			int docId = Integer.parseInt(id);
			newdoc.setDOC_ID(Integer.parseInt(id));
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();				
			}			
			newdoc.setDOC_ID(docId);
			System.out.println("Enter Doctor Name : ");
			String name = sc.nextLine();
			try {
				Validator.checkStringOnly(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();				
			}
			newdoc.setDOC_NAME(name);
			System.out.println("Enter  hire_date like \"dd/mm/yyyy\":");
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String doc_HireDate = sc.nextLine();
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);

			try {
				Validator.checkDateFormat(doc_HireDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			Date newDate = null;
			try {
				newDate = hire_dateFormate.parse(doc_HireDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			try {
				Validator.CheckNofutureDate(newDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}

			newdoc.setDOB(newDate);
			System.out.println("Enter Doctor Speciality : ");
			String sp = sc.nextLine();
			try {
				Validator.checkStringOnly(sp);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newdoc.setSPECIALITY(sp);			
			System.out.println("Enter Doctor City : ");
			String cy = sc.nextLine();
			try {
				Validator.checkStringOnly(cy);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newdoc.setCITY(cy);
			System.out.println("Enter Doctor Phone number : ");
			String phone=sc.nextLine();
			try {
				Validator.checklengthOfPhno(phone);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newdoc.setPHONE_NO(phone);
			System.out.println("Enter Doctor Standard fees : ");
			float fees = sc.nextFloat();
			try {
				Validator.checkfee(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			newdoc.setFEES(fees);
			int result = DoctorDao.insertDoctor(newdoc);
			System.out.println("Record added : " + result);
			sc.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static void updateDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			newdoc.setDOC_ID(Integer.parseInt(id));
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Doctor doc = DoctorDao.getDoctorById(docId);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDOC_ID(docId);
			System.out.println("Enter Update Name :");
			String name = sc.nextLine();
			try {
				Validator.checkStringOnly(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setDOC_NAME(name);
			System.out.println("Enter  hire_date like \"dd/mm/yyyy\":");
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String doc_HireDate = sc.nextLine();
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);

			try {
				Validator.checkDateFormat(doc_HireDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			Date newDate = null;
			try {
				newDate = hire_dateFormate.parse(doc_HireDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			try {
				Validator.CheckNofutureDate(newDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			newdoc.setDOB(newDate);
			System.out.println("Enter Update Speciality :");
			String sp = sc.nextLine();
			try {
				Validator.checkStringOnly(sp);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setSPECIALITY(sp);
			// newdoc.setSpeciality(sc.nextLine());
			System.out.println("Enter Update City :");
			String cy = sc.nextLine();
			try {
				Validator.checkStringOnly(cy);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setCITY(cy);
			System.out.println("Enter Update Phone_Number");
			String phone=sc.nextLine();
			
			try {
				Validator.checklengthOfPhno(phone);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setPHONE_NO(phone);
			System.out.println("Enter Update Standard_Fees :");
			float fees = sc.nextFloat();
			try {
				Validator.checkfee(fees);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setFEES(fees);
			int result = DoctorDao.updateDoctor(newdoc);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void updateDoctorFirstName() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			newdoc.setDOC_ID(Integer.parseInt(id));
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Doctor doc = DoctorDao.getDoctorById(docId);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDOC_ID(docId);
			System.out.println("Enter Update Name :");
			String name = sc.nextLine();
			try {
				Validator.checkStringOnly(name);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			newdoc.setDOC_NAME(name);
			int result = DoctorDao.updateDoctorFirstName(Integer.parseInt(id), name);
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	

	public static void deleteDoctor() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			newdoc.setDOC_ID(Integer.parseInt(id));
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Doctor doc = DoctorDao.getDoctorById(docId);

			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDOC_ID(docId);
			int result = DoctorDao.deleteDoctor(Integer.parseInt(id));
			System.out.println(result);
		} finally {
			sc.close();
		}
	}

	public static void getDoctorById() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			Doctor newdoc = new Doctor();
			System.out.println("Enter Doctor_Id :");
			String id = sc.nextLine();
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			int docId = Integer.parseInt(id);
			newdoc.setDOC_ID(Integer.parseInt(id));
			try {
				Validator.CheckNumberForGreaterThanZero(docId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
				return;
			}
			Doctor doc = DoctorDao.getDoctorById(docId);
			if (doc == null) {
				System.out.println("Doctor Doesn't Exist For Id " + docId);
				return;
			}
			newdoc.setDOC_ID(docId);
			Doctor result = DoctorDao.getDoctorById(Integer.parseInt(id));
			System.out.println(result.getDOC_ID() + " " + result.getDOC_NAME() + " " + result.getDOB() + " "
					+ result.getSPECIALITY() + " " + result.getCITY() + " " + result.getPHONE_NO() + " "
					+ result.getFEES());
		} finally {
			sc.close();
		}
	}

	public static void getAllDoctorDetails() {
		List<Doctor> allDoctor = DoctorDao.getAllDoctor();
		Iterator<Doctor> drIterator = allDoctor.iterator();
		while (drIterator.hasNext()) {
			Doctor dr = drIterator.next();
			System.out.println(dr.getDOC_ID() + " " + dr.getDOC_NAME() + " " + dr.getDOB() + " " + dr.getSPECIALITY()
					+ " " + dr.getCITY() + " " + dr.getPHONE_NO() + " " + dr.getFEES());
		}
	}
}