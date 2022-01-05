package factory;

import buttons.Button;
import buttons.HTMLButton;

public class HTMLDialog extends Dialog{
    @Override
    public void renderWindow() {
        super.renderWindow();
    }

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
