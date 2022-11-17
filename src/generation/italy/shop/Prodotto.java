package generation.italy.shop;

import java.util.Random;

public class Prodotto {
	int codice;
	String nome;
	String descrizione;
	int prezzo; 
	double iva=1.22;
	
	public Prodotto (String nome, String descrizione, int prezzo) {
		
		this.nome= nome;
		this.descrizione=descrizione;
		this.prezzo=prezzo;
	}
	
	public int calcPrezzo() {
		return prezzo;
	}
	
	public double prezzoIva() {
		return prezzo * iva;
	}
	
	public int creaCodice() {
		
		 Random random = new Random();
		 
		 for(int x=0; x<5; x++) {
			 
			 int partialCode = random.nextInt(6);
			 codice += partialCode;
		 }
		 return codice;
	}
	
	@Override
	public String toString() {

		return "Il nome del prodotto è: " + nome
			+ "\nDescrizione Prodotto: " + descrizione
			+ "\nPrezzo senza Iva:  " + calcPrezzo()
			+ "\nPrezzo con IVA: " + prezzoIva()
			+ "\nIl codice del prodotto è: " + codice;
	}
}