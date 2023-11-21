
public class Test3 extends Test4 implements Test5,Test6{
	
	public static void main(String[] args) {
		
		Test3 t3 = new Test3();
		t3.m1();
		
		//if we extends class(Test4) and implements interface(Test5) if both have same method name , 
		//one is normal m1()
		//another is default m1()
		//higher priority will be given to normal m1()
	}

//	@Override
//	public void m1() {
//		Test5.super.m1();
//	}
	
//	@Override
//	public void m1() {
//		Test6.super.m1();
//	}
}
