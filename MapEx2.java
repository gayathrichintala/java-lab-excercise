package collections;
import java.util.*;


public class MapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			TreeMap<Integer, String> ageMap = new TreeMap<>();
			ageMap.put(25, "Krish");
			ageMap.put(26, "Gopal");
			ageMap.put(30, "Solmen");
			ageMap.put(27, "Virag");
			/*System.out.println(ageMap.lowerKey(33)); // Returns the greatest key less than 33 (30)
			System.out.println(ageMap.higherKey(33)); // Returns the smallest key greater than 33		(35)
			System.out.println(ageMap.floorKey(37)); // Returns the greatest key less than or equal	to 37 (35)
			System.out.println(ageMap.ceilingKey(37)); // Returns the smallest key greater than or equal to 37 (40)
	*/
			/*int low=ageMap.lowerKey(33);
			System.out.println(ageMap.get(low));*/
			System.out.println(ageMap.firstKey());
			System.out.println(ageMap.lastKey());
			System.out.println(ageMap.descendingKeySet());
			System.out.println(ageMap.descendingMap());
		

	

	}

}
