/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class ATM
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        double debitAmount = sc.nextDouble();
        double initialAmount = sc.nextDouble();
        double result = withdraw(debitAmount, initialAmount);
        System.out.print(result);
    }

    public static double withdraw(double debitAmount, double initialAmount){
        if(isAMultipleOf5(debitAmount) && isInitialAmountSufficient(debitAmount, initialAmount)){
            return initialAmount - (debitAmount +0.5);
        }
        return initialAmount;
    }

    private int withdrawUpperLimit = 2000;
    private int withdrawLowerLimit = 0;
    private double fees = 0.5;

    private static boolean isInitialAmountSufficient(double amountToWithdraw, double initialAccountBalance) {
        return amountToWithdraw + 0.5 <= initialAccountBalance;
    }

    private static boolean isAMultipleOf5(double amountToWithdraw) {
        return amountToWithdraw % 5 == 0;
    }
}
