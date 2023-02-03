package eXERCICEXP;

import java.util.Scanner;

public class Exercice3xp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 0;

		System.out.print("Entrez un nombre à inverser : ");
		Scanner scanner = new Scanner(System.in);
		int nbr = scanner.nextInt();

		while (nbr != 0) {
			r = r * 10;
			r = r + nbr % 10;
			nbr = nbr / 10;
		}

		System.out.println("L'inverse du nombre est " + r);

	}

}
