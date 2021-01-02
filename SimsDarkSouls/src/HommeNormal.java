
/**
 * @author Tatiana GRIES
 */

public class HommeNormal extends Personnage
{
	private boolean mort; // on va se servir de ça après pour voir s'il est vivant ou mort.

	public HommeNormal(String nom)
	{
		super(nom,75,75,75,75);
		mort = false;
	}
	
	public void mort()
	{
		System.out.println("You died.");
		// à voir pour utiliser et appeler dans le système plus tard ? 
		this.mort=true;
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