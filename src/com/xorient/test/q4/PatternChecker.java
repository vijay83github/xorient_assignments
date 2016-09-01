package com.xorient.test.q4;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class PatternChecker {
	Map<Character,Character> symbols = new HashMap<>();
	public PatternChecker() {
		symbols.put('(', ')');
		symbols.put('{', '}');
		symbols.put('[', ']');
		symbols.put('<', '>');
	}
	public Boolean check(String pattern) {
		Stack<Character> charcterStack = new Stack<>();
		for (int i=0; i<pattern.length();i++) {
			Character patternSymbol = pattern.charAt(i);
			if(symbols.containsKey(patternSymbol)){
				charcterStack.push(patternSymbol);
			}
			if(symbols.containsValue(patternSymbol)){
				Character pairCharacter = charcterStack.pop(); 
				if(!symbols.get(pairCharacter).equals(patternSymbol)){
					return false;
				}
			}
		}
		if(charcterStack.size()>0){
			return false;
		}
		return true;
	}

}
