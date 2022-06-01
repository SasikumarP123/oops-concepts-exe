package OOPS;

class A {

	  // field and method of the parent class
	  String name;
	  public void eat() 
	  {
	    System.out.println("I can eat");
	  }
}

	// inherit from Animal
	class D extends A
	{
	  // new method in subclass
	  public void display() 
	  {
	    System.out.println("My name is " + name);
	  }

}
	class Inheritance {
	  public static void main(String[] args) {

	    // create an object of the subclass
	    D d1 = new D();

	    // access field of superclass
	    d1.name = "Kumar";
	    d1.display();

	    // call method of superclass
	    // using object of subclass
	    d1.eat();

	  }
	
	}



	
	
	
	
	
	