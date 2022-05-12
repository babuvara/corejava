package com.chainsys.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileCreate {
	public static void create() {
		try {

			File f = new File("D:\\temp.babu");

			if (f.createNewFile())
				System.out.println("File created");
			else
				System.out.println("File already exists");
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public static void FileRename() {
		File oldName = new File("D:\\temp.babu");
		File newName = new File("D:\\java.txt");
		if (oldName.renameTo(newName)) {
			System.out.println("renamed");
		} else {
			System.out.println("Error");
		}
	}

	public static void Append() {
		try (FileWriter f = new FileWriter("D:\\java.txt", true);) {

			f.append("123");
		} catch (IOException i) {
			i.printStackTrace();

		}
	}

	public static void modifyDataInFile() throws IOException {
		FileWriter f = new FileWriter("D:\\\\java.txt");
		try (FileWriter filewriter = new FileWriter("D:\\\\java.txt");) {
			f.write("BABU");
			f.close();
			System.out.println("Modify the file");
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

	public static void ReadDataFromFile() {

		try {
			File myObj = new File("D:\\java.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println("File reading: " + data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}

	public static void delete() {

		File file = new File("");

		if (file.delete()) {
			System.out.println("File deleted");
		} else {
			System.out.println("Failed to delete thD:\\java.txte file");
		}
	}

	public static void move() throws IOException {
		Path temp = Files.move(Paths.get("D:\\java.txt"), Paths.get("D:\\New folder\\java.txt"));
		if (temp != null) {
			System.out.println("moved successfully");
		} else {
			System.out.println("Failed to move the file");
		}
	}

	public static void copy() throws IOException {
		FileSystem fileSys = FileSystems.getDefault();
		Path srcPath = fileSys.getPath("D:\\java.txt");
		Path destPath = fileSys.getPath("D:\\New folder\\java.txt");
		try {
			Files.copy(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("file copied");
		} catch (IOException ioe) {
			System.out.println("file not copy");
		}
	}

	public static void main(String args[]) throws IOException {

		create();
		FileRename();
		Append();
		modifyDataInFile();
		ReadDataFromFile();
		//move();
		copy();
		//delete();
	}
}
