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
            System.out.print("Enter the currency you want to convert to (USD, EUR, GBP, JPY, AUD, CAD): ");
            String toCurrency = input.nextLine();
            while(!toCurrency.equalsIgnoreCase("USD") && !toCurrency.equalsIgnoreCase("EUR") && !toCurrency.equalsIgnoreCase("GBP") && !toCurrency.equalsIgnoreCase("JPY") && !toCurrency.equalsIgnoreCase("AUD") && !toCurrency.equalsIgnoreCase("CAD"))
            {
                System.out.print("Invalid input, please try a valid currency (USD, EUR, GBP, JPY, AUD, CAD): ");
                toCurrency = input.nextLine();
            }
            if(toCurrency.equalsIgnoreCase("USD") || toCurrency.equalsIgnoreCase("EUR") || toCurrency.equalsIgnoreCase("GBP") || toCurrency.equalsIgnoreCase("JPY") || toCurrency.equalsIgnoreCase("AUD") || toCurrency.equalsIgnoreCase("CAD"))
            {
                double convertedAmount = 0.0;

                // conversion from USD to other currencies logic
                if(fromCurrency.equalsIgnoreCase("USD"))
                {
                    // Conversion rates
                    double usd = 1.00;
                    double usdToEur = 0.89;
                    double usdToGbp = 0.76;
                    double usdToJpy = 158.33;
                    double usdToAud = 1.47;
                    double usdToCad = 1.43;

                    convertedAmount = usd * amount;
                    double eurAmount = convertedAmount * usdToEur;
                    double gbpAmount = convertedAmount * usdToGbp;
                    double jpyAmount = convertedAmount * usdToJpy;
                    double audAmount = convertedAmount * usdToAud;
                    double cadAmount = convertedAmount * usdToCad;
                    
                    // Print Amounts
                    if(toCurrency.equalsIgnoreCase("EUR"))
                    {
                        System.out.println("Converted Amount: " + eurAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("GBP"))
                    {
                        System.out.println("Converted Amount: " + gbpAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("JPY"))
                    {
                        System.out.println("Converted Amount: " + jpyAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("AUD"))
                    {
                        System.out.println("Converted Amount: " + audAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("CAD"))
                    {
                        System.out.println("Converted Amount: " + cadAmount);
                    }
                }
                
                // Conversion from EUR to other currencies logic
                else if(fromCurrency.equalsIgnoreCase("EUR"))
                {

                    // Conversion rates
                    double eur = 1.00;
                    double eurToUsd = 1.12;
                    double eurToGbp = 0.85;
                    double eurToJpy = 177.90;
                    double eurToAud = 1.61;
                    double eurToCad = 1.60;

                    convertedAmount = eur * amount;
                    double usdAmount = convertedAmount * eurToUsd;
                    double gbpAmount = convertedAmount * eurToGbp;
                    double jpyAmount = convertedAmount * eurToJpy;
                    double audAmount = convertedAmount * eurToAud;
                    double cadAmount = convertedAmount * eurToCad;

                    // Print Amounts
                    if(toCurrency.equalsIgnoreCase("USD"))
                    {
                        System.out.println("Converted Amount: " + usdAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("GBP"))
                    {
                        System.out.println("Converted Amount: " + gbpAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("JPY"))
                    {
                        System.out.println("Converted Amount: " + jpyAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("AUD"))
                    {
                        System.out.println("Converted Amount: " + audAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("CAD"))
                    {
                        System.out.println("Converted Amount: " + cadAmount);
                    }
                }

                // Conversion from GBP to other currencies logic
                else if(fromCurrency.equalsIgnoreCase("GBP"))
                {
                    // Conversion rates
                    double gbp = 1.00;
                    double gbpToUsd = 1.32;
                    double gbpToEur = 1.17;
                    double gbpToJpy = 208.33;
                    double gbpToAud = 1.88;
                    double gbpToCad = 1.88;

                    convertedAmount = gbp * amount;
                    double usdAmount = convertedAmount * gbpToUsd;
                    double eurAmount = convertedAmount * gbpToEur;
                    double jpyAmount = convertedAmount * gbpToJpy;
                    double audAmount = convertedAmount * gbpToAud;
                    double cadAmount = convertedAmount * gbpToCad;

                    // Print Amounts
                    if(toCurrency.equalsIgnoreCase("USD"))
                    {
                        System.out.println("Converted Amount: " + usdAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("EUR"))
                    {
                        System.out.println("Converted Amount: " + eurAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("JPY"))
                    {
                        System.out.println("Converted Amount: " + jpyAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("AUD"))
                    {
                        System.out.println("Converted Amount: " + audAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("CAD"))
                    {
                        System.out.println("Converted Amount: " + cadAmount);
                    }
                }

                // conversion from JPY to other currencies logic
                else if(fromCurrency.equalsIgnoreCase("JPY"))
                {
                    // Conversion rates
                    double jpy = 1.00;
                    double jpyToUsd = 0.0063;
                    double jpyToEur = 0.0056;
                    double jpyToGbp = 0.0048;
                    double jpyToAud = 0.0090;
                    double jpyToCad = 0.0089;

                    convertedAmount = jpy * amount;
                    double usdAmount = convertedAmount * jpyToUsd;
                    double eurAmount = convertedAmount * jpyToEur;
                    double gbpAmount = convertedAmount * jpyToGbp;
                    double audAmount = convertedAmount * jpyToAud;
                    double cadAmount = convertedAmount * jpyToCad;

                    // Print Amounts
                    if(toCurrency.equalsIgnoreCase("USD"))
                    {
                        System.out.println("Converted Amount: " + usdAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("EUR"))
                    {
                        System.out.println("Converted Amount: " + eurAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("GBP"))
                    {
                        System.out.println("Converted Amount: " +  gbpAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("AUD"))
                    {
                        System.out.println("Converted Amount: " + audAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("CAD"))
                    {
                        System.out.println("Converted Amount: " + cadAmount);
                    }

                }

                // conversion from AUD to other currencies logic
                else if(fromCurrency.equalsIgnoreCase("AUD"))
                {
                    // Conversion rates
                    double aud = 1.00;
                    double audToUsd = 0.70;
                    double audToEur = 0.62;
                    double audToGbp = 0.53;
                    double audToJpy = 110.72;
                    double audToCad = 0.95;

                    convertedAmount = aud * amount;
                    double usdAmount = convertedAmount * audToUsd;
                    double eurAmount = convertedAmount * audToEur;
                    double gbpAmount = convertedAmount * audToGbp;
                    double jpyAmount = convertedAmount * audToJpy;
                    double cadAmount = convertedAmount * audToCad;

                    // Print Amounts
                    if(toCurrency.equalsIgnoreCase("USD"))
                    {
                        System.out.println("Converted Amount: " + usdAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("EUR"))
                    {
                        System.out.println("Converted Amount: " + eurAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("GBP"))
                    {
                        System.out.println("Converted Amount: " + gbpAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("JPY"))
                    {
                        System.out.println("Converted Amount: " + jpyAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("CAD"))
                    {
                        System.out.println("Converted Amount: " + cadAmount);
                    }
                }

                // conversion from CAD to other currencies logic
                else if(fromCurrency.equalsIgnoreCase("CAD"))
                {
                    // Conversion rates
                    double cad = 1.00;
                    double cadToUsd = 0.70;
                    double cadToEur = 0.62;
                    double cadToGbp = 0.53;
                    double cadToJpy = 110.72;
                    double cadToAud = 1.05;

                    convertedAmount = cad * amount;
                    double usdAmount = convertedAmount * cadToUsd;
                    double eurAmount = convertedAmount * cadToEur;
                    double gbpAmount = convertedAmount * cadToGbp;
                    double jpyAmount = convertedAmount * cadToJpy;
                    double audAmount = convertedAmount * cadToAud;

                    // Print Amounts
                    if(toCurrency.equalsIgnoreCase("USD"))
                    {
                        System.out.println("Converted Amount: " + usdAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("EUR"))
                    {
                        System.out.println("Converted Amount: " + eurAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("GBP"))
                    {
                        System.out.println("Converted Amount: " + gbpAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("JPY"))
                    {
                        System.out.println("Converted Amount: " + jpyAmount);
                    }
                    else if(toCurrency.equalsIgnoreCase("AUD"))
                    {
                        System.out.println("Converted Amount: " + audAmount);
                    }
                }
            }
        }
        else
        {
            System.out.println("Invalid input. Please restart the program and enter a valid currency.");
        }
    }
}