package filehandling;


import java.io.FileWriter;
import java.io.IOException;


//steps
// 1. create object and pass parameter as file name
// 2. file not exist to create new one adnd msg writtened
// 3. send msg to console for confirmation
public class FileWrite {

	public static void main(String[] args) {
		
		
		// input file not found to error occur compile time
		try {
			
			// use class FileWriter and pass filename as parameter
			// if file not exist then auto create new file and msg was writtend
 			FileWriter wrote=new FileWriter("newfile.txt");
 			
 			// use write(int,char,bool,string etc !) method  to write
			wrote.write("Is Continuous Learning the Only Way to Survive in IT?\r\n"
					+ "\r\n"
					+ "In today’s fast-changing world, especially in the field of Information Technology (IT), learning never really stops. New technologies, tools, and methods keep coming up almost every day. If someone wants to stay relevant and grow in their IT career, continuous learning has become more than just an option—it’s a necessity.\r\n"
					+ "\r\n"
					+ "Technology doesn’t wait for anyone. What was popular five years ago may be outdated today. For example, earlier people used to build websites with plain HTML. Now, developers use advanced tools and frameworks like React, Angular, or Next.js. Similarly, jobs like data analyst, cloud engineer, or AI specialist didn’t even exist a decade ago. So, if IT professionals don’t keep learning, their skills may become old and less useful.\r\n"
					+ "\n"
					+ "Also, companies want people who can quickly adapt to new tools and systems. If someone sticks only to what they learned in college or in the early years of their career, they may fall behind. Continuous learning helps workers stay confident, solve problems better, and take on new roles and responsibilities.\r\n"
					+ "\r\n"
					+ "Luckily, learning today is easier than ever. There are online courses, YouTube tutorials, blogs, coding platforms, and tech communities where anyone can learn at their own pace. Many people even learn while working on real projects. So, you don’t always need to go back to school—just stay curious and keep exploring. kd sir");
			
			// avoid resource leackage
			wrote.close();
			
			System.out.println("Succesfully write text msg !");
			
		}
		// handle
		catch(IOException e) {
			e.printStackTrace();
			
		}

	}

}
