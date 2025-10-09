package filehandling;

// importing File class from java.io package
import java.io.File;

// importing IOException class from java.io package
import java.io.IOException;


// steps
// 1. create object and pass parameter as file name
// 2. check file create or not
// 3. true then send msg file created
// 4. else file already exist.
// 5. during file creation error occured handled by IOException

public class Createfile {

	public static void main(String[] args) {
		
		try
		{
			// create new file 
			File file=new File("newfile.java ");
			
			// check new file is created or not for that reference (file)
			if(file.createNewFile()) {
				System.out.println("File was created i.e: "+file.getName()+"at location: "+file.getAbsolutePath());
			}
			else {
				System.out.println(file.getName()+ "file has already exist ! ");
			}
			
		// if exception occured due to i/o
		}catch(IOException e) {
			
			System.out.println("An error occured !");
			e.printStackTrace();
		}
		
	}

}
