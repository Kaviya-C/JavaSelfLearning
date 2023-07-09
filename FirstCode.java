package com.learn.corejava;

class Calculator{// blueprint
	
	
	int num1;
	int num2;
	int result;
	Calculator(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
		
	}
	
	public void perform()
	{
		System.out.println("Perform action");
	}
	
	
	
}
public class FirstCode {
	public static void main(String...args) {
		Calculator obj=new Calculator((int) 10.0,9);
		System.out.println(obj.num1+" "+obj.num2);
		
	}
}
//object knows something and does something
//class defines the  structure of an object
//object what object does?what object knows need class 
//variables--->containers
//source file-Compiler-Bytecode-(JVM inside bytecode run )
 