/**
 * 
 */

/**
 * @author Hana Luong
 *
 */
public class TwoDeMatrix {
	/**
	 * @param args
	 */
	final static int H = 5;
    final static int  W = 5;

    static int findMaxIn2DeMatrix(int matrix[][]) {
        // Initializing max value as INT_MIN or -2^31 = -2147483648
        int maxValue = Integer.MIN_VALUE;
  
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }
	public static void main(String[] args) {
	    int matr[][] = { { 5, 9, 3, 4, 17 },
                        { 13, 9, 7, 11, 14 },
                        { 22, 12, 16, 10, 1 },
                        { 72, 56, 19, 20, 21 },
                        { 2, 5, 15, 18, 8} };  
        System.out.println(findMaxIn2DeMatrix(matr)) ;
	}

}
