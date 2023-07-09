package com.learn.corejava;

class Pa{
	int parentElement;
	public void show() {
		System.out.println("A show method "+parentElement);
	}
	
}
//child class method will override the parent class method
// that is called method overriding
class ch extends Pa{
	int element;
	public void show(int i) {
		System.out.println("Child Show method for parametrized "+i);
	}
	  @Override
	  public void show() 
	  
	  {
		  super.parentElement=19;
		  element=10;
		  this.show(10);
		  super.show();
		  System.out.println("B show method "+element); 
		  }
	 
	
}

public class MethodOverridingDemo {
	public static void main(String...args) {
		ch b=new ch();
		b.show();
		
	}

}
