package com.ecw;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringCalculator {

	public static void main(String[] args) {

	}

	public int add(String strNumbers) {
		int sumOfNumbers=0;
		if(strNumbers==null || "".equalsIgnoreCase(strNumbers.trim())) {
			return 0;
		}
		
		ArrayList<String> numArray = new ArrayList<String>();
		
        StringTokenizer st = new StringTokenizer(strNumbers,"\n,");
        while(st.hasMoreTokens()){
        	numArray.add(st.nextToken());
        }
        
		for(int i=0;i<numArray.size();i++) {
			sumOfNumbers+=Integer.parseInt(numArray.get(i));
		}
			
		return sumOfNumbers;
		
	}
	
	
}
