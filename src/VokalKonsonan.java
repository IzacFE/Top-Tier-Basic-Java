import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args) {
        System.out.println("Masukkan kalimat atau kata untuk pengecekan nilai konsonan dan vokal");
        Scanner inputTerminal = new Scanner(System.in);
        String rawInput = inputTerminal.nextLine();
        String input = rawInput.toLowerCase().replaceAll("\\s+","");

        int vokal = 0;
        int konsonan = 0;
        int stringLength = 0;

        for (int i = 0; i < input.length(); i++) {
            char check = input.charAt(i);
            if (check == 'a' || check == 'i' || check == 'u' || check == 'e' || check == '0' ) {
                vokal++;
            }else{
                konsonan++;
            }

            stringLength++;
        }

        System.out.println("Jumlah Vokal:"+vokal);
        System.out.println("Jumlah Konsonan:"+konsonan);
        System.out.println("Total Karakter:"+stringLength);
    }
}