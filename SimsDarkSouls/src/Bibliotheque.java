
public class Bibliotheque extends Batiment {
	
	int trouverLivre()
	{
		double rand = Math.random()*100;
		System.out.println(rand);
		if ((int)rand <= 5) {
			System.out.println("ta trouve un livre");
			return 10;
		}
		return 0;
	}

}