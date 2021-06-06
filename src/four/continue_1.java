package four;

public class continue_1 {
    public static void main(String[] args){
        continue_1();
    }

    public static void continue_1(){
        for (int count = 0 ; count <= 10 ; count++){
            if (count == 2)
                continue;
            System.out.println(count);
        }
    }
}
