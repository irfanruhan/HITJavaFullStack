package practice;
import java.util.*;
public class IteratingOver2DLists {

	// Java code to demonstrate the concept of
	// list of lists using loop
	 

	  
	    // Iterate the 2D list using loop
	    // and print each element
	    public static <K> void
	    iterateUsingForEach(List<List<K> > listOfLists)
	    {
	  
	        // Iterate the 2D list
	        // and print each element
	        System.out.println("[");
	  
	        for (List<K> list : listOfLists) {
	            System.out.print("  [");
	  
	            for (K item : list) {
	                System.out.print("  "
	                                 + item
	                                 + ", ");
	            }
	            System.out.println("], ");
	        }
	        System.out.println("]");
	    }
	  
	    // Driver code
	    public static void main(String[] args)
	    {
	  
	        // List of Lists
	        ArrayList<List<Integer> > listOfLists
	            = new ArrayList<List<Integer> >();
	  
	        // Create N lists one by one
	        // and append to the list of lists
	        List<Integer> list1
	            = new ArrayList<Integer>();
	        list1.add(5);
	        list1.add(10);
	        listOfLists.add(list1);
	  
	        List<Integer> list2
	            = new ArrayList<Integer>();
	        list2.add(1);
	        listOfLists.add(list2);
	  
	        List<Integer> list3
	            = new ArrayList<Integer>();
	        list3.add(20);
	        list3.add(30);
	        list3.add(40);
	        listOfLists.add(list3);
	  
	        // Iterate the 2D list
	        iterateUsingForEach(listOfLists);
	    }

}
