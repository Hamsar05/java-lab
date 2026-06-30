public class CopyConstructor {
    int x;

    public CopyConstructor() {
        x = 10;
        System.out.println("Public Copy constructor called. x = " + x);
    }

    private CopyConstructor(int a) {
        x = a;
        System.out.println("Private Copy constructor called. x = " + x);
    }

    protected CopyConstructor(String s) {
        x = 20;
        System.out.println("Protected Copy constructor called. Message: " + s);
    }

    public static void main(String[] args) {
        CopyConstructor c1 = new CopyConstructor();     
        CopyConstructor c2 = new CopyConstructor(50);     
        CopyConstructor c3 = new CopyConstructor("Hello"); 
    }
}
