package OOPS;
abstract class P 
{
	  abstract void makeSound();

	  public void eat() 
	  {
	    System.out.println("I can eat.");
	  }
	}

	class D extends P {

	  // provide implementation of abstract method
	  public void makeSound()
	  {
	    System.out.println("Bark bark");
	  }
	}

	class Abstract 
	{
	  public static void main(String[] args) 
	  {

	    // create an object of Dog class
	    D d = new D();

	    d.makeSound();
	    d.eat();
	  }

	
	}
	