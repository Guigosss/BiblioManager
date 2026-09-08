package src.biblio.dao;

import src.biblio.db.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class EmpruntDAO {

    public void enregistrer(int livreId, int utilisateurId, LocalDateTime dateEmprunt){
        String sql = "INSERT INTO emprunt (livre_id, utilisateur_id, date_emprunt) VALUES (?,?,?)";

        try (Connection connection = Database.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1, livreId);
            preparedStatement.setInt(2, utilisateurId);
            preparedStatement.setString(3, dateEmprunt.toString());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void cloturer(){}
}
