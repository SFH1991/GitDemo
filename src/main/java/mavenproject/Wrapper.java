package mavenproject;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		byte b=20;
		short c=30;
		double d=40.0D;
		float e=50.0F;
		long f=60;
		boolean g=true;
		char h='a';
		
		// Autoboxing
		Integer myint=a;
		Byte mybyte=b;
		Short myshort=c;
		Double mydouble=d;
		Float myfloat=e;
		Long mylong=f;
		Boolean mybool=g;
		Character mychar=h;
		
		
	    System.out.println("Integer object:"+myint);
		System.out.println("Byte object:"+mybyte);
		System.out.println("Short object:"+myshort);
		System.out.println("Double object:"+mydouble);
		System.out.println("Float object:"+myfloat);
		System.out.println("Long object:"+mylong);
		System.out.println("Boolean object:"+mybool);
		System.out.println("Character object:"+mychar);
		
		
		int intvalue=myint;
		byte bytevalue=mybyte;
		short shortvalue=myshort;
		double doublevalue=mydouble;
		float floatvalue=myfloat;
		long longvalue=mylong;
		boolean boolvalue=mybool;
		char charvalue=mychar;
		
		    System.out.println();
		    System.out.println("int value:"+intvalue);
			System.out.println("byte value:"+bytevalue);
			System.out.println("short value:"+shortvalue);
			System.out.println("doublevalue:"+doublevalue);
			System.out.println("float value:"+floatvalue);
			System.out.println("longvalue value:"+longvalue);
			System.out.println("bool value:"+boolvalue);
			System.out.println("charvalue:"+charvalue);
		
		
		
		
		
		
		
		
	}

}
