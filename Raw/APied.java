/**
 * @author Tatiana GRIES
 */

public class APied extends Vehicule
{

// Modifier le systeme de piege cest 5% parmi tous pas 5% pour chaque.
	double piege = Math.random()*100;
		if (int)piege <= 5) 
		{
			double choixPiege = Math.random()*5;
			switch (choixPiege) 
			{
				case 1 :
					int peauBanane()
					{
						System.out.println("Quelqu'un a joué à Mario Kart récemment. Vous avez glissé sur une peau de banane.");
						return 5;
					}
					break;
				case 2 :
					int poussette()
					{
						System.out.println("Vous réalisez que votre vie est vide de sens et que vous n'avez rien accompli. Même le bébé dans la poussette se moque de vous. Félicitation champion.");
						return 5;
					}
					break;
				case 3 :
					int dejection()
					{
						System.out.println("Vous vous souvenez de la raison pour laquelle vous n'aimez pas sortir. Les gens sont des porcs.");
						return 5;
					}
					break;
			}
		}
}