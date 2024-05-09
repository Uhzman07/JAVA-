package com.usman;

import java.util.Scanner;

public class cinemaTransaction {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomChoice = 0;
        int numberOfRows = 9;
        int seatNumber = 0;
        System.out.println("Which room do you want? \nPress 2 for the larger room \nPress 1 for the smaller room \nNote: The price of the rooms vary with size ");
        roomChoice = scanner.nextInt();{
        if (roomChoice == 1) {

            System.out.println("You have selected the smaller room");
            System.out.println("Please enter the seat number that you want");
            seatNumber= scanner.nextInt();
            switch (seatNumber) {
                case(1):
                case(2)
            }




            int totalPriceToBePaid = 5;

            System.out.println("Your total cost is" + " $" + totalPriceToBePaid);
        }
        else if (roomChoice == 2)    {
            System.out.println("You have selected the larger room");
            System.out.println("Please enter the seat number that you want");
            seatNumber = scanner.nextInt();
            switch (seatNumber){

                case (1) :
                case(2)   :
                case (3)    :
                case(4) :
                case(5)  :
                    System.out.println("Your total cost is " + "$" + 8);
                    break;
                case (6)  :
                case (7) :
                case(8) :
                case (9)    :
                    System.out.println("Your total cost is" + "$" +10);
                    break;
                default:
                    System.out.println("Please enter a valid number between 1 to 9");



            }
            System.out.println("Please enjoy your movie please");
        }






        }


    }

}
