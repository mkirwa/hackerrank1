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

//hackerrank day 3

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         System.out.println("Weird");
      }
      else if (n%2==0 && 2<=n && n<=5){
          
          System.out.println("Not Weird");
      }
       else if(n%2==0 && 6<=n && n<=20)
      {
          System.out.println("Weird"); 
      }
       else if(n%2==0 && n>20)
       {
          System.out.println("Not Weird");

       }
       else
       {
       
      System.out.println(ans);
       }
       
   }
}

///constructor example


class person
{

  String name;
  int age;
  String address;

  //parametized constructors
      class person(int initalage)
      {

        String name;
      }

}

//hackerrank day 4


import java.io.*;
import java.util.*;


public class Person {
    private int age;  
  
  public Person(int initialAge) {
      // Add some more code to run some checks on initialAge
        if(initialAge < 0)
        {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        }
        else
        {
            age = initialAge;
        }
  }

  public void amIOld() {
      // Write code determining if this person's age is old and print the correct statement:
        if(age < 13)
        {
            System.out.println("You are young.");
        }
        else if(age >= 13 && age < 18)
        {
            System.out.println("You are a teenager.");   
        }
        else
        {
            System.out.println("You are old.");
        }
  }

  public void yearPasses() {
      // Increment this person's age.
        age++;
  }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int i = 0; i < T; i++) {
      int age = sc.nextInt();
      Person p = new Person(age);
      p.amIOld();
      for (int j = 0; j < 3; j++) {
        p.yearPasses();
      }
      p.amIOld();
      System.out.println();
        }
    sc.close();
    }
}




