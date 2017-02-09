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

////////Day 5

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i=1; i<=10; i++)
        {
            int result= n*i;
            System.out.printf("%d x %d = %d\n",n, i,result);
        }
    }
}

///practise printing even and odd numbers in an array


import java.util.*;
public class example1 {
  
  public static void main(String[]args)
  {
    
    int [] firstword=new int []{1,2,3,4,5,6};

        
        for(int i=0;i<firstword.length;i++)
        {
          
            
            if(i%2==0)
                {
            
              System.out.print("this is an odd number ");

                System.out.println(firstword[i]);
                }
            else 
            {
              System.out.print("this is an even number ");
              System.out.println(firstword[i]);
            }
            
        }
        
    
    
  }

  

}
///Day 6 hackerrank

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        
        for(int i = 0; i < testCases; i++){
            char[] inputString = scan.next().toCharArray();
      
            // Print even chars
            for(int j = 0; j < inputString.length; j += 2){
                System.out.print(inputString[j]);
            }
            System.out.print(" ");
            
            // Print odd chars
            for(int j = 1; j < inputString.length; j += 2){
                System.out.print(inputString[j]);
            }
            System.out.println();
        }
        scan.close();

        
        
    }
}

<<<<<<< HEAD
///hacker rank Day 6 option 2

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        scan.nextLine();
        
        for(int i = 0; i < testCases; i++) {
            String input = scan.nextLine();
            
            for(int j = 0; j < input.length(); j = j+2) {
                System.out.print(input.charAt(j));
            }
            System.out.print(" ");
            for(int j = 1; j < input.length(); j = j+2) {
               System.out.print(input.charAt(j));
            }
            System.out.println();
        }

        
        
    }
}

<<<<<<< HEAD

////Day 7 hackerrank

import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //create an array
        int[] arr = new int[n];
        
        //put elements into the array
        for(int i=0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        
        for(int i=arr.length-1; i >= 0; i--)
        {
            System.out.printf("%d ",arr[i]);
        }
        in.close();
    }
}





//hacker rank day Dictionaries and maps


import java.util.*;

public class DictionaryPractise
{

