
/**
 * @author Tatiana GRIES
 */

public class HommePresse extends Personnage
{

	public HommePresse(String nom)
	{
		super(nom,100,75,75,50);
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
