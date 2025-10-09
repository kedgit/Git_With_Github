package filehandling;


import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


// steps
// 1. create object file and pass file name as parameter
// 2. file name not exist to error occures filenotfound
// 3. input type (where to take input like from console,file, etc)
// 4.while loop read line by line
public class ReadFile {

	public static void main(String[] args) {
		
		// create object for file pointer
	try {
		
		File readfile=new File("newfile.txt");
		
		System.out.println("file exists: "+readfile.exists());
		System.out.println("file size: "+ readfile.length());
		System.out.println("file path: "+ readfile.getAbsolutePath());
		
		// type of input where to take input
		Scanner sc=new Scanner(readfile);
		
		while(sc.hasNextLine()) {
			String line=sc.nextLine();
			System.out.println(line);
		}
		
		// prevent resource leakage
		sc.close();
	}
	catch(FileNotFoundException e) {
		System.out.println("Sir file not found !");
			e.printStackTrace();
		}
	}

}
