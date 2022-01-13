public class Employee {
    private static int nextID = 1;
    private int id;


    public void setId() {
        id = nextID;
        nextID++;
    }

    public int getId() {
        return id;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void main(String[] arg) {
        var e = new Employee();
        e.setId();
        System.out.println(e.getId());
    }

}
