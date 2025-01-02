package Model.DAO;

import Model.Metier.Utilisateur;

import java.sql.*;

public class implUtulisateur implements Iutulisateur{
    private String dbUrl="jdbc:mysql://localhost:3306/Utilisateur";
    private String dbUser="root";
    private String password="";
    private String dbDriver="com.mysql.jdbc.Driver";
    private Connection connection;
    private PreparedStatement ps ;
    private ResultSet rs;

    public implUtulisateur() throws ClassNotFoundException, SQLException {
        Class.forName(dbDriver);
        connection= DriverManager.getConnection(dbUrl,dbUser,password);
        System.out.println("Connection established");

    }




    @Override
    public void creeCompte(Utilisateur u) throws SQLException {
        ps=connection.prepareStatement("Insert into Utulisateur (nom,prenom,email,motDePasse,tele) values (?,?.?.?.?)");
        ps.setString(1,u.getNom());
        ps.setString(2,u.getPrenom());
        ps.setString(3,u.getEmail());
        ps.setString(4,u.getMotDePasse());
        ps.setString(5,u.getTele());
        ps.executeUpdate();
        ps.close();





    }

    @Override
    public void supprimerMonCompte() {

    }

    @Override
    public void modifierMonCompte() {

    }

    @Override
    public void seConnecter() {

    }
}
