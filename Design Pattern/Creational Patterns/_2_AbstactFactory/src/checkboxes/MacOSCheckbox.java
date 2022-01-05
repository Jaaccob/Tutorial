package checkboxes;

import checkboxes.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Tworzenie checkbox'a dla MacOS");
    }
}
