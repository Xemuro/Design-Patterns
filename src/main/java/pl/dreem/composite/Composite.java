package pl.dreem.composite;

// 1. "lowest common denominator"
interface Component {
    void traverse();
}

// 2. "Isa" relationship - leaf
class Primitive implements Component {
    private int value;

    public Primitive(int val) {
        value = val;
    }

    public void traverse() {
        System.out.print( value + "  " );
    }
}

// 2. "Isa" relationship
abstract class Composite implements Component {
    // 3. Couple to interface
    private Component[] children = new Component[9];
    private int total = 0;
    private int value;
    public Composite(int val) {
        value = val;
    }

    // 3. Couple to interface
    public void add(Component c) {
        children[total++] = c;
    }

    public void traverse() {
        System.out.print(value + "  ");
        for (int i=0; i < total; i++) {
            // 4. Delegation and polymorphism
            children[i].traverse();
        }
    }
}

// Two different kinds of "container" classes.  Most of the
// "meat" is in the Composite base class.
class Row extends Composite {
    public Row(int val) {
        super(val);
    }

    public void traverse() {
        System.out.print("Row");
        super.traverse();
    }
}

class Column extends Composite {
    public Column(int val) {
        super(val);
    }

    public void traverse() {
        System.out.print("Col");
        super.traverse();
    }
}