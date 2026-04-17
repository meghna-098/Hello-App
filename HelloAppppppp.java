public class HelloAppppppp {

    public static void main(String[] args) {

        // Check if arguments are provided
        String message = (args.length == 0)
                ? "Hello, World!"
                : "Hello, " + String.join(", ", args) + "!";

        // Print greeting
        System.out.println(message);
    }
}