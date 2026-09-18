package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Variable {

	public void runExample() {
		int myNum = 15;
		double myDouble = 5.5;
		boolean myBoolean = true;
		String myString = "Hello, World!";

		printVariable(myNum);
		printVariable(myDouble);
		printVariable(myBoolean);
		printVariable(myString);
	}

	private void printVariable(Object o) {
		System.out.println("Value of " + o + " is " + o);
	}


	public static void main(String[] args) {
		Variable v = new Variable();
		v.runExample();
		
		
		/*In Java, variables that refer to objects store references to those objects rather than containing the objects themselves. 
		 * When one reference variable is assigned to another, both variables refer to the same object in memory, so changes made 
		 * through either reference affect the same underlying object. In contrast, creating a new object produces a separate object 
		 * with its own reference. The == operator determines whether two reference variables refer to the same object, while the equals() 
		 * method is generally used to determine whether two objects are logically equivalent based on their contents or defined equality criteria.*/
		
		// Create a list
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		// Print the list's contents
		System.out.println("List: " + list);

		// Create another reference to the same list
		List<Integer> listRef = list;

		// Print the contents through the second reference
		System.out.println("List reference: " + listRef);

		// Modify the list through the original reference
		list.set(0, 10);

		// Print the list through the original reference
		System.out.println("List: " + list);

		// Print the same list through the second reference
		System.out.println("List reference: " + listRef);
	}

}


