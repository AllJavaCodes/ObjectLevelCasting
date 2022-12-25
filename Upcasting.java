package ObjectLevelCasting;

class Animal{
	
	void food() {
		System.out.println("Animal Food");
	}
	void walk() {
		System.out.println("Walking");
		
	}
	
	public void run() {
		System.out.println("Animal Running");
		}
}
class Dog extends Animal{
	@Override
	public void run() {
		System.out.println("Dog Running");
	}
	
}
class Cat extends Animal{
	@Override
	public void run() {
		
		System.out.println("Cat Running");
		//super.run();
		//super.food();
	}
	void walk() {
		System.out.println("Cat Walking");
	}
	void hunt() {
		System.out.println("Cat hunts Rat");
	}
}
public class Upcasting {
	public static void main(String[]ars) {
		//Cat c=new Cat();
		//Animal a =new Animal();
		
		Animal a=new Cat();
		
		a.run();
	//Animal a1=new Dog();
	
		//System.out.println("------------------------");
	//	c.run();
		//c.hunt();
		//a.hunt(); Error 
	}

}
