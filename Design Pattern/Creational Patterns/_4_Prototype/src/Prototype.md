<h1>
    Prototype
</h1>

<p>
    Wzorzec umożliwiający kopiowanie już istniejących obiektów bez referencji do nich
    Wzorzec ten polega na zaimplementowaniu interfejsu <code>prototypu</code>, który tworzy klon bieżącego obiektu
</p>

```java
public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public abstract Shape clone();
}
```

<p>
    Wzorzec ten wykorzysytwany jest gdy chcemy zwiększyć wydajność naszej aplikacji. Częste operacje na bazie danych 
nie są zalecane. W takim przypadku tworząc prototyp obiektów znajdujących się w bazie możemy je zmieniać i w razie 
potrzeby aktualizować bazę danych. 
</p>

<img src="img/prototype_pattern_uml_diagram.jpg">