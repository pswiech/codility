package stack;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

import org.junit.Test;

public class StackWithMaxTest {

	/*
	 * Jak dziala max w PriorityQueue?
	 */
	@Test
	public void shouldReturnMaxFromHeadButItDoesNotTest() {

		Queue<Integer> q = new PriorityBlockingQueue<>();
		q.add(3);
		q.add(1);

		Integer max = Collections.max(q);
		assertEquals(new Integer(3), q.remove());

		max = Collections.max(q);
		assertEquals(new Integer(1), q.remove());
	}

	@Test
	public void shouldRemoveValuesInReversedOrderTest() {
		StackWIthMax stack = new StackWIthMax();

		stack.push(2);
		stack.push(2);
		stack.push(4);
		stack.push(1);
		stack.push(4);
		stack.push(3);

		assertEquals(new Integer(4), stack.max());

		assertEquals(new Integer(3), stack.pop());
		assertEquals(new Integer(4), stack.max());

		assertEquals(new Integer(4), stack.pop());
		assertEquals(new Integer(4), stack.max());

		assertEquals(new Integer(1), stack.pop());
		assertEquals(new Integer(4), stack.max());

		assertEquals(new Integer(4), stack.pop());
		assertEquals(new Integer(2), stack.max());

		assertEquals(new Integer(2), stack.pop());
		assertEquals(new Integer(2), stack.max());

		assertEquals(new Integer(2), stack.pop());
		assertEquals(null, stack.max());

		assertEquals(null, stack.pop());
	}

}
