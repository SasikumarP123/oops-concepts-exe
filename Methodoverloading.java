package OOPS;

public class Methodoverloading {
	 public int sum(int x, int y)
	    {
	        return (x + y);
	    }
	  
	    // Overloaded sum(). This sum takes three int parameters
	    public int sum(int x, int y, int z)
	    {
	        return (x + y + z);
	    }
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading s = new Methodoverloading();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));

	}

}
