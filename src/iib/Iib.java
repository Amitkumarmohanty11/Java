package iib;
//IIB - Instance Initialization Block;
//Note:-
//IIBs are executed when objects are created
//Number of times we create an object , same number of time IIB will be called;
//IIBs are used to initialize all the instance variable in one place and that give as better readability of the code.

//Example :-

public class Iib {
    {
        System.out.println("From IIB");
    }

    public static void main(String[] args) {

    }
}
//Nothing out put because the object is not create
