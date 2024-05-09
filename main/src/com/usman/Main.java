package com.usman;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthly_interest_rate= 0;
        int PRINCIPAL = 0;

        int PERIOD = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Principal ($1K - $1M: ");

            PRINCIPAL = scanner.nextInt();
            if (PRINCIPAL >= 1_000 && PRINCIPAL <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }


        while(true) {
            System.out.print("Annual Interest Rate: ");
             float RATE_GIVEN = scanner.nextFloat();

            if (RATE_GIVEN > 0 && RATE_GIVEN < 1_000)
                break;
           monthly_interest_rate = RATE_GIVEN / PERCENT / MONTHS_IN_YEAR;
            System.out.println("Enter a number between 0 and 1000");
        }


        while(true) {
            System.out.print("Period(Years): ");
            PERIOD = scanner.nextInt();
            if (PERIOD >= 1 && PERIOD <= 30)
                break;
            System.out.println("Enter a number between 1 and 30");
        }



        double mortgage = PRINCIPAL*(monthly_interest_rate* Math.pow(1 + monthly_interest_rate,PERIOD)) / (Math.pow(1 + monthly_interest_rate, PERIOD) - 1);
        //NumberFormat mortgageFormatted = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: " + mortgage );


      char




    }
}
package com.usman;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthly_interest_rate= 0;
        int PRINCIPAL = 0;

        int PERIOD = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Principal ($1K - $1M: ");

            PRINCIPAL = scanner.nextInt();
            if (PRINCIPAL >= 1_000 && PRINCIPAL <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }


        while(true) {
            System.out.print("Annual Interest Rate: ");
             float RATE_GIVEN = scanner.nextFloat();

            if (RATE_GIVEN > 0 && RATE_GIVEN < 1_000)
                break;
           monthly_interest_rate = RATE_GIVEN / PERCENT / MONTHS_IN_YEAR;
            System.out.println("Enter a number between 0 and 1000");
        }


        while(true) {
            System.out.print("Period(Years): ");
            PERIOD = scanner.nextInt();
            if (PERIOD >= 1 && PERIOD <= 30)
                break;
            System.out.println("Enter a number between 1 and 30");
        }



        double mortgage = PRINCIPAL*(monthly_interest_rate* Math.pow(1 + monthly_interest_rate,PERIOD)) / (Math.pow(1 + monthly_interest_rate, PERIOD) - 1);
        //NumberFormat mortgageFormatted = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: " + mortgage );


      char




    }
}
package com.usman;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float monthly_interest_rate= 0;
        int PRINCIPAL = 0;

        int PERIOD = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Principal ($1K - $1M: ");

            PRINCIPAL = scanner.nextInt();
            if (PRINCIPAL >= 1_000 && PRINCIPAL <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }


        while(true) {
            System.out.print("Annual Interest Rate: ");
             float RATE_GIVEN = scanner.nextFloat();

            if (RATE_GIVEN > 0 && RATE_GIVEN < 1_000)
                break;
           monthly_interest_rate = RATE_GIVEN / PERCENT / MONTHS_IN_YEAR;
            System.out.println("Enter a number between 0 and 1000");
        }


        while(true) {
            System.out.print("Period(Years): ");
            PERIOD = scanner.nextInt();
            if (PERIOD >= 1 && PERIOD <= 30)
                break;
            System.out.println("Enter a number between 1 and 30");
        }



        double mortgage = PRINCIPAL*(monthly_interest_rate* Math.pow(1 + monthly_interest_rate,PERIOD)) / (Math.pow(1 + monthly_interest_rate, PERIOD) - 1);
        //NumberFormat mortgageFormatted = NumberFormat.getCurrencyInstance();
        System.out.println("Mortgage: " + mortgage );


      char




    }