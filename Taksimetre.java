import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double kmUcreti = 2.20, km, toplamTutar;
        int minTutar=20, acılısUcreti=10;

        Scanner scan = new Scanner(System.in);

        System.out.println("Gidilen KM yi giriniz : ");
        km = scan.nextDouble();

        toplamTutar = acılısUcreti+(km*kmUcreti);

        toplamTutar  = (toplamTutar<minTutar) ? 20 : toplamTutar ;
        System.out.println("Ödenecek toplam tutar : "+toplamTutar);

        scan.close();




    }
}
