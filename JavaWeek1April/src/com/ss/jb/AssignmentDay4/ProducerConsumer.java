package com.ss.jb.AssignmentDay4;

import java.util.ArrayList;


public class ProducerConsumer {

    public static void main(String[] args) throws InterruptedException {
    	ArrayList<Integer> boundedBuffer = new ArrayList<Integer>();
    	Thread t1 = new Thread(new Producer(boundedBuffer));
    	Thread t2 = new Thread(new Consumer(boundedBuffer));
    	t1.start();
    	t2.start();
    }
}
