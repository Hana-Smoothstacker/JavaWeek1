import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
//import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


public class CountCharacter {

	public static void main(String[] args) throws IOException{
		
		//Step 1: Get a character from the keyboard
		System.out.print("Type a character: ");
		Scanner in = new Scanner(System.in);
		char charToFind = in.next().charAt(0);
		in.close();
		
		// Step 2: Count the occurences of the character entered from key board	
		int count = readFromFileWithBuffer(charToFind);
		System.out.println("Count: " + count);
	}
	
	public static int readFromFileWithBuffer(char c) throws IOException {
		String oneLine = null;
		int count = 0;
		
		try(BufferedReader buf = new BufferedReader(new FileReader("C:\\Users\\Hana Luong\\Desktop\\Calbright\\Important Links.txt"))) {
			while ((oneLine = buf.readLine()) != null) {
				count += countOccurences(oneLine, c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return count;
	}
	
	public static int countOccurences(String extractedString, char c) {
		int count = 0; 
		for(int i=0; i<extractedString.length(); i++) {
			if(extractedString.charAt(i)== c) {
				count += 1;
			}
		}
		return count; 
	}
}

/*
 * BODY OF THE FILE 
 * https://www.dataprise.com/it-glossary
 * https://niccs.cisa.gov/about-niccs/cybersecurity-glossary
 * https://www.youtube.com/watch?v=wNS8eURYsFs&feature=youtu.be Trouble Shooting	Add this string to the Important Links!
 * 
 * OUTPUT 
 * Type a character: e 
 * Count: 10
 */


