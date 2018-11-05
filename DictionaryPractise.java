//Dictionaries and Hashmaps in Java
//Dictionaries don’t really exist in java
//it’s an abstract class and so other
//things are called. So instead we use maps.  
import java.util.*;
public class DictionaryPractise{

	public static void main(String[]args){
		//english to spanis dictionary
		//the first string is string because string is the data type 
		//for the key. The second string is string because the data type
		//for the value is String 
		Map<String, String> engspandictionary = new HashMap<String, String>();
		//inserting keys and values into the library
		engspandictionary.put("Monday","Lunes");
		engspandictionary.put("Tuesday","Martes");
		engspandictionary.put("Wednesday","Miercoles ");
		engspandictionary.put("Thursday","Juves");
		engspandictionary.put("Friday","Viernes");
		//retrieving the values from the dictionary
		System.out.println(engspandictionary.get("Monday"));
		System.out.println(engspandictionary.get("Tuesday"));
		System.out.println(engspandictionary.get("Wednesday"));
		System.out.println(engspandictionary.get("Thursday"));
		System.out.println(engspandictionary.get("Friday"));	
		//print out all keys 
		System.out.println(engspandictionary.keySet());	
		//print out all values
		System.out.println(engspandictionary.values());
		//print out the size
		System.out.println(engspandictionary.size());
		//checks whether the dictionary contains a key word
		//if it does, print that key
		if(engspandictionary.containsKey("Monday")){
			System.out.println(engspandictionary.get("Monday"));
		}


		//Create a shopping list with a boolean.
		//do you need carrots? NO or Yes
		Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
		//inserting keys and values into the dictionary 
		shoppingList.put("Ham",true);
		//Boolean.TRUE is the Boolean object corresponding to the primitive type false
		//it is teh same us the one above(for Ham)
		//ofcourse we can write our primitive value
		//in there and it will probably be fine but 
		//if we want to be extra safe use objects inside of the map
		//like the case below(Boolean.TRUE)
		//Boolean is an object we have properties which is why we can
		//do Boolean.True()....using . 
		shoppingList.put("Bread",Boolean.TRUE);
		shoppingList.put("Eggs", Boolean.FALSE);
		shoppingList.put("Sugar",false);
		//retrieving items
		System.out.println(shoppingList.get("Ham"));
		//printing key-value pair
		System.out.println(shoppingList.toString());
		//clearing the dictionary
		shoppingList.clear();
		//checking whether the dictionaries are empty
		//Is empty? Is it empty? prints True if it's empty
		System.out.println(shoppingList.isEmpty());
		//You can also removed either an object or a key
		shoppingList.remove("Eggs");
		//printing key-value pair to see if the Eggs were removed
		System.out.println(shoppingList.toString());
		//replacing things 
		shoppingList.replace("Bread",Boolean.FALSE);
		//printing key-value pair to see if the Bread was replaced
		System.out.println(shoppingList.toString());



	}
}