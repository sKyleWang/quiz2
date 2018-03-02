package quiz2;
import java.util.Scanner;

public class car {

	public static void main(double price, double downpayment, int month, double loan, double Monthlyloan, double MonthlyCarPayment, double TotalInterest, args) {
		Scanner s = new Scanner(System.in);
		System.out.println("The total price of car is: ");
		price = s.nextDouble();
		System.out.println("The down payment is: ");
		downpayment = s.nextDouble();
		System.out.println("The length of loan (in months)is: ");
		month = s.nextInt();
		System.out.println("The interest rate for loan is: ");
		loan = s.nextDouble();				
		s.close();
	
	Monthlyloan = loan/100/12;
	MonthlyCarPayment = (Monthlyloan + (Monthlyloan /
			(Math.pow(1+Monthlyloan, month)-1))) * price;
	TotalInterest = MonthlyCarPayment * month - price;
	System.out.println("The monthly car payment is: "+ MonthlyCarPayment);
	System.out.println("The total spent on interest over the term of the loan is: "+ TotalInterest);
}
}
