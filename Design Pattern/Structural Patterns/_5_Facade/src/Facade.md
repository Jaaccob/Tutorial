<html>
<body>
    <h1>
        Facade
    </h1>
    <p>
        Wzorzec projektowy pozwalający programiście na prostrzą współpracę z większymi bibliotekami czy frameworkami. 
        Fasada ukrywa szczegóły implementacji od logiki biznesowej udostępniając tylko prosty i czytelny interfejs do 
        pracy
    </p>
</body>
</html>

```java
public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
   }

   public void drawCircle() {circle.draw();}
   public void drawRectangle() {rectangle.draw();}
   public void drawSquare() {square.draw();}
}
```
<p>
    Taki interfejs umożliwia w łatwy sposób korzystać z skomplikowanych funkcjonalności większego systemu.
</p>