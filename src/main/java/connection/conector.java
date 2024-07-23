package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conector {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "4eZt@wR7yXu#2iS";
    private static final String URL = "jdbc:mysql://localhost:3306/db_lotos_report?autoReconnect=true&useSSL=false";

    private Connection conn;

    public conector() {
        conn = null;
    }

    public Connection getConnection() {
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al conectar con la base de datos", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return conn;
    }

    public void desconectar() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al cerrar la conexion con la base de datos", JOptionPane.ERROR_MESSAGE);
        }
    }
}
