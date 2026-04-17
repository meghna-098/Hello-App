public class HelloAppp {

    public static void main(String[] args) {

        String message;

        if (args.length > 0) {
            // Join all names with comma and space
            String names = String.join(", ", args);
            message = "Hello, " + names + "!";
        } else {
            message = "Hello, World!";
        }

        System.out.println(message);
    }
}