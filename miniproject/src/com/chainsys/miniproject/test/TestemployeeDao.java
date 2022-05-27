package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class TestemployeeDao {

	public static void testgetAllEmployees() {
		List<Employee> allemployees = EmployeeDao.getAllEmployee();
		Iterator<Employee> empIterator = allemployees.iterator();
		while (empIterator.hasNext()) {
			Employee emp = empIterator.next();
			System.out.println(emp.getEmp_ID() + " " + emp.getFirst_name() + " " + emp.getLast_name() + " "
					+ emp.getEmail() + " " + emp.getHire_date() + " " + emp.getJob_id() + " " + emp.getSalary());
		}
	}

	public static void testGetEmployeeById() {
		Employee emp = EmployeeDao.getEmployeeById(100);
		System.out.println(emp.getEmp_ID() + " " + emp.getFirst_name() + " " + emp.getLast_name() + " " + emp.getEmail()
				+ " " + emp.getHire_date() + " " + emp.getJob_id() + " " + emp.getSalary());
	}

	public static void testInsertEmployees() {
		Employee newemp = new Employee();
		newemp.setEmp_ID(300);
		newemp.setFirst_name("Mom");
		newemp.setLast_name("Dad");
		newemp.setEmail("mom@123.com");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newdate = c1.getTime();
		newemp.setHire_date(newdate);
		newemp.setJob_id("IT_PROG");
		newemp.setSalary(220000);
		int result = EmployeeDao.insertEmployee(newemp);
		System.out.println(result);
	}

	public static void testUpdateEmployee() {
		Employee oldEmployee = EmployeeDao.getEmployeeById(126);
		System.out.println(oldEmployee.getEmp_ID() + " " + oldEmployee.getFirst_name() + " " + oldEmployee.getSalary());
		oldEmployee.setFirst_name("Gokul");
		oldEmployee.setLast_name("Prasanth");
		oldEmployee.setEmail("Gokul@mail.com");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		oldEmployee.setHire_date(newDate);
		oldEmployee.setJob_id("IT_PROG");
		oldEmployee.setSalary(330000);
		int result = EmployeeDao.updateEmployee(oldEmployee);
		System.out.println(result);

	}

	public static void testDeleteEmployee() {
		int result = EmployeeDao.deleteEmployee(126);
		System.out.println(result);
	}
}
