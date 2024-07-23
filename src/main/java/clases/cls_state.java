package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import connection.conector;

public class cls_state {

    private final conector CN;
    private Connection con;

    public cls_state() {
        CN = new conector();
        con = CN.getConnection();
    }

    public List<String[]> listarEmpleados() {
        List<String[]> listaEmpleados = new ArrayList<>();

        // Actualizar la consulta para usar el nuevo nombre de columna
        String consulta = "SELECT datos_generales.nombre_completo, datos_generales.direccion, "
                        + "datos_generales.correo_electronico, datos_laborales.departamento, "
                        + "datos_laborales.estado_actividad FROM datos_generales "
                        + "INNER JOIN datos_laborales ON datos_generales.id_empleado = datos_laborales.id_empleado";
        
        try (PreparedStatement pst = con.prepareStatement(consulta);
             ResultSet rs = pst.executeQuery()) {
            
            while (rs.next()) {
                String nombreCompleto = rs.getString("nombre_completo");
                String direccion = rs.getString("direccion");
                String correoElectronico = rs.getString("correo_electronico");
                String departamento = rs.getString("departamento");
                String estadoActividad = rs.getString("estado_actividad"); // Cambiado aquí
                
                String[] empleado = {nombreCompleto, direccion, correoElectronico, departamento, estadoActividad};
                listaEmpleados.add(empleado);
            }
            
        } catch (SQLException ex) {
            System.err.println("Error al listar empleados: " + ex.getMessage());
        }
        
        return listaEmpleados;
    }
}
