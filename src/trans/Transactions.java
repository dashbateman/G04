package trans;

import cli.Clients;
import immo.BiensImmo;

public class Transactions {
    private BiensImmo bien ;
    private Clients client ;
    private String type ;
    private String etat ;
    private int idcontrat ;

    private static int nextId = 1;
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getEtat() {
        return etat;
    }
    public void setEtat(String etat) {
        this.etat = etat;
    }
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
    public int getIdcontrat(){
        return idcontrat ;
    }
    public void setIdcontrat(int idcontrat){
        this.idcontrat=idcontrat;
    }
    public Transactions(BiensImmo bien, Clients client, String type, String etat) {
        this.bien = bien;
        this.client = client;
        this.type = type;
        this.etat = etat;
        this.idcontrat=nextId++;
    }

    public void afficherContrat(){
        if (client != null) {
            client.afficher();
        } else {
            System.out.println("Client : N/A");
        }
        bien.afficherDetails();
        System.out.println("Type : "+type);
        System.out.println("Etat : "+etat);
    }
}
