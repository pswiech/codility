package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorAndConcurrentModificationException {

	private List<Integer> list = new LinkedList<>();
	private Set<Integer> set = new HashSet<>();
	private Map<String, Integer> map = new HashMap<>();

	public static void main(String[] args) {

		IteratorAndConcurrentModificationException x = new IteratorAndConcurrentModificationException();
		x.listIterator();
		x.setIterator();
		x.map();
	}

	public void listIterator() {
		list.add(1);
		list.add(2);
		list.add(3);

		for(Integer i : list) {
			// list.remove(i); // java.util.ConcurrentModificationException
		}
				
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
			// list.remove(i); // java.util.ConcurrentModificationException
		}
	}

	public void setIterator() {
		set.add(1);
		set.add(17);
		set.add(33);
		set.add(49);
		set.add(2);
		set.add(18);
		set.add(34);
		set.add(50);
		set.add(3);
		set.add(19);
		set.add(35);
		set.add(51);
		// tu nastapi rozszerzeenie Set z 16 na 32
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(10);
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		set.add(16);
		set.add(17);
		set.add(18);
		set.add(19);
		set.add(20);
		set.add(21);

		for (Integer i : set) {
			System.out.println(i);
			// set.remove(i); // java.util.ConcurrentModificationException
		}

		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
			// set.remove(i); // java.util.ConcurrentModificationException
			it.remove();
		}
	}

	public void map() {
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
			// map.remove(entry.getKey()); //
			// java.util.ConcurrentModificationException
		}

		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Integer> e = it.next();
			System.out.println(e);
			it.remove();
		}

		map.put("jeden", 1);
		map.put("dwa", 2);
		map.put("trzy", 3);

		for (String key : map.keySet()) {
			System.out.println(key + " -> " + map.get(key));
			// map.remove(key); // java.util.ConcurrentModificationException
		}
	}
}
