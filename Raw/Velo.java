/**
 * @author Tatiana GRIES
 */

public class Velo extends Vehicule
{

// Modifier le systeme de piege cest 5% parmi tous pas 5% pour chaque.
	int accidentVelo()
	{
		double rand = Math.random()*100;
		System.out.println(rand);
		if ((double)rand <= 0.5) {
			System.out.println("Finalement vous auriez du y aller à pied. Vous vous vider de votre sang sur le bord du trottoir.");
			return 0.5;
		}
		return 0;
	}

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