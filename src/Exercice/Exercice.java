package Exercice;

import java.util.Random;

public class Exercice {

	public Exercice() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Random rand = new Random();

	    // pick a random number between 0 and 1:
	    int n = rand.nextInt(2);
	    int v = rand.nextInt(2);
	    String[] aleatoireValeur = {"Pile","Tail"};
	    
	    if (n == 0) {
		    System.out.println("n = " + n + "\nValeur retouné " + aleatoireValeur[v]);
		} 
	    
	    if (n == 1) {
		    System.out.println("n = " + n + "\nValeur retouné " + aleatoireValeur[v]);
		} 

	}

}
