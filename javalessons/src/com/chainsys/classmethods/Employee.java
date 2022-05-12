package com.chainsys.classmethods;
/**
 * This is a class that contains employee related data
 * @author babu3107
 * the person has id,name,city,and salary properties
 * created on:25 march 2022
 */
public class Employee
 {
private int empID = 0;
private String name;
private long salary;
private String city;
public String Name;
//constructer
	public void setName(String name) {
		this.name=name;	
	}//assigning value to read only field
	public String getName() {
		return name;
	}

	public void setEmpId(int id) {
		this.empID=id;	
	}
public int getEmpID() {
	return empID;
}

public void setCity(String city) {
	this.city=city;
}
public String getCity() {
	return city;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary=salary;
}
}
