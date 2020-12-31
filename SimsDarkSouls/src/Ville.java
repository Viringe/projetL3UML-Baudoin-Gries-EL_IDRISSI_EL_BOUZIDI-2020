
public class Ville {
	Case tab_ville[][];
	int n;
	int m;
	
	public Ville(int i, int j) {
		// TODO Auto-generated constructor stub
		this.n=i;
		this.m=j;
		
		//for i * j we make case in tab_ville[n][m];
		this.tab_ville = new Case[n+2][m+2];
		double rand = Math.random();
		
		for (int k = 0; k < n+2; k++) {
			for (int k2 = 0; k2 < m+2; k2++) {
				tab_ville[k][k2]= new Grise();
			}
			
		}
		
		for (int k = 1; k <= n; k++) {
			for (int k2 = 1; k2 <= m; k2++) {
				//make house
				if (k== 1 && k2 == 1) {
					tab_ville[k][k2]= new Maison();
					
				}
				else if (tab_ville[k][k2-1].getClass().getSuperclass() == Batiment.class ) {
					//si a gauche y un batiment 
					tab_ville[k][k2]= new Trottoir();
					
				}
				else if (tab_ville[k][k2+1].getClass().getSuperclass() == Batiment.class ) {
					//si a dtroite y un batiment 
					tab_ville[k][k2]= new Trottoir();
					
				}
				else if (tab_ville[k-1][k2].getClass().getSuperclass() == Batiment.class ) {
					//si a en haut y un batiment 
					tab_ville[k][k2]= new Trottoir();
					
				}
				else if (tab_ville[k+1][k2].getClass().getSuperclass() == Batiment.class ) {
					//si a bas y un batiment 
					tab_ville[k][k2]= new Trottoir();
					
				}
				
				else {
					tab_ville[k][k2]= new Route();
				}
				
				//batiment entouré de route ou trooire
				
				
			}
			
		}
		
		
	}
}
