// Main package
package javaAssignment;

// imported library to scan users answers
import java.util.Scanner;

// Main class
public class NumberAnalyzer {

    // Entry point of the application where we call the methods
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;
        boolean check = true;
        do{
            System.out.println("""
                    
                    =========================
                    Number Analyzer Menu
                    =========================
                    1 - Print Numbers 10 to 1
                    2 - Print Even/Odd Report
                    3 - Check Number Type
                    4 - Calculate Sum Between Two Numbers
                    5 - Exit
                    =========================""");
            // scanning user input and save it to @var : option
            option = scanner.nextInt();
            // Switch case to call methods
            switch(option){
                case 1 -> // Calling Method 01 : printNumbersDescending
                            printNumbersDescending();

                case 2 -> // Calling Method 02 : printEvenOrOdd
                            printEvenOrOdd();

                case 3 -> // Calling Method 03 : checkNumberType
                {
                    System.out.print("Input: ");
                    int n = scanner.nextInt();
                    String output = checkNumberType(n);
                    System.out.println("Output: " + output);
                }
                case 4 -> // Calling Method 04 : calculateSum
                {
                    System.out.println("Input: ");
                    int n1 = scanner.nextInt();
                    int n2 = scanner.nextInt();
                    int sum = calculateSum(n1, n2);
                    System.out.println("Output:");
                    System.out.println("Sum = " + sum);
                }

                case 5 -> // If user chooses to Exit and terminate
                {
                    System.out.println("Thank you for using Number Analyzer.");
                    check = false;
                }

                default -> // If user enters an invalid choice
                            System.out.println("Invalid Choice");
            }
        }
        // To keep repeating the loop until user choose Exit
        while(check);

        scanner.close();
    }

    //////////////////////////////////////////////
    /// /* Method 01 : printNumbersDescending
    /// * description : a method prints numbers from 10 to 1
    ///                 in ascending order using a for loop
    ///                 it prints the numbers directly here in the method
    /// * @param : it does not take parameters
    /// * @reutrn : it does not return anything */
    /////////////////////////////////////////////
    public static void printNumbersDescending(){
        for(int i=10; i>=1; i--){
            System.out.println(i);
        }
    }

    //////////////////////////////////////////////
    /// /* Method 02 : printEvenOrOdd
    /// * description : a method specify whether a number
    ///                 from 1 to 10 is odd or even
    ///                 using a for loop and modulo checking
    ///                 it prints the output directly here in the method
    /// * @param : it does not take parameters
    /// * @reutrn : it does not return anything */
    /////////////////////////////////////////////
    public static void printEvenOrOdd(){
        for(int i=1; i<=10; i++){
            if((i%2)==0){
                System.out.println(i + " -> Even");
            }
            else{
                System.out.println(i + " -> Odd");
            }
        }
    }

    //////////////////////////////////////////////
    /// /* Method 03 : checkNumberType
    /// * description : a method checks the number type using if statement
    ///                 if 0 -> returns "Zero"
    ///                 if positive -> returns "Positive"
    ///                 if negative -> returns "Negative"
    ///                 it takes number scanned from user input
    /// * @param : number -> integer -> the number to check its type
    /// * @var : result -> string -> to hold the number type
    /// * @reutrn : result -> string -> that holds the number type to be printed */
    /////////////////////////////////////////////
    public static String checkNumberType(int number){
        String result = "";
        if(number == 0){
            result =  "Zero";
        }
        else if (number < 0) {
            result =  "Negative";
        }
        else{
            result =  "Positive";
        }
        return result;
    }

    //////////////////////////////////////////////
    /// /* Method 04 : calculateSum
    /// * description : a method calculate the sum of two integers
    ///                 it takes numbers scanned from user input
    /// * @param : number1 -> integer -> first number to sum
    ///            number2 -> integer -> second number to sum
    /// * @var : summation -> integer -> holds the result of the summation
    /// * @reutrn : summation -> integer -> returns the result of the summation to be printed*/
    /////////////////////////////////////////////
    public static int calculateSum(int number1, int number2){
        int summation = number1 + number2;
        return summation;
    }


















}
