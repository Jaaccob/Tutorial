<h1>
    Proxy
</h1>
<p> 
    Wzorzec udostępniający funkcjonalnośc innej klasy poprzez klasę majacą orygilnalny obiekt.
</p>

```java
public interface Image {
   void display();
}
```
```java
public class RealImage implements Image {

   private String fileName;

   public RealImage(String fileName){
      this.fileName = fileName;
      loadFromDisk(fileName);
   }

   @Override
   public void display() {
      System.out.println("Displaying " + fileName);
   }

   private void loadFromDisk(String fileName){
      System.out.println("Loading " + fileName);
   }
}
```