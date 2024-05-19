package immo;

public class Studio extends Appartement {

    public Studio(int superficie, float prix, String wilaya, String ville, String etat, int etage) {
        super(superficie, prix, wilaya, ville, etat, 1, etage);
    }

    public Studio() {
        super();
        setNbChambres(1);
    }

    @Override
    public String toString() {
        return "Type: Studio, Superficie: " + getSuperficie() + "m², Prix: " + getPrix() + "DA, Wilaya: " + getWilaya() + ", Ville: " + getVille() + ", Etat: " + getEtat() + ", Etage: " + getEtage();
    }
}
