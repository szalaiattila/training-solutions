package introinheritance;

public class Boss extends  Employee {

    private static final double LEADERSHIP_FACTOR = 0.1;
    private int numberOfEmployees;
    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public double getSalary() {
        return super.getSalary() + super.getSalary() * numberOfEmployees * LEADERSHIP_FACTOR;
    }
}
