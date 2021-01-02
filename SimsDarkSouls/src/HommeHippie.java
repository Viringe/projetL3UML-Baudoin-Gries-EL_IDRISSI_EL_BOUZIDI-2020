
/**
 * @author Tatiana GRIES
 */

public class HommeHippie extends Personnage
{

	public HommeHippie(String nom)
	{
		super(nom,75,50,50,100);
	}
	
	public boolean deplacer(Case verif)
	{
		switch (verif.getClass().toString())
		{
			case "Eau":
				return false;
			case "Batiment":
				return true;
			case "Foret":
				return true;
			default:
				return false;
		}
	}

}