package Task4;

import java.util.Scanner;

public class CurrencyConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double usdToEurRate = 0.85;
		double usdToGbpRate = 0.75;
		
		System.out.println("Welcome to Currency Converter");
		System.out.println("Select your base currency:");
		System.out.println("1. USd (US Doller)");
		System.out.println("2. EUR (Euro)");
		System.out.println("3. GBp (British Pound)");
		
		int baseCurrencyChoice = sc.nextInt();
		
		System.out.println("Select your target currency:");
		int targetCurrencyChoice = sc.nextInt();
		
		if(baseCurrencyChoice < 1 || baseCurrencyChoice > 3 || targetCurrencyChoice <1 || targetCurrencyChoice > 3) {
			System.out.println("Invalid currency selection.");
			return;
		}
		
		System.out.print("Enter the amount in your base currency: ");
		double amount = sc.nextDouble();
		
		double convertedAmount = convertCurrency(amount, baseCurrencyChoice, targetCurrencyChoice, usdToEurRate, usdToGbpRate);
		
		String targetCurrencySymbol;
		if(targetCurrencyChoice == 1) {
			targetCurrencySymbol = "USD";
		}else if(targetCurrencyChoice == 2){
			targetCurrencySymbol = "EUR";
		}else {
			targetCurrencySymbol = "GBP";
		}
		
		System.out.println("Converted Amount: " + convertedAmount + " " + targetCurrencySymbol);
		
		sc.close();
	}

	private static double convertCurrency(double amount, int baseCurrencyChoice, int targetCurrencyChoice,
			double usdToEurRate, double usdToGbpRate) {
         if(baseCurrencyChoice == 1 && targetCurrencyChoice == 2) {
        	 return amount * usdToEurRate;
         }else if(baseCurrencyChoice == 1 && targetCurrencyChoice == 3) {
        	 return amount * usdToGbpRate;
         }else if(baseCurrencyChoice == 2 && targetCurrencyChoice == 1) {
        	 return amount / usdToEurRate;
         }else if(baseCurrencyChoice == 2 && targetCurrencyChoice == 3) {
        	 return amount * (usdToGbpRate / usdToEurRate);
         }else if(baseCurrencyChoice == 3 && targetCurrencyChoice == 1) {
        	 return amount / usdToGbpRate;
         }else if(baseCurrencyChoice == 3 && targetCurrencyChoice == 2) {
        	 return amount / (usdToGbpRate / usdToEurRate);
         }else {
        	 return amount;
         }
	}
}
