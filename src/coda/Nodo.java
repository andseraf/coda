package coda;

public class Nodo {
	private int valore;
	private Nodo successivo;

	public Nodo(int valore, Nodo successivo) {
		this.valore = valore;
		this.successivo = successivo;
	}

	public int getValore() {
		return valore;
	}

	public void setValore(int valore) {
		this.valore = valore;
	}

	public Nodo getSuccessivo() {
		return successivo;
	}

	public void setSuccessivo(Nodo successivo) {
		this.successivo = successivo;
	}


}
