
public class Bar extends Batiment {
	
	void boire(Personnage perso)
	{
		perso.setHyd(perso.getHyd()+25);
		perso.setMor(perso.getMor()+10);
		perso.setVie(perso.getVie()-3);
	}
	
	int trouverEnonce()
	{
		double rand = Math.random()*100;
		System.out.println(rand);
		if ((int)rand <= 5) {
			System.out.println("lol tes malade");
			return 5;
		}
		return 0;
	}

}