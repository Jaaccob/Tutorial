public class Main {
    public static void main(String[] arg) {
        var message = new StringBuilder();
        var todoList = new StringBuilder("Do zrobienia \n");

        var workersOne = new Employee(50000);
        System.out.println("Name: " + workersOne.getName() + ", Salary: " + workersOne.getSalary());
    }
}
