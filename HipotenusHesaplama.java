import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {
        
        int a, b, c;
        double u, alan, ucgenCevresi;

        Scanner scan = new Scanner(System.in);

        System.out.println("1.kenarı giriniz : ");
        a = scan.nextInt();

        System.out.println("2.Kenarı giriniz : ");
        b = scan.nextInt();

        System.out.println("3.Kenarı giriniz : ");
        c = scan.nextInt();


        u = (a+b+c)/2;
        ucgenCevresi = 2*u;
        alan = Math.sqrt( (u*(u-a)*(u-b)*(u-c)));
        System.out.println("üçgenin alanı : "  + alan);

        

    }
}
