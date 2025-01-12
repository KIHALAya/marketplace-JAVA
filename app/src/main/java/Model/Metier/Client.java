package main.java.Model.Metier;


import java.util.ArrayList;

public class Client extends Utilisateur{
    private Panier panier ;
    private ArrayList<Commande> Commandes ;
    private String AdresseLivraison ;




    public Client(int ID, String nom,String prenom,String email,String motDePasse,String tele,Panier panier,ArrayList<Commande> Commandes,String AdresseLivraison){
        super(ID ,nom,prenom,email,motDePasse,tele);
        this,panier=panier;
        this.Commandes=new ArrayList<>();
        this.AdresseLivraison=AdresseLivraison;

    }
    public Client(){
        super();
        this,panier=panier;
        this.Commandes=new ArrayList<>();
        this.AdresseLivraison=AdresseLivraison;
    }

    @Override
    public String toString() {
        return "Client{" +
                "panier=" + panier +
                ", Commandes=" + Commandes +
                ", AdresseLivraison='" + AdresseLivraison + '\'' +
                '}';
    }

    public String getAdresseLivraison() {
        return AdresseLivraison;
    }

    public void setAdresseLivraison(String adresseLivraison) {
        AdresseLivraison = adresseLivraison;
    }

    public ArrayList<Commande> getCommandes() {
        return Commandes;
    }

    public void setCommandes(ArrayList<Commande> commandes) {
        Commandes = commandes;
    }

    public Panier getPanier() {
        return panier;
    }

    public void setPanier(Panier panier) {
        this.panier = panier;
    }
}
