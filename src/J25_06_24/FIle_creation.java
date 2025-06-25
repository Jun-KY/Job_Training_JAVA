package J25_06_24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIle_creation {
    public static void writeFile(String filename, String content){
//        FileWriter writer = null;

        try (FileWriter writer = new FileWriter (filename, true)){
            writer.write (content);
        }catch (IOException e){
            e.printStackTrace();;
        }
//        finally {
//            try{
//                if(writer != null) writer.close();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }
    }
    public static void readFile(String filename){
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;

            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        //Write file
//        writeFile ("lunch-menu.txt", "\nhmm");
//        System.out.println("File created.");
        //Read file
        readFile("lunch-menu.txt");

    }
}
