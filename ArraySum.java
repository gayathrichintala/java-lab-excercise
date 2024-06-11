package array;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10, 20, 30, 40, 50};

        // Calculate the sum of all elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Print the sum
        System.out.println("The sum of all elements in the array is: " + sum);
    }


	}


