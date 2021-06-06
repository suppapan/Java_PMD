package four;

public class score {
    public static void main(String[] args){
        score();
    }

    public static void score(){
        int score = 51;
        boolean isHandsome = true;
        if ((score >= 80) || (isHandsome == true)){
            System.out.println("Good");
        }
        else if (score >= 50) {
            System.out.println("Normal");
        }
        else {
            System.out.println("Fail");
        }
    }
}
