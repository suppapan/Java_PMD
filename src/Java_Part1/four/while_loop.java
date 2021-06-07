package four;

public class while_loop {
    public static void main(String[] args){
        while_loop();
        sum();
        modulo();
        for_each_array();
    }

    public static void while_loop(){
        int i = 0;
        while(i <=10){
            System.out.println(i);
            i++;
        }    
    }

    public static void sum(){
        int i = 0;
        int n = 1;
        while(n <= 10){
            i += n;
            n++;
        }
        System.out.println(i);
    }

    public static void modulo(){
        int i = 1;
        while (i <= 100){
            if (i % 12 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void for_each_array(){
        int array[] = {1,2,3,4,5};
        for (int i : array){
            System.out.println(i);
        }
    }
}
