/**
 * @author Tatiana GRIES
 */

public abstract class Personnage 
{
    private String nom;
    protected double vie; // point de vie
    protected double hyd; // hydratation
    protected double sat; // satiété
    protected double mor; // moral
    protected double dip; // diplome
    
    public Personnage(String nom,double vie,double hyd,double sat,double mor)
    {
        this.nom = nom;
        this.vie = vie;
        this.hyd = hyd;
        this.sat = sat;
        this.mor = mor;
        this.dip=0;
    }

    public Personnage() 
    {
      this.vie= 100;
      this.hyd= 100;
      this.sat= 100;
      this.mor = 100; // définie le perso au commencement
      this.dip=0;
    }

    public Personnage (int valeurDep, int valeurDepBis)
    {
        this.vie = valeurDep;
        this.hyd = valeurDepBis;
        this.sat = valeurDepBis;
        this.mor = valeurDepBis;
        this.dip=0;
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

    //setters : définie les valeurs
    public void setVie(double valeurDep)
    {
        this.vie = valeurDep;
    }
    public void setHyd(double valeurDep)
    {
        this.hyd = valeurDep;
    }
    public void setSat(double valeurDep)
    {
    	this.sat = valeurDep;
    }
    public void setMor(double valeurDep)
    {
    	this.mor = valeurDep;
    }
    public void setDip(double valeurDep)
    {
    	this.dip = valeurDep;
    }

    // service :
    public void seDeplacer(int deplacement)
    {

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
        return String.format("nom: "+this.nom+",vie: "+this.vie+",hyd: "+this.hyd+",sat: "+this.sat+",morale: "+this.mor+",diplome: "+this.dip); 
    } 
}
