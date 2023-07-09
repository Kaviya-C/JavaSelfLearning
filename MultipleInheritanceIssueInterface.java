package com.learn.corejava;

interface Demos{
	void abc();
	default void show() {
		System.out.println("Default method in Demo");
	}
	
}
interface MyDemos{
	
	
	  default void show() { System.out.println("Default method in myDemo"); }
	 
	
}
class Implementation implements Demos,MyDemos{
	/*
	 * public void show() { System.out.println("own implementation show method"); }
	 */
	
	public void abc() {
		System.out.println("Implementation of abstract method abc()");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		MyDemos.super.show();
	}
}

public class MultipleInheritanceIssueInterface {
	public static void main(String...args) {
		Demos obj=new Implementation();
		obj.show();
		obj.abc();
		
	}

}
