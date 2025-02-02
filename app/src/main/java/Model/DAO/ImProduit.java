package main.java.Model.DAO;

import main.java.Model.Metier.Produit;
import main.java.Model.Metier.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class ImProduit implements ProduitDAO {
    private Connection connection;

    public ImProduit(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addProduct(Produit product) {
        String sql = "INSERT INTO products (name, description, price, stock, category) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, product.getName());
            stmt.setString(2, product.getDescription());
            stmt.setDouble(3, product.getPrice());
            stmt.setInt(4, product.getStock());
            stmt.setString(5, product.getCategory().name()); // Convertir enum en string
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Produit> getAllProducts() {
        List<Produit> products = new ArrayList<>();
        String sql = "SELECT * FROM products";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Produit product = new Produit();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setPrice(rs.getDouble("price"));
                product.setStock(rs.getInt("stock"));
                product.setCategory(Category.valueOf(rs.getString("category"))); // Convertir string en enum
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public void deleteProduct(int id) {
        String sql = "DELETE FROM products WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id); // Définir l'ID du produit à supprimer
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Produit supprimé avec succès !");
            } else {
                System.out.println("Aucun produit trouvé avec l'ID : " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Produit getProductById(int id) {
        String sql = "SELECT * FROM products WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id); // Définir l'ID du produit à récupérer
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Produit product = new Produit();
                    product.setId(rs.getInt("id"));
                    product.setName(rs.getString("name"));
                    product.setDescription(rs.getString("description"));
                    product.setPrice(rs.getDouble("price"));
                    product.setStock(rs.getInt("stock"));
                    product.setCategory(Category.valueOf(rs.getString("category"))); // Convertir string en enum
                    return product;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Retourne null si aucun produit n'est trouvé
    }
}