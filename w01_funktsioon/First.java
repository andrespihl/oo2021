public class First {
    public static void main(String[] args){
        //console.log, echo, jne
        /* System.out.println("Hello, world");
        System.out.print("World Hello!");
        System.out.print("\n");
        System.out.println("Butts."); */
        String hello = "Hello World!";
        System.out.println(hello);
        // ALT+SHIFT+A
        for (int i = 0; i < args.length; i++){ //For i
            System.out.println(args[i]);
        }
        for (String text : args){ //For each
            System.out.println(text);
        }
        int length = args.length;
        while (length > 0){ //While
            length --;
            System.out.println("Inside while "+length);
        }
    }
}
