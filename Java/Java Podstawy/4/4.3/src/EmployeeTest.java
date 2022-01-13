import java.time.LocalDate;
import java.util.Objects;

public class EmployeeTest {

    public static void main(String[] arg) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Robert Siwiak", 75000, 1987, 12, 12);
        staff[1] = new Employee("Jacek Cydejko", 50000, 1989, 10, 1);
        staff[2] = new Employee("Mariusz Romczak", 40000, 1990, 3, 15);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for (Employee e : staff) {
            System.out.println(e.getName() + " " + e.getSalary() + " " + e.getHireDay() );
        }


        var harry = new Employee("Harry Hacker", 50000, 1989,10,1);
    }

    static class Employee {
        private final String name;
        private double salary;
        private LocalDate hireDay;

        public Employee(String name, double salary, int year, int month, int day) {
            name = Objects.requireNonNull(name, "brak");
            this.name = name;
            this.salary = salary;
            this.hireDay = LocalDate.of(year, month, day);
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public LocalDate getHireDay() {
            return hireDay;
        }

        public void raiseSalary(double byPercent) {
            double raise = salary * byPercent / 100.0;
            salary += raise;
        }
    }
}
