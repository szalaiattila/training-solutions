package introdate;

public class TestEmployee {
    public static void main(String[] args) {

        Employee employee = new Employee(1992, 4, 30, "Szalai Attila"
        );
        System.out.println(employee.getBeginEmployment());
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getName());
    }
}

