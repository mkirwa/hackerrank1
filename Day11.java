import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day11{

    private static final Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int maximum = 0;
        int total = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < 6; i++) {
            
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            for (int j = 0; j < 6; j++) {
                
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
                if(i+1==j){
                    //ignore element j=0 and element j=3;
                    if(j==0 || j==j+2){
                        total=total+0;
                    }else{
                        continue;
                    }
                }else{
                    if(j<6){
                        if(j+count1<3+count1)
                            total=total+j; 
                    }
                    
                }         
            }
            count1++;
            
        }
        //all the items have been stored in arr items...
        //loop through arr item
        //Using element 0 in row 0 as reference 
            //take the elements in the next two rows and add them 
            //take the elements in the next two columns except for 
            //element 1,0 and 1,2 add them to the elements fro
            //take the first three columns 
                //take all elements in the row 0
                //take the element in the column 1 row 1
                //take all elements in row 2
                //add all these elements and store them in a variable max
            //
        System.out.println(total);
        scanner.close();
    }
}

