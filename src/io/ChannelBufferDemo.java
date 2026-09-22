package io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ChannelBufferDemo {

    public static void main(String[] args) {

        Path file = Paths.get("channel-buffer.txt");

        try {
            // ========================================
            // 1. Create/Open FileChannel
            // ========================================

            FileChannel channel = FileChannel.open(
                    file,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE,
                    StandardOpenOption.READ
            );

            // ========================================
            // 2. Create a ByteBuffer
            // ========================================

            ByteBuffer buffer =
                    ByteBuffer.allocate(1024);

            // ========================================
            // 3. Put data into the buffer
            // ========================================

            String message = "Hello from NIO!";

            buffer.put(message.getBytes());

            System.out.println("Buffer position after put: "
                    + buffer.position());

            // ========================================
            // 4. Prepare buffer for reading
            // ========================================

            buffer.flip();

            System.out.println("Buffer position after flip: "
                    + buffer.position());

            System.out.println("Buffer limit after flip: "
                    + buffer.limit());

            // ========================================
            // 5. Write buffer to file
            // ========================================

            channel.write(buffer);

            // ========================================
            // 6. Close channel
            // ========================================

            channel.close();

            // ========================================
            // 7. Open file again for reading
            // ========================================

            channel = FileChannel.open(
                    file,
                    StandardOpenOption.READ
            );

            // Create a new buffer
            buffer = ByteBuffer.allocate(1024);

            // ========================================
            // 8. Read file into buffer
            // ========================================

            int bytesRead = channel.read(buffer);

            System.out.println("\nBytes read: " + bytesRead);

            // ========================================
            // 9. Prepare buffer for reading
            // ========================================

            buffer.flip();

            // ========================================
            // 10. Read data from buffer
            // ========================================

            byte[] data = new byte[buffer.remaining()];

            buffer.get(data);

            String result = new String(data);

            System.out.println("File content:");
            System.out.println(result);

            // ========================================
            // 11. Close channel
            // ========================================

            channel.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}