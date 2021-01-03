/**
 * @author Tatiana GRIES
 */

public class Velo extends Vehicule
{

// Modifier le systeme de piege cest 5% parmi tous pas 5% pour chaque.
	static void accidentVelo(Personnage perso)
	{
		double rand = Math.random()*100;
		//System.out.println(rand);
		if ((double)rand <= 0.5) {
			System.out.println("Finalement vous auriez du y aller à pieds. Vous vous vider de votre sang sur le bord du trottoir.");
			perso.mort();
		}
	}
	
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