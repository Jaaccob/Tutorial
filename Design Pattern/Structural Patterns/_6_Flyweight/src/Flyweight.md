<h1>
    Flyweight
</h1>
<p>
    Wzorzec umożliwiający zmniejszenie wykorzystanej pamięci RAM poprzez zmniejszenie liczebności podobnych obiektów. 
    Wzorzec próbuje wykorzystać już istniejące obiekty podobnego rodzaju. Nowe obiekty zostają utworzone jesli nie 
    zostanie znaleziony pasujący obiekt. Często jest wykorzystywany do obiektów podobnych typów (np w Fabrykach).
</p>

```java
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
```
<p>
    W tym przypadku zmniejszamy wykorzystywany RAM poprzez segregowanie drzew poprzez ich typ. Nie utworzymy elementu 
    jeśli podobny typ znajduje się już na liście.
</p>

```java
public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics g) {
        for (Tree tree : trees) {
            tree.draw(g);
        }
    }
}
```