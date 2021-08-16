/* Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a 
multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). 
For each successful withdrawal the bank charges 0.50 $US. Calculate Pooja's account balance after an attempted transaction. */

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
