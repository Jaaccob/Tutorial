import adapters.SquarePegAdapter;
import round.RoundHole;
import round.RoundPeg;
import square.SquarePeg;

public class Demo {
    public static void main(String... args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Kołek z promieniem " + rpeg.getRadius() + " zmieści się w otworze o promieniu " + hole.getRadius());
        }
        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Kwadratowy kołek z średnicą " + smallSqPegAdapter.getRadius() + " zmieści się w otworze o promieniu " + hole.getRadius());
        } else {
            System.out.println("Kwadratowy kołek z średnicą " + smallSqPegAdapter.getRadius() + " nie zmieści się w otworze o promieniu " + hole.getRadius());
        }
        if (hole.fits(largeSqPegAdapter)) {
            System.out.println("Kwadratowy kołek z średnicą " + largeSqPegAdapter.getRadius() + " zmieści się w otworze o promieniu " + hole.getRadius());
        } else {
            System.out.println("Kwadratowy kołek z średnicą " + largeSqPegAdapter.getRadius() + " nie zmieści się w otworze o promieniu " + hole.getRadius());
        }
    }
}
