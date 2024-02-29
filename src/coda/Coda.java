package coda;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Coda {
	
	private  Nodo testa;
	
	public void inserisci(int v){
		//creare un nodo che contiene v
		Nodo n = new Nodo(v, null);
		
		if(this.isEmpty()){
			testa=n;
			System.out.println("debug testa da inserire" +n.getValore());
			}
		else {
			Nodo corrente = this.testa;
			while(corrente.getSuccessivo()!=null){
				corrente = corrente.getSuccessivo();
				}
			System.out.println("debug nodo da inserire" +n.getValore());
			corrente.setSuccessivo(n);
		}
	}

	public Nodo estrai(){
		Nodo estratto = testa;
		this.testa = testa.getSuccessivo();
		return estratto;
	}
	
	public Coda(){}
	
	public boolean isEmpty(){
		if ( this.testa ==  null) {return true;}
		else {
			return false;
			}
	}

	public Nodo getTesta() {
		return this.testa;
	}

	public void setTesta(Nodo n) {
		this.testa = n;
	}
	
	
}
