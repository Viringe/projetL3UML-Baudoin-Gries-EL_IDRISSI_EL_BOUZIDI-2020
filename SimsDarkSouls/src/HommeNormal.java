
/**
 * @author Tatiana GRIES
 */

public class HommeNormal extends Personnage
{
	private boolean mort; // on va se servir de ça après pour voir s'il est vivant ou mort.

	public HommeNormal(String nom)
	{
		super(nom);
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
		switch (verif.getType())
		{
			case TypeCase.EAU:
				return false;
			case TypeCase.NORMAL:
				return true;
			case TypeCase.FORET:
				return true;
			default:
				return false;
		}
	}

	public Personnage()
	{
		vie, hyd, mor, sat = 75;
	}
}