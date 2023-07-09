package com.learn.corejava;


//Normal interface ---  contains  more than one abstract method
//functional interface --- single abstract method(contains only one abstract methods)
// marker interface --- it contains no methods   
// eg: marker --Serializable 

interface Abcd{
	void letter();
	// void newMethod();
}

public class TypesOfInterfaces {
	public static void main(String...args) {
		Abcd object= ()->System.out.println("Lambda letter method");
		object.letter();
	}
	

}
