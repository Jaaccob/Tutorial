package buttons;

import buttons.Button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Tworzenie przycisku dla MacOS");
    }
}
