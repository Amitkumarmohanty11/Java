package java_class;

public class Animals {

    public void run() {
        System.out.println("I am runing");
    }

    public static void main(String[] args) {
        System.out.println("Hii EveryOne");

        Animals dog = new Animals();

        dog.run();
        dog.eat();

        Birds peacook = new Birds();

        peacook.fly();
    }
    public void eat() {
        System.out.println("I am eating");
    }

}


class Birds {

    public void fly() {
        System.out.println("I am flying");
    }
}

