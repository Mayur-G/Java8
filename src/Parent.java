
public interface Parent {
	
	static void m1()
	{
		System.out.println("m1() static Parent");
	}
	
	default public void m2()
	{
		System.out.println("m2() default Parent");
	}
}
