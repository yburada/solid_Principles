package com.services.dip;

public class ShoppingMall {
	
	private BankCard bankCard;
	
	ShoppingMall(BankCard bankCard){
		this.bankCard = bankCard;
	}
	
	public void doTransaction(Integer amount) {
		bankCard.doTransaction(amount);
	}
	
	public static void main(String[] args) {
		CreditCard cd = new CreditCard();
		DebitCard dc = new DebitCard();
		//D-> Dependency Inverse Principle
		// The shopping mall class accepting both credit card and debt card as it achieves loose coupling -> Nothing but Runtime polymorphysum
		ShoppingMall sp = new ShoppingMall(dc);
		sp.doTransaction(1000);
		ShoppingMall sp1 = new ShoppingMall(cd);
		sp1.doTransaction(1000);
		
	}

}
