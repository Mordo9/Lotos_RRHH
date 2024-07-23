package forms;

import clases.cls_register;
import javax.swing.JTextField;

public class frm_register extends javax.swing.JInternalFrame {

    private cls_register registerDAO;

    public frm_register() {
        initComponents();
        setResizable(false);
        registerDAO = new cls_register();
    }

    private void limpiarCampos() {
        txt_fullname.setText("");
        txt_address.setText("");
        txt_mail.setText("");
        txt_identifier.setText("");
        txt_phone.setText("");
        ((JTextField) jdc_fecha.getDateEditor().getUiComponent()).setText("");
        jc_departamento.setSelectedIndex(0); // Asume que el índice 0 es la opción por defecto
        jc_estd_actividad.setSelectedIndex(0); // Asume que el índice 0 es la opción por defecto
        txt_puestotrabajo.setText("");
        ((JTextField) jdc_fecha_contract.getDateEditor().getUiComponent()).setText("");
        jc_horario_trb.setSelectedIndex(0); // Asume que el índice 0 es la opción por defecto
        txt_fullname_emrg.setText("");
        txt_phone_emrg.setText("");
        txt_parentesco_emrg.setText("");
        txt_mail_emrg.setText("");
        txt_fechas_lic_aus.setText("");
        txt_fechas_prom.setText("");
        txt_recon_sanci.setText("");
        txt_evaluacion.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_fullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_identifier = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        jdc_fecha = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_fullname_emrg = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_phone_emrg = new javax.swing.JTextField();
        txt_parentesco_emrg = new javax.swing.JTextField();
        txt_mail_emrg = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txt_idemploye = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_puestotrabajo = new javax.swing.JTextField();
        jdc_fecha_contract = new com.toedter.calendar.JDateChooser();
        jc_estd_actividad = new javax.swing.JComboBox<>();
        jc_departamento = new javax.swing.JComboBox<>();
        jc_horario_trb = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        txt_fechas_lic_aus = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txt_fechas_prom = new javax.swing.JTextField();
        txt_recon_sanci = new javax.swing.JTextField();
        txt_evaluacion = new javax.swing.JTextField();
        bt_registrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1000, 720));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel1.setText("Registro Empleados");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 19, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(231, 231, 219));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Datos Generales del Emleado");

        txt_fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fullnameActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre completo:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dirección:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Correo electrónico:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha de nacimiento:");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Número de teléfono:");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Número de identificación:");

        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });

        txt_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mailActionPerformed(evt);
            }
        });

        txt_identifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_identifierActionPerformed(evt);
            }
        });

        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(762, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_address, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                                    .addComponent(txt_fullname)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_phone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdc_fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_identifier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jdc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txt_identifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 20, 920, -1));

        jPanel3.setBackground(new java.awt.Color(231, 231, 219));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Contactos de Emergencia");

        txt_fullname_emrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fullname_emrgActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre completo del contacto:");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Número de Teléfono:");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Correo Electrónico:");

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Parentesco con el empleado:");

        txt_phone_emrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phone_emrgActionPerformed(evt);
            }
        });

        txt_parentesco_emrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_parentesco_emrgActionPerformed(evt);
            }
        });

        txt_mail_emrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mail_emrgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel11)
                                .addGap(65, 65, 65))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_fullname_emrg, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(txt_phone_emrg))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addComponent(txt_mail_emrg, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(txt_parentesco_emrg)))))
                .addGap(8, 32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_fullname_emrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_phone_emrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(txt_mail_emrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_parentesco_emrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 450, 920, -1));

        jPanel4.setBackground(new java.awt.Color(231, 231, 219));

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Información Laboral ");

        txt_idemploye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idemployeActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("ID de empleado:");

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Departamento:");

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Activo:");

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Horario de trabajo:");

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Fecha de contrato:");

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Puesto de trabajo:");

        txt_puestotrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_puestotrabajoActionPerformed(evt);
            }
        });

        jc_estd_actividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la actividad", "Activo", "Inactivo" }));
        jc_estd_actividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_estd_actividadActionPerformed(evt);
            }
        });

        jc_departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el departamento", "RRHH", "MARKETING", "VENTAS" }));
        jc_departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_departamentoActionPerformed(evt);
            }
        });

        jc_horario_trb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el horario", "Full-Time", "Part-Time", "Home office" }));
        jc_horario_trb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_horario_trbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addContainerGap(804, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jc_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jc_estd_actividad, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel20)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txt_idemploye, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel22))))
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdc_fecha_contract, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc_horario_trb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_puestotrabajo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_idemploye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txt_puestotrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdc_fecha_contract, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel21)
                        .addComponent(jc_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jc_estd_actividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jc_horario_trb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 223, 920, -1));

        jPanel5.setBackground(new java.awt.Color(231, 231, 219));

        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Historial Laboral");

        txt_fechas_lic_aus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechas_lic_ausActionPerformed(evt);
            }
        });

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Fechas de licencias o ausencias importantes");

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Fechas de promociones, cambios de puesto o departamento");

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Reconocimientos o sanciones");

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Evaluaciones de desempeño");

        txt_fechas_prom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechas_promActionPerformed(evt);
            }
        });

        txt_recon_sanci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_recon_sanciActionPerformed(evt);
            }
        });

        txt_evaluacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_evaluacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_evaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_recon_sanci, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fechas_prom, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel23))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel29)
                                .addComponent(jLabel26)
                                .addComponent(jLabel25)
                                .addComponent(jLabel24)
                                .addComponent(txt_fechas_lic_aus, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(21, 21, 21)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_fechas_lic_aus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_fechas_prom, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_recon_sanci, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_evaluacion, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 920, 650));

        jScrollPane1.setViewportView(jPanel1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 970, 503));

        bt_registrar.setText("Registrar");
        bt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrarActionPerformed(evt);
            }
        });
        jPanel6.add(bt_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 640, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fullnameActionPerformed

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void txt_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mailActionPerformed

    private void txt_identifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_identifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_identifierActionPerformed

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void txt_fullname_emrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fullname_emrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fullname_emrgActionPerformed

    private void txt_phone_emrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phone_emrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phone_emrgActionPerformed

    private void txt_parentesco_emrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_parentesco_emrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_parentesco_emrgActionPerformed

    private void txt_mail_emrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mail_emrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mail_emrgActionPerformed

    private void txt_idemployeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idemployeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idemployeActionPerformed

    private void txt_puestotrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_puestotrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_puestotrabajoActionPerformed

    private void txt_fechas_lic_ausActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechas_lic_ausActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechas_lic_ausActionPerformed

    private void txt_fechas_promActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechas_promActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechas_promActionPerformed

    private void txt_recon_sanciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_recon_sanciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_recon_sanciActionPerformed

    private void txt_evaluacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_evaluacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_evaluacionActionPerformed

    private void bt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarActionPerformed
        // Recoger datos de la interfaz
        String nombreCompleto = txt_fullname.getText();
        String direccion = txt_address.getText();
        String correoElectronico = txt_mail.getText();
        String numeroIdentificacion = txt_identifier.getText();
        String numeroTelefono = txt_phone.getText();
        java.util.Date fechaNacimientoUtil = jdc_fecha.getDate();
        java.sql.Date fechaNacimientoSQL = convertToSqlDate(fechaNacimientoUtil);
        String departamento = jc_departamento.getSelectedItem().toString();
        String estadoActividad = jc_estd_actividad.getSelectedItem().toString(); // Pasar como String
        String puestoTrabajo = txt_puestotrabajo.getText();
        java.util.Date fechaContratoUtil = jdc_fecha_contract.getDate();
        java.sql.Date fechaContratoSQL = convertToSqlDate(fechaContratoUtil);
        String horarioTrabajo = jc_horario_trb.getSelectedItem().toString();
        String nombreCompletoEmergencia = txt_fullname_emrg.getText();
        String numeroTelefonoEmergencia = txt_phone_emrg.getText();
        String parentescoEmergencia = txt_parentesco_emrg.getText();
        String correoElectronicoEmergencia = txt_mail_emrg.getText();
        String fechaAusenciasLicencias = txt_fechas_lic_aus.getText();
        String fechasPromociones = txt_fechas_prom.getText();
        String reconocimientosSanciones = txt_recon_sanci.getText();
        String evaluacionDesempeno = txt_evaluacion.getText();

        // Crear instancia de cls_register y llamar al método registrarEmpleado
        cls_register registerDAO = new cls_register();
        boolean registroExitoso = registerDAO.registrarEmpleado(
                nombreCompleto, direccion, correoElectronico, numeroIdentificacion, numeroTelefono,
                fechaNacimientoSQL != null ? fechaNacimientoSQL.toString() : null,
                departamento, estadoActividad, puestoTrabajo, // Pasar estadoActividad como String
                fechaContratoSQL != null ? fechaContratoSQL.toString() : null,
                horarioTrabajo, nombreCompletoEmergencia,
                numeroTelefonoEmergencia, parentescoEmergencia, correoElectronicoEmergencia,
                fechaAusenciasLicencias, fechasPromociones, reconocimientosSanciones, evaluacionDesempeno
        );

        // Limpiar los campos si el registro fue exitoso
        if (registroExitoso) {
            limpiarCampos();
        }
    }

    private java.sql.Date convertToSqlDate(java.util.Date utilDate) {
        return utilDate != null ? new java.sql.Date(utilDate.getTime()) : null;
    }//GEN-LAST:event_bt_registrarActionPerformed

    private void jc_departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_departamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jc_departamentoActionPerformed

    private void jc_horario_trbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_horario_trbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jc_horario_trbActionPerformed

    private void jc_estd_actividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_estd_actividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jc_estd_actividadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jc_departamento;
    private javax.swing.JComboBox<String> jc_estd_actividad;
    private javax.swing.JComboBox<String> jc_horario_trb;
    private com.toedter.calendar.JDateChooser jdc_fecha;
    private com.toedter.calendar.JDateChooser jdc_fecha_contract;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_evaluacion;
    private javax.swing.JTextField txt_fechas_lic_aus;
    private javax.swing.JTextField txt_fechas_prom;
    private javax.swing.JTextField txt_fullname;
    private javax.swing.JTextField txt_fullname_emrg;
    private javax.swing.JTextField txt_idemploye;
    private javax.swing.JTextField txt_identifier;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_mail_emrg;
    private javax.swing.JTextField txt_parentesco_emrg;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_phone_emrg;
    private javax.swing.JTextField txt_puestotrabajo;
    private javax.swing.JTextField txt_recon_sanci;
    // End of variables declaration//GEN-END:variables
}
