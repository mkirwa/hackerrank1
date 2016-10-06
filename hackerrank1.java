import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        int a=scan.nextInt();
        double b=scan.nextDouble();
        scan.nextLine();
        String c=scan.nextLine();


        int sum=a+i;
        
        System.out.println(""+sum);

        /* Print the sum of the double variables on a new line. */
		
        double sum2=b+d;

        System.out.println(""+sum2);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(""+s+""+c);
scan.close();

    }
}

///

/////Day 2 HackerRank


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        double tipPercent = scan.nextInt(); // tip percentage
        double taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        tipPercent=(mealCost*tipPercent)/100;
        taxPercent=(mealCost*taxPercent)/100;
        
        double total=mealCost+tipPercent+taxPercent;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(total);
      
        // Print your result
        
        System.out.println("The total meal cost is "+totalCost+ " dollars.");
        
    }
}
