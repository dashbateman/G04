package immo;
import java.util.List;

public class BiensImmo {
    //Super classe
    private int superficie ;
    private float prix ;
    private String wilaya ;
    private String ville ;
    private String etat ;
    private int idbien ;

    private static int nextId = 1;

    public BiensImmo(int superficie, float prix,String wilaya,String ville, String etat ) {
        this.superficie = superficie;
        this.prix = prix;
        this.wilaya=wilaya;
        this.ville=ville;
        this.etat = etat;
        this.idbien=nextId++;
    }

    public BiensImmo(){}

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getWilaya() {
        return wilaya;
    }

    public void setWilaya(String wilaya) {
        this.wilaya = wilaya;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getId() {
        return idbien;
    }

    public void setIdbien(int idbien) {
        this.idbien = idbien;
    }

    public void modifier(int superficie, float prix,String wilaya,String ville, String etat){
        this.superficie = superficie;
        this.prix = prix;
        this.wilaya=wilaya;
        this.ville=ville ;
        this.etat = etat;
    }

    public void supprimer(List<BiensImmo> listeBiens, BiensImmo bien) {
        if (listeBiens.contains(bien)) {
            listeBiens.remove(bien);
            System.out.println("Le bien immobilier a été supprimé avec succès.");
        } else {
            System.out.println("Le bien immobilier n'existe pas dans la liste.");
        }
    }
    
    /*public void afficherDetails() {
        System.out.println("INFORMATION DU BIEN : ");
        System.out.println("Identifiant unique du bien : "+idbien);
        System.out.println("Superficie: " + superficie+"M²");
        System.out.println("Prix: " + prix+"DA");
        System.out.println("Localisation : "+ville+" Wilaya de "+wilaya);
        System.out.println("Etat : "+ etat);
    }*/

    
}