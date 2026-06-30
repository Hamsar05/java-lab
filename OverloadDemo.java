public class OverloadDemo {
    void display(String msg) {
        System.out.println("String display: " + msg);
    }

    void display(int num) {
        System.out.println("Integer display: " + num);
    }

    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        obj.display("Hello Java");
        obj.display(100);
    }
    
}