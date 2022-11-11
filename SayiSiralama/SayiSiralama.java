package SayiSiralama;

import java.util.Arrays;
import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {

        int[] a = new int[3];

        Scanner scanner = new Scanner(System.in);

        //kullanıcıdan değerleri alıyoruz.
        for (int i = 0 ; i < 3 ; i++){
            System.out.print(i+1 +". sayıyı giriniz : ");
            a[i] = scanner.nextInt();

        }

        //sayıları sıralıyoruz.
        Arrays.sort(a);
        
        
        for (int i : a) {
            System.out.println(i);
            
        }


        scanner.close();


    }
}
