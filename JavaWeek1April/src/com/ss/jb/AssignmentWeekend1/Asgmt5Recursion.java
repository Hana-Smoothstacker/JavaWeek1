package com.ss.jb.AssignmentWeekend1;

public class Asgmt5Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asgmt5Recursion r = new Asgmt5Recursion();
		
		System.out.println("Answer: " + r.groupSumClump(0, new int[]{2, 4, 8}, 10, 0));
		System.out.println("Answer: " + r.groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14, 0));
		System.out.println("Answer: " + r.groupSumClump(0, new int[]{2, 4, 4, 8}, 14, 0));
	}
	public boolean groupSumClump(int start, int[] nums, int target, int indentLevel) {
		for (int i = 0; i < indentLevel; i++) System.out.print(" ");
		System.out.println("start=" + start + " target=" + target);
		
		// "start" to be parallel to index
	    if(start >= nums.length)
	        return false; //target == 0;
	    
	    int i = start;
	    int sum = 0;	    
	    while(i < nums.length && nums[start] == nums[i]) {
	        sum += nums[i];
	        i++;
	    }
	    
	    if (sum == target)
	    	return true;
	    
	    if(groupSumClump(i, nums, target - sum, indentLevel + 1))//add the next element
	        return true; 
	    if(groupSumClump(i, nums, target, indentLevel + 1))//skip
	        return true;	
	    
	    return false;
	}
}

