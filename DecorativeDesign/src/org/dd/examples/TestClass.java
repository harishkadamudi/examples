package org.dd.examples;

public class TestClass {

	/**
	 * Harish Kadamudi
	 */
	public static void main(String[] args) {
		
		Beverage espresso = new Espresso();
		System.out.println("Your Order is :"+espresso.getDescription()+"\n"
				+"and it costs :"+espresso.rate());
		
		 Beverage doubleMochaWhip = new DarkRoast();
		 doubleMochaWhip = new Mocha(doubleMochaWhip);
		 doubleMochaWhip = new Mocha(doubleMochaWhip);
		 doubleMochaWhip= new Whip(doubleMochaWhip);
		 
		 System.out.println("Order Description is :"+doubleMochaWhip.getDescription()
				 +"\n"+"Order costs :"+doubleMochaWhip.rate());
		
	}

}
