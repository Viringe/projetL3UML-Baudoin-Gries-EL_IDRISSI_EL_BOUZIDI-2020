import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cmd = new Scanner( System.in );
		
		System.out.print( "chosii une taille de ville 20,30,40,50 : " );
        int size = cmd.nextInt();
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
        //monde.tab_ville[i][j].getClass();
        for (int i = 0; i < size+2; i++) {
        	for (int j = 0; j < size+2; j++) {
				System.out.print(monde.tab_ville[i][j].getClass());
				System.out.print(" - ");
			}
			System.out.println(" ");
		}
        
//        for (int i = 0; i < size; i++) {
//        	for (int j = 0; j < 5; j++) {
//				System.out.print(j);
//				System.out.print(" - ");
//			}
//			System.out.println(" ");
//		}
				
				
	}

}


//.getClass()