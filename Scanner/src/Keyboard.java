import java.util.Scanner;

public class Keyboard {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		// 5. Cookie Calories
		
		int cookiesEaten;
		int calories;
		
		System.out.print("Please type in the number of cookies you have eaten: ");
		
		cookiesEaten = scan.nextInt();
		calories = 75 * cookiesEaten;
		
		System.out.println("Calories consumed: " + calories);
		
		//Sales Prediction
		
		double totalSales;
		double salesDivision;
		
		System.out.print("Please enter your company's total sales for this year: ");
		totalSales = scan.nextDouble();
		salesDivision = totalSales * 0.65;
		System.out.println("You Sales Division will receive 65% of the total sales, which is: " + salesDivision);
		
		// 7. Land Calculation
		
		double acre = 43560;
		double land = 389767;
		double numberOfAcres;
		numberOfAcres = land / acre;
		System.out.println(numberOfAcres);
		
		
		
		
		// 8. Sales Tax
		
		
		double purchase, stateTax = 0.02, countryTax = 0.055, totalSale;
		System.out.print("Please enter the Price of the Purchased item: ");
		purchase = scan.nextDouble();
		stateTax = purchase * stateTax;
		countryTax = purchase * countryTax;
		totalSale = purchase + stateTax + countryTax;
		
		
		System.out.println("Total price of the item is: " + totalSale + "\nPurchase Price: " + purchase + "\nState Tax: " + stateTax + "\nCountry Tax: " + countryTax);
		
		
		
		// 9. Miles-per-Gallon
		
		double mGP;
		double milesDriven;
		double gallonsUsed;
		
		System.out.print("Please input your Miles driven: ");
		milesDriven = scan.nextDouble();
		System.out.print("Please input your gallons used: ");
		gallonsUsed = scan.nextDouble();
		
		mGP = milesDriven / gallonsUsed;
		System.out.print("Your car's Miles-per-Gallon is: " + mGP);
		
		
		
		// 10. Test Average
		
		double test1, test2, test3, average;
		System.out.print("Please enter a random number: ");
		test1 = scan.nextDouble();
		System.out.print("Please enter a second random number: ");
		test2 = scan.nextDouble();
		System.out.print("Please enter a final random number: ");
		test3 = scan.nextDouble();
		
		average = test1 + test2 + test3 / 3;
		System.out.print("Test Scores" + "\nTest 1: " + test1 + "\nTest 2: " + test2 + "\nTest 3: " + test3 + "\nAverage: " + average);
		
		
		
		// 18. Stock Transaction Program
		
		double shares = 1000;
		double purchasePrice = 32.87;
		double sellsPrice = 33.92;
		double broker = 0.02;
		double profit;
		
		double firstSale;
		double firstBroker;
		double secondBroker;
		double secondSale;
		
		firstSale = shares * purchasePrice;
		firstBroker = firstSale * broker;
		secondSale = shares * sellsPrice;
		secondBroker = secondSale * broker;
		profit = (firstBroker + secondBroker) - (secondSale - firstSale); 
		
		
		
		System.out.print(firstSale +"\n" + firstBroker + "\n" + secondSale + "\n" + secondBroker + "\nProfit: " + profit);
		
		
		
		
		

	}
}