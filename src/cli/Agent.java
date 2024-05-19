package cli ;
import java.util.ArrayList;
import java.util.List;

import immo.*;

public class Agent {
    private String nom ;
    private String prenom ;
    private String email ;
    private List<BiensImmo> biensagerer ;
    private int idagent ;

    private static int nextId = 1 ;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BiensImmo> getBiensagerer() {
        return biensagerer;
    }

    public void setBiensagerer(List<BiensImmo> bienagerer) {
        this.biensagerer = bienagerer;
    }

    public int getIdagent() {
        return idagent;
    }

    public void setIdagent(int idagent) {
        this.idagent = idagent;
    }

    public Agent(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.idagent = nextId++ ;
        this.biensagerer = new ArrayList<>();
    }

    public void ajouterBiensagerer(BiensImmo bien) {
        biensagerer.add(bien);
    }

    public void supprimerBiesnagerer(int id) {
        // Parcourir la liste des biens
        for (BiensImmo b : biensagerer) {
            // Vérifier si l'ID du bien correspond à l'ID donné
            if (b.getId() == id) {
                // Si c'est le cas, supprimer le bien de la liste
                biensagerer.remove(b);
                System.out.println("Le bien avec l'ID " + id + " a été supprimé avec succès.");
                return; // Sortir de la méthode après avoir supprimé le bien
            }
        }
        // Si aucun bien correspondant n'est trouvé
        System.out.println("Le bien avec l'ID " + id + " n'existe pas dans la liste.");
    }
    

    public void afficherBiensagerer() {
        System.out.println("Bien a gerer de " + prenom + " " + nom + ":");
        for (BiensImmo bien : biensagerer) {
            System.out.println("- " + bien);
        }
    }

    public void modifier(String nom , String prenom , String email){
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
    }

    public void supprimer(List<Agent> listeAgents, Agent agent) {
        if (listeAgents.contains(agent)) {
            listeAgents.remove(agent);
            System.out.println("L'agent a été supprimé avec succès.");
        } else {
            System.out.println("L'agent n'existe pas dans la liste.");
        }
    }

    public void afficher(){
        System.out.println("INFORMATION AGENTS :");
        System.out.println("Identifiant agent : "+idagent);
        System.out.println("Nom : "+nom);
        System.out.println("Prenom : "+prenom);
        System.out.println("Adresse electronique : "+email);
        System.out.println("");
    }
    
}