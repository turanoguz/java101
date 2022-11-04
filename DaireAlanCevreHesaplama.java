import java.util.Scanner;

public class DaireAlanCevreHesaplama {
    public static void main(String[] args) {
        
    double   r, delta, alan, pi=3.14;
     
        Scanner scan = new Scanner(System.in);

        System.out.println("Yarıçap(r) değerini giriniz : ");
        r = scan.nextInt();


        System.out.println("Merkez açının ölçüsünü giriniz : ");
        delta = scan.nextInt();

       alan = ((pi*(r*r)*delta)/360);
       
       System.out.println("Dairenin alanı : "+ alan);

       scan.close();
       




    }
}
