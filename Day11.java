import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int maximum = 0;
        int reseti = 0;
        int total = 0;
        int count = 2;
        int count1 = 0;
        int count2 = 2;
        int counter = 0;
        for (int i = 0; i < 6; i++) {
            
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            for (int j = 0; j < 6; j++) {
                
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
                
    
                } 
            
                
            
            }
        
        do{
            for(int i= counter; i<=count; i++){
            
            for(int j= counter; j<=count; j++){
                        if(i==counter+1){
                            if(j==counter+1)
                                total+=arr[i][j]; 
                        }else{

                            total+=arr[i][j];
                 
                        }

            }       
        }
        if(total>maximum)
            maximum=total;
        total=0;
        count++;
        counter++; 
            
        }while(count!=6);
        
            
                System.out.println(maximum);
                scanner.close();
        }
       
}

