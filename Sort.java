package collections;

import java.util.*;


public class Sort {
public static void main(String[] args) {
        
		List<Integer> list = new ArrayList<>(Arrays.asList(10,42,69,54,11,4,86));
		System.out.println("Before Sorting:");
		System.out.println(list);
		System.out.println("After Sorting(Asc):");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("After Sorting(Desc):");
		Collections.reverse(list);
		System.out.println(list);
	}

}


