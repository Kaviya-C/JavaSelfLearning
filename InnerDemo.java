package com.learn.corejava;

//member class---without static keyword
//static class ---with static keyword
//Anonymous class

class Outer{
	
	static int a;
	public static void show() {
		
	}
	static class Inner{
		public void display() {
			System.out.println("Display of INNER");
		}
	}
}



public class InnerDemo {
	public static void main(String...args) {
		
		Outer obj=new Outer();
		//obj.show();
		Outer.show();
		
		Outer.Inner obj2=new Outer.Inner();
		obj2.display();
		
	}

}
