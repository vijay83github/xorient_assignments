package com.xorient.test.q1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SearchAlgoTest {
	SearchAlgo algo;

	@Before
	public void setUp() throws Exception {
		algo = new SearchAlgo();
	}

	@Test
	public void testSearchRepeatedItem() {
		int A[] = { 1, 3, 2, 4, 2, 2 };

		int comparisons = algo.searchRepeatedItem(A);
		assertEquals(4,comparisons);
		int B[] = { 2, 2, 1, 4, 3, 2 };
		comparisons = algo.searchRepeatedItem(B);
		assertEquals(1,comparisons);
	}

}
