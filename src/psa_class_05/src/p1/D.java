package p1;

//Static variable -- static variables has global access

public class D {
	
	static int x =10;
	
	public static void main(String[] args) {
		
		System.out.println(D.x);//10
		
		D d1 =new D();
		
		d1.test();
	}
	
	public void test() {
		System.out.println(D.x);
	}
	
	

}
