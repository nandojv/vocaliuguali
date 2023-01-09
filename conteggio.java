package nataleesercizi;

import java.util.Scanner;


/*Scrivere un programma Conteggio che chiede all’utente di inserire un numero maggiore o
uguale a zero e stampa uno dopo l’altro tutti i numeri da 0 al numero inserito compreso. Se il valore
inserito dall’utente `e negativo il programma stampa un messaggio di errore.
 * 
 */
public class conteggio {

	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc=new Scanner(System.in);
		
		System.out.println("inserisci un numero");
		
		int numero=sc.nextInt();
		
		
		if(numero<0) {
			System.out.println("errore numero negativo");
		}
		else for(int i=0;i<=numero;i++) {
			System.out.println(i);
		}
	}


}
