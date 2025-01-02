package Model.DAO;

import Model.Metier.Utilisateur;

import java.sql.SQLException;

public interface Iutulisateur {
    void creeCompte(Utilisateur u) throws SQLException;
    void supprimerMonCompte();
    void modifierMonCompte();
    void seConnecter();
}
