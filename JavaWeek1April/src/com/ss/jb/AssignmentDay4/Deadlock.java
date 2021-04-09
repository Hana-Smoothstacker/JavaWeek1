/**
 * 
 */
package com.ss.jb.AssignmentDay4;
//import com.ss.jb.AssignmentDay4.Person;

/**
 * @author Hana Luong
 *
 */
public class Deadlock {
	
	public static void main(String[] args) {

		Person p1 = new Person("Alice", 23, "sportswoman");
		Person p2 = new Person("David", 29, "nerd");

		Runnable t1 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized (p1) {
						Thread.sleep(100);
						synchronized (p2) {
							System.out.println("Thread 1 has accquired locks for P1 & P2");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		Runnable t2 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized (p2) {// reverse
						Thread.sleep(100); 
						synchronized (p1) { // reverse
							System.out.println("Thread 2 has accquired locks for P1 & P2");
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(t1).start();
		new Thread(t2).start();
		System.out.println("Deadlock is achieved");
	}	
}

/*
 * OUTPUT Deadlock is achieved
 */
