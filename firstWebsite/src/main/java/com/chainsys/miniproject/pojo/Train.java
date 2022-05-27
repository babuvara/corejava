package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Train {
	private String name;
	private int age;
	private String from_city;
	private String destination_city;
	private Date journy_date;
	private long phone_no;
	private float ticket_amount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFrom_city() {
		return from_city;
	}

	public void setFrom_city(String from_city) {
		this.from_city = from_city;
	}

	public String getDestination_city() {
		return destination_city;
	}

	public void setDestination_city(String destination_city) {
		this.destination_city = destination_city;
	}

	public Date getJourny_date() {
		return journy_date;
	}

	public void setJourny_date(Date journy_date) {
		this.journy_date = journy_date;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	public float getTicket_amount() {
		return ticket_amount;
	}

	public void setTicket_amount(float ticket_amount) {
		this.ticket_amount = ticket_amount;
	}
}
