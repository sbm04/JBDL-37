import java.io.File;

public class FileDeleteOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("my-Contacts.txt");
		
		if(f.exists()) {
			
			
		}
		boolean status=f.delete();
		System.out.println("File Deletion Success!"+status);

		if(status) {
			System.out.println("File Deletion Success!");
		}else {
			System.out.println("File Deletion Failure!");
		}
		
	}

}
