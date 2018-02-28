import java.util.Scanner;

public class Triangle {
// Written by: Mike Baldwin
// Project 5 - Part 4 - Triangle
// Builds a triangle in the console based upon a number of rows count provided by the
// user

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfRows, totalColumns, numOfXs, numOfSpaces;

    System.out.println("Welcome to the Game of Triangle.");

    while (true) {
        System.out.print("Please enter an odd number [1-20]: ");
        numOfRows = scanner.nextInt();
        if (numOfRows > 0 && numOfRows < 20 && numOfRows % 2 != 0) {
            System.out.println("Thanks, here is the triangle with 5 rows:");
            break;
        }
        System.out.println("The number must be odd numbers between 1 and 20.");
    }

    totalColumns = (numOfRows * 2) - 1;
    for (int i = 1; i < numOfRows + 1; i++) {
        numOfXs = (i * 2) - 1;
        numOfSpaces = totalColumns - numOfXs;
        System.out.println();
        for (int j = 0; j < numOfSpaces / 2; j++)
            System.out.print(" ");
        for (int k = 0; k < numOfXs; k++)
            System.out.print("x");
        for (int j = 0; j < numOfSpaces / 2; j++)
            System.out.print(" ");
    }
}
}
