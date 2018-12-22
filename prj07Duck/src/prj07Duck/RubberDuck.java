package prj07Duck;

public class RubberDuck extends Duck{
	public RubberDuck () {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWinds();	
	}

	@Override
	public void display() {
		System.out.println("I am RubberDuck");
		
	}
}
