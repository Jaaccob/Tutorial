import java.io.IOException;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class WielkieLiczby {
    public static void main(String[] arg) {
        BigInteger x = BigInteger.valueOf(100);
        BigInteger reallyBig = new BigInteger("721983712893781298371923812739187981379128372198317937");

        System.out.println(x);
        System.out.printf("%d", reallyBig);
        BigInteger a = BigInteger.valueOf(320);
        BigInteger b = BigInteger.valueOf(4102);
        BigInteger c = a.add(b);
        BigInteger d = c.multiply(b.add(BigInteger.valueOf(2)));
        System.out.println(" ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);


        Scanner in = new Scanner(System.in);
        System.out.println("Ile liczb ma być wylosowanych? ");
        int k = in.nextInt();

        System.out.println("Jaka jest górna granica przedziału losowanych liczb? ");
        int n = in.nextInt();

        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for (int i = 0; i <= k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
        }

        System.out.println("Twoje szanse to 1 do " + lotteryOdds + ". Powodzenia");
    }
}
