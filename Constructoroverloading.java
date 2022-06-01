package OOPS;

public class Constructoroverloading {
	String language;
	//constructor with no parameter
	Constructoroverloading()
	{
		this.language="java";
	}
	Constructoroverloading(String language)
	{
		this.language=language;
	}
	public void getName()
	{
		System.out.println("program: "+this.language);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructoroverloading m=new Constructoroverloading();// call with out parameter
		Constructoroverloading n=new Constructoroverloading("python"); // call with single parameter
		m.getName();
		n.getName();

	}

}

//constructor overloading


