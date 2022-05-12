package com.threads;

public class h {

	public static void main(String[] args) {
		runningMultipleRunnableThreads();
		// multiThreadsonjoin();
	//	checkingStateofThreads();
	}

// runnable thread
	public static void runningMultipleRunnableThreads() {
		try {
			Thread t = Thread.currentThread();
			System.out.println("MainTh ID: " + t.getId());
			RunnableWorker firstWorker = new RunnableWorker();
			// RunnableWorker secondWorker = new RunnableWorker();
			Thread t1 = new Thread(firstWorker);
			// Thread t2 = new Thread(secondWorker);
			Thread t2 = new Thread(firstWorker);
			Thread t3 = new Thread(firstWorker);
			t1.start();// call run
			t2.start();// call run
			t3.start();// call run
			System.out.println("From Main--END!!!");
		} catch (Exception e) {
			System.out.println("ERROR!!! " + e.getMessage());
		}
	}

	public static void multiThreadsonjoin() {
		try {
			Thread t = Thread.currentThread();
			System.out.println("MainTh ID: " + t.getId());
			RunnableWorker firstWorker = new RunnableWorker();
			Thread t1 = new Thread(firstWorker);
			Thread t2 = new Thread(firstWorker);
			t1.start();// call run
			t2.start();// call run
			t1.join();
			t2.join();
			System.out.println("From Main--END!!!");
		} catch (Exception e) {
			System.out.println("ERROR!!! " + e.getMessage());
		}
	}

	public static void checkingStateofThreads() {
		RunnableWorker obj = new RunnableWorker();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		System.out.println(t1.getId() + " T1 State " + t1.getState());
		System.out.println(t2.getId() + " T2 State " + t2.getState());
		t1.start();
		t2.start();
		System.out.println("T1 State " + t1.getState());
		System.out.println("T2 State " + t2.getState());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("T1 State " + t1.getState());
		System.out.println("T2 State " + t2.getState());
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("T1 State " + t1.getState());
		System.out.println("T2 State " + t2.getState());
	}
}