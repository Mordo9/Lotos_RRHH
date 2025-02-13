package clases;



/**public class cls_marketing {

    public static void main(String[] args) {
        int result = generateReportForDepartment("MARKETING"); // Cambia 'MARKETING' por 'RRHH' o 'VENTAS' según sea necesario
        // Salida del proceso con el código de estado correspondiente
        System.exit(result);
    }

    public static int generateReportForDepartment(String department) {
        ReportGenerator reportGenerator = new ReportGenerator();
        JasperPrint jasperPrint = null;

        // Llama al método adecuado según el departamento
        switch (department.toUpperCase()) {
            case "MARKETING":
                jasperPrint = reportGenerator.reporteMarketing(); // Asegúrate de tener este método en ReportGenerator
                break;
            case "RRHH":
                jasperPrint = reportGenerator.reporteRRHH(); // Asegúrate de tener este método en ReportGenerator
                break;
            case "VENTAS":
                jasperPrint = reportGenerator.reporteVentas(); // Asegúrate de tener este método en ReportGenerator
                break;
            default:
                System.err.println("Departamento no válido: " + department);
                return 1; // Código de error
        }

        if (jasperPrint != null) {
            try {
                // Genera un nombre de archivo único basado en el timestamp actual
                String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
                String outputFilePath = "pdf/test_report_" + department + "_" + timestamp + ".pdf";
                File outputFile = new File(outputFilePath);

                // Asegúrate de que el directorio exista
                File parentDir = outputFile.getParentFile();
                if (!parentDir.exists() && !parentDir.mkdirs()) {
                    System.err.println("No se pudo crear el directorio: " + parentDir.getAbsolutePath());
                    return 1; // Código de error
                }

                // Exportar el informe a PDF
                JasperExportManager.exportReportToPdfFile(jasperPrint, outputFilePath);
                System.out.println("Reporte generado con éxito en: " + outputFilePath);
                return 0; // Código de éxito
            } catch (JRException e) {
                System.err.println("Error al exportar el informe a PDF: " + e.getMessage());
                return 1; // Código de error
            } catch (Exception e) {
                System.err.println("Error inesperado: " + e.getMessage());
                return 1; // Código de error
            }
        } else {
            System.err.println("No se pudo generar el informe.");
            return 1; // Código de error
        }
    }
}
