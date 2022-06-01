package OOPS;

interface sam
{
 public void display();
}

	class AnonymousDemo 
	{
	   public void create() 
	   {
	      // anonymous class implementing interface
		   
	      sam p1 = new sam() 
	      {
	         public void display() 
	         {
	            System.out.println("Hello world");
	         }
	      };
	      p1.display();
	   }
	}

	class Anonymousclass
	{
	   public static void main(String[] args) 
	   {
	      AnonymousDemo an = new AnonymousDemo();
	      an.create();
	   }
	}
