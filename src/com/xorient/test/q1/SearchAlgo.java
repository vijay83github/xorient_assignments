package com.xorient.test.q1;

import java.util.HashSet;
import java.util.Set;

public class SearchAlgo {
	public void searchRepeatedItem(int A[]){
		Set<Integer> integers = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			int currentElement = A[i];
			int oldLength = integers.size();
			integers.add(currentElement);
			if(oldLength == integers.size()){
				System.out.println("Element '" + currentElement + "' is repeated "+ A.length/2 + " times and it took " +i+" comparisons." );
				break;
			}
		}
	}
	public static void main(String[] args) {
		int A[] = {1,3,2,4,2,2};
		SearchAlgo algo = new SearchAlgo();
		algo.searchRepeatedItem(A);
		int B[] = {2,2,1,4,3,2};
		algo.searchRepeatedItem(B);
	}
}
