import java.io.*;
import java.util.*;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Given string,S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).
       Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        input.nextLine();
        for(int j=1;j<=testcase;j++){
            
                String word = input.nextLine(); 
                char array[] = word.toCharArray();
                for(int i=0; i<word.length(); i++){
                    if(i%2==0){
                        System.out.print(array[i]);
                    }
                }
                System.out.print(" ");
                for(int i=0; i<word.length(); i++){
                    
                    if(i%2==1){
                        System.out.print(array[i]);
                    }
                }  
                    
                System.out.println();
        }
          
    }
}