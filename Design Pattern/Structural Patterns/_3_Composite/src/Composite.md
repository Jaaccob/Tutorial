<h1>
    Composite
</h1>

<p>
    Wzorzec pozwalający traktować grupe obiektów jako pojedynczy obiekt. Wzorzec składa się z grupy obiektów ułożonych 
    w formę drzewa. 
</p>

```java
public interface Shape {
    //implementacja
}
public class BaseShape implements Shape {
    //implementacja
}
public class Circle extends BaseShape {
    //implementacja
}
```

<p>
    Wzorzec ten zapewnia możliwośc pracowania z całym drzewem obiektów jak i pojedynczymi elementami. Zapewnia to 
    wspólny interfejs. W naszym przypadku zapewnia to poniższa klasa w której mamy listę elementów <code>Shape</code>
</p>

```java
public class CompoundShape extends BaseShape {
    protected List<Shape> children = new ArrayList<>();
}
```