
public class Universite extends Batiment {
	
	void obtenirDiplome(Personnage perso, int chance)
	{
		
		double rand = Math.random()*100;
		System.out.println(rand);
		if ((int)rand <= 30+chance) {
			System.out.println("optention du diplome");
			perso.setDip(perso.getDip()+1);
			//return 10;
		}
		//return 0;
	}

}