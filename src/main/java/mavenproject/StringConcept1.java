package mavenproject;

public class StringConcept1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello";
		String b=new String("Hello");
		String c="Hello";
		Thread s=new Thread();
		Thread t=new Thread();
		
System.out.println(a==b); // false
System.out.println(a==c); // true
System.out.println(a.equals(b)); // true
System.out.println(a.equals(c)); // true
System.out.println(s==t);// false
System.out.println(s.equals(t)); // false
	}

}
