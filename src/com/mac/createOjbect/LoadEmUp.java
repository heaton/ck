package com.mac.createOjbect;

/**
 * Test the order of creating an object.
 * CreateDate: Dec 11, 2011
 * @author HeatoN
 */
public class LoadEmUp {

	private Parent _parent = new Parent();
	
	{System.out.println("Told you so");}
	
	static {
		System.out.println("Did too 1");
	}
	
	public LoadEmUp(){
		System.out.println("Did not");
		_parent = new Parent(this);
	}
	
	static {
		System.out.println("Did too 2");
	}

	public static void main(String[] args) {
		new LoadEmUp();
		System.out.println("Did too 3");
		Parent referee = new Parent();
	}

}
