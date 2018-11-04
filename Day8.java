//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        String name;
        int phone;
        int n = in.nextInt();
        Map<String, Integer> phonebook = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            name = in.next();
            phone = in.nextInt();
            // Write code here
            //given Given n names and phone numbers, assemble a phone book that maps friends'                 //names to their respective phone numbers. You will then be given an unknown number of             //names to query your phone book for. For each name queried, print the associated                 //entry from your phone book on a new line in the form name=phoneNumber; if an entry               //for name is not found, print Not found instead.
            phonebook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(s.equalsIgnoreCase(name)){
                System.out.println(phonebook.toString());
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}