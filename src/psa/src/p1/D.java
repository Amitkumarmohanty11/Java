package p1;

public class D {
	
	public static void main(String[] args) {
		
		C c1 =(int x , int y) -> {
			System.out.println(x + y);
		};
		
		C c2 =(int x , int y) -> {
			System.out.println(x - y);
		};
		
		C c3 =(int x , int y) -> {
			System.out.println(x * y);
		};
		
		C c4 =(int x , int y) -> {
			System.out.println(x / y);
		};
		
		c1.test1(10, 10);
		c2.test1(10, 10);
		c3.test1(10, 10);
		c4.test1(10, 10);
		
	}

}
