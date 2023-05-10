package com.ceomarin.calculadora.tests;

import com.ceomarin.calculadora.objects.Calculator;

public class CalculadoraTest {

	public static void main(String[] args) {
		

		Calculator texas = new Calculator();
		texas.setOperandOne(10.5);
		texas.setOperation("+");
		texas.setOperanTwo(5.2);
		texas.performOperation();
		
		System.out.println("El resultado de la operacion es : "+texas.getResult());
	}

}
