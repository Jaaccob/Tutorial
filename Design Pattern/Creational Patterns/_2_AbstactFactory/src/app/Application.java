package app;

import buttons.Button;
import checkboxes.Checkbox;
import factores.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        this.button.paint();
        this.checkbox.paint();
    }
}
