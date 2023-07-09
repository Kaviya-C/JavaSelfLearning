package com.learn.corejava;
//in java we are not achieved multiple inheritance by using class
// below example are single level inheritance
// extends is a relationship

//

class Cal{//super class parent base
	public int  add(int a,int b) {
		
		return a+b;
	}
}
class AdvCalc extends Cal{//subclass child derived
	public int mul(int a,int b) {
		
		return a*b;
	}
}

class ScientificCalc extends AdvCalc{// multilevel inheritance
	public int div(int a,int b) {
		return a/b;
	}
}

public class InnheritanceDemo {
	public static void main(String...args) {
		//Cal obj=new Cal();
		//obj.add(1, 9);
		ScientificCalc obj=new ScientificCalc();
		int addition=obj.add(10, 10);
		int multiplication=obj.mul(2, 2);
		int division=obj.div(addition, multiplication);
		System.out.println(addition);
		System.out.println(multiplication);
		System.out.println(division);
	}

}
