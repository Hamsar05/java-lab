//Program using ArrayList<Integer> to insert 10 elements, remove duplicate elements and display the final list.
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(40);
        list.add(60);
        list.add(70);

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        ArrayList<Integer> finalList = new ArrayList<>(set);

        System.out.println("Final List:");
        System.out.println(finalList);
    }
}
