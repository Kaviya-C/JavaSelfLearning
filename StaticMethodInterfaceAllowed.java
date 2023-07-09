package com.learn.corejava;

// in interface inside variable everything by default is final
interface Samp{
	int value=10;// by default it is final
	void abc();
	static void show() {
		System.out.println("Static method allowed in interface");
	}
}
class SampImp implements Samp{
	public void abc() {
		//value=3;
		System.out.println("abc method");
	}
}
public class StaticMethodInterfaceAllowed {
   public static void main(String...args) {
	   Samp.show();
   }
}
