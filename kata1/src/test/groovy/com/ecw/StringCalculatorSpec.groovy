package com.ecw

import spock.lang.Specification

class StringCalculatorSpec extends Specification {

	def 'The method can take 0, 1 or 2 numbers, and will return their sum'() {
		given :'A StringCalculator instance'
			StringCalculator objStringCalc = new StringCalculator();
		when :'StringCalculator.add() method is called' 
			def result = objStringCalc.add(str);
		then :'It should return sum of numbers given as paramaters'
				result ==expectedResult;
		where:
			str         |         expectedResult
			null		|			0
			""			|			0
			"1"			|			1
			"1,2"		|			3
	}
	
}
