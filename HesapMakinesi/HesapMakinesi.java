package HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        
        int number1, number2, select;

        Scanner scan = new Scanner(System.in);

        System.out.println("ilk sayıyı giriniz : ");
        number1 = scan.nextInt();

        System.out.println("ikinci sayıyı giriniz : ");
        number2 = scan.nextInt();


        System.out.println("1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme \n Seçiniz : ");
        select = scan.nextInt();


        switch(select){
            
            case 1:
                System.out.println("Toplam : "+ (number1 + number2));
                break;

            case 2:
                System.out.println("Çıkarma : "+ (number1 - number2));
                break;
            case 3:
                System.out.println("Çarpma : "+ (number1 * number2));
                break;

            case 4:
                System.out.println("Bölme : "+ (number1/number2));
                break;
            default :
                System.out.println("Yanlış seçim yaptınız. Lütfen tekrar deneyiniz.");
        }


        scan.close();




    }
}
