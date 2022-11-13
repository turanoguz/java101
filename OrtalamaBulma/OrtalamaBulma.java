package OrtalamaBulma;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;

public class OrtalamaBulma {
    public static void main(String[] args) {
        
        int sayi;
        IntSummaryStatistics ortalama;

        List<Integer> sayilar = new ArrayList<Integer>();


        Scanner scanner = new Scanner(System.in);


        System.out.print("Lütfen sayıyı giriniz : ");
        sayi = scanner.nextInt();

        



        for(int i = 1 ; i <= sayi ; i++){
            if( i % 3 == 0 && i % 4 == 0){
                sayilar.add(i);
            }

        }

        ortalama = sayilar.stream().mapToInt((a)-> a).summaryStatistics();


        System.out.println("3'e ve 4'e tam bölünen sayıların ortalaması : "+ ortalama.getAverage());




        scanner.close();


    }
    
}
