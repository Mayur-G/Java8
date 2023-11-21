
public class Test implements Test1,Test2{

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
	
	
	//Interface_name.super.method_name
	
//	@Override
//	public void m1() {
//		Test1.super.m1();
//	}
	
//	@Override
//	public void m1() {
//		Test2.super.m1();
//	}
	
	@Override
	public void m1() {
		System.out.println("Test class impl ");
	}
	
	
}
