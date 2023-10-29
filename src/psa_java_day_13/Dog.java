package psa_java_day_13;

public class Dog extends Animal{
    public void noise(){
        System.out.println("Bow");
    }
    public static void main(String[] args){
        Dog d = new  Dog();
        d.sleep();
        d.eat();
        d.noise();
    }
}
//O/P == sleeping
//Eating
//Bow
