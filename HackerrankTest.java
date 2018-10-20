import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerrankTest{
// Complete the solve function below.
    static void solve(double meal_cost, double tip_percent, double tax_percent, double total_cost) {
            meal_cost = meal_cost;
            tip_percent = meal_cost * 0.2;
            tax_percent = meal_cost * 0.08;
            total_cost = meal_cost + tip_percent + tax_percent;

}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        double tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        double tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");        
        double total_cost = 0;
        
        solve(meal_cost,tip_percent,tax_percent, total_cost);
        
        System.out.printf("%.2f",total_cost);

        scanner.close();
    }
}

