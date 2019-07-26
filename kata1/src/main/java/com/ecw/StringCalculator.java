package com.ecw;

public class StringCalculator {

	public static void main(String[] args) {

	}

	public int add(String strNumbers) {
		if(strNumbers==null || "".equalsIgnoreCase(strNumbers.trim())) {
			return 0;
		}else
		{
			return Integer.parseInt(strNumbers);
		}
	}
}
