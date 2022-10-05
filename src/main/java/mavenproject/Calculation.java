package mavenproject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal=new Calculation();
		ArrayList<Integer> list=cal.test2();
		
		System.out.println(cal.calc());
		System.out.println(cal.test());
		System.out.println(cal.test1(10,20));
		System.out.println(list);
		System.out.println(cal.sort());
		System.out.println(cal.test3());
		
	}
	
	public int calc()
	{
			int a=5;
			int b=6;
			return a+b;		
		}
	
public String test()
{
		String a="Welcome";
		String b="To";
		String c=new String("Java");
		String d=a+b+c;
		return a;
}
public int test1(int x,int y)
{
		int z=y-x;
		return z;
}
public ArrayList<Integer> test2()
{
ArrayList<Integer> arr=new ArrayList<Integer>();
arr.add(10);
arr.add(11);
arr.add(12);
arr.add(13);
for(int i:arr)
{
	System.out.println(i);
}

return arr;
}

public ArrayList<Integer> sort()
{
	ArrayList<Integer> arr1=new ArrayList<Integer>();
	arr1.add(23);
	arr1.add(12);
	arr1.add(43);
	arr1.add(24);
   Collections.sort(arr1);
   return arr1;
}

public HashMap<Integer,Integer> test3()
{
	HashMap<Integer,Integer> hm1=new HashMap<Integer,Integer>();
	hm1.put(1,23);
	hm1.put(2,12);
	hm1.put(3,43);
	hm1.put(4,24);
	System.out.println("Printing the Elements in a Hashmap");
	
	for(Map.Entry<Integer,Integer> entry: hm1.entrySet())
	{
		System.out.println("Key = " + entry.getKey() + " " + "Value = "+ entry.getValue());
		
	}
	
    return hm1;
}
}