package J25_06_24;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class File_Write {
    public static void writeFile(String filename, String content){
        Path filePath = Paths.get(filename);

        try (FileChannel writeChannel = FileChannel.open(filePath, StandardOpenOption.CREATE,StandardOpenOption.WRITE)){
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            buffer.put(content.getBytes());
            buffer.flip();
            writeChannel.write(buffer);
            System.out.println("File has been successfully created.");
        }catch (IOException e){
            e.printStackTrace();
        }


    }
    public static void readFile(String filename){
        Path filePath = Paths.get(filename);

        try(FileChannel readChannel = FileChannel.open(filePath, StandardOpenOption.READ)){
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            int bytesRead = readChannel.read(buffer);

            while(bytesRead != -1){
                buffer.flip();

//                while(buffer.hasRemaining()){
//                    System.out.print((char) buffer.get());
//                }
                String chunk = StandardCharsets.UTF_8.decode(buffer).toString();
                System.out.println(chunk);

                buffer.clear();
                bytesRead = readChannel.read(buffer);
            }
            System.out.println("\n'File has been read completely'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main (String [] args){
//        writeFile("dinner-menu.txt", "What's today's dinner menu?");
        readFile ("dinner-menu.txt");
    }
}
