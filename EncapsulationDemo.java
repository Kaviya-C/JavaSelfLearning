package com.learn.corejava;

//Encapsulation--- binding the data with methods
// y encapsulation --- data/ variable is safe
// bcoz variable is private.. if public mean anyone can accessed

//object knows something by variables
// object does something by methods

// bettern access the variable using methods
class Students{
	private int rollNo;
	private String name;
	
	// getter and setter
	public void setRollNo(int roll) {
		this.rollNo=roll;
	}
	public int getRollNo() {
		return rollNo;
	}	
	public void setName(String studName) {
		this.name=studName;
	}
	public String getName() {
	return name;	
	}
	
}
// s1.name="kaviya"
//s1.rollNo=001;

// its not good to assign values in  maint method 
// we have to access through only  methods 
// that is called setters getters method 

// if we accessed the date through members by methods make the 
// variable as private

// variable--private 

// method who will access those variables to be public
public class EncapsulationDemo {
	public static void main(String...args) {
		Students s=new Students();
		s.setRollNo(120);
		s.setName("Kaviya_C");
		System.out.println(s.getRollNo());
		System.out.println(s.getName());
		
	}

}