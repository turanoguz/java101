package KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        
        String userName = "patika", password = "12345", answer, inputUserName, inputPassword, newPassword;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        inputUserName = scanner.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        inputPassword = scanner.nextLine();


        if(inputUserName.equals(userName) && password.equals(password)){

            System.out.println("Giriş yaptınız.");
        }else{
            System.out.println("Şifrenizi yanlış girdiniz. Şifrenizi sıfırlamak istermisiniz ? evet(e) veya hayır(h) ");
            answer = scanner.nextLine();
            if(answer.equals("e")){
                System.out.print("Lütfen yeni şifrenizi giriniz : ");
                newPassword = scanner.nextLine();

                if(newPassword.equals(password) || newPassword.equals(inputPassword)){

                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");

                }else{
                    
                    password = newPassword;
                    System.out.println("Şifre Oluşturuldu.");

                }


            }
        }
        

        

    }
    
}
