package prj07Duck;

public class DecoyDuck extends Duck{
	public DecoyDuck () {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWinds();	
	}

	@Override
	public void display() {
		System.out.println("I am DecoyDuck");
		
	}

}
