package prj07Duck;

public class RedheadDuck extends Duck{
	public RedheadDuck () {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWinds();	
	}

	@Override
	public void display() {
		System.out.println("RedheadDuck");
		
	}

}
