package com.chainsys.serveletevents;

import java.io.IOException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Environment implements ServletContextListener {
	  static String env = null;

	  public void contextInitialized(ServletContextEvent e) {
	    env = "Environment is ready to provide service";
	    System.out.println(env);
	  }
	  public void contextDestroyed(ServletContextEvent e) {
	    env = "Sorry, Environment is not ready to provide service";
	    System.out.println(env);
	  }
	  public static String getStatus() {
	    return env;
	  }
	}