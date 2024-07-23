package forms;

import clases.ReportGenerator2;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class frm_report_general extends javax.swing.JInternalFrame {

    public frm_report_general() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cb_departamento = new javax.swing.JComboBox<>();
        bt_generar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Reportes Generales");

        cb_departamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UN DEPARTAMENTO", "RRHH", "MARKETING", "VENTAS" }));
        cb_departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_departamentoActionPerformed(evt);
            }
        });

        bt_generar.setText("Generar");
        bt_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_generarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 941, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jDesktopPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(bt_generar)))
                .addGap(0, 349, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(cb_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cb_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_generar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_departamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_departamentoActionPerformed

    private void bt_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_generarActionPerformed
        // Obtener el departamento seleccionado
        String selectedDepartment = cb_departamento.getSelectedItem().toString().toUpperCase();

        // Crear una instancia de ReportGenerator2
        ReportGenerator2 reportGenerator2 = new ReportGenerator2();

        JasperPrint jasperPrint = null;

        try {
            // Seleccionar el archivo .jasper basado en el departamento seleccionado
            String jasperFileName = null;
            switch (selectedDepartment) {
                case "RRHH":
                    jasperFileName = "ReportGeneralRRHH.jasper";
                    break;
                case "MARKETING":
                    jasperFileName = "ReportGeneralMARKETING.jasper";
                    break;
                case "VENTAS":
                    jasperFileName = "ReportGeneralVENTAS.jasper";
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Departamento no reconocido.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
            }

            // Generar el reporte
            jasperPrint = reportGenerator2.generateReport(jasperFileName);

            // Si el informe se generó correctamente, exportarlo a PDF
            if (jasperPrint != null) {
                String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
                String outputFilePath = "pdf/" + selectedDepartment.toLowerCase() + "_report_" + timestamp + ".pdf";
                File outputFile = new File(outputFilePath);

                // Asegúrate de que el directorio exista
                File parentDir = outputFile.getParentFile();
                if (!parentDir.exists() && !parentDir.mkdirs()) {
                    JOptionPane.showMessageDialog(this, "No se pudo crear el directorio para el reporte.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Exportar el informe a PDF
                int result = reportGenerator2.exportToPdf(jasperPrint, outputFilePath);
                if (result == 0) {
                    JOptionPane.showMessageDialog(this, "Reporte generado con éxito en: " + outputFilePath, "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al exportar el informe a PDF.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo generar el informe.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al generar el informe: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt_generarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_generar;
    private javax.swing.JComboBox<String> cb_departamento;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
