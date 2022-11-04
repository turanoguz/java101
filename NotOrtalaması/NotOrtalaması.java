package NotOrtalaması;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        int matNotu,fizikNotu,kimyaNotu,türkceNotu,tarihNotu,müzikNotu;
        
        //scanner nesnesi oluşturuldu. Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik 
        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");
        matNotu = scan.nextInt();

        System.out.println("Fizik notunuzu giriniz : ");
        fizikNotu = scan.nextInt();


        System.out.println("Kimya notunuzu giriniz : ");
        kimyaNotu = scan.nextInt();

        System.out.println("Türkçe notunuzu giriniz : ");
        türkceNotu = scan.nextInt();

        System.out.println("Tarih notunuzu giriniz : ");
        tarihNotu = scan.nextInt();

        System.out.println("Müzik notunuzu giriniz : ");
        müzikNotu = scan.nextInt();


        float ortalama = (matNotu+fizikNotu+kimyaNotu+türkceNotu+tarihNotu+müzikNotu)/6;


        System.out.println("Ortalamnız : "+ortalama);
        System.out.println(ortalama >=60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

        scan.close();


        
    }
}