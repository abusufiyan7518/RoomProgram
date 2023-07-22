package com.multithreading;

class Multi extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		Multi t1 = new Multi();
		System.out.println("885");
		t1.start();
		System.out.println("Lucky Chhora");
	}
}