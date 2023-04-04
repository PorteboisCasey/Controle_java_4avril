package Entities.Exo1;

public class CoursCollectif implements ICalcul
{
    private String nomCours;

    private int nbPlacesMaxi;

    private int ageMini;

    public CoursCollectif(String nomCours, int nbPlacesMaxi, int ageMini) {
        this.nomCours = nomCours;
        this.nbPlacesMaxi = nbPlacesMaxi;
        this.ageMini = ageMini;
    }


    public String getNomCours() {
        return nomCours;
    }

    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }

    public int getNbPlacesMaxi() {
        return nbPlacesMaxi;
    }

    public void setNbPlacesMaxi(int nbPlacesMaxi) {
        this.nbPlacesMaxi = nbPlacesMaxi;
    }

    public int getAgeMini() {
        return ageMini;
    }

    public void setAgeMini(int ageMini) {
        this.ageMini = ageMini;
    }
}