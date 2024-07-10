package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import connection.conector;

public class cls_login {

    private final conector CN;
    private Connection con;

    public cls_login() {
        CN = new conector();
        con = CN.getConnection();
    }

    public boolean verificarCredenciales(String usuario, String clave) {
        String consulta = "SELECT * FROM login WHERE username = ? AND password = ?";
        
        try (PreparedStatement pst = con.prepareStatement(consulta)) {
            pst.setString(1, usuario);
            pst.setString(2, clave); // Sin hash
            
            try (ResultSet rs = pst.executeQuery()) {
                return rs.next(); // Si encuentra un registro, las credenciales son válidas
            }
        } catch (SQLException ex) {
            System.err.println("Error al verificar las credenciales: " + ex.getMessage());
            return false;
        }
    }
}
