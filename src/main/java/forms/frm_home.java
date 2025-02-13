
package forms;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class frm_home extends javax.swing.JFrame {


    public frm_home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bt_home = new javax.swing.JButton();
        bt_register = new javax.swing.JButton();
        bt_state = new javax.swing.JButton();
        bt_reportgn = new javax.swing.JButton();
        bt_reportsp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bt_logout = new javax.swing.JButton();
        contenedor = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lotos");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 236, 236));

        bt_home.setBackground(new java.awt.Color(250, 178, 192));
        bt_home.setFont(new java.awt.Font("Artifakt Element", 1, 14)); // NOI18N
        bt_home.setForeground(new java.awt.Color(0, 0, 0));
        bt_home.setText("Home");
        bt_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_homeActionPerformed(evt);
            }
        });

        bt_register.setBackground(new java.awt.Color(250, 178, 192));
        bt_register.setFont(new java.awt.Font("Artifakt Element", 1, 14)); // NOI18N
        bt_register.setForeground(new java.awt.Color(0, 0, 0));
        bt_register.setText("Registrar Empleado");
        bt_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registerActionPerformed(evt);
            }
        });

        bt_state.setBackground(new java.awt.Color(250, 178, 192));
        bt_state.setFont(new java.awt.Font("Artifakt Element", 1, 14)); // NOI18N
        bt_state.setForeground(new java.awt.Color(0, 0, 0));
        bt_state.setText("Estado del Empleado");
        bt_state.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_stateActionPerformed(evt);
            }
        });

        bt_reportgn.setBackground(new java.awt.Color(250, 178, 192));
        bt_reportgn.setFont(new java.awt.Font("Artifakt Element", 1, 14)); // NOI18N
        bt_reportgn.setForeground(new java.awt.Color(0, 0, 0));
        bt_reportgn.setText("Reportes Generales");
        bt_reportgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reportgnActionPerformed(evt);
            }
        });

        bt_reportsp.setBackground(new java.awt.Color(250, 178, 192));
        bt_reportsp.setFont(new java.awt.Font("Artifakt Element", 1, 14)); // NOI18N
        bt_reportsp.setForeground(new java.awt.Color(0, 0, 0));
        bt_reportsp.setText("Reportes Especificos");
        bt_reportsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reportspActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Freestyle Script", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lotos");

        bt_logout.setBackground(new java.awt.Color(250, 178, 192));
        bt_logout.setFont(new java.awt.Font("Artifakt Element", 1, 14)); // NOI18N
        bt_logout.setForeground(new java.awt.Color(0, 0, 0));
        bt_logout.setText("Cerrar la sesión");
        bt_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_reportsp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_reportgn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_state, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_register, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(bt_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt_home, bt_register, bt_reportgn, bt_reportsp, bt_state});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(bt_home, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bt_register, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bt_state, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bt_reportgn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bt_reportsp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(bt_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt_home, bt_register, bt_reportgn, bt_reportsp, bt_state});

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, -1, -1));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel2.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 1000, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_homeActionPerformed
        Component[] componentes = contenedor.getComponents();

        for (Component componente : componentes) {
            if (componente instanceof JFrame) {
                JFrame frame = (JFrame) componente;
                frame.dispose(); // Cerrar la ventana/frame
                contenedor.remove(frame); // Remover del contenedor
            } else if (componente instanceof JPanel) {
                JPanel panel = (JPanel) componente;
                contenedor.remove(panel); // Remover del contenedor
            }
        }

        contenedor.revalidate(); // Actualizar el contenedor
        contenedor.repaint(); // Repintar el contenedor
    }//GEN-LAST:event_bt_homeActionPerformed

    private void bt_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registerActionPerformed
        frm_register f = new frm_register();
        contenedor.add(f);
        f.show();
    }//GEN-LAST:event_bt_registerActionPerformed

    private void bt_reportgnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reportgnActionPerformed
        frm_report_general f = new frm_report_general();
        contenedor.add(f);
        f.show();
    }//GEN-LAST:event_bt_reportgnActionPerformed

    private void bt_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_logoutActionPerformed
        frm_login loginForm = new frm_login();
        loginForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bt_logoutActionPerformed

    private void bt_reportspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reportspActionPerformed
        frm_report_specific f = new frm_report_specific();
        contenedor.add(f);
        f.show();
    }//GEN-LAST:event_bt_reportspActionPerformed

    private void bt_stateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_stateActionPerformed
        frm_state f = new frm_state();
        contenedor.add(f);
        f.show();
    }//GEN-LAST:event_bt_stateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_home;
    private javax.swing.JButton bt_logout;
    private javax.swing.JButton bt_register;
    private javax.swing.JButton bt_reportgn;
    private javax.swing.JButton bt_reportsp;
    private javax.swing.JButton bt_state;
    private javax.swing.JDesktopPane contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
