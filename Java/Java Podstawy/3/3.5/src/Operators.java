public class Operators {
    public static void main(String[] arg){
        double x = 4;
        double y = Math.sqrt(x);
        System.out.println(y);
        y = Math.pow(x,2);
        double floorMod = Math.floorMod(4+12,3);
        System.out.println(floorMod);
        System.out.println(Math.sin(x));
        System.out.println(Math.cos(x));
        System.out.println(Math.tan(x));
        System.out.println(Math.atan(x));
        System.out.println(Math.atan2(x,y));
    }
}
