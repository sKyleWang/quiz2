package quiz2;
import java.util.Scanner;

public class car {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("The total price of car is: ");
		double price = s.nextDouble();
		System.out.println("The down payment is: ");
		double downpayment = s.nextDouble();
		System.out.println("The length of loan (in months)is: ");
		int month = s.nextInt();
		System.out.println("The interest rate for loan is: ");
		double loan = s.nextDouble();				
		s.close();
	
	double Monthlyloan = loan/100/12;
	double MonthlyCarPayment = (Monthlyloan + (Monthlyloan /
			(Math.pow(1+Monthlyloan, month)-1))) * price;
	double TotalInterest = MonthlyCarPayment * month - price;
	System.out.println("The monthly car payment is: "+ MonthlyCarPayment);
	System.out.println("The total spent on interest over the term of the loan is: "+ TotalInterest);
}
}
