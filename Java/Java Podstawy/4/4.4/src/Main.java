import java.text.NumberFormat;

public class Main {
    public static void main(String[] arg){
        Employee[] workers = new Employee[3];
        workers[0] = new Employee();
        workers[0].setId();

        workers[1] = new Employee();
        workers[1].setId();

        workers[2] = new Employee();
        workers[2].setId();

        for (int i=0; i< workers.length; i++){
            System.out.println(workers[i].getId());
        }

        int n = Employee.getNextID();
        System.out.println(n + " <--- Następny numer id pracownika");

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));

    }
}
