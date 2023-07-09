package com.learn.corejava;
import java.util.ArrayList;

// interface --- implements
// same as abstract class
// in abstract it contains both abstract and non-abstract methods
// in interface it contains only abstract public by default after
// 1.8  interface contains both abstract methods , default methods  static methods 
//we cannot create reference for interface not object

// we can achieve multiple inheritance through interface
// we cannot achieve multiple inheritance through classes
interface Writers{
	public  abstract void write();
	default void smooth() {
		
	}
	static void nice() {
		
	}
}

class Pens extends Pen implements Writers{
	public void write() {
		System.out.println("I m a pen");
	}
}

class Pencils extends Pencil implements Writers{
	public void write() {
		System.out.println("I m a pencil");
	}
	
}
class Kids
{
	public void doSomething(Writers p) 
	{
		p.write();	
	}
}

public class AbstractConclusion {
	public static void main(String...args) {
		Kids k=new Kids();
		k.doSomething(new Pens());
	}

}
