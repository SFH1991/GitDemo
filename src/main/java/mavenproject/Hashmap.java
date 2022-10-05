package mavenproject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    HashMap<String,Integer>	hm1=new HashMap<String,Integer>();
	hm1.put("Faraz", 10);
	hm1.put("Rahul", 20);
	hm1.put("Shabd", 30);
	hm1.put("Shubham", 40);
	
	System.out.println(hm1);
	
	if(hm1.containsKey("Faraz"))
	{
		
		Integer a=hm1.get("Faraz");
		System.out.println("Value for the key is:"+a);
	}
	
	for(Map.Entry<String, Integer> entry: hm1.entrySet())
	{
	System.out.println("Key is:"+entry.getKey() + "," + "Value is:"+entry.getValue());	
	
	}
	
//Iterator<Map.Entry<String, Integer>> itr=hm1.entrySet().iterator();
//
//while(itr.hasNext())
//{
//	<Map.Entry<String, Integer> entry=itr.next();	
//	
//}

for(String a : hm1.keySet())
{
	System.out.print(a);
	System.out.print(",");
		
}
System.out.println();

for(Integer b : hm1.values())
{
	{
		System.out.print(b);
		System.out.print(",");
		
}
		
		
	}

}}