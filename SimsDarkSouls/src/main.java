import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner cmd = new Scanner( System.in );
		
		//System.out.print( "chosii une taille de ville 20,30,40,50 : " );
        //int size = cmd.nextInt();
        int size=32;
		Ville monde = null;
        
        monde = new Ville(size,size);
        
//        switch (size) {
//	        case 5: {
//				//System.out.println(20);
//				monde = new Ville(5,5);
//				break;
//			}
//			case 20: {
//				//System.out.println(20);
//				monde = new Ville(20,20);
//				break;
//			}
//			case 30: {
//				System.out.println(30);
//				monde = new Ville(30,30);
//				break;
//			}
//			case 40: {
//				System.out.println(40);
//				monde = new Ville(40,40);
//				break;
//			}
//			case 50: {
//				System.out.println(50);
//				monde = new Ville(50,50);
//				break;
//			}	
//        }
        
        //afiche la map
//        for (int i = 0; i < size; i++) {
//        	for (int j = 0; j < size; j++) {
////        		System.out.print(i);
////        		System.out.print(",");
////        		System.out.print(j);
//				System.out.print(monde.tab_ville[i][j].getClass());
//				System.out.print(" - ");
//			}
//			System.out.println(" /fin");
//		}
        
//        for (int i = 0; i < size; i++) {
//        	for (int j = 0; j < 5; j++) {
//				System.out.print(j);
//				System.out.print(" - ");
//			}
//			System.out.println(" ");
//		}
        
        Personnage perso = null;
        while(true)
        {
        	System.out.print( "type de personage hippie,presse,standard : " );
            String type = cmd.nextLine();
            //System.out.println("-"+type+"-");
            if (type.equals("hippie")) {
    			//create le perso
            	System.out.print( "nom de votre hippie: " );
                String name = cmd.nextLine();
            	perso = new HommeHippie(name);
            	break;
    		}
    		if (type.equals("presse"))
    		{
    			System.out.print( "nom de votre homme persse: " );
                String name = cmd.nextLine();
                perso = new HommePresse(name);
            	break;
    		}
    		if (type.equals("standard"))
    		{
    			System.out.print( "nom de votre homme standard: " );
                String name = cmd.nextLine();
                perso = new HommeNormal(name);
            	break;
    		}
        }
        int i = 4,j=4;
        while(true)
        {
        	//monde.tab_ville[i][j]; //emplacement de la maison
        	System.out.print( "que voulez vous faire: " );
        	
        	System.out.println( "seReposer,deplacer" );//liste action
        	
            String action = cmd.nextLine();
            if (action.equals("seReposer") && monde.tab_ville[i][j].getClass().toString().equals("Maison"))
            {
            	gestionBarreA(perso);
            	perso.setRepos(1);
            	
			}
            else
            {
            	//System.out.println( "action impossible" );
            }
            
            if (action.equals("deplacer")) {
            	while(true)
            	{
 
            		System.out.println("votre position: "+monde.tab_ville[i][j].getClass().getName());
            		
            		System.out.println("         "+monde.tab_ville[i-1][j].getClass().getName());//haut
            		System.out.println(" "+monde.tab_ville[i][j-1].getClass().getName()+"          "+monde.tab_ville[i][j+1].getClass().getName());//droite
            		System.out.println("         "+monde.tab_ville[i+1][j].getClass().getName());//bas
            		//System.out.println( );//gauche
            		System.out.println( "direction: " );//liste action
                    String direction = cmd.nextLine();
                    
                    if (direction.equals("up") && !monde.tab_ville[i][j].getClass().toString().equals("Grise"))
                    {
                    	i--;
                    	gestionBarreD(perso);
                    	if (monde.tab_ville[i][j].getClass().toString().equals("Foret"))
                    	{
							double rand = Math.random()*100;
							System.out.println(rand);
							if ((int)rand > 10) {
								System.out.println("lol tes malade");
							}
						}
						//if action rand make it 
					}
					if (direction.equals("down") && !monde.tab_ville[i][j].getClass().toString().equals("Grise"))
					{
						gestionBarreD(perso);
						i++;					
										}
					if (direction.equals("right") && !monde.tab_ville[i][j].getClass().toString().equals("Grise"))
					{
						gestionBarreD(perso);
						j++;
					}
					if (direction.equals("left") && !monde.tab_ville[i][j].getClass().toString().equals("Grise"))
					{
						gestionBarreD(perso);
						j--;
					}
					if(direction.equals("exit"))
					{
						break;
					}
            	}
            	
            	
			}
            else
            {
            	System.out.println( "action impossible" );
            }
            
        	
        }

        
        
				
				
	}
	
	public static void gestionBarreD(Personnage perso)
	{
		if (perso.getClass().equals("HommePresse"))
		{
			perso.setMor(perso.getmor()-2);
		}
		else if (perso.getClass().equals("HommeHippie")) {
			//gestionBarreA(perso);
			perso.setVie(perso.getVie()-2);
		}
		else if (perso.getClass().equals("HommeNormale")) {
			gestionBarreA(perso);
		}
	}
	
	public static void gestionBarreA(Personnage perso)
	{
		if (perso.getClass().equals("HommePresse"))
		{
			perso.setMor(perso.getmor()-1);
			perso.setVie(perso.getVie()-1);
			perso.setHyd(perso.getHyd()-1);
			perso.setSat(perso.getSat()-1);
		}
		else if (perso.getClass().equals("HommeHippie")) {
			perso.setMor(perso.getmor()-0.5);
			perso.setVie(perso.getVie()-0.5);
			perso.setHyd(perso.getHyd()-0.5);
			perso.setSat(perso.getSat()-0.5);
		}
		else if (perso.getClass().equals("HommeNormale")) {
			perso.setVie(perso.getVie()-1);
		}
	}
	
	
	

}
