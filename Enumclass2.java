package OOPS;

enum Class 
{
	   SMALL {

	      // overriding toString() for SMALL
	      public String toString() 
	      {
	        return "The size is small.";
	      }
	   },

	   MEDIUM {

	     // overriding toString() for MEDIUM
	      public String toString() 
	      {
	        return "The size is medium.";
	      }
	   };
	}

	class Enumclass2
	{
	   public static void main(String[] args)
	   {
	      System.out.println(Class.SMALL.toString());
	   }
	

}
