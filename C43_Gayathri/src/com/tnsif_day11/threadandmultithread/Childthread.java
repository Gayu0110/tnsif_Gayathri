package com.tnsif_day11.threadandmultithread;

public class Childthread extends Thread{
	private int n;
	private String msg;
	
	//Constructor (2 Parameterized Constructor)
	public Childthread(int n, String msg) {
		this.n = n;
		this.msg = msg;
		
	}
	
	public void run() { //run() method
		for (int i = 1; i <= n; i++) {
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				System.err.println("Thread interrupted: "
			+e.getMessage());
			}
			System.out.println(msg + i + " " 
			+ Thread.currentThread().getName());
		}
	}
}
	


