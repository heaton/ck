package com.mac.thread.test;

public class MyRun implements Runnable {

	int num;

	public MyRun(int num){
		this.num=num;
	}

	@Override
	public void run() {
		try {
			MainTest.testFun(num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
