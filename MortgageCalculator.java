import java.text.NumberFormat;
import java.util.Scanner;
public class MortgageCalculator{
    
    public static void main(String[] args){
        final byte MONTH_IN_YEAR=12;
        final byte PERCENT=100;
        System.out.print("Principal:");
        Scanner scanner= new Scanner(System.in);
        int principal =scanner.nextInt();
        System.out.print("Annual Interest Rate:");

        float annualInterest=scanner.nextFloat();
        float monthlyInterest=annualInterest/PERCENT/MONTH_IN_YEAR;
        System.out.println("Period (Years):");
        byte years=scanner.nextByte();
        int numberofpayments=years*MONTH_IN_YEAR;
        double mortgage=principal*(monthlyInterest*Math.pow(1+monthlyInterest,numberofpayments))/(Math.pow(1+monthlyInterest,numberofPayments));
        String mortgageFormatted= NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:"+mortgageFormatted);

    }
}