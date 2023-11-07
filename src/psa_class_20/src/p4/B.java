package p4;

public class B {
	
	public static void main(String[] args) {
		
		
		A a1 = ()->{
			System.out.println(100);
		};
		
		A a2 = () -> {
			System.out.println(200);
		};
		
		A a3 = () -> {
			System.out.println(300);
		};
		
		a1.test1();
		a2.test1();
		a3.test1();
	}

}
