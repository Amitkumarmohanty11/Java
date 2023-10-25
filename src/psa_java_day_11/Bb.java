package psa_java_day_11;

public class Bb {
    Bb(String y){
        System.out.println(y);
    }
    Bb(int x){
        this("Amit");
    }

    Bb(){
        this(100);
    }

    public static void main(String[] args) {
        Bb b1=new Bb();
    }
}
