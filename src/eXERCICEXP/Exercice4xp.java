package eXERCICEXP;

public class Exercice4xp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println();
		System.out.println(" ************* NOMBRE D'AMSTRONG ****************");
		System.out.println();
		
		System.out.println("Les nombres d'amtrong compris entre 1 et 500 sont : ");
		System.out.println();
		for (int i = 1; i <= 500; i++) {

			String[] convert = String.valueOf(i).split("", 0);

			int resultat = 0;
			for (int j = 0; j < convert.length; j++) {

				int convert2 = Integer.valueOf(convert[j]);
				resultat = resultat + (int) Math.pow(convert2, 3);

			}

			if (resultat == i) {

				

				System.out.println( + i);
				System.out.println();
				

			}

		}
		System.out.println(" *************************************************");


	}

}
