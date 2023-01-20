package com.dynamicprogramming;

public class CoinChangeMinNumberOfCoins {

    public static void main(String[] args) {

//        int [] coins = {1, 2, 3, 5, 6};
//        [411,412,413,414,415,416,417,418,419,420,421,422]
//9864
        int [] coins = {411,412,413,414,415,416,417,418,419,420,421,422};
        int amount = 9864;

        int result = minCoins(coins, coins.length, amount );
        System.out.println("initial result : " + result);
        
        if(result == Integer.MAX_VALUE -1)
            System.out.println("minimum number of coins required is :" + -1);
        else
            System.out.println("minimum number of coins required is :" + result);

    }

    private static int minCoins(int[] coins, int n, int amount) {
        System.out.println("length of the array : " + n);
        System.out.println("amount : " +  amount) ;

        if(amount < 0)
            return -1;

        if(n == 0 && amount != 0)
            return Integer.MAX_VALUE - 1;

        if(amount == 0)
            return 0;

        if (coins[n-1] <= amount) {
//            int choice1 = minCoins(coins, n, (amount - coins[n - 1]));
//            System.out.println("Choice1 " + choice1);
//            int choice2 = minCoins(coins, n-1, amount);
//            System.out.println("Choice2 " + choice2);
//            System.out.println("Amount : " + amount);
//
//            int sum = Math.min((1 + minCoins(coins, n, (amount - coins[n - 1]))), minCoins(coins, n - 1, amount));
//            System.out.println(sum);
            return Math.min((1 + minCoins(coins, n, (amount - coins[n - 1]))), minCoins(coins, n - 1, amount));
        } else
            return minCoins(coins, n-1, amount);

    }
}
