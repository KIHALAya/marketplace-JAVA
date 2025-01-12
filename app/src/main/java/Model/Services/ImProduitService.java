package main.java.Model.Services;
import main.java.Model.Metier.Produit;
import main.java.Model.DAO.ProduitDAO;
import java.util.List;

public abstract class ImProduitService implements ProduitService {
    private ProduitDAO produitDAO;

    public ImProduitService(ProduitDAO productDAO) {
        this.produitDAO = productDAO;
    }

    @Override
    public void addProduct(Produit product) {
        // Validate product and call DAO
        produitDAO.addProduct(product);
    }

    @Override
    public List<Produit> getAllProducts() {
        return produitDAO.getAllProducts();
    }

    // Other methods (update, delete, getById)
}
