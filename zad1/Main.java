import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Triple<Integer, String, Double> triple1 = new Triple<>(50, "B", 7.5);
        Triple<Integer, String, Double> triple2 = new Triple<>(7, "B", 7.5);
        Triple<Integer, String, Double> triple3 = new Triple<>(1, "R", 14.5);
        Triple<Integer, String, Double> triple4 = new Triple<>(13, "S", 3.5);
        Triple<Integer, String, Double> triple5 = new Triple<>(77, "W", 1.5);
        Triple<Integer, String, Double> triple6 = new Triple<>(32, "F", 20.5);
        Triple<Integer, String, Double> triple7 = new Triple<>(49, "G", 5.5);
        Triple<Integer, String, Double> triple8 = new Triple<>(77, "W", 1.5);
        Triple<Integer, String, Double> triple9 = new Triple<>(41, "I", 101.5);
        Triple<Integer, String, Double> triple10 = new Triple<>(92, "H", 33.5);

        System.out.println("Triple1:  " + triple1);
        System.out.println("Triple2:  " + triple2);
        System.out.println("Triple3:  " + triple3);
        System.out.println("Triple4:  " + triple4);
        System.out.println("Triple5:  " + triple5);
        System.out.println("Triple6:  " + triple6);
        System.out.println("Triple7:  " + triple7);
        System.out.println("Triple8:  " + triple8);
        System.out.println("Triple9:  " + triple9);
        System.out.println("Triple10: " + triple10);

        System.out.println("\nIs triple5 equal to triple8 as an object?");

        System.out.println(triple5.equals(triple8)); // true

        System.out.println("Is triple1 equal to triple2 as an object?");
        System.out.println(triple1.equals(triple2)); // false

        System.out.println("Is triple5 equal to triple10 as an object?");
        System.out.println(triple5.equals(triple10)); // false

        System.out.println("Is triple3 equal to triple3 as an object?");
        System.out.println(triple3.equals(triple3)); // true

        List<Triple<Integer, String, Double>> list = new ArrayList<>();
        list.add(triple1);
        list.add(triple2);
        list.add(triple3);
        list.add(triple4);
        list.add(triple5);
        list.add(triple6);
        list.add(triple7);
        list.add(triple8);
        list.add(triple9);
        list.add(triple10);

        Collections.sort(list);
        System.out.println("\nComparable");

        for (Triple<Integer, String, Double> t : list) {
            System.out.println(t);
        }

        System.out.println("\nComparator");

        Collections.sort(list, new ReverseTripleComparator<>());

        for (Triple<Integer, String, Double> t : list) {
            System.out.println(t);
        }
    }
}



