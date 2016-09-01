package com.xorient.test.q4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.xorient.test.q4.PatternChecker;

public class PatternCheckerTest {
	PatternChecker patternChecker;  
	@Before
	public void setUp() throws Exception {
		patternChecker = new PatternChecker();
	}

	@Test
	public void testValidPattern() {
		assertEquals(true, patternChecker.check("()()()"));
		assertEquals(true, patternChecker.check("()[()]"));
		assertEquals(true, patternChecker.check("([{()}])"));
	}
	
	@Test
	public void testInValidPattern() {
		assertEquals(false, patternChecker.check("(){]"));
		assertEquals(false, patternChecker.check("([(]"));
	}

}
