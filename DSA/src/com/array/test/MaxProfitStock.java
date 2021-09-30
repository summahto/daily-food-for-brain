package com.array.test;

public class MaxProfitStock {

	public static void main(String[] args) {
		
		int prices[] = {7,1,4,3,8,2,9};
		int n = prices.length;
		int mp = 0;
        
        for(int i=0; i<n-1 ; i++){
            for(int j=i+1; j<n ; j++){
                
                if(prices[i] < prices[j]){
                    int p = prices[j] - prices[i];
                    if(p >mp)
                        mp = p;
                }
            }
        }
        
        System.out.println("max profit :" + mp);

	}

}
