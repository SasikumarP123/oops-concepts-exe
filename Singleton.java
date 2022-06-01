package OOPS;	
class Main
{
	   private static Main obj;

	   private Main()
	   {  
		   
	   }

	   public static Main getInstance()
	   {

	      // create object if it's not already created
	      if(obj == null) 
	      {
	         obj= new Main();
	      }

	       // returns the singleton object
	       return obj;
	   }

	   public void getConnection() 
	   {
	       System.out.println("You are now connected to the database.");
	   }
	}

public class Singleton 
{
	   public static void main(String[] args)
	   {
	      Main db1;

	      // refers to the only object of Database
	      db1= Main.getInstance();
	      
	      db1.getConnection();
	   }
	}
