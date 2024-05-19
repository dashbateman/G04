package immo;

public class Terrain extends BiensImmo {
    public Terrain(int superficie, float prix, String wilaya, String ville, String etat) {
        super(superficie, prix, wilaya, ville, etat);
    }

    @Override
    public String toString() {
        return "Type: Terrain, Superficie: " + getSuperficie() + "m², Prix: " + getPrix() + "DA, Wilaya: " + getWilaya() + ", Ville: " + getVille() + ", Etat: " + getEtat();
    }
}