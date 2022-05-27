package com.chainsys.arrayslist;

import java.io.Serializable;

public class Emp implements Serializable {
	private final int Id;
	private String Name;

	public Emp(int v1, String sName) {
		Id = v1;
		setName(sName);
	}

	public int getId() {
		return Id;
	}

	@Override
	public boolean equals(Object obj) {
		Class c1 = obj.getClass();
		boolean flag = false;
		if (c1 == this.getClass()) {
			Emp other = (Emp) obj;
			if (this.hashCode() == other.hashCode())
				flag = true;
		}
		return flag;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	/* @Override
	public int hashCode() {
		return this.Id;
	}

	public void print() {

	}  */
}
