public class App {

    public static void main(String[] args) {

        // Using ternary operator to assign default value
        String name = (args.length > 0) ? args[0] : "World";

        // Display greeting
        System.out.println("Hello, " + name + "!");
    }
}