package com.xorient.test.q5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SumPairNumbers {

	public Map<Integer,Integer> find(int sum,int[] numbers) {
		Map<Integer,Integer> pairs = new HashMap<>();
		Set<Integer> keys = new HashSet<>();
		for (int i : numbers) {
			if(i<sum){
				if(!pairs.containsKey(i) && !pairs.containsValue(i) ){
					pairs.put(i, sum-i);
					keys.add(i);
				}else if(pairs.containsValue(i)){
					keys.remove(sum-i);
				}
			}
		}
		for (Integer key : keys) {
			pairs.remove(key);
		}
		return pairs;
	}

}
