package mavenproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Test {
	
	int[] arr1= {5,2,3,4,1};
	int[] arr2= new int[10];
	String[] arr3= {"a","b","c"};
	int[][] arr4=new int[2][2];
	
	
	public void arr1()
	{
	ArrayList<Integer> arr1=new ArrayList<Integer>();
	arr1.add(5);
	arr1.add(2);
	arr1.add(3);
	arr1.add(1);
	System.out.println(arr1);
	Collections.sort(arr1);
	System.out.println(arr1);
	int a=Collections.max(arr1);
	int b=Collections.min(arr1);
	System.out.println("Maximum value is"+" "+a);
	System.out.println("Minimum value is"+" "+b);
	for(int i:arr1)
	{
		
		System.out.println(i);
		if(i==3)
		{
			System.out.println("Hello");	
		}
	}
	}
	
	public void hashmap() {
		
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		hm1.put(5, "Rahul");
		hm1.put(2, "Faraz");
		hm1.put(2, "Shubham");
		hm1.put(1, "Shabd");
		System.out.println(hm1);
	
	}
	
	public void arr3()
	{
		System.out.println(Arrays.toString(arr1));
			
	}
	
	public static void test1()
	
	{
		System.out.println("Hello Java");
		
	}
	
	public void reverse()
	
	{
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string");
		String str=sc.nextLine();
		System.out.println("You have entered:"+" "+str);
		 String reversedStr = "";    
         
	        //Iterate through the string from last and add each character to variable reversedStr    
	        for(int i = str.length()-1; i >= 0; i--){    
	            reversedStr = reversedStr + str.charAt(i);    
	        }    
	            
	        System.out.println("Original string: " + str);    
	        //Displays the reverse of given string    
	        System.out.println("Reverse of given string: " + reversedStr);    
	    }   
	
	public void duplicate()
	{
		int count=0;
	String[] strArray= {"abc","def","efg","abc","def","ijk"};
	HashSet<String> hs=new HashSet<String>();
	for(String a:strArray)
	{
		if(!hs.add(a))
		{
			count=count+1;
			System.out.println("Duplicate element is"+a);
		
		}
		
	}
	System.out.println("No of duplicates:"+count);
	
			
	}
		

			
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1=new Test();
		t1.arr1();
		t1.hashmap();
		t1.arr3();
		t1.duplicate();
		Test.test1();
		t1.reverse();

	}

}
