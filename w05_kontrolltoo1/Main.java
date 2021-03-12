import java.util.Scanner;

public class Main{
    public static boolean stringStatus;
    public static void main(String[] args) {
        String inputNum = "0";
        inputNum = inputNumber(inputNum);
        if(checkString(inputNum, inputNum.length())){
            System.out.println(inputNum + " on kahendsüsteemi arv.");
            stringSum(inputNum, inputNum.length());
            valuePerChar(inputNum, inputNum.length());
        } else {
            System.out.println(inputNum + " ei ole kahendsüsteemi arv.");
        }
    }

    public static String inputNumber(String inputNum){
        Scanner input = new Scanner(System.in);
        while(inputNum.length() < 4 || inputNum.length() > 10){
            System.out.println("Sisestage nelja- kuni kümnekohaline number:");
            inputNum = input.nextLine();
            System.out.println("Sisestasite: " + inputNum);
            if(inputNum.length() < 4 || inputNum.length() > 10){
                System.out.println(inputNum + " ei vasta pikkuse tingimustele.");
            }
            
        }
        input.close();
        return inputNum;
    }

    public static boolean checkString(String inputNum, int len){
        for(int i = 0; i < len; i++){
            if(inputNum.charAt(i) >= '0' && inputNum.charAt(i) <= '1'){
                stringStatus = true;
            } else {
                stringStatus = false;
                i = len;
            }
        }
        return stringStatus;
    }

    public static void stringSum(String inputNum, int len){
        int inputSum = 0;
        int[] binaryArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
        for (int i = len; i > 0 ; i--){
            if(inputNum.charAt(len-i) != '0'){
                inputSum = inputSum + binaryArray[i-1];
            }
        }
        System.out.println(inputNum + " väärtus kümnendsüsteemis on " + inputSum);
    }

    public static void valuePerChar(String inputNum, int len){
        String[] locationArray = {"Esimesel ", "Teisel ", "Kolmandal ", "Neljandal ", "Viiendal ", "Kuuendal ", "Seitsmendal ", "Kaheksandal ", "Üheksandal ", "Kümnendal "};
        int[] binaryArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
        for(int i = 0; i < len; i++){
            if(inputNum.charAt(i) != '0'){
                String charLoc = locationArray[i];
                System.out.println(charLoc +"kohal oleva ühe väärtus on " + binaryArray[len-i-1]);
            }
        }
    }
}