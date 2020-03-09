/**
 * 
 */
package arralistExample;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Keerti
 *
 * 
 */

// COLLECTIONS
//interfaces are set, list,queue, dequeue
//classes are hashset and linked hashset implements set, arralist and linkedlsit implements list,priorityqueue implements queue and dequeue extends queue interface

//ARRAYLIST
//Can contain a duplicate elements
//insertion order is maintained
//random access is possible bcs array works on index
//manipulation is slow bcs lot of shifting occurs if we remove any element
//ArrayList<E> extends abstractList<E>  implements list<E>, RandomAccess,Cloneable,Serializable

//in generic collection allows to have only one type of object in a collection soo typecasting is not required at runtime
public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
//		list.add("springboot");
		list.add("python");

		System.out.println(list);
		System.out.println();

		// iterating through the list

		// through the iterator
		@SuppressWarnings("rawtypes")
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();

		// through forEach loop
		for (String obj : list) {
			System.out.println(obj);
		}
		System.out.println();

//		through for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		// through forEach loop
		list.forEach(str -> System.out.println(str));

		list.add(2, "C++");
		System.out.println("after adding an element at position 2 : " + list);

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("angular");
		list2.add("SpringBoot");
		System.out.println(list2);

		list.addAll(list2);
		System.out.println("after adding list and list2 : " + list);

		list.remove(2);
		System.out.println("after removing 2nd index element from list :" + list);

		System.out.println(list.isEmpty());

		// upadting an element
		System.out.println("before updating : " + list.get(2));

		list.set(2, "c");
		System.out.println("after updating : " + list.get(2));
		System.out.println(list);

	}

}
