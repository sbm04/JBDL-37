import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileByteStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aditya!1234567890

		File f = new File("my-Contacts.txt");
		
		String nameStr;
		
		try {
			RandomAccessFile raf = new RandomAccessFile(f, "rw");
			raf.writeBytes("Aditya!1234567890");
			System.out.println("Data written to the file.");
			
			
			while(raf.getFilePointer()<raf.length()) {
				
				nameStr = raf.readLine();
				
				if(nameStr.equals("")) {
					
				}
				
			}
			raf.writeBytes("Aditya!1234567890");
			raf.writeBytes(System.lineSeparator());
			System.out.println("Data written to the file.");
			
			raf.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
