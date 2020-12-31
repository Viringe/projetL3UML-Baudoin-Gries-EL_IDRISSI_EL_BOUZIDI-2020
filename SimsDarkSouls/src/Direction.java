/**
 * @author Tatiana GRIES
 */
public class Direction 
{	
	public static final int up=1;
	public static final int down=2;
	public static final int left=3;
	public static final int right=4;

	/**
	 * Verifie si l'entree est possiblement une direction
	 * @param dir
	 * @return
	 */
	public static boolean isDirection(int dir)
	{
		for(int i=1; i<4 ;i++)
		{
			if(i==dir)
				return true;
		}
		return false;
	}
}
