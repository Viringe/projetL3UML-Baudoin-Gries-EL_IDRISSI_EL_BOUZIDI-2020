
public class Fast_food extends Batiment {
	
	void manger(Personnage perso)
	{
		//10 points pour le moral, la satiété et l’hydratation
		perso.setMor(perso.getMor()+10);
		perso.setHyd(perso.getHyd()+10);
		perso.setSat(perso.getSat()+25);
		perso.setVie(perso.getVie()-5);
	}

}