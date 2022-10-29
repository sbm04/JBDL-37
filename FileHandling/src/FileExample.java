import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// We are a creating a file with a pathname in the project folder
		File f = new File("helloWorld.txt");
		
		if(f.exists()) {
			System.out.println("Yes, files exists");
		}else {
			System.out.println("No, files doesnot exists");
			try {
				f.createNewFile();
				System.out.println("New File Created");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("Error creating File");

			}
		}
		System.out.println("The length of the file is"+f.length());
		// We are a creating a file with a pathname on a remote location the project folder

		File f1 = new File("/Users/AdityaDua/Downloads/a.txt");
		try {
			f1.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/*File fUri = new File("https://filesamples.com/samples/document/txt/sample3.txt");

		if(fUri.exists()) {
			System.out.println(fUri.length());
		}else {
			System.out.println("The file doesnot exists.");
		}*/
		
		File file = new File("/Users/AdityaDua/Downloads/dummyFolder");
		file.mkdir();
		if(file.isDirectory()) {
			
			System.out.println(file.getName()+" is a folder.");
			
			
			
			File fArray[] = file.listFiles();
			
			for (int i = 0; i < fArray.length; i++) {
				System.out.println("File Name is:: "+fArray[i].getName()+ " Size is:"+fArray[i].length());
			}
			
		}else {
			
			System.out.println(file.getName()+" is a File.");

		}

		
	}
}
