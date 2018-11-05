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
        
            while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(!phonebook.containsKey(s)){
                System.out.println("Not found");
            }
            else{
                System.out.printf("%s=%s\n", s, Integer.toString(phonebook.get(s)));
            }
           
            
        }

        in.close();
    }
}