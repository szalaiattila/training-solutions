package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Szalai Attila");
        client.setYear(1992);
        client.setAddress("Budapest, Hungary");

        System.out.println("Name: " + client.getName());
        System.out.println("Year:" + client.getYear());
        System.out.println("Address:" + client.getAddress());

        client.migrate(" Liverpool, England");
        System.out.println("New Address: " + client.getAddress());
    }
}
