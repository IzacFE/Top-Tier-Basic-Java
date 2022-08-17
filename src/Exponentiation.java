import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        Scanner inputTerminal = new Scanner(System.in);
        System.out.println("Masukkan nilai bilangan");
        int x = inputTerminal.nextInt();
        System.out.println("Masukkan nilai pangkat");
        int n = inputTerminal.nextInt();

        int result = x;

        for (int i = 0; i < n-1;i++){
            result*=x;
        }

        System.out.println(result);
    }
}
