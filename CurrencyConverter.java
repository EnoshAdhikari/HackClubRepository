import java.util.Scanner;
public class CurrencyConverter
{
    public static void main(String[] args)
    {
        // Scanner object, to read the user input
        Scanner input = new Scanner(System.in);

        // Introduction
        System.out.println("----------------------------------");
        System.out.println("Welcome to the Currency Converter!");
        System.out.println("----------------------------------");
        System.out.println("");
        System.out.println("Supported Curriencies:");
        System.out.println("1. USD- US Dollar");
        System.out.println("2. EUR- Euro");
        System.out.println("3. GBP- British Pound");
        System.out.println("4. JPY- Japanese Yen");
        System.out.println("5. AUD- Australian Dollar");
        System.out.println("6. CAD- Canadian Dollar");
        System.out.println("");

        // Ask user what they want to convert from
        System.out.print("Enter the currency you want to convert from (e.g., USD, EUR, GBP, JPY, AUD, CAD): ");
        String fromCurrency = input.nextLine();

        // If the input currency is not valid, while loop will keep asking the user till they give a valid input
        while(!fromCurrency.equalsIgnoreCase("USD") && !fromCurrency.equalsIgnoreCase("EUR") && !fromCurrency.equalsIgnoreCase("GBP") && !fromCurrency.equalsIgnoreCase("JPY") && !fromCurrency.equalsIgnoreCase("AUD") && !fromCurrency.equalsIgnoreCase("CAD"))
            {
                System.out.print("Invalid input, please try a valid currency (USD, EUR, GBP, JPY, AUD, CAD): ");
                fromCurrency = input.nextLine();
            }

        // logic to check if the input currency is valid
        if(fromCurrency.equalsIgnoreCase("USD") || fromCurrency.equalsIgnoreCase("EUR") || fromCurrency.equalsIgnoreCase("GBP") || fromCurrency.equalsIgnoreCase("JPY") || fromCurrency.equalsIgnoreCase("AUD") || fromCurrency.equalsIgnoreCase("CAD"))
        {
            System.out.print("Enter the amount you want to convert: ");
            double amount = input.nextDouble();
            while(amount < 0.0)
            {
                System.out.print("Invalid input, please enter a positive amount: ");
                amount = input.nextDouble();
            }
            System.out.print("Enter the currency you want to conver to (USD, EUR, GBP, JPY, AUD, CAD): ");
            String toCurrency = input.next();
            if(toCurrency.equalsIgnoreCase("USD") || toCurrency.equalsIgnoreCase("EUR") || toCurrency.equalsIgnoreCase("GBP") || toCurrency.equalsIgnoreCase("JPY") || toCurrency.equalsIgnoreCase("AUD") || toCurrency.equalsIgnoreCase("CAD"))
            {
                double convertedAmount = 0.0;
                // Conversion rates
                if(fromCurrency.equalsIgnoreCase("USD"))
                {
                    
                }
                
            }
        }
        else
        {
            System.out.println("Invalid input. Please restart the program and enter a valid currency.");
        }
    }
}