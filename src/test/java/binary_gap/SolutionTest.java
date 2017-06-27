package binary_gap;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution solution;

	@Before
	public void init() {
		solution = new Solution();
	}

	@Test
	public void shouldReturnZeroWhenNegativeNumberTest() {
		int i = -16;
		int gap = solution.solution(i);
		assertEquals(0, gap);
	}

	@Test
	public void shouldReturnZeroWhenZeroTest() {
		int i = 0;
		int gap = solution.solution(i);
		assertEquals(0, gap);
	}

	@Test
	public void shouldReturnZeroWhenNoZeroBitsTest() {
		int i = 0b1111;
		int gap = solution.solution(i);
		assertEquals(0, gap);
	}

	@Test
	public void shouldReturnGap1Test() {
		int i = 0b100010;
		int gap = solution.solution(i);
		assertEquals(3, gap);
	}

	@Test
	public void shouldReturnGap2Test() {
		int i = 0b1010010001000011;
		int gap = solution.solution(i);
		assertEquals(4, gap);
	}

	@Test
	public void shouldReturnGap3Test() {
		int i = 0b1000000000000001;
		int gap = solution.solution(i);
		assertEquals(14, gap);
	}
}
