package com.greatlearning.skyscraper;

import java.util.*;

public class architect {

	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	
	int floors ;
	Integer floorsize[],originalfloorsize[]; 
	
	System.out.println("Enter the total no of floors in the building:");
	
	floors = sc.nextInt();
	
	floorsize = new Integer[floors];
	originalfloorsize = new Integer[floors];
	
	
	
	for (int i= 0; i < floors; i++) {
		System.out.println("Enter the floor size given on day "+ (i+1) +":");
	
	    floorsize[i] = sc.nextInt();
	   
}
	
	
	for (int i= 0; i < floors; i++) {
		originalfloorsize[i] = floorsize[i];
	    
}

	
	Arrays.sort(floorsize, Collections.reverseOrder());
	System.out.println("The order of construction is as follows");
	
	ArrayDeque<Integer> floorstack = new ArrayDeque<Integer>();
	for (int i = 0; i < floors; i++)

   {
    	
    	System.out.println("Day "+(i+1));
    	
    floorstack.add(floorsize[i]);
   
    
    	
    	int floormax = floorstack.peek();
    	
    	
    	if(originalfloorsize[i]>floormax) {
    		floormax = originalfloorsize[i];
    	}else {
    		floormax = floorstack.peek();
    	}
    	
    	
    	if (originalfloorsize[i] >= floormax) {
    	
    		    		System.out.println(floorstack);
    		    		
    		    		floorstack.removeAll(floorstack);
    			 }
    		

    	else {
    		System.out.println(" ");
    		
    	}
    }
}
}
