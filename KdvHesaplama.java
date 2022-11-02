import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOrani,kdvTutar,kdvliTutar;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ücret tutarını giriniz : ");
        tutar = scan.nextDouble();

        
        kdvOrani = (tutar>=0 & tutar<=1000) ? 0.18 : 0.08;
        kdvTutar = tutar*kdvOrani;
        kdvliTutar = tutar+kdvTutar; 


        System.out.println("KDV'siz tutar : " + tutar );
        System.out.println("KDV oranı : "+kdvOrani);
        System.out.println("KDV tutarı : "+kdvTutar);
        System.out.println("KDV'li tutar : "+kdvliTutar);

        scan.close();
        





    }
}
