package com.learn.corejava;
//array is an indexed collection of homogenous element and fixed in size 
//we can accessed the array elements by using index number 
//we cannot expand the size i mean to say am not able to 
// increment or decrement the size of the array is not possible
class Student{
	
}
public class ArrayDemo {
	public static void main(String...args) {
		
		  Student s1=new Student(); Student s2=new Student(); Student s3=new Student();
		  
		  Student[] last={s1,s2,s3};;
		  
		  int[] arrray= {}; int[] arr=new int[4]; int[] a=new int[] {1,2,4,5,6};
		  //System.out.println(arr[2]); 
		  //System.out.println(a[5]); 
		  for(int element: a)
		  { System.out.print(element+" "); }
		 
		
		//2D Array:
		
		
		  //int[] a= {1,2,3,5}; 
		  int[] b= {2,3,4,6};
		  int[] c= {7,8,9,0};
		  
		  
		  int[][] dim2D= { a,b,c }; for(int[] index:dim2D) { for(int element:index) {
		  System.out.print(element+" "); } System.out.println(); }
		 
		
		
		
		//Jagged Array
		
		//int[][] jagged=new int[4][];
		//jagged[0]=new int[2];
		//jagged[1]=new int[4];
		//jagged[2]=new int[1];
		
		int[][] jagged={
						{1,2},
						{3,4,5,6},
						{0}
					};
		
		for(int[] index:jagged) {
			for(int element: index) {
				System.out.print(element+" ");
			}
			System.out.println();
		}
	}

}
