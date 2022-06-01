package OOPS;


//method Overriding in inheritance
class Animals {

	  // method in the superclass
	  public void eat() {
	    System.out.println("I can eat");
	  }
	}

	// Dog inherits Animal
	class cat extends Animals {

	  // overriding the eat() method
	  @Override
	  public void eat() {
	    System.out.println("I eat dog food");
	  }

	  // new method in subclass
	  public void bark() {
	    System.out.println("I can bark");
	  }
	}

	class Inheritance2 
	{
	  public static void main(String[] args) {

	    // create an object of the subclass
	    cat labrador = new cat();

	    // call the eat() method
	    labrador.eat();
	    labrador.bark();
	  }
	}
	