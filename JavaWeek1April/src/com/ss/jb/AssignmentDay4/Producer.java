package com.ss.jb.AssignmentDay4;

import java.util.ArrayList;

public class Producer implements Runnable {
	
	private ArrayList<Integer> bb;
	Producer(ArrayList<Integer> bb){
		this.bb = bb;
	}

	@Override
	public void run() {
		int count = 1;
		while(count <= 3) {
			synchronized(bb) {
				bb.add(count);
				System.out.println(count + " have been produced.");
				count++;
				try {
					bb.notify();
					bb.wait();
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}		
	}
}
