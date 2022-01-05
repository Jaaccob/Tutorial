import factory.Dialog;
import factory.HTMLDialog;
import factory.WindowDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HTMLDialog();
        }
    }
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
