public class Second {
    public static void main (String[] args){
        System.out.println(myName());
        System.out.println(add(5, 10));
        System.out.println(fullName("Andres", "Pihl"));
    }

    public static String myName(){
        return "Andres";
    }

    public static int add(int number1, int number2){
        return number1 + number2;
    }

    public static String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
}
