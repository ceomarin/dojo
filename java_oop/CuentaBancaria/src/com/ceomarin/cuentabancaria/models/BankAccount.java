package com.ceomarin.cuentabancaria.models;

public class BankAccount {
	private String numeroCuenta;
	private double saldoCuentaCorriente;
	private double saldoCuentaAhorro;
	private static int contadorCuentas;
	private static double dineroAlmacenado;

	public BankAccount() {
		this.numeroCuenta = generarNumeroCuenta();
		this.saldoCuentaCorriente = 0;
		this.saldoCuentaAhorro = 0;
		BankAccount.contadorCuentas++;
		BankAccount.dineroAlmacenado = 0;
	}

	private String generarNumeroCuenta() {
		String result = "";
		try {
			for (int i = 0; i < 10; i++) {
				int numInt = (int) (Math.random() * 10);
				result += Integer.toString(numInt);
			}
		} catch (Exception e) {
			System.out.println("Excepcion: " + e);
		}

		return result;
	}

	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldoCuentaCorriente() {
		return this.saldoCuentaCorriente;
	}

	public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}

	public double getSaldoCuentaAhorro() {
		return this.saldoCuentaAhorro;
	}

	public void setSaldoCuentaAhorro(double saldoCuentaAhorro) {
		this.saldoCuentaAhorro = saldoCuentaAhorro;
	}

	public int getContadorCuentas() {
		return BankAccount.contadorCuentas;
	}

	public double getDineroAlmacenado() {
		return BankAccount.dineroAlmacenado;
	}

	public void depositarDinero(String tipoCuenta, double deposito) {
		double total = 0;
		if (tipoCuenta.equalsIgnoreCase("corriente") && deposito > 0) {
			total = getSaldoCuentaCorriente() + deposito;
			setSaldoCuentaCorriente(total);
		}
		if (tipoCuenta.equalsIgnoreCase("ahorro") && deposito > 0) {
			total = getSaldoCuentaAhorro() + deposito;
			setSaldoCuentaAhorro(total);
		}
		BankAccount.dineroAlmacenado = getSaldoCuentaAhorro() + getSaldoCuentaCorriente();
	}

	public void retirarDinero(String tipoCuenta, double retiro) {
		double total = 0;
		if (tipoCuenta.equalsIgnoreCase("corriente") && retiro > 0) {
			if (retiro < getSaldoCuentaCorriente()) {
				total = getSaldoCuentaCorriente() - retiro;
				setSaldoCuentaCorriente(total);
			} else {
				System.out.println("Saldo insuficiente");
			}

		}
		if (tipoCuenta.equalsIgnoreCase("ahorro") && retiro > 0) {
			if (retiro < getSaldoCuentaAhorro()) {
				total = getSaldoCuentaAhorro() - retiro;
				setSaldoCuentaAhorro(total);
			} else {
				System.out.println("Saldo insuficiente");
			}
		}
		BankAccount.dineroAlmacenado = getSaldoCuentaAhorro() + getSaldoCuentaCorriente();
	}
}
