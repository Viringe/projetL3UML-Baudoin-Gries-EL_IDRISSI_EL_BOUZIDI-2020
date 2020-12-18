/**
 * @author Tatiana GRIES
 */

public abstract class Personnage 
{
    private String nom;
    private int vie; // point de vie
    private int hyd; // hydratation
    private int sat; // satiété
    private int mor; // moral

    public Personnage(String nom)
    {
        this.nom = nom;
    }

    public Personnage() 
    {
      vie, hyd, sat, mor = 100; // définie le perso au commencement
    }

    public Personnage (int valeurDep, int valeurDepBis)
    {
        vie = valeurDep;
        hyd, sat, mor = valeurDepBis;
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

        mor, sat, hyd += 10;
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