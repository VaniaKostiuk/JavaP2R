package prj07Duck;



public class MallardDuck extends Duck{
	public MallardDuck () {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWinds();	
	}
	public void display () {
		System.out.println("I am a real Mallard duck");
	}
}
