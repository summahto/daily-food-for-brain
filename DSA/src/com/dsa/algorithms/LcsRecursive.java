package com.dsa.algorithms;

public class LcsRecursive {

	public static void main(String[] args) {
		
		String text1 = "abcde";
		String text2 = "abfghde";
		text2 = "ace";
		int m = text1.length();
        int n = text2.length();
        Integer [][] memo = new Integer[m+1][n+1];
        
        int res = helper(text1, text2, m, n, memo);
        
        System.out.println("longest length of the subsequence is: "+ res);
    }
    
    public static int helper(String x, String y, int m, int n, Integer memo[][] ){
        
        if(m == 0 || n == 0)
            return 0;
        
        if(x.charAt(m-1) == y.charAt(n-1))
            return 1+ helper(x, y, m-1, n-1, memo);
        else
            return Math.max(helper(x, y, m, n-1, memo), helper(x, y, m-1, n, memo));
    }


}
