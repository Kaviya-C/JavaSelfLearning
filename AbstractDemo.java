package com.learn.corejava;
// i don't want to create object for others so make class as abstract
//then no one can instantiated that abstract class

// if a class contain abstract method mandatory to make that 
// class as abstract
// even though we can make class as abstract if we no one want to instantiated this class

// whenever we extend the abstract  class compulsory we should give definition for those abstract methods in the extended class

abstract class Human{
	
	public abstract void eat();
	public void walk() {
		
	}
}
class Man extends Human{
	
	public void eat() {
		System.out.println("Animal eating...!");
	}
	
	
}
public class AbstractDemo {
	public static  void main(String...args) {
		Human obj=new Man();
		obj.eat();
		obj.walk();
		
		
	}

}
