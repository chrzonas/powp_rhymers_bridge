package edu.kis.vh.nursery.stacklist;

import edu.kis.vh.nursery.Adapter;

public class IntArrayStack extends Adapter {
	

	private int[] NUMBERS = new int[CAPITALITY];

	private int total = EMPTY;

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultInterface#getTotal()
	 */
	@Override
	public int getTotal()
	{
		return total;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultInterface#countIn(int)
	 */
	@Override
	public void countIn(final int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultInterface#callCheck()
	 */
	@Override
	public boolean callCheck() {
		return total == EMPTY;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultInterface#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == FULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY;
		return NUMBERS[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.DefaultInterface#countOut()
	 */
	@Override
	public int countOut() {
		if (callCheck())
			return EMPTY;
		return NUMBERS[total--];
	}

}
