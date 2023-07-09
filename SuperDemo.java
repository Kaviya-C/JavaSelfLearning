package com.learn.corejava;

class A{
	public A() {
		System.out.println("A constructor");
	}
	public A(int a) {
		System.out.println("A Parametrized constructor "+a);
	}
}
class B extends A{
	public B() {
		//super()--- every construcor first statment to be 
		//super() or this()
		// super()  meant for parent class constructor
		System.out.println("B constructor");
	}
	public B(int a,int b) {
		System.out.println("B int a int b 2 parameterized constructor "+a+" "+b);
	}
	public B(int i) {
		//super(8);
		this();
		System.out.println("B parameterized constructor " +i);
	}
	
}
public class SuperDemo {
public static void main(String...args) {
	//A a=new A();
	B b =new B(9);
}
}
