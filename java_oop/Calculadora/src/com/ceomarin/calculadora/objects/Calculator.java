package com.ceomarin.calculadora.objects;

public class Calculator {
	private double operandOne,operanTwo,result;
	private String operation;
	
	public Calculator() {
		
	}
	
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperanTwo() {
		return operanTwo;
	}
	public void setOperanTwo(double operanTwo) {
		this.operanTwo = operanTwo;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void performOperation() {
		
		try {
			if(this.operation.equals("+")) {
				this.result = this.operandOne + this.operanTwo;
			}
			if(this.operation.equals("-")) {
				this.result = this.operandOne - this.operanTwo;
			}
			
		}catch (Exception e) {
			System.out.println("Error: "+e);
			System.out.println("operacion no valida, esta permitido solo '+' y '-' ");
		}

		
		
	}
}
