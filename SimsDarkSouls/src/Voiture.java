/**
 * @author Tatiana GRIES
 */

public class Voiture extends Vehicule
{

// Modifier le systeme de piege cest 5% parmi tous pas 5% pour chaque.
	static int accidentVoiture(Personnage perso)
	{
		double rand = Math.random()*100;
		System.out.println(rand);
		if ((int)rand <= 2) {
			System.out.println("Vous avez eu un accident.");
			perso.mort();
		}
		return 0;
	}

	// int feuRouge()
	// {
	// 	double rand = Math.random()*100;
	// 	System.out.println(rand);
	// 	if ((int)rand <= 5) {
	// 		System.out.println("Vous avez grillÃ© un feu.");

	// 		return 5();
	// 	}
	// 	return 0;
	
	static int piege()
	{
		double piege = Math.random()*100;
		if ((int)piege <= 5) 
		{
			double choixPiege = Math.random()*3;
			switch ((int)choixPiege) 
			{
			case 1 :
			{	
				//int feuRouge();
				System.out.println("Vous avez grillé un feu.");
				return 1;
			}
			case 2 :
			{
				//int nidDePoule();
				System.out.println("Vous avez rencontré un nid de poule.");
				return 2;
			}
			case 3 :
			{
				//int police();
				System.out.println("Vous avez commis une infraction.");
				return 3;
			}
			}
		}
		return 0;
	}
	
}