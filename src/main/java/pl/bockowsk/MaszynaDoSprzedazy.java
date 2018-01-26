package pl.bockowsk;

public class MaszynaDoSprzedazy {

	public static void main(String[] args) {
		Automat maszynaDoSprzedazy=new Automat(10,7,"haslo");
		System.out.println("najpierw cwaniak uzywa");
		maszynaDoSprzedazy.oddajMonety();
		maszynaDoSprzedazy.wydajNapoje(1);
		System.out.println("uzywa uczciwy");
		maszynaDoSprzedazy.wrzucMonete(1);
		maszynaDoSprzedazy.wydajNapoje(5);
		System.out.println("uzywa niezdecydowany");
		maszynaDoSprzedazy.wrzucMonete(5);
		maszynaDoSprzedazy.oddajMonety();;
		System.out.println("serwisant sprawdza");
		maszynaDoSprzedazy.serwisSprawdz("lala");
		maszynaDoSprzedazy.serwisSprawdz("haslo");
		System.out.println("uczciwy robi duze zakupy");
		maszynaDoSprzedazy.wrzucMonete(1);
		maszynaDoSprzedazy.wrzucMonete(1);
		maszynaDoSprzedazy.wrzucMonete(5);
		maszynaDoSprzedazy.wrzucMonete(2);
		maszynaDoSprzedazy.wydajNapoje(7);
		maszynaDoSprzedazy.wydajNapoje(1);
		maszynaDoSprzedazy.serwisSprawdz("haslo");
		System.out.println("gosc chce kupic duzo");
		maszynaDoSprzedazy.wrzucMonete(1);
		maszynaDoSprzedazy.wrzucMonete(1);
		maszynaDoSprzedazy.wrzucMonete(1);
		maszynaDoSprzedazy.wrzucMonete(5);
		maszynaDoSprzedazy.wydajNapoje(1);
		System.out.println("znowu cwaniakcwaniak uzywa");
		maszynaDoSprzedazy.oddajMonety();
		maszynaDoSprzedazy.wydajNapoje(1);
		maszynaDoSprzedazy.serwisSprawdz("haslo");

	}

}
