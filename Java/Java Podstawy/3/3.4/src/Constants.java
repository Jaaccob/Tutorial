public class Constants {

    public static final double CM_PER_INCH = 2.54;

    enum Rozmiar {MAŁY, ŚREDNI, DUŻY, EKSTRA_DUZY };


    public static void main(String[] arg) {
        double salary;
        int vacationDays;
        long earthPopulation;
        boolean done;

        vacationDays = 12;

        //final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Rozmiar papieru w centymetrach: " +
                +paperWidth * CM_PER_INCH + " na " + paperHeight * CM_PER_INCH);

        Rozmiar s = Rozmiar.ŚREDNI;
    }
}
