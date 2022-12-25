package ObjectLevelCasting;
class E{
	void hi() {
		System.out.println("E : hi");
		
	}
	void oyy() {
		System.out.println("E  : oyy");
		
	}
	void bye() {
		System.out.println("E : bye");
	}
	
}

class F extends E{
	void oyy() {
		System.out.println("F : oyy");
		
	}
	void hi() {
		System.out.println("F : hi");
		
		
	}
	void hello() {
		System.out.println("F : hello");
		
	}
	
}
public class DownCasting {
	public static void main(String[]args) {
		E e=new F();
		F f=(F)e;
		
		f.hello();
	
	}
}
