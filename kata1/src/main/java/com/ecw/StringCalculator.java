package com.ecw;

public class StringCalculator {

	public static void main(String[] args) {

	}

	public int add(String strNumbers) {
		int sumOfNumbers=0;
		if(strNumbers==null || "".equalsIgnoreCase(strNumbers.trim())) {
			return 0;
		}
		
		String[] numArray = strNumbers.split(",");
		
		for(int i=0;i<numArray.length;i++) {
			sumOfNumbers+=Integer.parseInt(numArray[i]);
		}
			
		return sumOfNumbers;
		
	}
}
