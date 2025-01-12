package main.java.Model.Metier;

import java.util.ArrayList;
import java.util.List;

public class Vendeur extends Utilisateur{
    private ArrayList<Produit> Produits ;
    private ArrayList<Commande> CommandesRecu;
    private List<String> TypeProduit;
    private List<String> avisClients;

    public ArrayList<Commande> getCommandesRecu() {
        return CommandesRecu;
    }

    @Override
    public String toString() {
        return "Vendeur{" +
                "Produits=" + Produits +
                ", CommandesRecu=" + CommandesRecu +
                ", TypeProduit=" + TypeProduit +
                ", avisClients=" + avisClients +
                '}';
    }

    public List<String> getAvisClients() {
        return avisClients;
    }

    public void setAvisClients(List<String> avisClients) {
        this.avisClients = avisClients;
    }

    public ArrayList<String> getTypeProduit() {
        return TypeProduit;
    }

    public void setTypeProduit(ArrayList<String> typeProduit) {
        TypeProduit = typeProduit;
    }

    public void setCommandesRecu(ArrayList<Commande> commandesRecu) {
       this.CommandesRecu =CommandesRecu;
    }

    public ArrayList<Produit> getProduits() {
        return Produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        Produits = produits;
    }

    public Vendeur(int ID, String nom, String prenom, String eamail, String motDepasse, String tele, ArrayList<Produit> produits, ArrayList<Commande> CommandesRecu,List<String> TypeProduit,List<String> avisClients) {
        super(ID, nom, prenom, eamail, motDepasse, tele);
        this.Produits = new ArrayList<>();
        this.CommandesRecu = new ArrayList<>();
        this.TypeProduit = new ArrayList<>();
        this.avisClients = new ArrayList<>();
    }

    public void setTypeProduit(List<String> typeProduit) {
        TypeProduit = typeProduit;
    }
}
