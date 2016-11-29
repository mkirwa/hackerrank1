

//hacker rank day Dictionaries and maps


import java.util.*;

public class DictionaryPractise
{

		public static void main(String[]args)
		{

			//English to Spanish Dictionary
			Map<String,String> englSwaDictionary = new HashMap<String, String>();
			//putting things inside of a dictionary
			englSwaDictionary.put("Monday","Jumatatu");
			englSwaDictionary.put("Tuesday","Jumanne");
			englSwaDictionary.put("Wednesday","Jumatano");
			englSwaDictionary.put("Thursday","Alhamisi");
			englSwaDictionary.put("Friday","Ijumaa");
			//Getting things from a dictionary
			System.out.println(englSwaDictionary.get("Monday"));
			System.out.println(englSwaDictionary.get("Tuesday"));
			System.out.println(englSwaDictionary.get("Wednesday"));
			System.out.println(englSwaDictionary.get("Thursday"));
			System.out.println(englSwaDictionary.get("Friday"));
			//Getting the out all the keys
			System.out.println(englSwaDictionary.keySet());
			//Getting out all the values
			System.out.println(englSwaDictionary.values());
			//Getting the size of the dictionary
			System.out.println("the size of the dictionary is "+englSwaDictionary.size());


			//Shopping list

			Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();

			//put items into the shopping lise

			shoppingList.put("ham",true);
			shoppingList.put("bread",Boolean.TRUE);
			shoppingList.put("eggs",true);
			shoppingList.put("oreos",Boolean.FALSE);

			//retrive items

			//key value parents

			System.out.println(shoppingList.toString());

			//
			//shoppingList.clear(); ----clears the list
			//shoppingList.remove("eggs"); ----removes the eggs

			//finding out if the dictionary is empty

			System.out.println(shoppingList.isEmpty());

			//replacing values for a certain key

			shoppingList.replace("bread",Boolean.FALSE);

			System.out.println(shoppingList.toString());






			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();


			//Hacker rank challenge question


			//Task 
			//Given n names and phone numbers
			//assemble a phone book that maps friends' names to their respective phone numbers.
			// You will then be given an unknown number of names to query your phone book for.
			//For each name queried, print the associated entry from your phone book on a new line in the form name=phoneNumber;
			// if an entry for name is not found, print Not found instead.


			
					import java.util.*;
					import java.io.*;

					class Solution{
					    public static void main(String []argh){
					        Scanner in = new Scanner(System.in);
					        int n = in.nextInt();
					        
					            //Task 
								//Given n names and phone numbers
								//assemble a phone book that maps friends' names to their respective phone numbers.
								// You will then be given an unknown number of names to query your phone book for.
								//For each name queried, print the associated entry from your phone book on a new line in the form     q               //name=phoneNumber;
								// if an entry for name is not found, print Not found instead.


					        //System.out.println(n);
					        Map<String, Integer> phonebook = new HashMap<String, Integer>();
					        
					        for(int i = 0; i < n; i++){
					            String name = in.next();
					            int phone = in.nextInt();
					            // Write code here
					            
					            phonebook.put(name,phone);
					            //System.out.println(phonebook.toString());
					            
					            
					        }
					        
					        while(in.hasNext()){
					            //take in the query
					            String name = in.next();
					            
					            if (!phonebook.containsKey(name)) 
					            {
					                System.out.println("Not found");
					            } 
					            else{
					                System.out.printf("%s=%s\n", name, Integer.toString(phonebook.get(name)));
					            }
					                
					            
					        }
					        
					        in.close();
					    }
					}









							}


					}