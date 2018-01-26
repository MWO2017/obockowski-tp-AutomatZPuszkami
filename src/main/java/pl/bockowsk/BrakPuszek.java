package pl.bockowsk;

public class BrakPuszek implements Stan {

	Automat automat;
	protected BrakPuszek(Automat a) {
		automat=a;
	}
	
	public void pobierzMonete(int i) {
		System.out.println("brak puszek, nie przyjmuje monet");
		
	}

	public void wydajPuszke(int i) {
		System.out.println("brak puszek");
		
	}

	public void zwrocMonety() {
		System.out.println("nie ma co zwrocic");
	}
 
}
