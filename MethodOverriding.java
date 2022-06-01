package OOPS;
class Parent 
{
    void show()
    {
        System.out.println("Parent class");
    }
}  

class Child extends Parent {
    
    @Override
    void show()
    {
        System.out.println("Child class");
    }
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj1 = new Parent();
        obj1.show(); //parent class value
       
        Parent obj2 = new Child();
        obj2.show();//child class value


	}

}
