package basic;

public class StringExample {
	public static void main(String[] args) {

        // Create a String
        String text = "Hello, Java World!";

        // Get the length of the String
        System.out.println("Length: " + text.length());

        // Access a character by its index
        System.out.println("First character: " + text.charAt(0));

        // Convert to uppercase and lowercase
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // Check whether the String contains a specific sequence
        System.out.println("Contains Java: " + text.contains("Java"));

        // Check whether the String starts or ends with specific text
        System.out.println("Starts with Hello: " + text.startsWith("Hello"));
        System.out.println("Ends with !: " + text.endsWith("!"));

        // Find the position of a substring
        System.out.println("Index of Java: " + text.indexOf("Java"));

        // Extract part of a String
        System.out.println("Substring: " + text.substring(7, 11));

        // Replace part of a String
        String replaced = text.replace("Java", "World");
        System.out.println("Replaced: " + replaced);

        // Split a String into an array
        String[] words = text.split(" ");

        System.out.println("Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Compare Strings by content
        String a = new String("Java");
        String b = new String("Java");
        String k = a;

        System.out.println("a == b: " + (a == b));
        System.out.println("a == k: " + (a == k));
        System.out.println("a.equals(b): " + a.equals(b));

        // String concatenation
        String language = "Java";
        String version = "8";

        String result = language + " " + version;
        System.out.println("Result: " + result);

        // StringBuilder is useful when repeatedly modifying strings
        StringBuilder builder = new StringBuilder("Hello");

        builder.append(" ");
        builder.append("Java");

        System.out.println("StringBuilder: " + builder);
        

        String d = "Java";

        // Creates a new String object on the heap
        String e = new String("Java");

        // Returns the String Pool version of "Java"
        String c = b.intern();

        System.out.println(d == e); // false
        System.out.println(d == c); // true
        System.out.println(d.equals(e)); // true
        
    }
}
