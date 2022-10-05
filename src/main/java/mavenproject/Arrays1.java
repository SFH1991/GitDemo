package mavenproject;
import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[5];
		int[] arr2= {1,2,3,4,5};
		int[] arr3=new int[0];
		char[] arr4= {'a','b','c'};
		int[] arr5= {9,2,5,1,8,4,6,8,3,5};
		String[] arr6= {"Faraz","Rahul","Shubham","Yash"};
		arr1[0]=0;
		arr1[0]=1;
		arr1[0]=2;
		Arrays.sort(arr5);
		Arrays.sort(arr2);
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr4));
		System.out.println(arr5);
		System.out.println(Arrays.toString(arr5));
		//System.out.println(Arrays.toString(arr3));
	    System.out.println("Hello"+ " " +"My name"+ " " + "is Syed Faraz Hussain");
		for(int i:arr2)
		{
         System.out.println(i);			
		}
		
		for(int j:arr2)
		{
			System.out.println(arr2[j-1]);
		}
		for(int i:arr5)
		{
			
		}
		System.out.println(Arrays.toString(arr5));

		for(String s: arr6)
		{
			System.out.println(s);
	
	}
	}}
	
