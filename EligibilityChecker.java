package functions;

public class EligibilityChecker {
	private int birthYear;

    // Constructor
    public EligibilityChecker(int birthYear) {
        this.birthYear = birthYear;
    }

    // Method to calculate age
    public int calculateAge(int currentYear) {
        return currentYear - birthYear;
    }

    // Method to check eligibility
    public boolean checkEligibility(int age) {
        return age >= 18;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get birth year from the user
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Get the current year (you can also hardcode this value)
        int currentYear = 2024;

        // Create an instance of the EligibilityChecker class
        EligibilityChecker checker = new EligibilityChecker(birthYear);

        // Calculate the age
        int age = checker.calculateAge(currentYear);

        // Check eligibility
        if (checker.checkEligibility(age)) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }
    }


}
