package immo;

public class Appartement extends BiensImmo {
    private int nbChambres;
    private int etage;

    public Appartement(int superficie, float prix, String wilaya, String ville, String etat, int nbChambres, int etage) {
        super(superficie, prix, wilaya, ville, etat);
        this.nbChambres = nbChambres;
        this.etage = etage;
    }

    public Appartement() {
        super();
        nbChambres = 0;
        etage = 0;
    }

    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    @Override
    public String toString() {
        return "Type: Appartement, Superficie: " + getSuperficie() + "m², Prix: " + getPrix() + "DA, Wilaya: " + getWilaya() + ", Ville: " + getVille() + ", Etat: " + getEtat() + ", Nombre de chambres: " + nbChambres + ", Etage: " + etage;
    }
}
