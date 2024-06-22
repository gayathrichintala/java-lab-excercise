package polymorphism;

public class GeometryCalculator {
	
	    // Method to calculate area of a square
	    public double calculateArea(double sideLength) {
	        return sideLength * sideLength;
	    }

	    // Method to calculate area of a rectangle
	    public double calculateArea(double length, double width) {
	        return length * width;
	    }

	    // Method to calculate area of a circle
	    public double calculateArea(double radius) {
	        return Math.PI * radius * radius;
	    }

	    public static void main(String[] args) {
	        GeometryCalculator calculator = new GeometryCalculator();

	        // Calculate area of a square
	        double squareArea = calculator.calculateArea(5.0);
	        System.out.println("Area of the square: " + squareArea);

	        // Calculate area of a rectangle
	        double rectangleArea = calculator.calculateArea(4.0, 6.0);
	        System.out.println("Area of the rectangle: " + rectangleArea);

	        // Calculate area of a circle
	        double circleArea = calculator.calculateArea(3.0);
	        System.out.println("Area of the circle: " + circleArea);
	    }
	}


