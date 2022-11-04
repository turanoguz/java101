import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        float armutKilo, elmaKilo, domatesKilo, muzKilo, patlıcanKilo;

        double armutFİyat = 2.14, elmaFiyat = 3.67 , domatesFiyat = 1.11, muzFiyat = 0.95, patlıcanFiyat = 5d, toplamTutar;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutKilo = scan.nextFloat();


        System.out.print("Elma Kaç Kilo ? : ");
        elmaKilo = scan.nextFloat();


        System.out.print("Domates Kaç Kilo ? : ");
        domatesKilo = scan.nextFloat();


        System.out.print("Muz Kaç Kilo ? : ");
        muzKilo = scan.nextFloat();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlıcanKilo = scan.nextFloat();


        toplamTutar = (armutKilo*armutFİyat)+(elmaKilo*elmaFiyat)+(domatesKilo*domatesFiyat)+(muzKilo*muzFiyat)+(patlıcanKilo*patlıcanFiyat);

        System.out.printf("Toplam Tutar : %.2f",toplamTutar);

        scan.close();










    }
}
