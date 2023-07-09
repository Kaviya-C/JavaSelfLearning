package com.learn.corejava;

//Integer Float Short Boolean Character


// primitive values put inside an object is called wrapping or boxing

// fetching the object inside the primitive is called unboxing or unwrapping


public class WrapperDemo {
	public static void main(String...args) {
		int i=3;// primitive data types
		Integer value=new Integer(i);// boxing
		Float v=new Float(10.9); 
		int l=value.intValue(); // unboxing
		
		Integer o=i;// automatically it done autoboxing
		
		int k=value;//automatically done in backend then it is autounboxing

	    //primitives worker fast when compared to wrapper class
		
		// y wrapper class --- collection framework depend on wrapper class
	    
		String s="123";
		int n=Integer.parseInt(s);// parseInt  is static method present in Integer
	    System.out.println(n);
	}

}
