package main.java.Model.Metier;

import java.util.ArrayList;

public class Client {
    // Attributes
    private int ID;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private String tele;
    private Panier panier;
    private ArrayList<Commande> Commandes;
    private String AdresseLivraison;

    // Constructor with parameters
    public Client(int ID, String nom, String prenom, String email, String motDePasse, String tele, Panier panier, ArrayList<Commande> Commandes, String AdresseLivraison) {
        this.ID = ID;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.tele = tele;
        this.panier = panier;
        this.Commandes = Commandes != null ? Commandes : new ArrayList<>();
        this.AdresseLivraison = AdresseLivraison;
    }

    // Default constructor
    public Client() {
        this.ID = 0;
        this.nom = "";
        this.prenom = "";
        this.email = "";
        this.motDePasse = "";
        this.tele = "";
        this.panier = new Panier(); // Assuming Panier has a default constructor
        this.Commandes = new ArrayList<>();
        this.AdresseLivraison = "";
    }

    // Getters and Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

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

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public Panier getPanier() {
        return panier;
    }

    public void setPanier(Panier panier) {
        this.panier = panier;
    }

    public ArrayList<Commande> getCommandes() {
        return Commandes;
    }

    public void setCommandes(ArrayList<Commande> Commandes) {
        this.Commandes = Commandes;
    }

    public String getAdresseLivraison() {
        return AdresseLivraison;
    }

    public void setAdresseLivraison(String AdresseLivraison) {
        this.AdresseLivraison = AdresseLivraison;
    }

    // toString method
    @Override
    public String toString() {
        return "Client{" +
                "ID=" + ID +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", tele='" + tele + '\'' +
                ", panier=" + panier +
                ", Commandes=" + Commandes +
                ", AdresseLivraison='" + AdresseLivraison + '\'' +
                '}';
    }
}