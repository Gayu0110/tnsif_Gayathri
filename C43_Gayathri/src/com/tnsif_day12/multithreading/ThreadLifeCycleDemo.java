package com.tnsif_day12.multithreading;
import com.tnsif_day11.threadandmultithread.MyChildthread;
public class ThreadLifeCycleDemo {

public static void main(String args[]) {
	MyChildthread myThread=new MyChildthread();
	System.out.println("Before runable stage thread"+"is alive or not"+myThread.isAlive());
	myThread.start();
	try {
		Thread.sleep(4000);
	}
	catch(InterruptedException exp) {
		
	}
	
	
}

}
