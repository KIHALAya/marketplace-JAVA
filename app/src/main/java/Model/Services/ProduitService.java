package main.java.Model.Services;
import main.java.Model.Metier.Produit;
import java.util.List;

public interface ProduitService {
    void addProduct(Produit product);
    void updateProduct(Produit product);
    void deleteProduct(int id);
    Produit getProductById(int id);
    List<Produit> getAllProducts();
}