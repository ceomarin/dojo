package com.ceomarin.masterobject.objects;

public class Human {
	private int strength;
	private int stealth;
	private int intelligence;
	private int health;
	
	public Human() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	
	public void attack(Human otherHuman) {
		otherHuman.health -= this.strength;
		System.out.println(otherHuman.health);
	}
}
