package edu.lessons.day61.collections;

import java.util.Set;
import java.util.Iterator;
import java.util.*;

class DictionaryPropDemo {
	public static void main(String args[]) {

		Properties capitals = new Properties();
		Set<Object> states;
		String str;
		capitals.put("Illinois", "Springfield");
		capitals.put("Florida", "Tallahassee");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");
		states = capitals.keySet();
		Iterator<Object> itr = states.iterator();
		while (itr.hasNext()) {
			str = (String) itr.next();
			System.out.println("The capital of " + str + " is " + capitals.getProperty(str) + ".");
		}

	}
}