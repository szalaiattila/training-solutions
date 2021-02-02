package references.parameter;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person1;
        Person person2;

        Person person = new Person("Szalai Attila", 20);
        person1 = person;
        person2 = person1;
        person2.setName("XY");

        System.out.println(person1);
        System.out.println(person2);

        int number1 = 28;
        int number2 = number1 + 1;
        System.out.println(number1);
        System.out.println(number2);

        Person newPerson = person1;
        System.out.println(newPerson);
        System.out.println(person1);
    }


}
