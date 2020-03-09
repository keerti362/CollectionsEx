/**
 * 
 */
package HashMapExample;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Keerti
 *
 * 
 */

//HashMap implements a map interface, it uses a technich called hashing wch is converting an object into integer wch helps in indexing and faster searches.
//when we call a put method, hashcode is generated for a key value using wch an index is decided.
//index = hashcode(key) & (n-1) : where n is size of the array

//HASH COLLISION
//if two index is same then in this case an equals() method compares whether the both keys are same or different, if both keys are same then value is replaced by current value.
//else node object is connected to the existing node object through linkedlist.

//when get method is called using key then hashcode is generatedfor that key and index is searched. If two keys are present in same index then first key is comapred and get the value
public class HashMapEx {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("Aman", 14);
		map.put("Ritesh", 17);
		map.put("Sanjana", 15);
		map.put("Sunny", 20);

		System.out.println(map);

		System.out.println(map.get("Aman"));

		System.out.println(map.containsKey("Keerti"));// checking whether particular key exists
		System.out.println();

		// iterating through the hashmap

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		map.replace("Sunny", 25); //replacing a value
		System.out.println("after replacement" + map);
		
		map.putIfAbsent("Sanjana", 12);
		map.putIfAbsent("Madhura", 22);
		
		System.out.println(map);

	}

}
