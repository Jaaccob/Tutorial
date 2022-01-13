import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Date;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Skaner {

    public static void main(String[] arg) throws IOException {
        //Scanner in = new Scanner(System.in);
        //System.out.println("Jak sie nazywasz ?");
        //String name = in.nextLine();
        //System.out.println("Nazywasz sie " + name);

        //System.out.println("A jak masz na nazwisko?");
        //String firstName = in.next();
        //System.out.println("Masz na nazwisko " + firstName);

        //System.out.println("Ile masz lat?");
        //int age = in.nextInt();
        //System.out.println("Masz " + age);

        //Console console = System.console();
        //String username = console.readLine("Nazwa użytkownika: ");
        //char[] passwd = console.readPassword("Hasło: ");
        //System.out.println("Twoja nazwa użytkownika: " + username);

        double x = 1000.0/3.0;
        System.out.println(x);

        System.out.printf("%8.2f",x);
        System.out.println();
        System.out.printf("%tc", new Date());
        System.out.println();
        System.out.printf("%tF", new Date());
        System.out.println();
        System.out.printf("%1$s %2$te %2$tB %2$tY", "Termin płatności: ",new Date());
        System.out.println();

        Scanner in = new Scanner(Path.of("/MojePliki1.txt"), StandardCharsets.UTF_8);
        while (in.hasNext()){
            System.out.println(in.nextLine());
        }
        PrintWriter out = new PrintWriter("/MojePliki2.txt", UTF_8);

    }
}
