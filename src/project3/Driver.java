package project3;

import java.util.Scanner;

/**
 * Created by saurabh on 15/8/16.
 */
public class Driver {
    public static void main(String [] args) {
        double rate;
        int numberOfMonths, loanAmt, installment;
        Scanner CONSOLE = new Scanner(System.in);

        LoanPayment loanPayment = new LoanPayment();

        System.out.println("One Year Loan Table\n");
        System.out.print("Enter the annual interest rate: ");
        rate = CONSOLE.nextInt();



        loanPayment.DisplayInitialLoanDetails(1000, 50, rate);
        System.out.println("Simple Loan Payment Table For One Year\n");

        loanPayment.PrintLoanMiniStatement(1000, 50, rate);


        System.out.println("Detailed Loan Table\n");

        System.out.println("Enter Initial balance:");
        loanAmt = CONSOLE.nextInt();
        System.out.println("Enter Annual Interest rate");
        rate = CONSOLE.nextInt();
        System.out.println("Enter Monthly payment");
        installment = CONSOLE.nextInt();
        System.out.println("Enter number of months");
        numberOfMonths = CONSOLE.nextInt();

        loanPayment.DisplayInitialLoanDetails(loanAmt, installment, rate);

        loanPayment.PrintDetailedPaymentTable(loanAmt ,installment, rate ,numberOfMonths);
    }
}
