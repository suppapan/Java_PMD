package twodottwo;

public class primitive {
    public static void main(String[] args){
        bark();
        primitive();
        final_string();
    }

    public static void bark(){
        String dogname = "Num";
        System.out.println("The Dog name = " + dogname + " bark");
    }

    public static void primitive(){
        float a = 1.11f;
        int b = 2;
        double c = 3.3;
        char d = 'D';
        int newInt = (int) a;
        float newFloat = (float) b;
        float newFloat_d = (float) c;
        int newIntFromChar = (int) d;
        System.out.println(newInt);
        System.out.println(newFloat);
        System.out.println(newFloat_d);
        System.out.println(newIntFromChar);
    }

    public static void final_string(){
        final String hello = "Hello";
        hello = "new Hello";
        System.out.println(hello);
    }

}
