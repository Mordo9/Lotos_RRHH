package clases;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import connection.conector;

public class ReportGenerator2 {

    private static final Logger logger = Logger.getLogger(ReportGenerator2.class.getName());

    /**
     * Genera un informe basado en el archivo .jasper proporcionado y lo devuelve como un objeto JasperPrint.
     * 
     * @param jasperFileName el nombre del archivo .jasper
     * @return JasperPrint objeto con el informe generado, o null si ocurre un error.
     */
    public JasperPrint generateReport(String jasperFileName) {
        Connection cone = null;
        InputStream is = null;
        try {
            cone = getConexion();
            // Cargar el archivo .jasper desde el classpath
            is = getClass().getClassLoader().getResourceAsStream("Reportes/" + jasperFileName);
            if (is == null) {
                logger.severe("Archivo .jasper no encontrado en el classpath: " + jasperFileName);
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
     * Exporta un JasperPrint a un archivo PDF.
     * 
     * @param jasperPrint el objeto JasperPrint a exportar
     * @param outputFilePath la ruta del archivo PDF de salida
     * @return int código de estado, 0 si éxito, 1 si error
     */
    public int exportToPdf(JasperPrint jasperPrint, String outputFilePath) {
        try {
            JasperExportManager.exportReportToPdfFile(jasperPrint, outputFilePath);
            return 0; // Código de éxito
        } catch (JRException e) {
            logger.severe("Error al exportar el informe a PDF: " + e.getMessage());
            e.printStackTrace();
            return 1; // Código de error
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
