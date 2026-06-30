public class EvenSwitch {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            switch (i % 2) {
                case 0:
                    System.out.println(i);
                    break;
                default:
                    break;
            }

        }
    }
}