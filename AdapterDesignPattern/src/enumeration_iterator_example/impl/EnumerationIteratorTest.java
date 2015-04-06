package enumeration_iterator_example.impl;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTest {

	public static void main(String args[]) {
		Vector<String> v = new Vector<>(Arrays.asList(args));
		Iterator<String> iterator = new EnumerationIterator<>(v.elements());
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
