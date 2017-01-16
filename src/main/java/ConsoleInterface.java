

import java.io.File;
import java.util.Scanner;

public class ConsoleInterface {

	private Scanner sc = new Scanner(System.in);

	public File getRootFolder() {
		File file;
		do {
			System.out.println("Please insert the path to the root folder: ");
			String path = sc.nextLine();
			file = new File(path);
		} while (!file.exists() || !file.isDirectory());
		return file;
	}

}
