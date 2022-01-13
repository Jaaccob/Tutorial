import java.util.Arrays;
import java.util.Scanner;

public class Tablice {
    public static void main(String[] arg) {
        /*
        //int[] a;
        //a = new int[100];
        var a = new int[100];

        int[] smallPrimes = {2, 3, 5, 7, 11, 13};
        String[] authors = {"James Gosling",
                "Bill Joy",
                "Guy Steele",};
        smallPrimes = new int[]{17, 19, 23, 29, 31, 37};
        int[] anonymous = {17, 19, 23, 29, 31, 37};
        smallPrimes = anonymous'
        */

        //-------------------------------------------------------
        /*
        Scanner in = new Scanner(System.in);

        System.out.println("Ile liczb musisz wylosować? ");
        int k = in.nextInt();

        System.out.println("Jaka jest największa liczba? ");
        int n = in.nextInt();

        //Zapełnianie tablicy liczbami 1 2 3 ... n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        //Losowanie k liczb i zapisanie ich w drugiej tablicy
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            //Lozowanie indeksu z zakresu od 0 do n-1
            int r = (int)(Math.random() * n);
            //Pobieranie elementu z losowej lokalizacji
            result[i] = numbers[r];
            try {


                //Przeniesienie ostatniego elementu do losowej lokalizacji
                numbers[r] = numbers[n - 1];
                n--;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        }
        //Wydruk zapisanej tablicy
        Arrays.sort(result);
        System.out.println("Postaw na następujące liczby. Dzięki nim zostaniesz bogaty!");
        for (int r : result)
            System.out.println(r);

         */

        /*
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEAR = 10;

        //Ustawienie stóp oprocentowania na wartość w przedziale 10 - 15%
        double[] interestRate = new double[NRATES];

        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (STARTRATE + j) / 100.0;
        }

        double[][] balance = new double[NYEAR][NRATES];

        //Ustawienie sald początkowych na 10 000
        for (int j =0; j< balance[0].length; j++){
            balance[0][j] = 10000;
        }
        //Obliczanie odsetek dla przyszłych lat
        for(int i = 1; i<balance.length; i++){
            for (int j = 0; j<balance[i].length; j++){
                //Pobieranie sald z minionego roku z poprzedniego wiersza
                double oldBalance = balance[i-1][j];

                //Obliczanie odsetek
                double interest = oldBalance*interestRate[j];

                //Obliczanie tegorocznego salda
                balance[i][j] = oldBalance + interest;
            }
        }
        //Wydruk jednego wiersza stóp oprocentowania
        for (int i=0; i<interestRate.length; i++) {
            System.out.printf("%9.0f%%", 100 * interestRate[i]);
        }
        System.out.println();

        //Wydruk tabeli sald
        for (double[] row : balance){
            //Wydruk wiersza tabeli
            for (double b : row){
                System.out.printf("%10.2f",b);
            }
            System.out.println();
        }

         */

        final int NMAX = 10;
        //Tworzenie tablicy trójkątnej
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++) {
            odds[n] = new int[n + 1];
        }
        //Zapełnianie tablicy trójkątnej
        for (int n = 0; n < odds.length; n++) {
            for (int k = 0; k < odds[n].length; k++) {
                //Obliczanie współczynnika dwumianowego n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++) {
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                }
                odds[n][k] = lotteryOdds;
            }
            //Drukowanie tablicy trójkątnej
            for (int[] row : odds){
                for (int odd : row){
                    System.out.printf("%4d",odd);
                }
                System.out.println();
            }
        }
    }
}
