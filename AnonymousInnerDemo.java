package com.learn.corejava;

// anonymous inner class does not have name
// we can create anonymous inner class while creating an object
// and use open close bracket ends with semicolon
class Top{
	public void show() {
		System.out.println("top show method");
	}
}
//class 
public class AnonymousInnerDemo {
	public static void main(String...args) {
		Top t=new Top() 
		{
			public void show() 
			{
				System.out.println("I am the best");
			}
		};
		t.show();
	}

}
