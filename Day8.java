//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        //taking the integer from the user
        int n = in.nextInt();
        //taking the phone number and the name from the user
        Map<String, Integer> phonebook = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt(); 
            //storing the name and the phone numbers in the newly created phonebook 
            phonebook.put(name,phone);
            //given Given n names and phone numbers, assemble a phone book that maps friends'
            //names to their respective phone numbers. You will then be given an unknown number of
            //names to query your phone book for. For each name queried, print the associated
            //entry from your phone book on a new line in the form name=phoneNumber; if an entry
            //for name is not found, print Not found instead.
        }
        int i = 0;
        while(in.hasNext()){
            String s = in.next();
            int j=0;
            //looping through the keys and comparing them to the name entered from the user
            for(String key: phonebook.keySet()){
                if(s.equalsIgnoreCase(key)){
                    System.out.format("%s=%d\n",s,phonebook.get(key));
                    //if the name is found increament j 
                    j++;
                }
            }
            //if j is incremented, it means the name was found.
            if(j>0){
                continue;
            }else{
                System.out.println("Not found");
            }
            
        }


        in.close();
    }
}