import java.io.File;
import java.io.IOException;

public class ReadFilesDirectories {
	public static void main(String args[]) throws IOException {
		listFiles("C:\\Users\\Hana Luong\\Desktop\\Calbright", 0);
	}
	
	public static void listFiles(String path, int count) {
		//Creating a File object for directory
		File directoryPath = new File(path);

		//List of all files and directories
		String contents[] = directoryPath.list();
		System.out.println("Entering directory " + path);

		for(int i=0; i<contents.length; i++) {
			File file = new File(path + "\\" + contents[i]);

			if(file.isDirectory()) {
				listFiles(file.getAbsolutePath(), count + 1);
			}
			else {
				for (int indent = 0; indent < count; indent++) {
					System.out.print("    ");
				}
				System.out.println(contents[i]);
			}
		}
	}
}

/* OUTPUT:
 * Entering directory C:\Users\Hana Luong\Desktop\Calbright 
 * Entering directory C:\Users\Hana Luong\Desktop\Calbright\Core1A Core 1A 
 * 		Vocabulary.pdf 
 * 		Trouble Shooting.txt 
 * 		Trouble Ticket-filledin.pdf 
 * Important Links.txt
 * syllabus-it-support-core-1A.pdf
 */