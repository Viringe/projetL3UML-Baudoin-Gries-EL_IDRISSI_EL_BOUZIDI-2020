
/**
 * @author Tatiana GRIES
 */

public class HommeNormal extends Personnage
{
	
	public HommeNormal(String nom)
	{
		super(nom,75,75,75,75);
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