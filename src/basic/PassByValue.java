package basic;

import java.util.ArrayList;
import java.util.List;

public class PassByValue {
	public static void main(String[] args) {

        // Create a List object and store its reference in 'list'
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Before method call: " + list);

        // Java passes a copy of the reference to the method
        modifyList(list);

        // The original List object was modified inside the method
        System.out.println("After method call:  " + list);
    }

    public static void modifyList(List<Integer> listRef) {

        // 'listRef' is a copy of the reference,
        // but it still points to the same List object as 'list'
        listRef.add(4);

        // Reassigning 'listRef' only changes the local reference.
        // It does NOT change what 'list' refers to in main().
        listRef = new ArrayList<>();
        listRef.add(100);

        System.out.println("Inside method:       " + listRef);
    }
}
