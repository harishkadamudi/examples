package org.dd.examples;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		
		return beverage.getDescription()+"Mocha\t";
	}

	@Override
	public double rate() {
		// TODO Auto-generated method stub
		return 0.20+beverage.rate();
	}

}
