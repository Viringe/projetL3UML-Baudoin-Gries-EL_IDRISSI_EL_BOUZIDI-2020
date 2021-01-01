/**
 * @author Tatiana GRIES
 */

public abstract class Personnage 
{
    private String nom;
    protected int vie; // point de vie
    protected int hyd; // hydratation
    protected int sat; // satiété
    protected int mor; // moral

    public Personnage(String nom,int vie,int hyd,int sat,int mor)
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
    public int getVie()
    {
        return vie;
    }
     public int getHyd()
    {
        return hyd;
    }
     public int getSat()
    {
        return sat;
    }
     public int getmor()
    {
        return mor;
    }

    //setters : définie les valeurs
    public void setVie(int valeurDep)
    {
        vie = valeurDep;
    }
    public void setHyd(int valeurDep)
    {
        hyd = valeurDep;
    }
    public void setSat(int valeurDep)
    {
        vie = valeurDep;
    }
    public void setMor(int valeurDep)
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
