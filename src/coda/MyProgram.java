package coda;

public class MyProgram {

	public static void main(String[] args) {
		Coda coda = new Coda();
		coda.inserisci(4);
		coda.inserisci(7);
		coda.inserisci(9);
		System.out.println("nodo estratto : " + coda.estrai().getValore());
		System.out.println("nodo estratto : " + coda.estrai().getValore());
		System.out.println("nodo estratto : " + coda.estrai().getValore());
		}

}
