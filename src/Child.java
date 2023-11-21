
public class Child implements Parent{

	//we cannot override static method of Parent interface
	//if we add @Override , we get compile error
	//@Override
	static void m1()
	{
		System.out.println("m1() static Child");
	}
	
	@Override
	public void m2() {
		System.out.println("m2() default Child");
	}
	
	//to call default method m2() in Parent interface
	//Interface_name.super.method_name
	public void hello()
	{
		Parent.super.m2();
	}
	
	public static void main(String[] args) {
		
		//Parent static m1() method
		//Interface_name.method_name
		Parent.m1();
		//Child class m1() non-static method (not overridden)
		m1();
		
		//Invoking Interface Student m2() default method 
		new Child().hello();
		//Child class m2() default method overridden
		new Child().m2();
		
	}
}
