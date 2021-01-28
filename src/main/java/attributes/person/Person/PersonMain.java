package attributes.person.Person;

public class PersonMain {

    public static void main(String[] args) {
        PersonMain personMain = new PersonMain();

        Person person = new Person("Szalai Attila", "01010101");

        Address address = new Address("Magyarország", "Budapest", "Zöldlomb utca 24/B", "1025");
        person.moveTo(address);

        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        person.correctData("Szalai Attila 1", "01010101");
        System.out.println(person.personToString());

        person.getAddress().correctData("Magyarország", "Budapest II. kerület", "Zöldlomb utca 24/B", "1025");

        System.out.println(person.getAddress().addressToString());

        Address newAddress = new Address("Magyarország", "Kecskemét", "Almavirág utca 11",  "6000");

        person.moveTo(newAddress);

        System.out.println(person.getAddress().addressToString());
    }
}

