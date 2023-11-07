package p2;

public class B implements A {
	
	public static void main(String[] args) {
		
		B b1 = new B();
		
		b1.test1();
		b1.test2();
		
	}
	@Override 
	public void test2() {
		
		System.out.println(400);
	}

}
