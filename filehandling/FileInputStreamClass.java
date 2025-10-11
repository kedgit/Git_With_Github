package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamClass {
    public static void main(String[] args) {
        String fileName = "bitedata.bin";  // Your file name here

        try  {
        	// open file start read
        	FileInputStream fis = new FileInputStream(fileName);
        	
        	// byte store
            int byteData;
            // fis - read one byte at time and check it last byte
            while ((byteData = fis.read()) != -1) {
                // Print byte value
                System.out.print(byteData + " "); // or (char) byteData to see characters
            }

        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

