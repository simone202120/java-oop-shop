package generation.italy.shop;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Prezzo prodotto: ");
		int prezzo = sc.nextInt();
		
		System.out.print("Nome del prodotto: ");
		String nome = sc.next();
		
		System.out.print("Descrizione del prodotto: ");
		String descrizione = sc.next();
		
		
		Prodotto newProduct= new Prodotto(nome, descrizione, prezzo);
		
		System.out.println(newProduct);
	}
}
