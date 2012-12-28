package org.spd.examples;

public class DecoyDuck extends Duck {
	
	private String name;
	
	public DecoyDuck(String name) {
		setFlyBehaviors(new FlyNoFly());
		setQuackBehaviors(new FakeQuack());
		setFlyHeight(new FlyGreatHeight());
		this.name = name;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
		fly();
		flyHt();
		quack();
	}

}
