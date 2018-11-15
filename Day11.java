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
        int reseti = 0;
        int total = 0;
        int count1 = 0;
        int count2 = 2;
        for (int i = 0; i < 6; i++) {
            
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            for (int j = 0; j < 6; j++) {
                
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
                //if(count2==3){  
                //}
                          //if(total>maximum)
                                //maximum=total;                         
                            //total+=arr[i][j+count1];
                            //count1++  
                                
                            //if j is greater or equal to 3
                            //store the total in maximum
                            //increment the count
                            //add the next three elements starting
                            //from the count to the 3rd element
    
                } 
            
                //if(i==3){
                    //total = maximum;
                    //count1++;
                //}
            
            }
        
        //find the highest hour glass in the first three rows
        //compare that hour glass with the second row and so forth 
        //and so forth
        
        for(int i=0; i<6; i++){
            
            for(int j=0; j<count2; j++){
                total+=arr[i][j];
                if(j==count2){
                    if(total>maximum)
                        maximum=total;
                        reseti=j-2;
                    total=0;
                    j=j-1;
                    total+=arr[i][j];
                    count2++;   
                            
                }
                    
            }
        }
            
                System.out.println(total);
                scanner.close();
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
}


