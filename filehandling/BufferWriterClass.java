package filehandling;


import java.io.BufferedWriter;
import java.io.FileWriter;
// import java.io.Writer;
import java.io.IOException;
public class BufferWriterClass {

	public static void main(String[] args) {
		
		try {
			// method
			// 1. write(char or string)
			// 2. newLine() insert new line
			// 3.flush() forcefully wrote buffer data to file 
			// 4. close() resource free
			
		// it also write character by character so use bufferedwriter 
		// but filewriter is manadentory for file open if exist or create new one by object
			
		// if file exist write directly else  create and then write
		FileWriter  fw=new FileWriter("output.txt");
		
		// write char by char or string line depends upon you
		String firstline="mera bharath mahan hai !";
		String lastline="sare jaha se acha hindustan hamara !";
		BufferedWriter bw=new BufferedWriter(fw);
		
		// data write in buffer memory not in file
		bw.write(firstline);
		// write data into file suddenly means into disk but it slow if u char by char flushing  
		bw.flush();
		bw.newLine();
		bw.write(lastline);
		
		// write buffer memory data to file at end and resource free 
		bw.close();
		System.out.println("data write into file succesfully !");
		
		}
		catch(IOException e) {
			System.out.println("First need to create file then write data or auto create file !");
		}

	}

}
