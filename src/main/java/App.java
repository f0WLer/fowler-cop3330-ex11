import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Fowler
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        double n_euros = scanner.nextDouble();
        System.out.print("What is the exchange rate? ");
        double exchange_rate = scanner.nextDouble();
        double output_usd = n_euros * exchange_rate;

        System.out.println(String.format("%.2f euros at an exchange rate of %s is\n%.2f U.S. dollars.",
                n_euros, exchange_rate, output_usd));
    }
}
