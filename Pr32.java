import java.util.*;

public class Pr32 {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        LinkedList<Integer> rollNumbers = new LinkedList<Integer>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        System.out.println("Roll Number 102 Found: " + searchElement(rollNumbers, 102));
        System.out.println("Roll Number 105 Found: " + searchElement(rollNumbers, 105));

        LinkedList<String> names = new LinkedList<String>();
        names.add("Amit");
        names.add("Neha");
        names.add("Rahul");

        System.out.println("Name Neha Found: " + searchElement(names, "Neha"));
        System.out.println("Name Priya Found: " + searchElement(names, "Priya"));
    }
}
