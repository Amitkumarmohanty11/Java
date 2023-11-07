package p1;

//Default keyword 
//Using default keyword we can create complete method inside interface

public interface A {
	
	default public void test() {
		System.out.println("From test1");
	}

}
