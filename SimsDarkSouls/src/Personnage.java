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

    public Personnage(String nom,double vie,double hyd,double sat,double mor)
    {
        this.nom = nom;
        this.vie = vie;
        this.hyd = hyd;
        this.sat = sat;
        this.mor = mor;
    }

    public Personnage() 
    {
      this.vie= 100;
      this.hyd= 100;
      this.sat= 100;
      this.mor = 100; // définie le perso au commencement
    }

    public Personnage (int valeurDep, int valeurDepBis)
    {
        this.vie = valeurDep;
        this.hyd = valeurDepBis;
        this.sat = valeurDepBis;
        this.mor = valeurDepBis;
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
     public double getmor()
    {
        return mor;
    }

    //setters : définie les valeurs
    public void setVie(double valeurDep)
    {
        vie = valeurDep;
    }
    public void setHyd(double valeurDep)
    {
        hyd = valeurDep;
    }
    public void setSat(double valeurDep)
    {
        vie = valeurDep;
    }
    public void setMor(double valeurDep)
    {
        vie = valeurDep;
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
            mor = 100;
        }
        if (sat > 100)
        {
            sat = 100;
        }
        if (hyd > 100)
        {
            hyd = 100;
        }
    }
}
