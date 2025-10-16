import java.util.*;

public class Asort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2); 
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println("Before sorting: " + list);
        Collections.sort(list); //ascending
        System.out.println("After sorting: " + list);

        //descendging;
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After sorting: " + list);
    }
}
