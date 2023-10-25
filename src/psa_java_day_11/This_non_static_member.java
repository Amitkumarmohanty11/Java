package psa_java_day_11;
//this. nonstatic member
// this()- we can call a constructor from another constructor
public class This_non_static_member {
    This_non_static_member(){
        System.out.println(100);
    }
    This_non_static_member(int x){
        this();
        System.out.println(x);
    }

    public static void main(String[] args) {
        This_non_static_member a1 = new This_non_static_member(100);
    }
}
