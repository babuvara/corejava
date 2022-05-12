package files.self_study;

import java.io.File;

public class SubFolderCreation {

	public static void main(String[] args) {
		File subfolder = new File("C:\\Users\\babu3107\\Desktop\\BABU\\GOKUL\\SHEIK");
		boolean present = subfolder.exists();
		System.out.println("SubFolder Present : " + present);
		if (present == false) {
			subfolder.mkdirs();
		}

		present = subfolder.exists();
		System.out.println("SubFolder Present : " + present);
	}

}
