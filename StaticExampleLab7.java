public class StaticExampleLab7 {
    static int count = 3;

    public static int incrementAndGetCount() {
        count++;
        return count;
    }

    public static void main(String[] args) {
        int currentCount = StaticExampleLab7.incrementAndGetCount();
        System.out.println("Current count: " + currentCount); 

        int nextCount = StaticExampleLab7.incrementAndGetCount();
        System.out.println("Next count: " + nextCount); 
    }
}