import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class Class {
    public static void main(String[] arg){
        System.out.println(new Date());
        String s = new Date().toString();

        Date birthday = new Date();

        System.out.println(LocalDate.now());
        LocalDate newYearsEve = LocalDate.of(1999,12,31);
        int year = newYearsEve.getYear();
        int month = newYearsEve.getMonthValue();
        int day = newYearsEve.getDayOfMonth();


        LocalDate date = LocalDate.now();

        month = date.getMonthValue();
        int today = date.getDayOfMonth();
        System.out.println(month + "  " + today);


        //date = date.plusDays(7);
        date = date.minusDays(today-1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();
        System.out.println(value);


        System.out.println(" Pn  Wt  Śr  Czw  Pt  So  N");
        for (int i=0; i<value; i++){
            System.out.print("  ");
        }
        while (date.getMonthValue() == month){
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            date= date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1){
                System.out.println();
            }
        }
    }
}
