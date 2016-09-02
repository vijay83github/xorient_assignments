package com.xorient.test.q1;

import java.util.HashSet;
import java.util.Set;

public class SearchAlgo {
	public int searchRepeatedItem(int A[]){
		int comparisons = 0 ;
		Set<Integer> integers = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			int currentElement = A[i];
			int oldLength = integers.size();
			integers.add(currentElement);
			if(oldLength == integers.size()){
				System.out.println("Element '" + currentElement + "' is repeated "+ A.length/2 + " times and it took " +i+" comparisons." );
				comparisons =i;
				break;
			}
		}
		return comparisons;
	}
	
}
