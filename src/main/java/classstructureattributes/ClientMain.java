package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();

        System.out.println("Your Name: ");
        client.name = scanner.nextLine();
        System.out.println("Year Of Birth: ");
        client.yearOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Your Address: ");
        client.address = scanner.nextLine();

        System.out.println("Name:" + client.name);
        System.out.println("Year of Birth:" +client.yearOfBirth);
        System.out.println("Address:" + client.address);

    }
}
