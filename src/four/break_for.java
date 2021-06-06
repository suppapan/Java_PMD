package four;

public class break_for {
    public static void main(String[] args){
        break_for_1();
    }

    public static void break_for_1(){
        for (int count = 20 ; count >=0 ; count--){
            if (count == 11){
                System.out.println(count);
                break;
            }
        }
    }
}
