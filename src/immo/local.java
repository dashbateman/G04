package immo;

public class Local extends BiensImmo {
    public Local(int superficie, float prix, String wilaya, String ville, String etat) {
        super(superficie, prix, wilaya, ville, etat);
    }

    @Override
    public String toString() {
        return "Type: Local, Superficie: " + getSuperficie() + "m², Prix: " + getPrix() + "DA, Wilaya: " + getWilaya() + ", Ville: " + getVille() + ", Etat: " + getEtat();
    }
}