package CiftveDordunKatlari;

import java.util.Scanner;

public class CiftVeDordunKatlari {
    public static void main(String[] args) {
        
        int sayi, toplam=0;


        Scanner scanner = new Scanner(System.in);
        

        do {

            System.out.print("Sayıyı giriniz : ");
            sayi = scanner.nextInt();

            if(sayi % 2 == 0 && sayi % 4 == 0){
                toplam += sayi;
            }
            
        } while (sayi % 2 == 0);

        System.out.println("2'ye ve 4'e tam bölünenlerin toplamı : "+toplam);


        scanner.close();



    }
}
