package mavenproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
	
	class A
	{
	void ab()
	{
		System.out.println("Hello World");
	}
	A()
	{
		System.out.println("Hello World1");	
		ab();
	}
	
	}

	class B extends A
	{
		
		B(){
			super();
			System.out.println("Hello1");
		}
	void ab()

	{

		System.out.println("Hello");
	}
	}
	
	
	class Testing
	{

		
		Testing() throws FileNotFoundException
		{
		FileInputStream fis=new FileInputStream("");
			
		}
		
		int method1() throws Exception 
		{

			return 0;
		}

		int method2() throws Exception
		{
		method1(); 
		return 0;
		}

		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			A ab=new A();
	        A a=new B();
	        B b=new B();
	       // B b= new A();  it is not correct casting: compiler error
			ab.ab();
			a.ab();
			b.ab();
			//b.ab();
		

		}
	
	}

