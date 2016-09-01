package com.xorient.test.q5;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class PairNumberTest {
	SumPairNumbers pairNumbers;
	int testArray[] ={2, 3, 5, 7, 10, 15, 20, 4, 1};
	@Before
	public void setUp() throws Exception {
		pairNumbers = new SumPairNumbers();
	}

	@Test
	public void test() {
		Map<Integer,Integer> pairs = pairNumbers.find(6,testArray);
		assertEquals(2, pairs.size());
		assertEquals(Integer.valueOf(4),pairs.get(2));
		assertEquals(Integer.valueOf(1),pairs.get(5));
		
		pairs = pairNumbers.find(7,testArray);
		assertEquals(2, pairs.size());
		assertEquals(Integer.valueOf(5),pairs.get(2));
		assertEquals(Integer.valueOf(4),pairs.get(3));
	}

}
