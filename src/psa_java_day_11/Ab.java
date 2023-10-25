package psa_java_day_11;

public class Ab {
    Ab(int x){
        System.out.println(x);
    }
    Ab(){
        this(100);
        System.out.println(10);

    }

    public static void main(String[] args) {
        Ab a1 = new Ab();
    }
}
