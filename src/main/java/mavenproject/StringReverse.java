package mavenproject;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev=" ";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
		
		}
		
		System.out.println("Original string: " + str);    
        //Displays the reverse of given string    
        System.out.println("Reverse of given string: " + rev);   
	}

}
