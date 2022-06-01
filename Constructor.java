package OOPS;

/*public class Constructor {
	private String name;
	Constructor() //constructor with no parameter
	{
		System.out.println("Constructor Called....");
		name="Program";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor ob=new Constructor(); // constructor called no parameter
		System.out.println("This name:"+ob.name);
	}

}*/

// parameterized constructor

public class Constructor
{
	String language;
	Constructor(String lang) //constructor accept single value
	{
		language=lang;
		System.out.println(language+"programing");
	}
	public static void main(String []args)
	{
		Constructor ob1=new Constructor("java "); // constructor by passing a single value
		Constructor ob2=new Constructor("python ");
		Constructor ob3=new Constructor("c ");
	}
}






































