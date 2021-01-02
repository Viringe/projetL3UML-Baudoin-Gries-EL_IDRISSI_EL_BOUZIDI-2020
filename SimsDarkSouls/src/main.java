import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner cmd = new Scanner( System.in );
		
        Personnage perso = null;
        int i = 4,j=4;
        int bonusChance=0;
        int size=32;
		Ville monde = null;
        monde = new Ville(size,size);
        
		while(true)
		{
			System.out.print( "new or load:" );
	        String SaveLoad = cmd.nextLine();
	        
			if (SaveLoad.equals("load")) {
				//perso:type,nom,vie,sat,hyd,mor,dip
				//i et j
				//bonus
				try {
					File save = new File("save.txt");
					FileReader  LecSave = new FileReader (save);
					@SuppressWarnings("resource")
					BufferedReader br=new BufferedReader(LecSave);
					
					String type = br.readLine();
					System.out.println(type);
					if (type.equals("HommeHippie"))
					{
						perso = new HommeHippie(br.readLine());
					}
					else if(type.equals("HommeNormal"))
					{
						perso = new HommeNormal(br.readLine());
					}
					else if(type.equals("HommePresse"))
					{
						perso = new HommePresse(br.readLine());
					}
					
					//perso.set
					//Double.parseDouble(s)
					perso.setVie(Double.parseDouble(br.readLine()));
					perso.setSat(Double.parseDouble(br.readLine()));
					perso.setHyd(Double.parseDouble(br.readLine()));
					perso.setMor(Double.parseDouble(br.readLine()));
					perso.setDip(Double.parseDouble(br.readLine()));
					i=Integer.parseInt(br.readLine());
					j=Integer.parseInt(br.readLine());
					bonusChance=Integer.parseInt(br.readLine());
					br.close();
					break;
				} catch (Exception e) {
					// TODO: handle exception
					System.err.println(e);
				}
			}
			else if (SaveLoad.equals("new")) {
				
		        
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
		        break;
		        
			}
		}
		
		
		
		
		
		
		
		//System.out.print( "chosii une taille de ville 20,30,40,50 : " );
        //int size = cmd.nextInt();
        
        
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
               
        
        while(true)
        {
        	//monde.tab_ville[i][j]; //emplacement de la maison
        	System.out.println( perso.toString() );
        	System.out.print( "que voulez vous faire: " );
        	
        	System.out.println( "seReposer,deplacer,save" );//liste action
        	
            String action = cmd.nextLine();
            if (action.equals("seReposer") && monde.tab_ville[i][j].getClass().getName().equals("Maison"))
            {
            	gestionBarreA(perso);
            	perso.setRepos(1);
            	malade(perso, 5);
            	
			}
            else if (action.equals("save")) {
            	//perso:type,nom,vie,sat,hyd,mor,dip
    			//i et j
    			//bonus
            	try {
            		BufferedWriter bw = new BufferedWriter(new FileWriter("save.txt"));
            		bw.write(perso.getClass().getName());
            		bw.newLine();
            		bw.write(perso.getName());
            		bw.newLine();
            		bw.write(String.valueOf(perso.getVie()));
            		bw.newLine();
            		bw.write(String.valueOf( perso.getSat()));
            		bw.newLine();
            		bw.write(String.valueOf(perso.getHyd()));
            		bw.newLine();
            		bw.write(String.valueOf(perso.getMor()));
            		bw.newLine();
            		bw.write(String.valueOf(perso.getDip()));
            		bw.newLine();
            		bw.write(String.valueOf(i));
            		bw.newLine();
            		bw.write(String.valueOf(j));
            		bw.newLine();
            		bw.write(String.valueOf(bonusChance));
            		//bw.newLine();
            		bw.close();
            		System.out.println("save reusie");
				} catch (Exception e) {
					// TODO: handle exception
					System.err.println(e);
				}
        		
        		
        	}
            else if (action.equals("deplacer")) {
            	while(true)
            	{
            		System.out.println( perso.toString() );
            		System.out.println("votre position: "+monde.tab_ville[i][j].getClass().getName());
            		
            		System.out.println("         "+monde.tab_ville[i-1][j].getClass().getName());//haut
            		System.out.println(" "+monde.tab_ville[i][j-1].getClass().getName()+"          "+monde.tab_ville[i][j+1].getClass().getName());//droite
            		System.out.println("         "+monde.tab_ville[i+1][j].getClass().getName());//bas
            		//System.out.println( );//gauche
            		System.out.println( "direction(up,down,right,left): " );//liste action
                    String direction = cmd.nextLine();
                    
                    if(monde.tab_ville[i+1][j].getClass().getName().equals("Grise")||
                    		monde.tab_ville[i-1][j].getClass().getName().equals("Grise")||
                    		monde.tab_ville[i][j+1].getClass().getName().equals("Grise")||
                    		monde.tab_ville[i][j-1].getClass().getName().equals("Grise"))
					{
						System.out.println("vous avez pris un mur, vous perde 10 point de vie");
						System.out.println("non je decone");
					}
                    else if (direction.equals("up") && !monde.tab_ville[i-1][j].getClass().getName().equals("Grise"))
                    {
                    	i--;
                    	gestionBarreD(perso);
                    	
						//if action rand make it 
					}
                    else if (direction.equals("down") && !monde.tab_ville[i+1][j].getClass().getName().equals("Grise"))
					{
						gestionBarreD(perso);
						i++;					
										}
                    else if (direction.equals("right") && !monde.tab_ville[i][j+1].getClass().getName().equals("Grise"))
					{
						gestionBarreD(perso);
						j++;
					}
                    else if (direction.equals("left") && !monde.tab_ville[i][j-1].getClass().getName().equals("Grise"))
					{
						gestionBarreD(perso);
						j--;
					}
                    else if(direction.equals("exit"))
					{
						break;
					}
                    
					if (monde.tab_ville[i][j].getClass().getName().equals("Foret"))
                	{
						malade(perso, 10);
					}
					else
					{
						malade(perso, 5);
					}
					if (monde.tab_ville[i][j].getClass().getName().equals("Bibliotheque"))
                	{
						perso.setMor(perso.getMor()+20);
						bonusChance+=((Bibliotheque) monde.tab_ville[i][j]).trouverLivre();
						
					}
					if (monde.tab_ville[i][j].getClass().getName().equals("Fast_food"))
                	{
						((Fast_food) monde.tab_ville[i][j]).manger(perso);
					}
					if (monde.tab_ville[i][j].getClass().getName().equals("Universite"))
                	{
						((Universite) monde.tab_ville[i][j]).obtenirDiplome(perso,bonusChance);
					}
					if (monde.tab_ville[i][j].getClass().getName().equals("Bar"))
                	{
						((Bar) monde.tab_ville[i][j]).boire(perso);
						bonusChance+=((Bar) monde.tab_ville[i][j]).trouverEnonce();
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
		if (perso.getClass().getName().equals("HommePresse"))
		{
			perso.setMor(perso.getMor()-2);
		}
		else if (perso.getClass().getName().equals("HommeHippie")) {
			//gestionBarreA(perso);
			perso.setVie(perso.getVie()-2);
		}
		else if (perso.getClass().getName().equals("HommeNormale")) {
			gestionBarreA(perso);
		}
	}
	
	public static void malade(Personnage perso,int chance)
	{
		double rand = Math.random()*100;
		//System.out.println(rand);
		if ((int)rand <= chance) {
			System.out.println("lol tes malade");
			perso.setVie(perso.getVie()-10);
		}
	}
	
	public static void gestionBarreA(Personnage perso)
	{
		if (perso.getClass().getName().equals("HommePresse"))
		{
			perso.setMor(perso.getMor()-1);
			perso.setVie(perso.getVie()-1);
			perso.setHyd(perso.getHyd()-1);
			perso.setSat(perso.getSat()-1);
		}
		else if (perso.getClass().getName().equals("HommeHippie")) {
			perso.setMor(perso.getMor()-0.5);
			perso.setVie(perso.getVie()-0.5);
			perso.setHyd(perso.getHyd()-0.5);
			perso.setSat(perso.getSat()-0.5);
		}
		else if (perso.getClass().getName().equals("HommeNormale")) {
			perso.setVie(perso.getVie()-1);
		}
	}
	
	public static void save(Personnage perso,int i, int j,int bonus)
	{
		
	}
	


}
