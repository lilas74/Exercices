import java.util.Scanner;
public class Champi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner clavier = new Scanner(System.in);
		boolean answer = false;
		System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
		System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");
		
		System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
		answer = clavier.nextBoolean();
		if(answer == true) {
			System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
			answer = clavier.nextBoolean();
			if(answer) {
				System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
				answer = clavier.nextBoolean();
				if(answer) {
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("l'amanite tue-mouches");
				} else{
					System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("le pied bleu");
				}
			}
			else {
				System.out.print("==> Le champignon auquel vous pensez est ");
				System.out.print("l'agaric jaunissant");
			}
		}
		else {
			System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
			answer = clavier.nextBoolean();
			if(answer) {
				System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
				 answer = clavier.nextBoolean();
				 if(answer) {
					 System.out.print("==> Le champignon auquel vous pensez est ");
						System.out.print("la girolle");
				 } else {
					 System.out.print("==> Le champignon auquel vous pensez est ");
					System.out.print("le cèpe de Bordeaux");
				 }
			}
			else {
				System.out.print("==> Le champignon auquel vous pensez est ");
				System.out.print("le coprin chevelu");
			}
		}
		
			
	
		
	clavier.close();
	}

}
