package main.java.Controller;

import main.java.Model.Metier.Produit;
import main.java.Model.Services.ImProduitService;
import main.java.Model.Services.ProduitService;


import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.util.List;

public class ProduitController {
    @FXML private TableView<Produit> productTable;
    @FXML private TextField searchField;

    private ProduitService produitService;

    public void setProductService(ProduitService productService) {
        this.produitService = productService;
        loadProducts();
    }

    private void loadProducts() {
        List<Produit> products = produitService.getAllProducts();
        productTable.getItems().setAll(products);
    }

    @FXML
    private void handleSearch() {
        String query = searchField.getText();
        // Implement search logic
    }

    @FXML
    private void handleAddProduct() {
        // Open a form to add a new product
    }
}
