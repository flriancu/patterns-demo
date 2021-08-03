package oo.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPlay {
	public static void main(String[] args) {
		List<String> collection = Arrays.asList("a", "b", "c");
		Iterator<String> it = collection.iterator();
		while (it.hasNext()) {
			String element = it.next();
			System.out.println("Element: " + element);
		}

		// 3 TODO rewrite simpler, with foreach statement ... (Iterable)

		// 2 TODO write an iterator that sweeps over an array

		String[] array = new String[] { "1", "2", "3" };
		// TODO implement an Array iterator
		// Iterator<String> it2 = new MyArrayIterator(array);
		// while (it2.hasNext()) {
		// String element = it2.next();
		// System.out.println("Element: " + element);
		// }
	}
}
