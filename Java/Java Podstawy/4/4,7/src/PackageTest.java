import com.horstmann.corejava.Employee;
import static java.lang.System.*;

public class PackageTest {
    public static void main(String[] arg){
        var harry = new Employee("Hubert Kowalski",50000,1989,10,1);
        harry.raiseSalary(5);

        out.println("name= "+harry.getName()+" ,salary= "+harry.getSalary());
    }

}
