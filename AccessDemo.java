class Parent {
    private int a = 10;
    protected int b = 20;
    public int c = 30;

    void showPrivate() {
        System.out.println(a);
    }
}

class Child extends Parent {
    void display() {
        showPrivate();
        System.out.println(b);
        System.out.println(c);
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}