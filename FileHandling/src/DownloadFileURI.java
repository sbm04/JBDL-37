import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class DownloadFileURI {
	

	public static void main(String[] args) {
		try {
			URL url = new URL("https://media.geeksforgeeks.org/gfg-gg-logo.svg");
			File f = new File("gfg-gg-logo.svg");
			
			FileUtils.copyURLToFile(url, f);
			
			
			
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
