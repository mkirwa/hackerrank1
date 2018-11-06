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
        int n;
        do{
            n = scanner.nextInt();
        }
        while(n<1 || n>Math.pow(10,6)); 
        
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int count=0; 
        int count1=0;
        do{
            int modulo = n%2;
            n = n/2; 
            if(modulo==1){
                count++;    
            }else{
                if(count>count1){
                    count1=count;
                }
                count=0;
            }
            }while(n!=0);

        if(count>count1){
            System.out.println(count);
        }else{
            System.out.println(count1);
        }        
        
        scanner.close();
    }
}

