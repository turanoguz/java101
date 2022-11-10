package EtkinlikOnerme;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        
        int sicaklik ; 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz : ");
        sicaklik = scanner.nextInt();


        if(sicaklik < 5){

            System.out.println("Kayak yapabilirsiniz.");

        }
        else if(sicaklik >=5 && sicaklik <15){

            System.out.println("Sinemaya gidebilirisiniz.");

        }
        else if(sicaklik >= 15 && sicaklik <25 ){

            System.out.println("Piknik yapabilirsiniz. ");

        }
        else{

            System.out.println("Yüzmeye gidebilirsiniz. ");

        }

        


        scanner.close();
        
    }
}
