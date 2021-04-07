/**
 * 
 */

/**
 * @author Hana Luong
 *
 */
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Printing CLArguments: ");
		for (String s: args) {
			System.out.println(s);
		}
		
		int sum = 0; 
		for (String s : args) {
			int n;
			try {
				n = Integer.parseInt(s, 10);
				sum += n;
			}
			catch (NumberFormatException e) {
				System.out.println("Sorry, cannot " + e.getMessage() + " "
						+ "convert into an integer!");
			}
		}
		System.out.println("The sum of all the converted arguments is: " + sum);
	}	
}











