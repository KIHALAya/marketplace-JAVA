package main.java.Model.DAO;

import main.java.Model.DAO.IClient;
import main.java.Model.Metier.Client;
import java.sql.*;

public class ImplClient implements IClient {
    private String dbUrl="jdbc:mysql://localhost:3306/Utilisateur";
    private String dbUser="root";
    private String password="";
    private String dbDriver="com.mysql.jdbc.Driver";
    private Connection connection;
    private PreparedStatement ps ;
    private ResultSet rs;

    public ImplClient() throws ClassNotFoundException, SQLException {
        Class.forName(dbDriver);
        connection= DriverManager.getConnection(dbUrl,dbUser,password);
        System.out.println("Connection established");

    }

    @Override
    public void ajouterAuPanier() {

    }

    @Override
    public void retirerDuPanier() {

    }

    @Override
    public void passerUneCommande() {

    }

    @Override
    public void annulerUneCommande() {

    }

    @Override
    public void voirPanier() {

    }

    @Override
    public void creeCompte(Client c) throws SQLException {
        ps=connection.prepareStatement("Insert into Utulisateur (nom,prenom,email,motDePasse,tele) values (?,?.?.?.?)");
        ps.setString(1,c.getNom());
        ps.setString(2,c.getPrenom());
        ps.setString(3,c.getEmail());
        ps.setString(4,c.getMotDePasse());
        ps.setString(5,c.getTele());
        ps.executeUpdate();
        ps.close();

    }

    @Override
    public void seConnecter() {

    }
}
