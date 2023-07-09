package com.learn.corejava;

abstract class Writer{
	public void write() {
		System.out.println("Write both pen and pencil");
	}
	public abstract void erase();
	public abstract void darkColor();
	 
	
	
}

class Pen extends Writer{
	public void erase() {
		System.out.println("we can't erase the word if we use pen");
	}
	public void darkColor() {
		System.out.println("I can Write in dark color");
	}
}
class Pencil extends Writer{
	public void erase() {
		System.out.println("i have erasing capability");
	}
	public void darkColor() {
		
	}
}


class Printer{
	public void show(Number i) {
		System.out.println(i);
	}
	/*
	 * public void show(Double d) { System.out.println(d); }
	 */
}


public class YAbstractClassNeed {
	public static void main(String...args) {
	   Printer p=new Printer();
	   p.show(1000000000);
	   Writer w=new Pencil();
	   w.erase();
	   w.write();
	   w.darkColor();
	   
	}

}
