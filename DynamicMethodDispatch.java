package com.learn.corejava;

class Parent{
	public void show() {
		System.out.println("Parent show method");
	}
	
}
class Child extends Parent{
	public void show() {
		System.out.println("child show method");
	}
	/*
	 * public void config() { System.out.println("Config child method"); }
	 */
}

class GrandChild extends Parent{
	
	public void show() {
		System.out.println("Grand child show method");
	}
}
public class DynamicMethodDispatch {
	public static void main(String...args) {
		
		//compile time
		// runtime polymorphism
	
		Parent obj=new Child();
		// show method decided by runtime   so these 
		// RUNTIME POLYMORPHISM
		// assign the object Runtime
		obj.show();
		
		obj=new GrandChild();
		obj.show();//DYNAMIC METHOD DISPATCH
		
		
// method overriding----  runtime polymorphism
		
// achieve dynamic method dispatch  need runtime ploymosphism	
		
// changing the object then changing the calling that is dynamic method dispatch		
	}

}
