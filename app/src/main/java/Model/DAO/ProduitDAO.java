package Model.DAO;

import Model.Metier.Produit;
import java.util.List;

public interface ProduitDAO {
    void addProduct(Produit product);
    void updateProduct(Produit product);
    void deleteProduct(int id);
    Produit getProductById(int id);
    List<Produit> getAllProducts();
}