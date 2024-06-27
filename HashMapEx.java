package collections;
import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		// Create a HashMap to store cricketer names and their scores
        HashMap<String, Integer> cricketerScores = new HashMap<>();

        // Adding some entries to the HashMap
        cricketerScores.put("Virat Kohli", 100);
        cricketerScores.put("Rohit Sharma", 90);
        cricketerScores.put("MS Dhoni", 120);

        // Displaying the HashMap contents
        System.out.println("Cricketer Scores:");
        for (Map.Entry<String, Integer> entry : cricketerScores.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Searching for a batsman and displaying his score
        String batsman = "Virat Kohli";
        if (cricketerScores.containsKey(batsman)) {
            int score = cricketerScores.get(batsman);
            System.out.println("\nScore of " + batsman + ": " + score);
        } else {
            System.out.println("\nScore not found for " + batsman);
        }
    }


	}


