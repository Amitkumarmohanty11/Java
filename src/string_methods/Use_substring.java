package string_methods;

public class Use_substring {

    public static void main(String[] args) {

        String name = "Amit Kumar ";
        int value = name.length();

        String lstring = name.toUpperCase();

        String newsrring = lstring.substring(4);

        String newsrring1 = lstring.substring(4,9);


        System.out.println(value );
        System.out.println(newsrring );
        System.out.println(newsrring1 );
    }
}
