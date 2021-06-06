package four;

public class continue_for {
    public static void main(String[] args){
        continue_for_1();
    }

    public static void continue_for_1(){
        for (int count = 20 ; count >=0 ; count--){
            if (count == 11)
                System.out.println(count);
                continue;
        }
    }
}
