package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import connection.conector;
import java.sql.ResultSet;

public class cls_register {

    private final conector CN;
    private Connection con;

    private final String SQL_INSERT_EMPLEADO = "INSERT INTO datos_generales (nombre_completo, direccion, correo_electronico, "
            + "numero_identificacion, numero_telefono, fecha_nacimiento) VALUES (?, ?, ?, ?, ?, ?)";

    private final String SQL_INSERT_DATOS_LABORALES = "INSERT INTO datos_laborales (id_empleado, departamento, estado_actividad, "
            + "puesto_trabajo, fecha_contrato, horario_trabajo) VALUES (?, ?, ?, ?, ?, ?)";

    private final String SQL_INSERT_CONTACTO_EMERGENCIA = "INSERT INTO contactos_emergencia (id_empleado, nombre_completo, "
            + "numero_telefono, parentesco, correo_electronico) VALUES (?, ?, ?, ?, ?)";

    private final String SQL_INSERT_HISTORIAL_LABORAL = "INSERT INTO historial_laboral (id_empleado, "
            + "fecha_ausencias_licencias_importantes, fechas_prom_puest_depart, reconocimiento_sanciones, evaluacion_desempeño) "
            + "VALUES (?, ?, ?, ?, ?)";

    public cls_register() {
        CN = new conector();
        con = CN.getConnection();
    }

    public boolean registrarEmpleado(String nombreCompleto, String direccion, String correoElectronico,
            String numeroIdentificacion, String numeroTelefono, String fechaNacimiento, String departamento,
            String estadoActividad, String puestoTrabajo, String fechaContrato, String horarioTrabajo,
            String nombreCompletoEmergencia, String numeroTelefonoEmergencia, String parentescoEmergencia,
            String correoElectronicoEmergencia, String fechaAusenciasLicencias, String fechasPromociones,
            String reconocimientosSanciones, String evaluacionDesempeno) {

        try {
            // Verificar si los datos ya existen
            if (existeDato("datos_generales", "correo_electronico", correoElectronico)) {
                JOptionPane.showMessageDialog(null, "El correo electrónico ya está registrado.");
                return false;
            }
            if (existeDato("datos_generales", "numero_identificacion", numeroIdentificacion)) {
                JOptionPane.showMessageDialog(null, "El número de identificación ya está registrado.");
                return false;
            }
            if (existeDato("datos_generales", "numero_telefono", numeroTelefono)) {
                JOptionPane.showMessageDialog(null, "El número de teléfono ya está registrado.");
                return false;
            }
            if (existeDato("contactos_emergencia", "numero_telefono", numeroTelefonoEmergencia)) {
                JOptionPane.showMessageDialog(null, "El número de teléfono de emergencia ya está registrado.");
                return false;
            }
            if (existeDato("contactos_emergencia", "correo_electronico", correoElectronicoEmergencia)) {
                JOptionPane.showMessageDialog(null, "El correo electrónico de emergencia ya está registrado.");
                return false;
            }

            // Iniciar una transacción explícita
            con.setAutoCommit(false);

            // Registrar en datos_generales
            PreparedStatement psDatosGenerales = con.prepareStatement(SQL_INSERT_EMPLEADO);
            psDatosGenerales.setString(1, nombreCompleto);
            psDatosGenerales.setString(2, direccion);
            psDatosGenerales.setString(3, correoElectronico);
            psDatosGenerales.setString(4, numeroIdentificacion);
            psDatosGenerales.setString(5, numeroTelefono);
            psDatosGenerales.setString(6, fechaNacimiento);
            psDatosGenerales.executeUpdate();

            // Obtener el ID generado para datos_laborales y contactos_emergencia
            int idEmpleado = obtenerUltimoIDGenerado();

            // Registrar en datos_laborales
            PreparedStatement psDatosLaborales = con.prepareStatement(SQL_INSERT_DATOS_LABORALES);
            psDatosLaborales.setInt(1, idEmpleado);
            psDatosLaborales.setString(2, departamento);
            psDatosLaborales.setString(3, estadoActividad); // Ahora como String
            psDatosLaborales.setString(4, puestoTrabajo);
            psDatosLaborales.setString(5, fechaContrato);
            psDatosLaborales.setString(6, horarioTrabajo);
            psDatosLaborales.executeUpdate();

            // Registrar en contactos_emergencia
            PreparedStatement psContactoEmergencia = con.prepareStatement(SQL_INSERT_CONTACTO_EMERGENCIA);
            psContactoEmergencia.setInt(1, idEmpleado);
            psContactoEmergencia.setString(2, nombreCompletoEmergencia);
            psContactoEmergencia.setString(3, numeroTelefonoEmergencia);
            psContactoEmergencia.setString(4, parentescoEmergencia);
            psContactoEmergencia.setString(5, correoElectronicoEmergencia);
            psContactoEmergencia.executeUpdate();

            // Registrar en historial_laboral
            PreparedStatement psHistorialLaboral = con.prepareStatement(SQL_INSERT_HISTORIAL_LABORAL);
            psHistorialLaboral.setInt(1, idEmpleado);
            psHistorialLaboral.setString(2, fechaAusenciasLicencias);
            psHistorialLaboral.setString(3, fechasPromociones);
            psHistorialLaboral.setString(4, reconocimientosSanciones);
            psHistorialLaboral.setString(5, evaluacionDesempeno);
            psHistorialLaboral.executeUpdate();

            // Confirmar la transacción
            con.commit();
            con.setAutoCommit(true); // Restaurar el modo de auto-commit

            JOptionPane.showMessageDialog(null, "Empleado registrado con éxito.");
            return true;

        } catch (SQLException e) {
            // Manejo de errores: deshacer la transacción
            try {
                con.rollback();
            } catch (SQLException ex) {
                System.err.println("Error al hacer rollback: " + ex.getMessage());
            }
            JOptionPane.showMessageDialog(null, "Error al registrar empleado.");
            System.err.println("Error al registrar empleado: " + e.getMessage());
            return false;

        } finally {
            // Cerrar recursos
            try {
                if (con != null) {
                    con.setAutoCommit(true); // Restaurar el modo de auto-commit por si acaso
                }
                CN.desconectar();
            } catch (SQLException ex) {
                System.err.println("Error al cerrar la conexión: " + ex.getMessage());
            }
        }
    }

    private boolean existeDato(String tabla, String columna, String valor) {
        String sql = "SELECT COUNT(*) FROM " + tabla + " WHERE " + columna + " = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, valor);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al verificar existencia de dato: " + e.getMessage());
        }
        return false;
    }

    private int obtenerUltimoIDGenerado() throws SQLException {
        String sql = "SELECT LAST_INSERT_ID() AS last_id";
        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("last_id");
            }
        }
        throw new SQLException("No se pudo obtener el último ID generado.");
    }
}