    public static void main(String[]args)
    {

      //English to Spanish Dictionary
      Map<String,String> englSwaDictionary = new HashMap<String, String>();
      //putting things inside of a dictionary
      englSwaDictionary.put("Monday","Jumatatu");
      englSwaDictionary.put("Tuesday","Jumanne");
      englSwaDictionary.put("Wednesday","Jumatano");
      englSwaDictionary.put("Thursday","Alhamisi");
      englSwaDictionary.put("Friday","Ijumaa");
      //Getting things from a dictionary
      System.out.println(englSwaDictionary.get("Monday"));
      System.out.println(englSwaDictionary.get("Tuesday"));
      System.out.println(englSwaDictionary.get("Wednesday"));
      System.out.println(englSwaDictionary.get("Thursday"));
      System.out.println(englSwaDictionary.get("Friday"));
      //Getting the out all the keys
      System.out.println(englSwaDictionary.keySet());
      //Getting out all the values
      System.out.println(englSwaDictionary.values());
      //Getting the size of the dictionary
      System.out.println("the size of the dictionary is "+englSwaDictionary.size());


      //Shopping list

      Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();

      //put items into the shopping lise

      shoppingList.put("ham",true);
      shoppingList.put("bread",Boolean.TRUE);
      shoppingList.put("eggs",true);
      shoppingList.put("oreos",Boolean.FALSE);

      //retrive items

      //key value parents

      System.out.println(shoppingList.toString());

      //
      //shoppingList.clear(); ----clears the list
      //shoppingList.remove("eggs"); ----removes the eggs

      //finding out if the dictionary is empty

      System.out.println(shoppingList.isEmpty());

      //replacing values for a certain key

      shoppingList.replace("bread",Boolean.FALSE);

      System.out.println(shoppingList.toString());






      System.out.println();
      System.out.println();
      System.out.println();
      System.out.println();


      //Hacker rank challenge question


      //Task 
      //Given n names and phone numbers
      //assemble a phone book that maps friends' names to their respective phone numbers.
      // You will then be given an unknown number of names to query your phone book for.
      //For each name queried, print the associated entry from your phone book on a new line in the form name=phoneNumber;
      // if an entry for name is not found, print Not found instead.


      

      //Recursions examples
      //Finding summations
      //Example summation of 5 = 5+4+3+2+1

      public static int Summation(int n)
      {

        //base case

        if(n<=0)
        {
          return 0;
        }

        //recursive case
        else
        {
          //3 + summation(2)
          //3 + 2 + summation(1)
          //3 + 2 + 1 + summation(0)
          //return 6
          return n + Summation(n-1);
        }


      }

      public static void main(String[]args)

      {

          Summation(3);

      }


      //exponentiation example

      public static int exponentiation(int n, int p)

      {

      //base case
      if(p<=0)
      {
        return 1;
      }

      //recursive case

      else
      {

        //5 * exponential(5,2)
        //5 * 5 * exponential(5,1)
        //5 * 5 * 5 exponentiation(5,0)
        //5 * 5 * 5 * 1

        return 5 * exponentiation(n, p-1);

      }

      }

      public static void main(String[]args)

      {


        exponentiation(5,3);


      }




      //hackerrank Day 9 Solution

      public static void main(String[] args) {
    // TODO Auto-generated method stub

    //Write a factorial function that takes a positive integer,N
    //as a parameter and prints the result of N ( N factorial).
    System.out.print(factorial(5));
    
    
  }
  
  public static int factorial(int n)
  {
    
  
  //base case
  if(n<=1)
  {
    return 1;
  }
  
  else
  {
    
  //recursive case
    
  return n * factorial(n-1);
    
  }
  
  
  
}

}





    }


}

//hacker rank day 10 solution

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int counter = 0;
        int maxCount = counter;
        
        while(n/2 != 0){
            if(n%2 == 1){
                counter++;
            }
            else{
                if(counter > maxCount){
                    maxCount = counter;
                    counter = 0;
                }
            }
            
            n = n/2;
        }
        if(n%2 == 1){
            counter++;
            if(counter > maxCount){
                maxCount = counter;
            }
           
        }
        
        System.out.println(maxCount);
        
        
    }
}

//Hacker rank day 10 solution 2

public static int countConsecutiveOnes(int input)
    {
        String binary ="";
        
        while(input != 0)
        {
            binary = (input%2) + binary;
            input = input/2;
        }
        int largest = 0;
        int conSecutive =0;
        for(int i =0; i < binary.length(); i++)
        {
            if(binary.charAt(i) == '1')
            {
                conSecutive+=1;
            }
            else if(binary.charAt(i) == '0')
            {
                if(conSecutive > largest)
                    largest = conSecutive;
                conSecutive = 0;
            }
        }
        if(conSecutive > largest)
                    largest = conSecutive;
        
        return largest;
    }

// Hacker rank day 11 solutions 



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        
        int sum = 0;
        
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
         int max = arr[0+0][0+0] + arr[0+0][0+1] +  arr[0+0][0+2] +  arr[1+1][1+1] +  arr[2+2][2+0] +  arr[2+2][2+1]+                                 arr[2+2][2+2];
            

        
        for (int i = 0; i <= arr.length - 3; i++){
            for(int j = 0; j<= arr.length - 3; j++){
                sum = arr[i+0][j+0] + arr[i+0][j+1] +  arr[i+0][j+2] +  arr[i+1][j+1] +  arr[i+2][j+0] +  arr[i+2][j+1]+                                 arr[i+2][j+2];
            
                if(sum >= max){
                    max = sum;
                }
            }
        
            
        
        }
        System.out.println(max);
    }
        
}



