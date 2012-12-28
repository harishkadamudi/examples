package org.spd.examples;

public abstract class Duck {
	
	private FlyBehaviors flyBehaviors;
	private QuackBehaviors quackBehaviors;
	private FlyHeight flyHeight;
	
	public void setFlyHeight(FlyHeight flyHeight) {
		this.flyHeight = flyHeight;
	}
	public void setFlyBehaviors(FlyBehaviors flyBehaviors) {
		this.flyBehaviors = flyBehaviors;
	}
	public void setQuackBehaviors(QuackBehaviors quackBehaviors) {
		this.quackBehaviors = quackBehaviors;
	}
	
	public void fly(){
		this.flyBehaviors.doFly();
	}
	
	public void quack(){
		this.quackBehaviors.doQuack();
	}
	
	public void flyHt(){
		this.flyHeight.flyHeights();
	}
	public abstract void display();
		
}
