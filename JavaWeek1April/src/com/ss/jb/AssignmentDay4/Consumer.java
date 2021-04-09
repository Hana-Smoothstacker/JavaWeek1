package com.ss.jb.AssignmentDay4;

import java.util.ArrayList;

public class Consumer implements Runnable {
	private ArrayList<Integer> bb;
	Consumer (ArrayList<Integer>bb){
		this.bb = bb;
	}
	
	@Override
	public void run() {
		int count = 1;
		while(count <= 3) {
			synchronized(bb){
				while(bb.size() == 0) {
					try {
						bb.notify();
						bb.wait();
					}
					catch(InterruptedException e) {
						e.printStackTrace();						
					}
				}
				Integer val = bb.remove(0);
				System.out.println(val + " have been consumed.");
				count++;
				try {
					bb.notify();
					bb.wait();					
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}				
			}			
		}		
	}
}
