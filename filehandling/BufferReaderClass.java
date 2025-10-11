package filehandling;

// import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class BufferReaderClass {

	public static void main(String[] args) {

		// Read large Amount of data from file 
		// methods
		// 1.read() - single character
		// 2.readLine() - read line of text
		// 3. close() - close stream to release resource
		
		try {
		// FileReader - class in java.io package
		// new FileReader() - object create and try to open file and read from file 
		// read character by character
		FileReader fr=new FileReader("newfile.txt");
		
		// but bufferreader doesnot no how to open file it wrap filereader and increas reading by line reading at time
		// buffer read line by line by readLine()
		// for large amount of data reading bufferreader is useful.
		// it take input as filereader
		BufferedReader br=new BufferedReader(fr);
		
		// now read and store it somewhere so use String 
		
		String line;
		
		while((line=br.readLine()) != null) 
			{
				System.out.println(line);
			}
		
		//  INputStream Close to free resource
		  br.close();
		}
		catch(IOException e) {
			System.out.println("File nhi hai is folder me ! ");
		}
		

	}

}
