package ObjectLevelCasting;

class Phone extends Object {
	void information() { // parent class
		System.out.println("phone info");
	}

	void games() {
		System.out.println("phone hidden games");

	}

	
	
	 void battery() { 
		  System.out.println("phone hidden battery");
	  
	  }
	 
	 

	void chatBox() {
		System.out.println("Hello am phone...!");
	}
	/*
	 * void ram() { System.out.println("phone ram");
	 * 
	 * } void processor() { System.out.println("phone processor");
	 * 
	 * }
	 */

}

class samsung extends Phone {
	@Override
	void games() {
		System.out.println("samsung games");
	}

	@Override
	void battery() {
		System.out.println("samsung battery");
	}

	void ram() {
		System.out.println("samsung ram");
	}

}

class pixel extends Phone {
	@Override
	void information() {
		System.out.println("pixel info");
	}

	@Override
	void games() {
		System.out.println("pixel games");
	}

	@Override
	void battery() {
		System.out.println("pixel battery");
	}

	void processor() {
		System.out.println("pixel processor");
	}

}

public class MobilesUpcasting {
	public static void main(String[] args) {
		Phone p = new pixel(); // Upcasting Pixel
		p.information();
		p.games();
		p.battery();
		System.out.println("_____________________________________________");
		Phone p1 = new samsung();
		p1.games(); // Upcasting Samsung
		p1.battery();
		p1.chatBox();
		System.out.println("______________________________________");

		pixel a = (pixel) p; // DownCasting Pixel
		a.processor();
		a.games();
		a.battery();
		System.out.println("___________________________________");
		samsung s = (samsung) p1; // DownCasting Samsung
		s.games();
		s.ram();
		s.battery();
		s.information();

	}

}
