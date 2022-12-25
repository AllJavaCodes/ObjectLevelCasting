package ObjectLevelCasting;

class A{
	int i=77;
	void hi() {
		System.out.println("A : hi");
		
	}
	void hello() {
		System.out.println("A : hello");
		
	}
	void m1() {
		System.out.println("lkjhgfc");
	}
	
}

class B extends A{
	
	void hi() {
		System.out.println("B : hi");
		System.out.println(i);
		
	}
	void hello() {
		System.out.println("B : hello");
	}
	void m2() {
		System.out.println("12354587");
	}
}
public class Demo {
	public static void main(String[]args) {
		A a=new B();
		a.hi();
		//a.m2();
	}
	

}
