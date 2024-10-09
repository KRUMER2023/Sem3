import java.util.ArrayList; 
public class prac25 { 
 public static void main(String[] args) { 
 // Create an ArrayList to store integers 
 ArrayList<Integer> dynamicArray = new ArrayList<>(); 
 // Add elements to the dynamic array 
 dynamicArray.add(10); 
 dynamicArray.add(20); 
 dynamicArray.add(30); 
 dynamicArray.add(40); 
 // Print the contents of the dynamic array 
 System.out.println("Contents of the dynamic array:"); 
 for (int i = 0; i < dynamicArray.size(); i++) { 
 System.out.println(dynamicArray.get(i)); 
 } 
 } 
}