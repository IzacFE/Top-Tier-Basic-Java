import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        //   variable faktor kali digunakan untuk dikalikan dengan output dari tiap kolom dalam 1 baris
        System.out.println("Masukan ukuran tabel");
        Scanner inputTerminal = new Scanner(System.in);
        int number = inputTerminal.nextInt();

        //   loop pertama digunakan untuk membuat total jumlah baris
        for (int i = 1; i <= number; i++) {
            String result = "";

            // loop kedua digunakan untuk membuat output dalam 1 baris
            for (int j = 1; j <= number; j++) {
                System.out.print(j * i+"\t");
            }

            System.out.println();
        }
    }
}
