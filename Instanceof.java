package OOPS;

/*public class Instanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="program";
		boolean bl=name instanceof String;
		System.out.println("name is an instanceof string: "+bl);
		Instanceof obj=new Instanceof();
		boolean b2=obj instanceof Instanceof;
		System.out.println("obj is an instanceof Instance:  "+b2);
	}

}*/

//instanceof during inheritance

class Animal
{
	
}
class Dog extends Animal
{
	
}
class Instanceof {

	public static void main(String[] args) {
		Dog d1=new Dog();
		System.out.println(d1 instanceof Dog);
		System.out.println(d1 instanceof Animal);
		
	}
	
	}