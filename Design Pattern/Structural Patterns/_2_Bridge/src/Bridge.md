<h1>
    Bridge
</h1>
<p>
    Wzorzec wskazujący aby rozdzielic abstrakcję od implementacji. Wzorzec to właśnie most łączący te dwie implementacje.
    Można w ten sposób rozróżnic różne sposoby na tworzenie podobnych wyników (np. rysowanie koła w różnych kolorach). 
</p>

```java
public class RedCircle implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
   }
}
```
```java
public class GreenCircle implements DrawAPI {
   @Override
   public void drawCircle(int radius, int x, int y) {
      System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
   }
}
```

<p>
    Obie klasy implementują ten sam interfejs. Następnie musimy utworzyć abstrakcję, która będzie wskazywać jak 
    aplikacja ma się zachowywać.
</p>

```java
public abstract class Shape {
   protected DrawAPI drawAPI;
   
   protected Shape(DrawAPI drawAPI){
      this.drawAPI = drawAPI;
   }
   public abstract void draw();	
}
```

<p>
    Pomostem jest interfejs DrawAPI.<br>
    Abstrakcją jest klasa Shape<br>
    Klasa implementująca są już poszczególne klasy
</p>
<p>
    Ten wzorzec pomaga nam oddzielić implementację od abstrakcji. Dzięki temu w łatwy sposób możemy wprowadzać zmiany do
    naszej aplikacji nie bojąc się, że jest ona bezpośrednio połączona z wykonaniem.
</p>