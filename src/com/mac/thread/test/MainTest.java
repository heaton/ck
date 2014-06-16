package com.mac.thread.test;

public class MainTest {

	public static int testFun(int in) throws InterruptedException{
		int out = in;
		if(out!=2){
			Thread.sleep(300);
		}
		System.out.println(out);
		return out;
	}
	/**
	 * Test the field in function in a Thread whether to be changed by another Thread.
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRun(1));
		Thread t2 = new Thread(new MyRun(2));
		t1.start();
		t2.start();
	}

}
