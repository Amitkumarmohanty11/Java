package p3;

public class B1  implements A1{
	@Override
	public void test1() {
		System.out.println(100);
	}
	public static void main(String[] args) {
		
		B1 b1= new B1();
		b1.test1();
	}
	

}
