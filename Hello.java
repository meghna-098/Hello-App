/**
 * UC2: Display "Hello" with Command-Line Argument
 * This program prints a personalized greeting using command-line input
 */
public class Hello {

    /**
     * Main method - Entry point of the application
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Check if user provided a name
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default message if no argument is provided
            System.out.println("Hello, World!");
        }
    }
}