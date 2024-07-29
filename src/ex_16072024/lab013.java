package ex_16072024;
import java.util.Scanner;

public class lab013 {
    public static void main(String[] args) {
//        int age = 10; // Decimal Number System
//        int b = 0b1010; // Binday - Automation x
//        int octal = 0101; // If your Automation you may be working with these numbers
//        int hex = 0Xface;

        // https://www.rapidtables.com/convert/number/decimal-to-hex.html?x=10

        // ASCII Table
        // 0-9 48-57
        // A-Z 65-90
        // a-z 97-122
//      // 0-9 48-57


        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);

        // Get the ASCII value of the character
        int asciiValue = (int) character;

        // Convert the ASCII value to different number systems
        String binary = Integer.toBinaryString(asciiValue);
        String octal = Integer.toOctalString(asciiValue);
        String hexadecimal = Integer.toHexString(asciiValue).toUpperCase();

        // Print the results
        System.out.println("Character: " + character);
        System.out.println("ASCII Value (Decimal): " + asciiValue);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);

        // Close the scanner
        sc.close();
    }
}
