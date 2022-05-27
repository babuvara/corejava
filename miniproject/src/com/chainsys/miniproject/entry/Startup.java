package com.chainsys.miniproject.entry;

import com.chainsys.miniproject.ui.AppointmentUI;
import com.chainsys.miniproject.ui.DoctorUI;
import com.chainsys.miniproject.ui.EmployeeUi;

public class Startup {
	public static void main(String args[]) {
		loadMenu();

	}

	private static void loadMenu() {
		System.out.println("Enter Menu : 1 is EmployeeMenu, 2 is Doctor Menu, 3 is Appointment Menu ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				loadEmployeeMenu();
				break;
			case 2:
				loadDoctorMenu();
				break;
			case 3:
				loadAppointmentMenu();
				break;
			}
		} finally {
			sc.close();
		}
	}

	private static void loadEmployeeMenu() {
		System.out.println(
				"Enter Employee Method : 1=addNewEmployee, 2=updateFirstnameOfEmployee ,3=updateEmployee ,4=updateSalaryOfEmployee, 5=fetchEmployeeById, 6=deleteEmployee, 7=fetchAllEmployee");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int call = sc.nextInt();

			switch (call) {
			case 1:
				EmployeeUi.addNewEmployee();
				break;
			case 2:
				EmployeeUi.updateFirstnameOfEmployee();
				break;
			case 3:
				EmployeeUi.UpdateEmployee();
				break;
			case 4:
				EmployeeUi.updateSalaryOfEmployee();
				break;
			case 5:
				EmployeeUi.fetchEmployeeById();
				break;
			case 6:
				EmployeeUi.deleteEmployee();
				break;
			case 7:
				EmployeeUi.fetchAllEmployee();
				break;
			}
		} finally {
			sc.close();
		}
	}

	private static void loadDoctorMenu() {
		System.out.println(
				"Enter Doctor Method : 1=addNewDoctorInformation ,2=updateDoctor ,3=deleteDoctor ,4=getDoctorById, 5=getAllDoctorDetails");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				DoctorUI.addNewDoctorInformation();
				break;
			case 2:
				DoctorUI.updateDoctor();
				break;
			case 3:
				DoctorUI.deleteDoctor();
				break;
			case 4:
				DoctorUI.getDoctorById();
				break;
			case 5:
				DoctorUI.getAllDoctorDetails();
				break;
			}
		} finally {
			sc.close();
		}
	}

	private static void loadAppointmentMenu() {
		System.out.println(
				"Enter Method : 1=addNewAppointments ,2=updateAppointment ,3=deleteAppointment ,4=getAppointmentById ,5=getAllAppointmentDetails ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				AppointmentUI.addNewAppointments();
				break;
			case 2:
				AppointmentUI.updateAppointment();
				break;
			case 3:
				AppointmentUI.deleteAppointment();
				break;
			case 4:
				AppointmentUI.getAppointmentById();
				break;
			case 5:
				AppointmentUI.getAllAppointmentDetails();
				break;
			default:
			}
		} finally {
			sc.close();
		}
	}

}
