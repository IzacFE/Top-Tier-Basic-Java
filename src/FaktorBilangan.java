import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args) {
        System.out.println("Masukan nilai bilangan untuk mendapatkan faktor-faktor bilangan tersebut");
        Scanner inputTerminal = new Scanner(System.in);
        int input = inputTerminal.nextInt();

        System.out.println(1);
        for (int i =2;i<=input;i++){
            if(input%i==0){
                System.out.println(i);
            }
        }
    }
}
