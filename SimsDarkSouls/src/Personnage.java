/**
 * @author Tatiana GRIES
 */

public abstract class Personnage 
{
	protected String nom;
    protected double vie; // point de vie
    protected double hyd; // hydratation
    protected double sat; // satiété
    protected double mor; // moral
    protected double dip; // diplome
    private boolean mort; // on va se servir de ça après pour voir s'il est vivant ou mort.
    protected Vehicule deplacement;
    protected int nbArret;
    protected boolean maillot;
    
    public Personnage(String nom,double vie,double hyd,double sat,double mor)
    {
        this.nom = nom;
        this.vie = vie;
        this.hyd = hyd;
        this.sat = sat;
        this.mor = mor;
        this.dip = 0;
        this.mort = false;
        this.deplacement = new APied();
        double rand = Math.random()*100;
        if ((int)rand <= 10) {
			this.maillot=true;
		}
        else
        {
        	this.maillot=false;
        }
    }
    
    public Personnage() 
    {
      this.vie= 100;
      this.hyd= 100;
      this.sat= 100;
      this.mor = 100; // définie le perso au commencement
      this.dip=0;
      this.mort = false;
      this.deplacement = new APied();
      double rand = Math.random()*100;
      if ((int)rand <= 10) {
			this.maillot=true;
		}
      else
      {
      	this.maillot=false;
      }
    }

    public Personnage (int valeurDep, int valeurDepBis)
    {
        this.vie = valeurDep;
        this.hyd = valeurDepBis;
        this.sat = valeurDepBis;
        this.mor = valeurDepBis;
        this.dip=0;
        this.mort = false;
        this.deplacement = new APied();
        double rand = Math.random()*100;
        if ((int)rand <= 10) {
			this.maillot=true;
		}
        else
        {
        	this.maillot=false;
        }
    }

    //accesseurs : permet de récupérer l'info
    public double getVie()
    {
        return vie;
    }
     public double getHyd()
    {
        return hyd;
    }
     public double getSat()
    {
        return sat;
    }
     public double getMor()
    {
        return mor;
    }
    public double getDip()
    {
        return dip;
    }
    public String getName()
    {
        return nom;
    }
    public Vehicule getDeplacement()
    {
        return deplacement;
    }
    public int getNbArret() {
		return nbArret;
	}

    //setters : définie les valeurs
    public void setVie(double valeurDep)
    {
        this.vie = valeurDep;
    }
    public void setHyd(double valeurDep)
    {
    	if (this.hyd+valeurDep > 100)
        {
        	this.hyd = 100;
        }
    	else
    		this.mor = valeurDep;
    }
    public void setSat(double valeurDep)
    {
    	if (this.sat+valeurDep > 100)
        {
        	this.sat = 100;
        }
    	else
    		this.mor = valeurDep;
    }
    public void setMor(double valeurDep)
    {
    	if (this.mor+valeurDep > 100)
        {
        	this.mor = 100;
        }
    	else
    		this.mor = valeurDep;
    }
    public void setDip(double valeurDep)
    {
    	this.dip = valeurDep;
    }
    public void setDeplacement(Vehicule dep)
    {
    	this.deplacement = dep;
    }
    public void setNbArret(int dep) {
		this.nbArret = dep;
	}
    
    public boolean getMaillot() {
		return maillot;
	}

	public void setMaillot(boolean maillot) {
		this.maillot = maillot;
	}

	// service :
    public void seDeplacer(int deplacement)
    {

    }

	public void mort()
	{
		System.out.println("You died.");
		// à voir pour utiliser et appeler dans le système plus tard ? 
		this.mort=true;
		System.exit(0);
	}
	
    public void setRepos(int reposMaison)
    {
        // Il y gagne 10 points pour le moral, 
        //la satiété et l’hydratation. 

        this.mor += 10;
        this.sat += 10;
        this.hyd += 10;
        if (mor > 100)
        {
        	this.mor = 100;
        }
        if (sat > 100)
        {
        	this.sat = 100;
        }
        if (hyd > 100)
        {
        	this.hyd = 100;
        }
    }
    
    @Override
    public String toString() { 
        return String.format("nom: "+this.nom+",vie: "+this.vie+",hyd: "+this.hyd+",sat: "+this.sat+",morale: "+this.mor+",vehicule: "+this.deplacement.getClass().getName()+",maillot: "+this.maillot+",nombre d'arrestations: "+this.nbArret+",diplome: "+this.dip); 
    } 
}
