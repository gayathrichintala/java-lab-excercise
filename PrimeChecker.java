package simpleif;

public class PrimeChecker {

	public static void main(String[] args) {
		int number = 17; // Change this number to test other cases
        if(isPrime(number))
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
    
    public static boolean isPrime(int number) {
        if(number <= 1)
            return false;
        if(number <= 3)
            return true;
        
        if(number % 2 == 0 || number % 3 == 0)
            return false;
        
        for(int i = 5; i * i <= number; i += 6) {
            if(number % i == 0 || number % (i + 2) == 0)
                return false;
        }
        
        return true;
    }
}

	
