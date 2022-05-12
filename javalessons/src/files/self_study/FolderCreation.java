package files.self_study;

import java.io.File;

public class FolderCreation {

	public static void main(String[] args) {

		File folder = new File("C:\\Users\\babu3107\\Desktop//BABU");
		boolean present = folder.exists();
		System.out.println("Folder present : " + present);
		if (present == false) {
			folder.mkdir();
		}
		present = folder.exists();
		System.out.println("Folder present : " + present);
		
	}
	
}
 