public class Main {
    public static void main(String[] arg){
        Employee harry = new Employee("Harry Davidson", 50000, 1989,3,11);
        Employee.tripleSalary(harry);

        System.out.println(harry.getSalary());
    }
}
