import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


public class AppendText {

	public static void main(String[] args) {
		String filePath = "C:\\Users\\Hana Luong\\Desktop\\Calbright\\Important Links.txt";
		String appendText = "	Add this string to the Important Links!";
		appendNow(filePath, appendText);
	}

	private static void appendNow(String fileP, String text) {
		File file = new File(fileP);
		FileWriter from = null;
		try {
			// Below constructor argument decides whether to append or override
			from = new FileWriter(file, true);
			from.write(text);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				from.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

/*
 * RESULT: 
 * https://www.dataprise.com/it-glossary
 * https://niccs.cisa.gov/about-niccs/cybersecurity-glossary
 * https://www.youtube.com/watch?v=wNS8eURYsFs&feature=youtu.be Trouble Shooting
 * Add this string to the Important Links!
 */