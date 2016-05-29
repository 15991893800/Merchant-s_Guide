package com.yk.marchant.util;

import java.util.HashMap;
import java.util.Map;

public class SymbolUtil {
     private static Map<String, Integer> symbolMap = new HashMap<String, Integer>();
     static {
    	 symbolMap.put("I", 1);
    	 symbolMap.put("V", 5);
    	 symbolMap.put("X", 10);
    	 symbolMap.put("L", 50);
    	 symbolMap.put("C", 100);
    	 symbolMap.put("D", 500);
    	 symbolMap.put("M", 1000); 
     }
     
     public static int getSymmolValue(String synbolKey){
    	 return symbolMap.get(synbolKey);
     }
	
}
