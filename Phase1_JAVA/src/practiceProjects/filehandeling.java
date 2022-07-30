package practiceProjects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filehandeling {

	public static void main(String[] args) {
		

		System.out.println("Write something in a file");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// Write a file
		try {
			FileWriter myFileWriter = new FileWriter("C://PracticeProject//PracticeProject_file.text");
			myFileWriter.write(str);
			System.out.println("Write operation done!");

			// Appending a file
			System.out.println("Write something to check append operation!");
			String appendData = sc.nextLine();
			myFileWriter.append(appendData);

			myFileWriter.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

		// Reading a file
		File myFileReader = new File("C://PracticeProject//PracticeProject_file.text");
		try {
			System.out.println("Reading of data:");
			Scanner f = new Scanner(myFileReader);
			while (f.hasNextLine()) {
				String line = f.nextLine();
				System.out.println(line);
			}
			f.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
