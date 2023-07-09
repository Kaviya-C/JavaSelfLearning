package com.learn.corejava;


interface Abc{
	 void show( );
}

public class InterfaceDemo {
	public static void main(String...args)
	{
		Abc obj=()->
		{
				System.out.println("Anonymous inner class in show method");
		
		};
		obj.show();
		
	}
}
