package intromethods;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Szalai Attila",2020,250000);

        System.out.println(employee.getName());
        System.out.println(employee.getHiringYear());
        System.out.println(employee.getSalary());
        employee.setName("XY");
        System.out.println(employee.getName());
        employee.raiseSalary(250000);
        System.out.println(employee.getSalary() + "FT");
    }
}
