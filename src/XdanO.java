import java.util.Scanner;

public class XdanO {
    public static void main(String[] args) {
        System.out.println("masukkan input berupa string berisikan karakter x dan o");
        Scanner inputTerminal = new Scanner(System.in);
        String input = inputTerminal.nextLine();

        int valueX = 0;
        int valueO = 0;
        int stringLength = input.length();

        for (int i = 0; i < stringLength; i++) {
            char check = input.charAt(i);
            if (check == 'x' ) {
                valueX++;
            }else if(check == 'o'){
                valueO++;
            }
        }

        System.out.println("Hasil nilai imbang");
        if(valueX == valueO){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
