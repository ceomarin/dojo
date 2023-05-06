package com.ceomarin.zookeeper.animals;

public class Gorilla extends Mammal{
	
	
	public Gorilla() {
		super();
	}

	public void throwSomething() {
		System.out.println("El gorila lanzo algo!!!");
		setEnergyLevel(getEnergyLevel()-5);
	}
	
	public void eatBananas() {
		System.out.println("mmmmm...... banana!!!");
		setEnergyLevel(getEnergyLevel()+10);
	}
	
	public void climb() {
		System.out.println("el gorila ha trepado a la cima de un árbol!!!");
		setEnergyLevel(getEnergyLevel()-10);
	}
}
