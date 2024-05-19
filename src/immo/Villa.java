package immo;

public class Villa extends BiensImmo {
    private int nbEtages;
    //private boolean piscine;

    public Villa(int superficie, float prix, String wilaya, String ville, String etat, int nbEtages) {
        super(superficie, prix, wilaya, ville, etat);
        this.nbEtages = nbEtages;
        //this.piscine = piscine;
    }

    public int getNbEtages() {
        return nbEtages;
    }

    public void setNbEtages(int nbEtages) {
        this.nbEtages = nbEtages;
    }

    /*public boolean isPiscine() {
        return piscine;
    }*/

    /*public void setPiscine(boolean piscine) {
        this.piscine = piscine;
    }*/

    @Override
    public String toString() {
        //String piscineStr = piscine ? "Oui" : "Non";
        return "Type: Villa, Superficie: " + getSuperficie() + "m², Prix: " + getPrix() + "DA, Wilaya: " + getWilaya() + ", Ville: " + getVille() + ", Etat: " + getEtat() + ", Nombre d'étages: " + nbEtages ;
    }
}
