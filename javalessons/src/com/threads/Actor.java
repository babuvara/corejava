package com.threads;

public class Actor {
	public String Name;
	public String city;
	public long pincode;

	public Actor() {
		Name = "default";
	}

	public Actor(String value) {
		Name = value;
	}

	public void printName() {
		System.out.println("\t printName " + Name);
	}

	public int getName(int x, int y, int z) {
		System.out.println("\t getName " + Name);
		return x + y + z;
	}

	public void printCity() {
		System.out.println(" printCity " + city);
	}
}