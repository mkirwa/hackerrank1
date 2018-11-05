//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n;
        do{
            n = in.nextInt();
        }while(n<1 && n>Math.pow(10,5));
     
        Map<String, Integer> phonebook = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt(); 
            phonebook.put(name,phone);
            //given Given n names and phone numbers, assemble a phone book that maps friends'                 //names to their respective phone numbers. You will then be given an unknown number of             //names to query your phone book for. For each name queried, print the associated                 //entry from your phone book on a new line in the form name=phoneNumber; if an entry               //for name is not found, print Not found instead.
        }
        
        int count = 1;
            while(in.hasNext() && count<=Math.pow(10,4)){
            count++;
            String s = in.next();
            int j=0;
            // Write code here
            for(String key: phonebook.keySet()){
                if(s.equalsIgnoreCase(key)){
                    System.out.format("%s=%d\n",s,phonebook.get(key));
                    j++;
                }
            }
            
            if(j==1){
                continue;
            }else{
                System.out.println("Not found");
            }

        }
            
        


        in.close();
    }
}