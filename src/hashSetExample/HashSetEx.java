/**
 * 
 */
package hashSetExample;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Keerti
 *
 * 
 */
//*HashSet uses the hashing technology to store the values.
//*HashSet stores unique values, it does not allow the duplicate elements.
//it doesnot follow the insertion order, insertion is dependent on the hashcode.
//*HashSet allows the null value.
//*HashSet is best for search operations.
//*HashSet uses hashmap internally.
public class HashSetEx {

	public static void main(String[] args) {

		String newLine = System.getProperty("line.separator");
		
		HashSet<String> set = new HashSet<String>();
		set.add("ABC");
		set.add("BCD");
		set.add("XYZ");

		System.out.println(set + newLine);

		// iterating through the hashset
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Ravi");
		set1.add("vijay");
		set1.add("ajay");
		
		for (String str : set1) {
			System.out.println(str);
		}
		System.out.println();
		System.out.println("set 1 " + set1 + newLine);
		set.addAll(set1);

		System.out.println(set + newLine);

		set.removeIf(str -> str.contains("Keerti"));
		set.removeIf(str -> str.contains("ajay"));

		System.out.println(set + newLine);

		set.removeAll(set1);

		System.out.println("set1 : " + set1 +newLine);
		System.out.println(set + newLine);

		set.clear();
		System.out.println(set);

	}

}
