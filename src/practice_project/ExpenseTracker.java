package practice_project;

import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {


    static ArrayList<Float> hold = new ArrayList<Float>();


    public static void calculateTotal() {

        double total = 0;

        for (Float x : hold) {
            total = total + x;
        }

        System.out.println("The total expense is: " + total);
    }

    public static void highestExpense() {


        if (hold.isEmpty()) {
            System.out.println("No expense found!");
            return; // Exit the method immediately
        }


        double max = hold.get(0);


        for (int i = 1; i < hold.size(); i++) {
            if (hold.get(i) > max) {
                max = hold.get(i);
            }
        }

        System.out.println("The max expense is: " + max);
    }

    public static void main(String[] args) {



        Boolean Condition = true;
        Scanner sc = new Scanner(System.in);

        while (Condition) {

            System.out.println("Enter expense amount (or type -1 to stop).");

            // Check if user actually entered a number to prevent crash
            if(sc.hasNextFloat()){
                float expense = sc.nextFloat();

                if (expense > 0) {
                    hold.add(expense);
                }
                else if (expense != -1 && expense < 0) {
                    System.out.println("Enter a Positive Expense!");
                }
                else if (expense == -1) {
                    Condition = false;
                }
                else {
                    System.out.println("Invalid Input!");
                }
            } else {
                System.out.println("Please enter a valid number!");
                sc.next(); // Clear the invalid input
            }
        }


        calculateTotal();
        highestExpense();
    }
}