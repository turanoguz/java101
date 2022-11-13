package ArtikYilHesaplama;

import java.time.Year;
import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        int yil;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen yılı giriniz : ");
        yil = scanner.nextInt();


        if((yil % 4 == 0 && yil % 100 != 0 ) || yil % 400 == 0){
            System.out.println(yil + " bir artık yıldır !");
        }
        else{
            System.out.println(yil + " bir artık yıl değildir !");

        }

        scanner.close();



    }
}
