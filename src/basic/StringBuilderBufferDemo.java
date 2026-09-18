package basic;

public class StringBuilderBufferDemo {

    public static void main(String[] args) {

        // ========================================
        // 1. StringBuilder
        // ========================================

        StringBuilder builder = new StringBuilder("Hello");

        // Add text to the end
        builder.append(" Java");

        System.out.println(builder);
        // Hello Java

        // Insert text at a specific position
        builder.insert(6, "World ");

        System.out.println(builder);
        // Hello World Java

        // Replace part of the string
        builder.replace(6, 12, "Beautiful");

        System.out.println(builder);
        // Hello Beautiful Java

        // Delete part of the string
        builder.delete(6, 16);

        System.out.println(builder);
        // Hello Java

        // Reverse the string
        builder.reverse();

        System.out.println(builder);
        // avaJ olleH


        // ========================================
        // 2. StringBuffer
        // ========================================

        StringBuffer buffer = new StringBuffer("Hello");

        buffer.append(" Java");

        System.out.println(buffer);
        // Hello Java

        buffer.insert(6, "World ");

        System.out.println(buffer);
        // Hello World Java

        buffer.reverse();

        System.out.println(buffer);
        // avaJ dlroW olleH


        // ========================================
        // 3. Converting to String
        // ========================================

        StringBuilder message = new StringBuilder("Hello");

        message.append(" Ken");

        String result = message.toString();

        System.out.println(result);
        // Hello Ken
    }
}