import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day2{
    private static double total_cost;
    private static double meal_cost;
    private static double tip_percent;
    private static double tax_percent;
    // Complete the solve function below.
    static void solve(double meal_cost, double tip_percent, double tax_percent) {
            meal_cost = meal_cost;
            tip_percent = meal_cost * (tip_percent/100);
            tax_percent = meal_cost * (tax_percent/100);
            total_cost = meal_cost + tip_percent + tax_percent;

}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");        
        
        solve(meal_cost,tip_percent,tax_percent);
        
        
        System.out.println(Math.round(total_cost));

        scanner.close();
    }
}

