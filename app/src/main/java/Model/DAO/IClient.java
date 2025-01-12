package main.java.Model.DAO;

import main.java.Model.Metier.Client;

import java.sql.SQLException;

public interface IClient {
    void creeCompte(Client C) throws SQLException;
    void seConnecter();
    void ajouterAuPanier();
    void retirerDuPanier();
    void passerUneCommande();
    void annulerUneCommande();
    void voirPanier();

}
