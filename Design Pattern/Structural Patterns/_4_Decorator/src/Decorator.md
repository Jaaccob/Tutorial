<h1>
    Decorator
</h1>
<p>
    Wzorzec pozwalający dekorować istniejący obiekt bez logicznej jego zmiany. Wzorzec zapewnia dodatkowe 
    funkcjonalności klasy opakowywanej. Ważnym elementem jest interfejs, który będzie połączeniem logicznej częsci 
    aplikacji od funkcjonalnej częsci.  
</p>

```java
public interface DataSource {
    void writeData(String data);
    String readData();
}
```
<p>
    Nastepnie potrzebujemy logiczną część naszej aplikacji
</p>

```java
public class FileDataSource implements DataSource {
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }
    //Dalsza implementacja
}
```
<p>
    Ostatecznie potrzebujemy dekoratora, który rozszerzy naszą funkcjonalność. 
</p>
