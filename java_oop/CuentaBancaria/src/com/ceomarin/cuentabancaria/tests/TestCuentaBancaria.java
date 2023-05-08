package com.ceomarin.cuentabancaria.tests;
import com.ceomarin.cuentabancaria.models.*;

public class TestCuentaBancaria {

	public static void main(String[] args) {
		BankAccount cuenta1 = new BankAccount();
		BankAccount cuenta2 = new BankAccount();
		BankAccount cuenta3 = new BankAccount();
		BankAccount cuenta4 = new BankAccount();
		System.out.println("numero cuenta1: "+cuenta1.getNumeroCuenta());
		System.out.println("Saldo cuenta corriente = "+cuenta1.getSaldoCuentaCorriente());
		System.out.println("Saldo cuenta ahorro = "+cuenta1.getSaldoCuentaAhorro());
		cuenta1.depositarDinero("Corriente", 5500);
		cuenta1.depositarDinero("Corriente", 15500);
		cuenta1.depositarDinero("ahorro", 50000);
		cuenta1.retirarDinero("ahorro", 15000);
		cuenta1.retirarDinero("Corriente", 700);
		cuenta1.retirarDinero("Corriente", 700000);
		System.out.println("Saldo cuenta corriente = "+cuenta1.getSaldoCuentaCorriente());
		System.out.println("Saldo cuenta ahorro = "+cuenta1.getSaldoCuentaAhorro());
		System.out.println("Total Almacenado Cuenta Ahorro + Corriente = " + cuenta1.getDineroAlmacenado());
		System.out.println("Cantidad de cuentas creadas: "+cuenta1.getContadorCuentas());

	}

}
