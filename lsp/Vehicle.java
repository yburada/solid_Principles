package com.services.lsp;

public class Vehicle {
	
	//L->Liskov Substitution Principle -> We have to take care of hierarchy and the methods extends by the child class
	
	public Integer getNumberOfWheels() {
		return 2;
	}
}
