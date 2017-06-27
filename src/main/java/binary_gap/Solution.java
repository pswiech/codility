package binary_gap;

public class Solution {

	public int solution(final int n) {
		if (n <= 0) {
			return 0;
		}

		int shift;
		int maxGap = 0;
		int tNum = n;

		// remove trailing zeros
		shift = Integer.numberOfTrailingZeros(tNum);
		tNum = (tNum >>> shift);

		while (tNum > 0) {
			// remove trailing ones
			shift = Integer.numberOfTrailingZeros(~tNum);
			tNum = (tNum >>> shift);

			// remove sequence of consecutive zeros
			shift = Integer.numberOfTrailingZeros(tNum);
			tNum = (tNum >>> shift);

			if ((tNum & 1) == 1) {
				// update max length of sequence of consecutive zeros
				maxGap = Math.max(maxGap, shift);
			}
		}

		return maxGap;
	}
}
