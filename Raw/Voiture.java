/**
 * @author Tatiana GRIES
 */

public class Voiture extends Vehicule
{

// Modifier le systeme de piege cest 5% parmi tous pas 5% pour chaque.
	int accidentVoiture()
	{
		double rand = Math.random()*100;
		System.out.println(rand);
		if ((int)rand <= 2) {
			System.out.println("Vous avez eu un accident.");
			return mort();
		}
		return 0;
	}

	// int feuRouge()
	// {
	// 	double rand = Math.random()*100;
	// 	System.out.println(rand);
	// 	if ((int)rand <= 5) {
	// 		System.out.println("Vous avez grillé un feu.");

	// 		return 5();
	// 	}
	// 	return 0;

	double piege = Math.random()*100;
		if (int)piege <= 5) 
		{
			double choixPiege = Math.random()*5;
			switch (choixPiege) 
			{
				case 1 :
					int feuRouge()
					{
						System.out.println("Vous avez grillé un feu.");
						return 5;
					}
					break;
				case 2 :
					int nidDePoule()
					{
						System.out.println("Vous avez rencontré un nid de poule.");
						return 5;
					}
					break;
				case 3 :
					int police()
					{
						System.out.println("Vous avez commis une infraction.");
						return 5;
					}
					break;
			}
		}
}