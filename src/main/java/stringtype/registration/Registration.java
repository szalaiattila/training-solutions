package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a felhasználó nevet: ");
        String usName = scanner.nextLine();

        System.out.println("Adja meg az email címet: ");
        String userMail = scanner.nextLine();

        System.out.println("Adja meg a jelszót: ");
        String userPass1 = scanner.nextLine();
        System.out.println("Jelszó megerősítés: ");
        String userPass2 = scanner.nextLine();

        UserValidator userValidator = new UserValidator();

        System.out.println(userValidator.isValidUsername(usName) ? "Név rendben" : "Név helytelen");
        System.out.println(userValidator.isValidEmail(userMail) ? "Email rendben" : "Email helytelen");
        System.out.println(userValidator.isValidPassword(userPass1, userPass2) ? "Jelszó rendben" : "Jelszó helytelen");


    }

}
