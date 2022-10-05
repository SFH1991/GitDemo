package mavenproject;

public class Sorting {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int arr1[]= {6,9,5,2,3,1};
System.out.println("Before Sorting");
		
		for(int k=0;k<arr1.length;k++)
		   {
			System.out.println(arr1[k]+" ");
		   }
		
		
		 for(int k=0;k<arr1.length;k++)
		   {
				for(int l=k+1;l<arr1.length;l++)
				{
					if(arr1[k]>arr1[l])
					{
					int temp=arr1[k];
					arr1[k]=arr1[l];
					arr1[l]=temp;
					}
					
					
				}}
		 
			System.out.println("After Sorting");
			for(int k=0;k<arr1.length;k++)
			   {
				System.out.println(arr1[k]+" ");
			   }
			
}}