package OOPS;
abstract class Language {

	  // method of abstract class
	public void disk()
	{
		// TODO Auto-generated method stub
		System.out.println("This is Java Programming");
		
	}
	  
	  
}
public class Abstract2 extends Language
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create an object of Main
	    Abstract2 obj = new Abstract2();

	    // access method of abstract class
	    // using object of Main class
	    obj.disk();
	

	}

}
