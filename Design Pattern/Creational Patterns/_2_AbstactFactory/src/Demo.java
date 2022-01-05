import app.Application;
import factores.GUIFactory;
import factores.MacOSFactory;
import factores.WindowsFactory;

import java.util.Locale;

public class Demo {
    private static Application configureApplication(){
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        System.out.println(osName);
        if (osName.contains("mac")){
            factory = new MacOSFactory();
            app = new Application(factory);
        }
        else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }
    public static void main(String[] args){
        Application app = configureApplication();
        app.paint();
    }
}
