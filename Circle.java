import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive radius of the circle to calculate the area:");
        int radius = scanner.nextInt();

        double area = calculateArea(radius);

        System.out.println("The area of a circle with radius " + radius + " is " + area);
    }

    public static double calculateArea(int radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
}
