package four;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args){
        do_while_loop();
        input_even_odd();
    }

    public static void do_while_loop(){
        int i = 20;
        do {
            System.out.println(i);
            i--;
        }while(i>=0);
    }

    public static void input_even_odd(){
        int myinp;
        do {
            Scanner inp = new Scanner(System.in);
            System.out.print("Enter Number: ");
            myinp = inp.nextInt();
        } while(myinp % 2 == 0);
        
    }
}
