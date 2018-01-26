package pl.bockowsk;

public class Automat {
	// skladowe

	// stany
	BrakPuszek brakPuszek;
	BrakWrzuconych brakWrzuconych;
	Wrzucone wrzucone;

	// podstawowe
	int monety;
	int puszki;
	int wrzuconeMonety;
	String haslo;

	// najwazniejsza skladowa: The State Design Pattern
	Stan stan;

	// konstruktor, parametery liczba monet, puszek, haslo)
	protected Automat(int i, int j, String haslo) {
		this.monety = i;
		this.puszki = j;
		this.wrzuconeMonety = 0;
		this.haslo = haslo;
		brakPuszek = new BrakPuszek(this);
		brakWrzuconych = new BrakWrzuconych(this);
		wrzucone = new Wrzucone(this);
		stan=brakWrzuconych;
	}

	// METODY: - przyjmij monete - wydaj monete - wydaj napoj - podaj ile

	private void wyswietlStan() {
		String display = String.format("puszek:%5d, monet: %5d", puszki, monety);
		System.out.println(display);
	}

	protected void serwisSprawdz(String password) {
		if (haslo == password) {
			System.out.println("SERVICE MODE");
			wyswietlStan();
		}
		else {
			System.out.println("zle haslo");
		}
	}

	protected void ustawStan(Stan stan) {
		this.stan = stan;
	}

	//  nie sledzimy ilosci kazdego rodzaju monety, bo mialo przyjmowac tylko rozne monety (mozna by bylo uzywac np. HashMap)
	protected void wrzucMonete(int ile) {
		this.stan.pobierzMonete(ile);
	}

	protected void wydajNapoje(int ile) {
		this.stan.wydajPuszke(ile);
	}

	protected void oddajMonety() {
		this.stan.zwrocMonety();
	}
}
