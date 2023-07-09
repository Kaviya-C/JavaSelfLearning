package com.learn.corejava;

import com.kaviya.exception.StudentExampAccessModifiers;

// in java there is nothing like access specifiers
// only we have access modifiers in java

public class AccessModifiers {
  public static void main(String...args) {
	  StudentExampAccessModifiers s =new StudentExampAccessModifiers();
	  System.out.println(s.rollNo=10);
	  
  }
}

// default -- inside the packages
// variable as private ||  method as public then it is encapsulation
//private ---Specific class
//Default specific package
//public --- any package any class
// protected ---subsiding class extended class can acess the variables of protected
//---------------------------------------------------------------

// top level class modifiers are allowed: 
//  final abstract public default
// inner class modifiers are:
//  private protected static 

/*
 * final 
 * abstract
 *  private
 *  protected
 *  public
 * 
 */

