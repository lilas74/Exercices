import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();
        

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        if(debut < 0 || debut > 24 || fin <0 || fin > 24) {
       	 System.out.println("Les heures doivent être comprises entre 0 et 24 !");
       } else if(debut == fin) {
       	 System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
       } else if(fin < debut) {
       	System.out.println("Bizarre, le début de la location est après la fin ...");
       } else {
       	  System.out.println("Vous avez loué votre vélo pendant");
       	  double sommeUnFranc = 0.0;
       	  double sommeDeuxFrancs = 0.0;
       	if  (debut >=0 && debut <7) {
       		if(fin <= 7) {
       			sommeUnFranc = (fin - debut)*1.0;
    			   System.out.println(fin - debut + " heure(s) au tarif horaire de 1.0 franc(s)");
       		}else if(fin>7 && fin<=17) {
       		sommeUnFranc = (7 - debut) * 1.0;
      			  sommeDeuxFrancs = (fin - 7)*2.0;
      			  System.out.println(7 - debut + " heure(s) au tarif horaire de 1.0 franc(s)");
      			  System.out.println(fin -7 + " heure(s) au tarif horaire de 2.0 franc(s)");
       		}
       		else if(fin <= 24 && fin >=17 ) {
       			sommeUnFranc = (7 - debut) * 1.0 + (fin -17)*1.0;
       			sommeDeuxFrancs = (17-7)*2.0;
       			System.out.println((7 - debut) + (fin -17) + " heure(s) au tarif horaire de 1.0 franc(s)");
        			System.out.println(17-7 + " heure(s) au tarif horaire de 2.0 franc(s)");
       		}
       	} else if(debut >=7 && debut<17) {
       		if(fin>17) {
       			sommeDeuxFrancs = (17- debut) * 2.0 ;
       			sommeUnFranc = (fin - 17)*1.0;
       			System.out.println((fin - 17)  + " heure(s) au tarif horaire de 1.0 franc(s)");
        			System.out.println(17 - debut + " heure(s) au tarif horaire de 2.0 franc(s)");
       		}
       		else {
       			sommeDeuxFrancs = (fin - debut)*2.0;
       			System.out.println(fin - debut + " heure(s) au tarif horaire de 2.0 franc(s)");
       		}
       	}else {
       		sommeUnFranc = (fin - debut)*1.0;
 			   System.out.println(fin - debut + " heure(s) au tarif horaire de 1.0 franc(s)");
       	}
       	 System.out.print("Le montant total à payer est de ");
            System.out.println(sommeUnFranc + sommeDeuxFrancs + " franc(s).");
       }
       
        
        

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
