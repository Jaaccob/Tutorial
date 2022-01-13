import java.util.Random;

public class Employee {
    private String name;
    private int salary;
    private static int nextInt = 1;
    private int id;

    {       //Blok inicjalizujący obiekt
        id = nextInt;
        nextInt++;
    }       //Statyczny blok inicjujący
    static
    {
        var generator = new Random();
        nextInt = generator.nextInt(10000);
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(int salary) {
        this("Employee #" + nextInt, salary);
        nextInt++;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public static int getNextInt() {
        return nextInt;
    }
}
