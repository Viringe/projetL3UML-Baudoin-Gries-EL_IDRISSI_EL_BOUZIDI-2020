/**
 * @author Tatiana GRIES
 */

public class APied extends Vehicule
{

// Modifier le systeme de piege cest 5% parmi tous pas 5% pour chaque.
	static int piege()
	{
		double piege = Math.random()*100;
		if ((int)piege <= 5) 
		{
			double choixPiege = Math.random()*5;
			switch ((int)choixPiege) 
			{
				case 1 :
					{
						System.out.println("Quelqu'un a jou� � Mario Kart r�cemment. Vous avez gliss� sur une peau de banane.");
						return 1;
					}
				case 2 :
					{
						System.out.println("Vous r�alisez que votre vie est vide de sens et que vous n'avez rien accompli. M�me le b�b� dans la poussette se moque de vous. F�licitation champion.");
						return 2;
					}
				case 3 :
					{
						System.out.println("Vous vous souvenez de la raison pour laquelle vous n'aimez pas sortir. Les gens sont des porcs.");
						return 3;
					}
			}
		}
		return 0;
	}
}