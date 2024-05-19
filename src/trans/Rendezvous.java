package trans;
import java.util.List;

import cli.*;
import immo.BiensImmo;

public class Rendezvous {
    private BiensImmo bien;
    private Clients client;
    private Agent agent;
    private String dat;
    private String heure;
    private int idrdv;

    private static int nextId = 1;

    public BiensImmo getBien() {
        return bien;
    }

    public void setBien(BiensImmo bien) {
        this.bien = bien;
    }

    public Clients getClient() {
        return client;
    }

    public void setClient(Clients client) {
        this.client = client;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getDat() {
        return dat;
    }

    public void setDat(String dat) {
        this.dat = dat;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public int getIdrdv() {
        return idrdv;
    }

    public void setIdrdv(int idrdv) {
        this.idrdv = idrdv;
    }

    public Rendezvous(BiensImmo bien, Clients client, Agent agent, String dat, String heure) {
        this.bien = bien;
        this.client = client;
        this.agent = agent;
        this.dat = dat;
        this.heure = heure;
        this.idrdv = nextId++;
    }

    
    public static void ajouterRendezvous(List<Rendezvous> rdvs, Rendezvous rdv) {
        rdvs.add(rdv);
    }

    public static void supprimerRendezvous(List<Rendezvous> rdvs, Rendezvous rdv) {
        rdvs.remove(rdv);
    }

    // Modifier les détails d'un rendez-vous
    public static void modifierRendezvous(Rendezvous rdv, BiensImmo bien, Clients client, Agent agent, String dat, String heure) {
        rdv.setBien(bien);
        rdv.setClient(client);
        rdv.setAgent(agent);
        rdv.setDat(dat);
        rdv.setHeure(heure);
    }

    public static void afficherRendezvous(List<Rendezvous> rdvs) {
        for (Rendezvous rdv : rdvs) {
            System.out.println("Rendez-vous ID: " + rdv.getIdrdv());
            System.out.println("Client: " + rdv.getClient().getNom() + " " + rdv.getClient().getPrenom());
            System.out.println("Agent: " + rdv.getAgent().getNom() + " " + rdv.getAgent().getPrenom());
            System.out.println("Bien immobilier: " + rdv.getBien().getId());
            System.out.println("Date: " + rdv.getDat());
            System.out.println("Heure: " + rdv.getHeure());
            System.out.println("----------------------------------------");
        }
    }
}
