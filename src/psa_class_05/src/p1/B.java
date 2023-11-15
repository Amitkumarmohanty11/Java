package p1;

public class B {
	
  public static void main(String[] args) {
		
		A a1 = new A();
		a1.test();
		
		//System.out.println(x);//Error
	}
	
	public void test() {
		
		int x = 10;
		System.out.println(x);
	}


}
//o/p == error