package project3;

import java.text.DecimalFormat;

/**
 * Created by saurabh on 15/8/16.
 */
public class LoanPayment {
    private static int loanAmount;
    private static double annualInterestRate;
    private static int monthlyPayment;
    private static int numberOfMonths;


    private static String twoPlaces(double d) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(d);
    }

    public static void DisplayInitialLoanDetails(int loan, int installment, double rate)
    {
        System.out.println("The initial loan is " + loan);
        System.out.println("The monthly payment is " + installment);
        System.out.println("The annual interest rate is" + rate);
        System.out.print("\n");
    }

    public static void PrintLoanMiniStatement(int loan, int installment, double rate)
    {
        loanAmount = loan;
        monthlyPayment = installment;
        annualInterestRate = rate;

        double startBalance ;
        double remaining_balance = loanAmount;

        System.out.println("Month\t" + "Balance");
        for(int i=1; i<=12; i++)
        {
            startBalance = (remaining_balance + ((annualInterestRate/12)/100)*remaining_balance);
            remaining_balance = startBalance - monthlyPayment;
            System.out.println(i + "\t\t"+ remaining_balance);
        }
        System.out.print("\n");
    }

    public static void PrintDetailedPaymentTable(int loan, int installment, double rate, int period)
    {
        loanAmount = loan;
        monthlyPayment = installment;
        annualInterestRate = rate;
        numberOfMonths = period;

        double startBalance ;
        double remainingBalance = loanAmount;

        System.out.println("Month\t\t" + "Balance\t\t\t" + "Payment\t\t\t" + "Remaining");

        for(int i=1; i<=numberOfMonths; i++)
        {
            startBalance = (remainingBalance + ((annualInterestRate/12)/100)*remainingBalance);
            remainingBalance = startBalance - monthlyPayment;
            System.out.println(i + "\t\t\t"+ twoPlaces(startBalance) + "\t\t\t" + twoPlaces(monthlyPayment) + "\t\t\t"+ twoPlaces(remainingBalance));
            //System.out.printf("%d \t\t%.4f \t\t%.4f \t\t%.4f", i, startBalance, monthlyPayment, remainingBalance);
        }

    }
}
