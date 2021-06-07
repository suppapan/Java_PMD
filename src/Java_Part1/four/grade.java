package four;

public class grade {
    public static void main(String[] args){
        grade();
    }

    public static void grade(){
        int grade = 39;
        if (grade >= 80){
            System.out.println("A");
        }
        else if (grade >= 70){
            System.out.println("B");
        }
        else if (grade >= 60){
            System.out.println("C");
        }
        else if (grade >= 50){
            System.out.println("D");
        }
        else if (grade >= 40){
            System.out.println("F");
        }
        else {
            System.out.println("E");
        }
    }
}
