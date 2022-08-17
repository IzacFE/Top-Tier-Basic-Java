import java.util.Scanner;

public class PlayWithAsterik {
    public static void main(String[] args) {
        System.out.println("Masukan lebar asterik");
        Scanner inputTerminal = new Scanner(System.in);
        int input = inputTerminal.nextInt();
        int spaceLoop = input;

        for (int i = 1;i<=input;i++){
            String result = "";

            for (int k = 0;k<spaceLoop;k++){
                result+=" ";
            }

            for (int j = 0;j<i;j++){
                result+="* ";
            }

            System.out.println(result);

            spaceLoop--;
        }
    }
}
