import java.util.Scanner;

public class PersonalInfoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Read last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Read city
        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        // Read age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Clear buffer after nextInt()

        // Read height
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        // Convert height to centimeters
        int heightInCm = (int) (height * 100);

        // Display information
        System.out.println("\nOutput:");
        System.out.println("My name is " + firstName + " " + lastName + ", I am " + age + " years old, " +
                           "I live in " + city + ", my height is " + heightInCm + " cm.");

        // Close the Scanner
        scanner.close();
    }
}
