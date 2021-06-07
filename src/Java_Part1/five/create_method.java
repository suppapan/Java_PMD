package five;

public class create_method {
    public static void main(String[] args){
        not_return_method();
        System.out.println(return_method("Return Method"));
    }

    public static void not_return_method(){
        System.out.println("Not return method");
    }

    public static String return_method(String message){
        return message;
    }
}
