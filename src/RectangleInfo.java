import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean done = false;

        double width = 0;
        double height = 0;

        // Input for width
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input: " + trash + ". Please enter a valid number.");
            }
        } while (!done);

        // Input for height
        done = false;
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input: " + trash + ". Please enter a valid number.");
            }
        } while (!done);

        // Calculations
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        // Output
        System.out.printf("\nFor a rectangle with width %.2f and height %.2f:%n", width, height);
        System.out.printf("The area is: %.2f%n", area);
        System.out.printf("The perimeter is: %.2f%n", perimeter);
        System.out.printf("The length of the diagonal is: %.2f%n", diagonal);
    }
}