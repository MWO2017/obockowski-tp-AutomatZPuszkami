package pl.bockowsk;

public class BrakWrzuconych implements Stan {

	Automat automat;
	
	protected BrakWrzuconych(Automat a) {
		automat=a;
	}
	
	public void pobierzMonete(int i) {
		automat.wrzuconeMonety+=i;
		automat.monety+=i;
		automat.ustawStan(automat.wrzucone);
		
	}

	public void wydajPuszke(int i) {
		System.out.println("najpierw wrzuc monete");
		
	}

	public void zwrocMonety() {
		System.out.println("bez uprzedniego wrzucenia, nie da sie zwrocic");
		
	}

}
