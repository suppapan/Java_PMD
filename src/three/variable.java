package three;

public class variable {
    public static void main(String[] args){
        i();
        andor();
    }
    public static void i(){
        int i = 2;
        i++;
        i++;
        i++;
        i++;
        i++;
        System.out.println(i);
        i--;
        i--;
        i--;
        i--;
        i--;
        System.out.println(i);
    }
    
    public static void andor(){
        float a = 1.23f;
        float b = 2.34f;
        char c = 'C';
        char d = 'D';
        if ((a == 1.23f) && (b== 2.34f)){
            System.out.println("Value a and b is Equal");
        }
        if ((c == 'C') || (d == 'C')){
            System.out.println("Value d or c is C");;
        }
    }

}
