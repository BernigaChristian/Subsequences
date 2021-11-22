package program4;

import java.util.*; 

public class Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("inserisci dimensione del vettore: ");
		int max=0,somma=1,i,size=Integer.parseInt(scan.nextLine());
		int[] vettore=new int[size];//dichiarazione di un vettore
		for(i=0;i<size;i++) {
			System.out.println("inserisci il valore "+(i+1));
			vettore[i]=Integer.parseInt(scan.nextLine());
		}
		for(i=0;i<(size-1);i++) {
			if(vettore[i]<vettore[i+1]) {
				somma++;
			}
			if(somma>max) {
				max=somma;
			}
		}
		System.out.println("max sottosequenza: "+max);
	}

}
