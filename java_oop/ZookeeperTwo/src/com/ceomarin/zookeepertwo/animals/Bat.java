package com.ceomarin.zookeepertwo.animals;

public class Bat extends Mammal{
	
	public Bat() {
		this.setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("Crack crack crack !!!");
		this.setEnergyLevel(getEnergyLevel()-50);
	}
	public void eatHumans() {
		System.out.println("bueno, no importa !!!");
		this.setEnergyLevel(getEnergyLevel()+50);
	}
	public void attackTown() {
		System.out.println("sonido de ciudad en llamas !!!");
		this.setEnergyLevel(getEnergyLevel()-100);
	}
}
