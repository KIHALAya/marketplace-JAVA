package main.java.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.java.Model.Metier.Produit;

public class ProduitFormController {
    @FXML private Tab productTab; // Tab pour afficher le nom du produit
    @FXML private TextField nameField; // Champ pour le nom du produit
    @FXML private TextField priceField; // Champ pour le prix du produit
    @FXML private TextField descriptionField; // Champ pour la description du produit
    @FXML private ImageView productImageView; // Image du produit
    @FXML private Spinner<Integer> quantitySpinner; // Spinner pour la quantité
    @FXML private MenuButton typeMenuButton; // Menu pour choisir le type
    @FXML private Button addToCartButton; // Bouton pour ajouter au panier

    private Produit produit; // Produit sélectionné

    // Méthode pour initialiser les données du produit
    public void initializeProduct(Produit produit) {
        this.produit = produit;

        // Mettre à jour l'interface avec les données du produit
        productTab.setText(produit.getName()); // Nom du produit dans l'onglet
        nameField.setText(produit.getName());
        priceField.setText(String.format("%.2f €", produit.getPrice()));
        descriptionField.setText(produit.getDescription());

        // Charger l'image du produit (si disponible)
        if (produit.getImagePath() != null) {
            Image image = new Image(produit.getImagePath());
            productImageView.setImage(image);
        }

        // Configurer le Spinner pour la quantité
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);
        quantitySpinner.setValueFactory(valueFactory);

        // Configurer le bouton "Ajouter au panier"
        addToCartButton.setOnAction(event -> addToCart());
    }

    // Méthode pour ajouter le produit au panier
    private void addToCart() {
        int quantity = quantitySpinner.getValue();
        String selectedType = typeMenuButton.getText();

        // Logique pour ajouter le produit au panier
        System.out.println("Produit ajouté au panier : " + produit.getName());
        System.out.println("Quantité : " + quantity);
        System.out.println("Type : " + selectedType);
    }
}