package com.summahto.java8.training.day2;

interface Bank{
    public int calculateInterest(int amount, int noOfYears);
}
public class Lab3 {

    public static void main(String[] args) {
        int rate = 8;
        //rate = 10;
        Bank sbi = (amt, n) -> {
            //rate = 20;
            System.out.println("Rate of Interest is :" + rate);
            return amt*n*rate/100;
        };

        //rate = 20

        System.out.println("sbi Bank's interest is : " +  sbi.calculateInterest(3000, 5));
    }

}
