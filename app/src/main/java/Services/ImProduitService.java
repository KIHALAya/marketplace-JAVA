package Services;
import Model.Metier.Produit;
import Model.DAO.ProduitDAO;
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
