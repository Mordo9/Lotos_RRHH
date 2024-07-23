package clases;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import connection.conector;
import java.sql.Connection;

public class ReportGenerator {

    private static final Logger logger = Logger.getLogger(ReportGenerator.class.getName());

    /**
     * Genera un informe de productos y lo devuelve como un objeto JasperPrint.
     * 
     * @return JasperPrint objeto con el informe generado, o null si ocurre un error.
     */
    public JasperPrint reporteTodoProducto() {
        Connection cone = null;
        InputStream is = null;
        try {
            cone = getConexion();
            // Cargar el archivo .jasper desde el classpath
            is = getClass().getClassLoader().getResourceAsStream("Reportes/ReportState.jasper");
            if (is == null) {
                logger.severe("Archivo .jasper no encontrado en el classpath.");
                return null;
            }

            // Cargar el reporte Jasper
            JasperReport jr = (JasperReport) JRLoader.loadObject(is);

            // Parámetros del informe (si los hay)
            Map<String, Object> parameters = new HashMap<>();

            // Generar el informe
            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, cone);
            return jp;
        } catch (JRException e) {
            logger.severe("Error al generar el informe: " + e.getMessage());
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            logger.severe("Error inesperado: " + e.getMessage());
            e.printStackTrace();
            return null;
        } finally {
            // Cerrar la conexión y el InputStream
            closeQuietly(cone);
            closeQuietly(is);
        }
    }

    /**
     * Obtiene una conexión a la base de datos.
     * 
     * @return Connection objeto de conexión a la base de datos.
     */
    private Connection getConexion() {
        conector dbConector = new conector();
        return dbConector.getConnection();
    }

    /**
     * Cierra un recurso de manera silenciosa, ignorando cualquier excepción.
     * 
     * @param resource el recurso a cerrar.
     */
    private void closeQuietly(AutoCloseable resource) {
        if (resource != null) {
            try {
                resource.close();
            } catch (Exception e) {
                logger.warning("Error al cerrar el recurso: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
