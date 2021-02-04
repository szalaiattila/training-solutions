package stringconcat.employee;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {


    @Test
    public void testCreate() {
        Employee employee = new Employee("Kis Géza", "minőségellenőr", 520000);

        assertEquals("XY", employee.getName());
        assertEquals("YX", employee.getJob());
        assertEquals(300000, employee.getSalary());
    }

    @Test
    public void testCreateWithEmptyName() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("", "minőségellenőr", 300000));
        assertEquals("Name must not be empty.", ex.getMessage());
    }

    @Test
    public void testCreateWithNullJob() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("XY", null, 300000));
        assertEquals("Job must not be empty.", ex.getMessage());
    }

    @Test
    public void testCreateWithNegativeSalary() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Employee("XY", "YX", -300000));
        assertEquals("Salary must be positive.", ex.getMessage());
    }

    @Test
    public void testToString() {
        Employee employee = new Employee("XY", "YX", 300000);

        assertEquals("XY - YX - 300000 Ft", employee.toString());
    }
}
