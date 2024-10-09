import java.util.ArrayList;

public class prac26_ArrayList_Operations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("ArrayList after adding elements: " + numbers);
        // Search for an element
        int searchElement = 30;
        if (numbers.contains(searchElement)) {
            System.out.println(searchElement + " found in the ArrayList.");
        } else {
            System.out.println(searchElement + " not found in the ArrayList.");
        }

        // Remove an element
        int removeElement = 10;
        numbers.remove(Integer.valueOf(removeElement));

        // Print the ArrayList after removal
        System.out.println("ArrayList after removing " + removeElement + ": " + numbers);

    }

}
