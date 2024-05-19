package cli ;
import java.util.ArrayList;
import java.util.List;

public class Clients {
    private String nom;
    private String prenom;
    private String numtel;
    private List<String> preferences;
    private int idclient;

    private static int nextId = 0;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumtel() {
        return numtel;
    }

    public void setNumeroTelephone(String numtel) {
        if (numtel.length() == 10) {
            this.numtel = numtel;
        } else {
            System.out.println("Le numero de telephone doit avoir 10 chiffres.");
        }
    }

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    public Clients(String nom, String prenom, String numtel) {
        this.nom = nom;
        this.prenom = prenom;
        this.numtel = numtel;
        this.idclient = nextId++;
        this.preferences = new ArrayList<>();
    }

    

	public List<String> getPreferences() {
        return preferences;
    }

    public void ajouterPreference(String preference) {
        preferences.add(preference);
    }

    public void supprimerPreference(String preference) {
        preferences.remove(preference);
    }

    public void afficherPreferences() {
        System.out.println("Préférences de " + prenom + " " + nom + ":");
        for (String preference : preferences) {
            System.out.println("- " + preference);
        }
    }

    public void modifier(String nom, String prenom, String numtel) {
        this.nom = nom;
        this.prenom = prenom;
        this.numtel = numtel;
    }

    public void supprimer(List<Clients> listeClients, Clients client) {
        if (listeClients.contains(client)) {
            listeClients.remove(client);
            System.out.println("Le client a été supprimé avec succès.");
        } else {
            System.out.println("Le client n'existe pas dans la liste.");
        }
    }

    public void afficher() {
        System.out.println("INFORMATION CLIENTS : ");
        System.out.println("Identifiant client : " + idclient);
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Numero de telephone : " + numtel);
    }
}
