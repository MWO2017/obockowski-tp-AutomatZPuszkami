package pl.bockowsk;

public class Wrzucone implements Stan {

	Automat automat;

	protected Wrzucone(Automat a) {
		automat = a;
	}

	public void pobierzMonete(int i) {
		automat.monety += i;
		automat.wrzuconeMonety += i;
	}

	public void wydajPuszke(int i) {
		// jesli klient chce mniej albo tyle samo niz wrzucil
		if (i<=automat.wrzuconeMonety) {
			// jesli puszek wystarczy
			if (i < automat.puszki) {
				System.out.println("wydawanie...");
				//zmniejszanie puszek i zmniejszanie wrzuconych
				automat.puszki-=i;
				automat.wrzuconeMonety-=i;
				System.out.println("wydano "+i+" x puszki");
				// jesli chcial mniej to dostanie reszte
				if (automat.wrzuconeMonety > 0) {
					//reszta
					System.out.println("wydawanie reszty...");
					zwrocMonety();
					automat.wrzuconeMonety=0;
				}
				automat.ustawStan(automat.brakWrzuconych);
			}
			// jesli puszek nie wystarczy
			else {
				System.out.println("wydawanie...");
				//zmniejszanie wrzuconych, wydawanie, zmniejszanie puszek
				automat.wrzuconeMonety-=automat.puszki;
				System.out.println("wydano "+i+" x puszki");				
				System.out.println("to byla ostatnia puszka... koniec");
				automat.puszki=0;
				//reszta
				System.out.println("wydawanie reszty...");
				zwrocMonety();
				automat.wrzuconeMonety=0;
				automat.ustawStan(automat.brakPuszek);
			}
			
		} 
		// jesli klient chce wiecej niz dal
		else {
			System.out.println("za malo wrzuconych monet, wrzuc jeszcze: "+(i-automat.wrzuconeMonety));
		}
 
	}

	public void zwrocMonety() {
		automat.monety -= automat.wrzuconeMonety;
		System.out.println("zwrocono " + automat.wrzuconeMonety + " x monet");
		automat.wrzuconeMonety=0;
	}

}
