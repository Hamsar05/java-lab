public class Constructor {
    int x;

    public Constructor() {
        x = 10; 
        System.out.println("Public Constructor called. Default value x = " + x);
    }

    
    private Constructor(int val) {
        x = val; 
        System.out.println("Private Constructor called. Value x = " + x);
    }

    protected Constructor(String message) {
        System.out.println("Protected Constructor called. Message: " + message);
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor(50);
        Constructor obj3 = new Constructor("Hello World");
    }
}