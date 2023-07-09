package com.learn.corejava;


class Calci{
	int sum=0;
	public int add(int... b) {
		for(int index=0;index<b.length;index++) {
			sum+=b[index];
		}
		return sum;
	}
}


public class VarArgsDemo {
	public static void main(String...args) {
		Calci obj=new Calci();
		int result=obj.add(9,8,1,9);
		System.out.println(result);
	}

}
