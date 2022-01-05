<h1>
    Singleton
</h1>

<p>
    Wzorzec, który umozliwia tworzenie obiektów bez konieczności tworzenia instancji. Klasa, która sugeruje się wzorcem 
    utworzy tylko 1 obiekt danej klasy. 
</p>

<ul>
    <li>
    Ograniczenie dostępu do domyślnego konstruktora przez uczynienie go prywatnym, aby zapobiec stosowaniu operatora 
    new w stosunku do klasy Singleton.
    </li>
    <li>
    Utworzenie statycznej metody kreacyjnej, która będzie pełniła rolę konstruktora. Za kulisami, metoda ta wywoła 
    prywatny konstruktor, aby utworzyć instancję obiektu i umieści go w polu statycznym klasy. Wszystkie kolejne 
    wywołania tej metody zwrócą już istniejący obiekt.
    </li>
</ul>