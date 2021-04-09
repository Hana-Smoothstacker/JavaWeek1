/**
 * 
 */
package com.ss.jb.AssignmentDay4;

/**
 * @author Hana Luong
 *
 */
public class DoubleLockedChecking {
	volatile private static DoubleLockedChecking instance; //missing public,= null
	private DoubleLockedChecking() {
	}
    public static DoubleLockedChecking getInstance() {// missing synchronized
    							// missing synchronized (instance) //block synchronizing
        if (instance == null) {
            synchronized (DoubleLockedChecking.class) {
                if (instance == null) {
                    instance = new DoubleLockedChecking();
                }
            }
        }
        return instance;
    }
    
    public void printSomething() {
    	System.out.println("Just checking");
    }
}  

