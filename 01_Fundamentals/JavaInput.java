import java.util.Scanner;

class JavaInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc is a object of Scanner class

        System.out.print("Enter an integer: ");
        int number = sc.nextInt(); // Read an integer input
        System.out.println("You entered: " + number); // Print the integer
        sc.nextLine(); // consume the leftover newline

        System.out.print("Enter your name: ");
        String name = sc.next(); // Read a string input
        System.out.println("Hello, " + name + "!"); // Print the string
        sc.nextLine(); // consume the leftover newline

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine(); // Read a string input
        System.out.println("Hello, " + fullName + "!"); // Print the string
        sc.close(); // // closing the scanner object
    }
}
