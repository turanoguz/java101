package SinifGecmeDurumu;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        
        int matematik, fizik, turkce, kimya, muzik;
        OptionalDouble ortalama;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        matematik = scanner.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = scanner.nextInt();


        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = scanner.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = scanner.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = scanner.nextInt();



        List<Integer> list = new ArrayList<Integer>();
        
        list.add(matematik);
        list.add(fizik);
        list.add(turkce);
        list.add(kimya);
        list.add(muzik);


        ortalama = list.stream()
        .filter(e -> e >= 0 && e <= 100)
        .mapToInt(i -> i)
        .average();

        String sonuc = ortalama.getAsDouble() < 55 ? "Sınıfta kaldınız. " : "Sınıfı geçtiniz." ;
        
        System.out.println("Ortalamanız : "+ ortalama +" \n "+ sonuc);
        



        scanner.close();


    }

}
