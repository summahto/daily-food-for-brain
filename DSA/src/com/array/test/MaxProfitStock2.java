package com.array.test;

public class MaxProfitStock2 {

    public static void main(String[] args) {
        int prices[] = {7,1,4,3,8,2};
        int prices2 [] = {2,4,1};


        System.out.println(maxProfit(prices2));
    }

    private static int maxProfit(int[] prices) {

        int max = prices[0];
        int min = prices[0];
        int maxIndex = 0;
        int minIndex = 0;
        int currProfit = 0;
        int maxProfit = 0;

        for(int i = 1 ; i< prices.length ; i++){


            if(prices[i] < min){
                min = prices[i];
                minIndex = i;
                currProfit = max -min;

            }

            if(maxIndex < minIndex){
                max = prices[i];
                maxIndex = minIndex;
                currProfit = max -min;
            }

            if(prices[i] > max){
                max = prices[i];
                maxIndex = i;
                currProfit = max -min;
            }

            maxProfit = currProfit > maxProfit ? currProfit: maxProfit;

        }

        return maxProfit;

    }
}
