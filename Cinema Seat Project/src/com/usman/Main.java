package com.usman;

public class Main {

    public static void main(String[] args) {
        System.out.println("Cinema :");
        System.out.println(" 1 2 3 4 5 6 7 8 ");
        for(int i = 0; i < 8; i ++){ // Note: here we use whichever of i and j to create rows and column and if we print the i and j component itself, we get digits but if we print using a letter or anything , we get such letter in rows and column
            System.out.print( i + "   ");// the space after i is for the space after the digits and the following S

             for(int j =1 ; j < 9; j++) {// here the j for loop is inside the i loop meaning for each i loop which is the column, print letter s which is the row in the j for loop
                 System.out.print( "S" + "          ");

                 // the space in the colon is to give space between rows or column when we run

             }

            System.out.println(); // we need to print a new line so as to give space between the digits from the int i for loop


        }



    }
}
