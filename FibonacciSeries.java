package simpleif;

public class   FibonacciSeries {

	public static void main(String[] args) {
		int numTerms = 10; // Change this value to generate more or fewer terms
        generateFibonacciSeries(numTerms);
    }
    
    public static void generateFibonacciSeries(int numTerms) {
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;

        System.out.println("Fibonacci Series up to " + numTerms + " terms:");
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(firstTerm + " ");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    

	}

}
