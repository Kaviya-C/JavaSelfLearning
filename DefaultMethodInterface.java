package com.learn.corejava;
// Interface after 1.7  we can define methods inside interface
@FunctionalInterface  //-- contain one abstract and any number of default method
interface Demo{
	void abc();
	default void show() {
		System.out.println("show method");
	}
}
interface MyDemo{
	
}
public interface DefaultMethodInterface {
  public static void main(String...args) {
	  Demo obj=new Demo(){
		  public void show() {
			  System.out.println("show method inside main");
		  }
		  public void abc() {
			  System.out.println("Abc method");
		  }
	  };
	  obj.show();
	  obj.abc();
  }
}
