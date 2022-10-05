package mavenproject;

public class Duplicates {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {1,2,6,6,5,5};
    
     
   System.out.println("Duplicates");
   for(int i=0;i<arr.length;i++)
   {
		for(int j=i+1;j<arr.length;j++)
		{
		if(arr[i]==arr[j])
		{
			
			System.out.println(arr[j]);
		}
		
		
	}
		
		
}}}
