package Vista;

import BusinessObject.Cliente;
import BusinessObject.ClienteTelefono;
import DataAccessObject.ClienteDAO;
import DataAccessObject.ClienteTelefonoDAO;
import Persistencia.Conexion;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTextField;

public class AñadirCliente extends javax.swing.JFrame {

    public AñadirCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTabla = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        tfdDNI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfdNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfdApellido = new javax.swing.JTextField();
        tfdTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        snrEdad = new javax.swing.JSpinner();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jlVerificar = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaTelefonos = new javax.swing.JTable();
        jLNombre = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        tfdBuscarDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBuscaDNI = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        tfdNuevoTelefono = new javax.swing.JTextField();
        btnNuevoTelefono = new javax.swing.JToggleButton();
        jlVerficar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tabla Registro"));

        JTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI", "NOMBRE", "TELEFONO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTabla);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Añadir Cliente"));

        tfdDNI.setEnabled(false);
        tfdDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdDNIActionPerformed(evt);
            }
        });
        tfdDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdDNIKeyTyped(evt);
            }
        });

        jLabel1.setText("DNI");

        tfdNombre.setEnabled(false);

        jLabel2.setText("Nombre ");

        jLabel3.setText("Apellido");

        tfdApellido.setEnabled(false);
        tfdApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdApellidoActionPerformed(evt);
            }
        });

        tfdTelefono.setEnabled(false);
        tfdTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdTelefonoKeyTyped(evt);
            }
        });

        jLabel5.setText("Telefono");

        jLabel4.setText("Edad");

        snrEdad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        snrEdad.setEnabled(false);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jlVerificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlVerificar.setText("------------");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlVerificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(11, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(snrEdad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfdNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdTelefono, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(36, Short.MAX_VALUE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfdDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tfdNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(snrEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(tfdTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlVerificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Visualizar Registro Completo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrar", jPanel3);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Generales"));

        jLabel7.setText("Nombre:");

        jLabel8.setText("Apellido:");

        jLabel9.setText("Telefono(s):");

        TablaTelefonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaTelefonos);

        jLNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tfdBuscarDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdBuscarDniActionPerformed(evt);
            }
        });
        tfdBuscarDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdBuscarDniKeyTyped(evt);
            }
        });

        jLabel6.setText("Buscar cliente por DNI:");

        btnBuscaDNI.setText("Buscar");
        btnBuscaDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaDNIActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Añadir Telefono"));

        jLabel13.setText("Nuevo Telefono: ");

        tfdNuevoTelefono.setEnabled(false);
        tfdNuevoTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdNuevoTelefonoKeyTyped(evt);
            }
        });

        btnNuevoTelefono.setText("+");
        btnNuevoTelefono.setEnabled(false);
        btnNuevoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTelefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfdNuevoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfdNuevoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoTelefono))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jlVerficar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlVerficar2.setText("VERIFICAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tfdBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscaDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jlVerficar2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscaDNI))
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlVerficar2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Añadir Telefono", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DefaultTableModel dtm0 = null;
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {
            dtm0 = (DefaultTableModel) JTabla.getModel();

            
                ClienteTelefono clienteT = new ClienteTelefono();
                Cliente cliente = new Cliente();
                //Obtener datos 

                cliente.setDni(Integer.parseInt(tfdDNI.getText().trim()));
                cliente.setNombre(tfdNombre.getText().trim());
                cliente.setApellido(tfdApellido.getText().trim());
                cliente.setEdad(Integer.parseInt(snrEdad.getValue().toString()));
                clienteT.setTelefono(Integer.parseInt(tfdTelefono.getText().trim()));
                boolean dniExiste = false;
                for (int i = 0; i < dtm0.getRowCount(); i++) {
                    if (dtm0.getValueAt(i, 0).equals(tfdDNI.getText().trim())) {
                        dniExiste = true;
                        break;
                    }
                }
                if (dniExiste) {
                    jlVerificar.setText("YA EXISTE ESTE DNI");
                } else if (!(tfdDNI.getText().length() == 8)) {
                    jlVerificar.setText("FALTAN DATOS EN DNI");
                } else if (!(tfdTelefono.getText().length() == 9)) {
                    jlVerificar.setText("FALTA DATOS EN TELEFONO");
                } else {
                    ClienteDAO cliente_Dao = new ClienteDAO();
                    boolean op1 = cliente_Dao.insertar(cliente);
                    int ultimoId = cliente_Dao.ultimoID();
                    boolean op2 = new ClienteTelefonoDAO().insertar(ultimoId, clienteT);
                    if (op2 && op1) {
                        String[] lista = new String[3];
                        lista[0] = tfdDNI.getText().trim();
                        lista[1] = tfdNombre.getText().trim();
                        lista[2] = tfdTelefono.getText().trim();
                        dtm0.addRow(lista);
                        jlVerificar.setText("SE AGREGO EXITOSAMENTE");
                    }
                    limpiar();
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO DEJAR VACIO");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (btnNuevo.getText().trim().equalsIgnoreCase("nuevo")) {
            CambiarFuncion("Cancelar", true);
        } else {
            CambiarFuncion("Nuevo", false);
        }
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tfdApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdApellidoActionPerformed

    private void tfdDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdDNIKeyTyped
        aplicarRestriccionNumero(tfdDNI, 8, evt);
    }//GEN-LAST:event_tfdDNIKeyTyped

    private void tfdTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdTelefonoKeyTyped
        aplicarRestriccionNumero(tfdTelefono, 9, evt);
    }//GEN-LAST:event_tfdTelefonoKeyTyped
    DefaultTableModel dtm1 = null;
    DefaultTableModel dtm2 = null;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dtm1 = (DefaultTableModel) JTabla.getModel();
        dtm1.setRowCount(0);
        var lista = new String[3];
        try {
            String sql = "SELECT Cliente.DNI, Cliente.Nombre , ClienteTelefono.Telefono FROM Cliente JOIN ClienteTelefono ON Cliente.IdCliente = ClienteTelefono.IdCliente";
            ResultSet rs = Conexion.conexionMySQL().prepareStatement(sql).executeQuery();
            while (rs.next()) {
                lista[0] = String.valueOf(rs.getInt(1));
                lista[1] = rs.getString(2);
                lista[2] = String.valueOf(rs.getInt(3));
                dtm1.addRow(lista);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscaDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaDNIActionPerformed
        try {
            if (tfdBuscarDni.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "No dejar vacia", "ERROR", 1);
            } else if (!(tfdBuscarDni.getText().length() == 8)) {
                JOptionPane.showMessageDialog(null, "FALTAN DATOS EN DNI", "ERROR", 1);
            } else {
                tfdNuevoTelefono.setEnabled(true);
                btnNuevoTelefono.setEnabled(true);
                dtm2 = (DefaultTableModel) TablaTelefonos.getModel();
                dtm2.setRowCount(0);
                Cliente entidad = new ClienteDAO().getClientePorDNI(tfdBuscarDni.getText().trim());
                if (entidad == null || !tfdBuscarDni.getText().equalsIgnoreCase(String.valueOf(entidad.getDni()))) {
                    JOptionPane.showMessageDialog(null, "El DNI ingresado no existe", "EROR", 1);
                } else {
                    ArrayList<ClienteTelefono> lista = new ClienteTelefonoDAO().buscarId(entidad.getIdCliente());
                    jLNombre.setText(entidad.getNombre().trim());
                    jLApellido.setText(entidad.getApellido().trim());
                    String[] listaTelefono = new String[1];
                    for (int i = 0; i < lista.size(); i++) {
                        listaTelefono[0] = String.valueOf(lista.get(i).getTelefono());
                        dtm2.addRow(listaTelefono);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnBuscaDNIActionPerformed

    private void tfdBuscarDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdBuscarDniActionPerformed

    }//GEN-LAST:event_tfdBuscarDniActionPerformed

    private void btnNuevoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTelefonoActionPerformed
        Cliente entidad = new ClienteDAO().getClientePorDNI(tfdBuscarDni.getText().trim());
        ClienteTelefono entidad_Telefono = new ClienteTelefono();
        entidad_Telefono.setTelefono(Integer.parseInt(tfdNuevoTelefono.getText().trim()));
        boolean cliente_dao = new ClienteTelefonoDAO().insertar(entidad.getIdCliente(), entidad_Telefono);

        jlVerficar2.setText("SE AGREGO EL NUMERO " + tfdNuevoTelefono.getText());

    }//GEN-LAST:event_btnNuevoTelefonoActionPerformed

    private void tfdBuscarDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdBuscarDniKeyTyped
        aplicarRestriccionNumero(tfdBuscarDni, 8, evt);
    }//GEN-LAST:event_tfdBuscarDniKeyTyped

    private void tfdNuevoTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdNuevoTelefonoKeyTyped
        aplicarRestriccionNumero(tfdNuevoTelefono, 9, evt);
    }//GEN-LAST:event_tfdNuevoTelefonoKeyTyped

    private void tfdDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdDNIActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTabla;
    private javax.swing.JTable TablaTelefonos;
    private javax.swing.JButton btnBuscaDNI;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JToggleButton btnNuevoTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jlVerficar2;
    private javax.swing.JLabel jlVerificar;
    private javax.swing.JSpinner snrEdad;
    private javax.swing.JTextField tfdApellido;
    private javax.swing.JTextField tfdBuscarDni;
    private javax.swing.JTextField tfdDNI;
    private javax.swing.JTextField tfdNombre;
    private javax.swing.JTextField tfdNuevoTelefono;
    private javax.swing.JTextField tfdTelefono;
    // End of variables declaration//GEN-END:variables

//METODOS AGREGADOS
    private void CambiarFuncion(String texto, boolean opcion) {
        tfdDNI.setEnabled(opcion);
        tfdNombre.setEnabled(opcion);
        tfdApellido.setEnabled(opcion);
        tfdTelefono.setEnabled(opcion);
        snrEdad.setEnabled(opcion);
        btnGuardar.setEnabled(opcion);
        btnNuevo.setText(texto);
    }

    private void limpiar() {
        tfdDNI.setText(null);
        tfdNombre.setText(null);
        tfdApellido.setText(null);
        tfdTelefono.setText(null);
        snrEdad.setValue(0);
    }

    private void aplicarRestriccionNumero(JTextField textField, int longitudMax, KeyEvent evt) {
        char caracter = evt.getKeyChar();

        // Verificar si el carácter es un dígito numérico
        if (!Character.isDigit(caracter)) {
            evt.consume();
            return;
        }
        String texto = textField.getText();
        if (texto.length() == longitudMax) {
            evt.consume();
        } else if (texto.length() > longitudMax) {
            textField.setText("");
            JOptionPane.showMessageDialog(null, "¡No es posible ingresar más de " + longitudMax
                    + " caracteres!", "Ingreso Inválido", 1);
        }

    }

    private void aplicarRestriccionCadena(KeyEvent evt) {
        char caracter = evt.getKeyChar();
        if (!Character.isLetter(caracter) && caracter != KeyEvent.VK_SPACE) {
            evt.consume(); // Consumir el evento para evitar que se ingrese el carácter
        }
    }

    private boolean identificar() {
        try {
            if(tfdDNI.getText().isEmpty()
                    && tfdNombre.getText().isEmpty()
                    && tfdApellido.getText().isEmpty()
                    && tfdTelefono.getText().isEmpty()
                    && !snrEdad.getValue().toString().isEmpty()){
                return true;
            }
        } catch (Exception e) {
            System.out.println("ERROR");
            return false;
        }
        return false;
    }
}
