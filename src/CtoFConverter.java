import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempC = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the temperature in Celsius (C): ");
            if (in.hasNextDouble()) {
                tempC = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input: " + trash);
                System.out.println("Please enter a valid number for the temperature.");
            }
        } while (!done);

        double tempF = (tempC * 9 / 5) + 32;
        System.out.printf("\nThe temperature %.2f°C is equal to %.2f°F.%n", tempC, tempF);
    }
}