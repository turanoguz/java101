package UcakBiletiHesaplama;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {

        int km, yas, yolculukTipi;

        double normalTutar, yasIndirimi, indirimliTutar, gidisDonusIndirimi, toplamTutar;


        

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen mesafeyi giriniz : ");
        km = scanner.nextInt();

        System.out.print("Lütfen yaşınızı giriniz : ");
        yas = scanner.nextInt();


        System.out.println("Lütfen yolculuk tipini giriniz : \n"
                            +"1-Gidiş\n"
                            +"2-Gidiş-Dönüş");
        yolculukTipi = scanner.nextInt();



        if(km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2) ){

            normalTutar = km * 0.1 ;

            yasIndirimi = normalTutar * yasIndirimOranı(yas);

            indirimliTutar = normalTutar - yasIndirimi ;

            if(yolculukTipi == 2){
                gidisDonusIndirimi = indirimliTutar * 0.2 ;

                toplamTutar = (indirimliTutar- gidisDonusIndirimi) * 2;

            }
            else{

                toplamTutar =indirimliTutar  ; 

            }

            System.out.println(toplamTutar);

            


        }
        else{
            System.out.println("Hatalı Veri Girdiniz !");
        }





        scanner.close();


    }

    
    private static double yasIndirimOranı(int yas){
        if (yas < 12) {
            return 0.5;
            
        }
        else if(yas >= 12 && yas <= 24){
            return 0.1 ;
        }
        else if(yas >= 65){
            return 0.3 ;

        }
        else{
            return 0;
        }
    }
}
