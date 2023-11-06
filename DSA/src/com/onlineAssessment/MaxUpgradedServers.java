package com.onlineAssessment;

import java.util.Arrays;
import java.lang.Math;

public class MaxUpgradedServers {

    public static void main(String[] args) {
//        int [] numServers = {9,5};
        int [] numServers = {12};
//        int [] money = {15,17};
        int [] money = {12};
//        int [] sell = {4,2};
        int [] sell = {2};
//        int [] upgrade = {4,5};
        int [] upgrade = {6};



        System.out.println(Arrays.toString(getMaxUpgraadedServers(numServers, money, sell, upgrade)));
    }

    private static int [] getMaxUpgraadedServers(int[] numServers, int[] money, int[] sell, int[] upgrade) {

        int [] result = new int[numServers.length];

        for(int i =0; i< numServers.length; i++){
            int numServersUpgraded = money[i] / upgrade[i];
            int remMoney = money[i] % upgrade[i];

            int remServers = numServers[i] - numServersUpgraded;

            int serversSold = 0, newServersUpgraded = 0;
            int totalRemMoney = remMoney + remServers * sell[i];
            int totalServersReqFor1Upgrade = (int)Math.ceil((double)upgrade[i] /sell[i] ) + 1;

            while(totalRemMoney >= upgrade[i] && totalServersReqFor1Upgrade <= remServers){
                totalRemMoney -= upgrade[i];
                newServersUpgraded++;
                serversSold = (int)Math.ceil((double)upgrade[i]/sell[i]);
                totalRemMoney += (serversSold * sell[i])  % upgrade[i];
                remServers -= (1 + serversSold);
                System.out.println("rm : " + totalRemMoney + ", tsr1u :" + totalServersReqFor1Upgrade + ", rs: " + remServers);
            }


            result[i] = numServersUpgraded + newServersUpgraded;
        }

        return result;

    }
}
