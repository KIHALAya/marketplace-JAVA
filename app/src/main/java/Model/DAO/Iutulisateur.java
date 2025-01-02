package main.java.org.example.dao;

import main.java.org.example.metier.Utilisateur;

import java.sql.SQLException;

public interface Iutulisateur {
    void creeCompte(Utilisateur u) throws SQLException;
    void supprimerMonCompte();
    void modifierMonCompte();
    void seConnecter();
}
