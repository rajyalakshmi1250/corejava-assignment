package com.capgemini.lambda.client;

import com.capgemini.lambda.model.Calculator;

public class CalculatorClient {
	public static void main(String args[]) {

		Calculator addition = (x,y)->x+y;
		System.out.println(addition.calculate(23, 8));

		Calculator substraction = (x,y)->x-y;
		System.out.println(substraction.calculate(83, 8));

	}

}
