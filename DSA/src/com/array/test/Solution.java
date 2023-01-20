package com.array.test;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	
	    public boolean isMonotonic(int[] nums) {
	        boolean increasing = true;
	        boolean decreasing = true;
	        
	        for(int i=0; i< nums.length -1 ; i++){
	            
	            if(nums[i] > nums[i+1])
	                increasing = false;
	            
	            if(nums[i] < nums[i+1])
	                decreasing = false;
	            
	        }
	        
	        return increasing || decreasing;

		}
}

