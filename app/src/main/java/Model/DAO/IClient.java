package Model.DAO;

public interface IClient {
    void ajouterAuPanier();
    void retirerDuPanier();
    void passerUneCommande();
    void annulerUneCommande();
    void voirPanier();

}
