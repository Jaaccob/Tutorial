package buttons;

import buttons.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Tworzenie przycisku dla Windows");
    }
}
