import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Ville {
	Case tab_ville[][];
	int n;
	int m;
	
	public Ville(int i, int j) throws IOException {
		// TODO Auto-generated constructor stub
		this.m=32;//normalement i et j 
		this.n=32;
		
		//for i * j we make case in tab_ville[n][m];
		this.tab_ville = new Case[n][m];
		//double rand = Math.random();
		
		File map = new File("map.txt");
		FileReader  LecMap = new FileReader (map);
		BufferedReader br=new BufferedReader(LecMap);
		int c=0;

		for (int k = 0; k < n; k++) {
			for (int k2 = 0; k2 < m; k2++) {
				c = br.read();
				char character = (char) c;     
				System.out.print(character);
				switch (character) {
				case 49: {
					tab_ville[k][k2]= new Grise();
					System.out.print("1-");
					break;
				}
				case 50: {
					tab_ville[k][k2]= new Foret();
					System.out.print("2-");
					break;
				}
				case 51: {
					tab_ville[k][k2]= new Eau();
					System.out.print("3-");
					break;
				}
				case 52: {
					tab_ville[k][k2]= new Route();
					System.out.print("4-");
					break;
				}
				case 53: {
					tab_ville[k][k2]= new Trottoir();
					System.out.print("5-");
					break;
				}
				case 54: {
					tab_ville[k][k2]= new Batiment();
					System.out.print(1);
					break;
				}
				case 13: {
					//retourn a la ligne
					System.out.println();
					break;
				}
				case 10: {
					//saute de ligne
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + c);
				}
				
			}
			
			
		}
		br.close();
		
		
		
		
		
		
		
		
//		for (int k = 0; k < n+2; k++) {
//			for (int k2 = 0; k2 < m+2; k2++) {
//				tab_ville[k][k2]= new Grise();
//			}
//			
//		}
		
//		for (int k = 1; k <= n; k++) {
//			for (int k2 = 1; k2 <= m; k2++) {
//				//make house
//				if (k== 1 && k2 == 1) {
//					tab_ville[k][k2]= new Maison();
//					
//				}
//				else if (tab_ville[k][k2-1].getClass().getSuperclass() == Batiment.class ) {
//					//si a gauche y un batiment 
//					tab_ville[k][k2]= new Trottoir();
//					
//				}
//				else if (tab_ville[k][k2+1].getClass().getSuperclass() == Batiment.class ) {
//					//si a dtroite y un batiment 
//					tab_ville[k][k2]= new Trottoir();
//					
//				}
//				else if (tab_ville[k-1][k2].getClass().getSuperclass() == Batiment.class ) {
//					//si a en haut y un batiment 
//					tab_ville[k][k2]= new Trottoir();
//					
//				}
//				else if (tab_ville[k+1][k2].getClass().getSuperclass() == Batiment.class ) {
//					//si a bas y un batiment 
//					tab_ville[k][k2]= new Trottoir();
//					
//				}
//				
//				else {
//					tab_ville[k][k2]= new Route();
//				}
//				
//				//batiment entouré de route ou trooire
//				
//				
//			}
//			
//		}
		
		
		
		
	}
}
