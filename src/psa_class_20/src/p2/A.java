package p2;

public interface A {
	default public void test1() {
		System.out.println(100);
	}
	
	public void test2();

}
