package mavenproject;

class Animal 

{
	// when we use static keyword it means we can directly call in its subclass.
	static String s="Hello Animals";
	static String t="The Animal Family";
	
	Animal()
	{
		
		System.out.println("Welcome to Animal Family Old");
		
	}
	
	Animal(String a)
	{
		
		System.out.println("Welcome to Animal Family "+a);
		
	}
	
	
	public void eat()
	{
		
		System.out.println("Animal is eating");
	
	}
	
	public void eat(String s)
	{
		
		System.out.println("Animal is eating:"+s);
	
	}
	
	public void sleep()
	
	{
		System.out.println("Animal is sleeping");
		
	}
	
static void drink()
{
	int a=10;
	System.out.println("Animal is drinking");	
}

}
	
	class Cow extends Animal
	
	{
		Cow()
		
		{
			System.out.println("Welcome to Cow Family");
			
		}
		
		public void walk()
		{
			
			System.out.println("Cow is walking");
			
			
		}	
		
		public void sleep()
		{
			
			System.out.println("Cow is eating");	
			
		}
		
	}
	
	class Dog extends Animal
	{
	Dog()
			{
                super();
                System.out.println(s);
				System.out.println("Welcome to Dog Family");

				
	}
		public void bark()
		{
			
			System.out.println("Dog is barking");
			drink(); // static method can directly be called in its subclass.
			System.out.println(s); // static variable can directly be called in its subclass.
		}
		
	}
	
	
	class Puppet extends Dog
	{
		
		Puppet()
		{
			super();
			System.out.println("Welcome to Dog Sub Family");	
			
		}
		
		public void cry()
		{
			
			System.out.println("Puppet is crying");
			
			
		}}
	
	// abstract class can have abstract and non abstract methods.
	// A class which extends the abstract class must provide implementation of all the abstract methods.If not then that class also must be declared as abstract.
	// non abstract methods can be defined in abstract class.
	
	abstract class fruits{
		
	void lemon() {	
		
		System.out.println("Lemons are yellow");
	}
	
	abstract void apple();
		
	}
	// interface methods are by default abstract and public.
	// we cannot define method body inside interface.Only method signature is defined.
	// class which implements the interface must provide the implementation of all the methods in the interface because all methods are abstract.
	
	interface vegetables
	{
		void onion();
		abstract void potato();		
	}
		
		public class TestAnimal extends fruits implements vegetables
		{
			
			void apple()
			{
				
			System.out.println("Apples are red");	
				
			}
			
			public void potato()
			{
				
				System.out.println("Potatoes are orange");	
				
			}
			
			public void onion()
			{
				
				System.out.println("Onions are Green");	
				
			}
			// Main Method is overloaded but JVM always calls the original main method.
			
			public static void main(int args1) {
				System.out.println("main method overloading");
			}
			
			
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestAnimal b=new TestAnimal();
	    Puppet a=new Puppet();
        a.eat();
        a.eat("Food");
        a.sleep();
        a.bark();
        a.cry();
        Animal.drink(); // static method call in non subclass with Class Name.
        b.apple();
        b.potato();
        b.onion();
        b.lemon();
		System.out.println("Thank you for visiting");
		System.out.println(Animal.t); // static variable call in non subclass with Class Name.
		
	
	}
		}
