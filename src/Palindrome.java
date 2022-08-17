import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Masukan kata untuk dicek apakah palindrome atau bukan");
        Scanner inputTerminal = new Scanner(System.in);
        String input = inputTerminal.nextLine();
        String inputLowCase = input.toLowerCase();
        String result = "";

        for (int i = input.length()-1; i>=0;i--){
        result+=inputLowCase.charAt(i);
        }

        if(result.equals(input)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Bukan Palindrome");
        }
    }
}
