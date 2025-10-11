package filehandling;



import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class FileOutputStreamClass {
    public static void main(String[] args) {
    	// string data
        String data = "my name is kedar !";
        
        // file name direct pass or as string 
        String fileName = "binary-output.bin";
        
        // stepe 
        // 1.first convert data into byte array corresponding ascii value
        // 2.Takes the byte array and encodes it using Base64 encoding.
        // 3.converts into readable format letter,number,

        try  {
        	// exist file to open and write else create file and then open write
        	FileOutputStream fos = new FileOutputStream(fileName);
        	
        	// convert firts char into bytes by data.getbytes(""std use like UTF-8);
        	// create byte array and store in char as byte value by special method of Base64.getEncoder().encode()
            byte[] bytes = Base64.getEncoder().encode(data.getBytes("UTF-8"));  
            
            // then write byte by byte into file
            fos.write(bytes);

            // confirmation message
            System.out.println("Written in binary format.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

