<h1>Abstract Factory</h1>

Wzorzec pozwala tworzyć grupy obiektów bez określania ich konkretnych klas
<p>
    Wzorzec ten zapewnia jeden z najlepszych sposobów tworzenia obiektów. Ważne jest aby wszystkie obiekty implementowały
    konkrerny interfejs.
</p>

```java
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Tworzenie przycisku dla MacOS");
    }
}
```

<p>
    Klasa MacOsButton implementuje ogólny interfejs Button. Tak samo implementuje go interfejs WindowsButton
</p>

```java
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Tworzenie przycisku dla Windows");
    }
}
```

<p>
    Następnym ważnym elementem jest stowrzenie interfejs <code>Fabryki</code>, która zawiera wszystkie metody w ramach 
    jednej rodziny obiektów.
</p>

```java
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
```
<p>
    Ostatnim elementem jaki musimy stworzyć jest aplikacja z którą będzie się komunikować klient. Aplikacja będzie 
zwracać referencję do konkretnych obiektów.
</p>

```java
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
```

<p>
<br><br>
    Schemat całego wzorca można przedstawić tak jak poniżej: 
</p>
<img src="img/abstractfactory_pattern_uml_diagram.jpg">
