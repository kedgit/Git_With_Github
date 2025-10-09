package filehandling;


import java.io.File;


public class DeleteFile {

	public static void main(String[] args) {
		
		// object file store or point to file which passed as parameter
		
		
			
		File file=new File("newfile.java");
		
		if(file.delete()) {
			System.out.println(" Deleted Succesfully ! ");
			System.out.println("Your file was deleted: "+file.getName());
		}
		
		else {
			System.out.println("Failed to delete file ! ");
		}
	
		
	}

}
