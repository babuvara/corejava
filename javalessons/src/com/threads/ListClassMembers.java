package com.threads;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ListClassMembers {
	public static void main(String args[]) {

		String classname = "com.Threads.Actor";
		Class<?> actorclass = null;
		try {
			actorclass = Class.forName(classname); // Actor actorclass=null;
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		Object obj = null;
		try {
			// obj=actorclass.newInstance(); // new Actor();
			obj = actorclass.getDeclaredConstructors()[0].newInstance();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		printClassInfo(obj);
		// Class<Actor> actorclass = (Class<Actor>actor.getClass();
		// String firstString = "its August";
		// printClassInfo(firstString);
	}

	public static void printClassInfo(Object ob) {
		Class<?> classreflected = ob.getClass();
		System.out.println(classreflected.getName());
		System.out.println("Constructors:");
		Constructor<?> constructorlist[] = classreflected.getConstructors();
		for (int i = 0; i < constructorlist.length; i++) {
			System.out.println("\t" + constructorlist[i]);
		}
		//
		System.out.println("Methods:");
		Method methodlist[] = classreflected.getMethods();
		for (int i = 0; i < methodlist.length; i++) {
			methodlist[i].setAccessible(true);
			System.out.println("\t Method Name: " + methodlist[i].getName() + " ParameterCount "
					+ methodlist[i].getParameterCount() + " returnType " + methodlist[i].getReturnType());
		}
	}
	
}