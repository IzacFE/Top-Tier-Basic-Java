import java.util.Scanner;

public class BilanganPrima{
    public static void main(String[] args) {
        System.out.println("Masukan nilai bilangan untuk dicek");
        Scanner inputTerminal = new Scanner(System.in);
        int input = inputTerminal.nextInt();

        if(input<=1){
            System.out.println("Bukan Bilangan Prima");
        }else if(input==2){
            System.out.println("Bilangan Prima");
        }else
        for (int i =3; i<input;i++){
            if(input%i==0){
                System.out.println("Bukan Bilangan Prima");
                break;
            }
            if(i==input-1){
                System.out.println("Bilangan Prima");
            }
        }
    }
}
