package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StackWIthMax {

	private List<Integer> stack = new ArrayList<>();

	Set<Integer> maxSet = new TreeSet<>();

	// Queue<Integer> maxQ = new PriorityBlockingQueue<>();

	public void push(Integer i) {
		stack.add(i);
		if (!maxSet.contains(i)) {
			maxSet.add(i);
		}
	}

	public Integer pop() {
		Integer ret = null;

		if (stack.size() > 0) {
			ret = stack.remove(stack.size() - 1);
			// If stack still contains removed value - do not try to remove max
			// Map with values equal to number of occurences could be used instead of Set
			if (! stack.contains(ret) && maxSet.contains(ret)) {
				maxSet.remove(ret);
			}
		}
		return ret;
	}

	/*
	 * Return current max value of the stack
	 */
	public Integer max() {
		return maxSet.isEmpty() ? null : Collections.max(maxSet);
	}
}
