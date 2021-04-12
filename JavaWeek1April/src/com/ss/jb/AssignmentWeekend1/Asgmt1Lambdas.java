package com.ss.jb.AssignmentWeekend1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Asgmt1Lambdas {
	
	 public interface performOperation { // can have "public" if inside a class or in a separate class file
	    	int check(int n); //It is a signature of an interface method. It cannot be implemented in interface. 
	 }

     //  "locked stub code "
    public static void main(String[] args)throws IOException {
    	
    	Asgmt1Lambdas l = new Asgmt1Lambdas();
        BufferedReader br = new BufferedReader(new FileReader("resources/lambda_numbers.txt"));// like in lecture

        int CS = Integer.parseInt(br.readLine());   // read first line;
        											//convert the string into integer, C = converted string
        
        performOperation op;//declare an interface
        int returnVal = 0; 
        String answer = null;
        
        while (CS-- > 0) { 	//CS representing the number of tests, decreasing as you have done some tests
        					// CS = 5 starting point
            String s = br.readLine().trim();// trim white spaces in front and at the end;
            StringTokenizer st = new StringTokenizer(s); // split the two groups of the line 
            int cc = Integer.parseInt(st.nextToken()); // cc = coded choice, obtain the first group (choice)
            int num = Integer.parseInt(st.nextToken()); // second group
            
            if (cc == 1) {
                op = l.isOdd();
                returnVal = op.check(num);
                answer = (returnVal == 1)?"ODD":"EVEN"; // ternary expression 
            }
            else if(cc == 2) {
                op = l.isPrime();
                returnVal = op.check(num);
                answer = (returnVal == 1)?"PRIME":"COMPOSITE"; 
            }
            else if(cc == 3) {
                op = l.isPalindrome();
                returnVal = op.check(num);
              	answer = (returnVal == 1)?"PALINDROME":"NOT PALINDROME";

            }
            System.out.println(answer);
        }
        br.close();
    }          

    public performOperation isOdd() {
    	performOperation p =  (n) -> { if ( (n % 2) == 0 ) return 0; else return 1; };        
    	return p;
    }

    public performOperation isPrime() {
    	//The convention (1) is true and (0) is false
    	performOperation p =  (n) -> {if (n == 1) return 1;// no need to put else, because of return
    	for(int i = 2;i<n/2+1;i++){// greater than half
    		if((n%i)==0) return 0; // found a divisor, should return 0;
    	}
    	return 1;
    	};
    	return p;
    }

    public performOperation isPalindrome() {
    	performOperation p =  (n) -> {  String word = ""+n;
    	for(int i = 0;i<(int)word.length()/2;i++) { 
    		if(word.charAt(i) != word.charAt(word.length()-1-i)){
    			return 0;
    		}
    	}
    	return 1;
    	};
    	return p;
    }	
}
 
	
