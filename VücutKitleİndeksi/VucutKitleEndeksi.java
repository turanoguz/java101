package VücutKitleİndeksi;
import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        float boy,vucutKitleEndeksi;
        int kilo;

        
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scan.nextFloat();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scan.nextInt();

        vucutKitleEndeksi = kilo/(boy*boy);


        System.out.println("Vücut Kitle İndeksiniz : "+vucutKitleEndeksi);

        scan.close();


    }
}
