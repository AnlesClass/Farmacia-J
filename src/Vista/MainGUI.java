package Vista;

import BusinessObject.ClienteTelefono;
import DataAccessObject.ClienteTelefonoDAO;
import Persistencia.Conexion;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson
 */
public class MainGUI extends javax.swing.JFrame {

    private DefaultTableModel tablaModelo;

    public MainGUI() {
        initComponents();
        tablaModelo = (DefaultTableModel) tblCliente.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbdPanePrograma = new javax.swing.JTabbedPane();
        tbpnlVenta = new javax.swing.JPanel();
        lblOperacionesRecientes = new javax.swing.JLabel();
        btnNuevoPedido = new javax.swing.JButton();
        pnlOperacionesRecientes = new javax.swing.JPanel();
        pnlWorkbench = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        tbpnlConsultas = new javax.swing.JPanel();
        tfdBuscandoDNI = new javax.swing.JTextField();
        pruebaLblTelefono = new javax.swing.JLabel();
        btnBuscarDNI = new javax.swing.JButton();
        lblBBuscarError = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfdDNIBusca = new javax.swing.JTextField();
        tfdNombreBusca = new javax.swing.JTextField();
        tfdApellidoBusca = new javax.swing.JTextField();
        spnEdadBusca = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        scrollConsultaCliente = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        mnbrMenu = new javax.swing.JMenuBar();
        mnArchivo = new javax.swing.JMenu();
        mnGestionProducto = new javax.swing.JMenu();
        mnitNuevoProducto = new javax.swing.JMenuItem();
        mnitModificarProducto = new javax.swing.JMenuItem();
        mnitBorrarProducto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farmacia J&J - V.1.0.");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        lblOperacionesRecientes.setText("Operaciones Recientes");

        btnNuevoPedido.setText("Nuevo Pedido");
        btnNuevoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPedidoActionPerformed(evt);
            }
        });

        pnlOperacionesRecientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlOperacionesRecientes.setMaximumSize(new java.awt.Dimension(250, 250));
        pnlOperacionesRecientes.setMinimumSize(new java.awt.Dimension(200, 200));

        javax.swing.GroupLayout pnlOperacionesRecientesLayout = new javax.swing.GroupLayout(pnlOperacionesRecientes);
        pnlOperacionesRecientes.setLayout(pnlOperacionesRecientesLayout);
        pnlOperacionesRecientesLayout.setHorizontalGroup(
            pnlOperacionesRecientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlOperacionesRecientesLayout.setVerticalGroup(
            pnlOperacionesRecientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlWorkbench.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlWorkbench.setPreferredSize(new java.awt.Dimension(350, 220));

        javax.swing.GroupLayout pnlWorkbenchLayout = new javax.swing.GroupLayout(pnlWorkbench);
        pnlWorkbench.setLayout(pnlWorkbenchLayout);
        pnlWorkbenchLayout.setHorizontalGroup(
            pnlWorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        pnlWorkbenchLayout.setVerticalGroup(
            pnlWorkbenchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jButton3.setText("Mostrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tbpnlVentaLayout = new javax.swing.GroupLayout(tbpnlVenta);
        tbpnlVenta.setLayout(tbpnlVentaLayout);
        tbpnlVentaLayout.setHorizontalGroup(
            tbpnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbpnlVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOperacionesRecientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbpnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbpnlVentaLayout.createSequentialGroup()
                        .addComponent(btnNuevoPedido)
                        .addGap(18, 18, 18)
                        .addComponent(lblOperacionesRecientes))
                    .addGroup(tbpnlVentaLayout.createSequentialGroup()
                        .addGroup(tbpnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlWorkbench, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        tbpnlVentaLayout.setVerticalGroup(
            tbpnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbpnlVentaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(tbpnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOperacionesRecientes)
                    .addComponent(btnNuevoPedido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbpnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOperacionesRecientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tbpnlVentaLayout.createSequentialGroup()
                        .addGroup(tbpnlVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tbpnlVentaLayout.createSequentialGroup()
                                .addComponent(pnlWorkbench, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 279, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tbdPanePrograma.addTab("Venta", tbpnlVenta);

        tbpnlConsultas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tfdBuscandoDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfdBuscandoDNIKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdBuscandoDNIKeyTyped(evt);
            }
        });

        pruebaLblTelefono.setText("Prueba: Buscando Telefono por DNI");

        btnBuscarDNI.setText("BuscarTelefono");
        btnBuscarDNI.setEnabled(false);
        btnBuscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDNIActionPerformed(evt);
            }
        });

        lblBBuscarError.setForeground(new java.awt.Color(255, 102, 102));
        lblBBuscarError.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBBuscarError.setText("AQUI VA EL ERROR");

        jLabel1.setText("Prueba: Buscar Cliente por DNI, Nombre, Apellido, Edad, Telefono");

        spnEdadBusca.setModel(new javax.swing.SpinnerNumberModel(0, 0, 150, 1));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DNI", "Nombre", "Apellido", "Edad", "Telefono(s)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.getTableHeader().setReorderingAllowed(false);
        scrollConsultaCliente.setViewportView(tblCliente);
        if (tblCliente.getColumnModel().getColumnCount() > 0) {
            tblCliente.getColumnModel().getColumn(0).setResizable(false);
            tblCliente.getColumnModel().getColumn(0).setPreferredWidth(35);
            tblCliente.getColumnModel().getColumn(1).setResizable(false);
            tblCliente.getColumnModel().getColumn(2).setResizable(false);
            tblCliente.getColumnModel().getColumn(3).setResizable(false);
            tblCliente.getColumnModel().getColumn(3).setPreferredWidth(20);
            tblCliente.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel2.setText("Prueba: Registro Cliente");

        jButton2.setText("Registrar Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tbpnlConsultasLayout = new javax.swing.GroupLayout(tbpnlConsultas);
        tbpnlConsultas.setLayout(tbpnlConsultasLayout);
        tbpnlConsultasLayout.setHorizontalGroup(
            tbpnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbpnlConsultasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(tbpnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel2)
                    .addComponent(pruebaLblTelefono)
                    .addGroup(tbpnlConsultasLayout.createSequentialGroup()
                        .addComponent(tfdBuscandoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBBuscarError)
                    .addGroup(tbpnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGroup(tbpnlConsultasLayout.createSequentialGroup()
                            .addComponent(tfdDNIBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(tfdNombreBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(tfdApellidoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(spnEdadBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(123, 123, 123)
                            .addComponent(jButton1))))
                .addContainerGap(484, Short.MAX_VALUE))
        );
        tbpnlConsultasLayout.setVerticalGroup(
            tbpnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbpnlConsultasLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(pruebaLblTelefono)
                .addGap(4, 4, 4)
                .addGroup(tbpnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdBuscandoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarDNI))
                .addGap(6, 6, 6)
                .addComponent(lblBBuscarError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(tbpnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdDNIBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdNombreBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdApellidoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnEdadBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(17, 17, 17)
                .addComponent(scrollConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(225, 225, 225))
        );

        tbdPanePrograma.addTab("Consultas", tbpnlConsultas);

        mnArchivo.setText("Archivo");
        mnbrMenu.add(mnArchivo);

        mnGestionProducto.setText("Gestion Prod.");

        mnitNuevoProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnitNuevoProducto.setText("Nuevo Producto");
        mnitNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitNuevoProductoActionPerformed(evt);
            }
        });
        mnGestionProducto.add(mnitNuevoProducto);

        mnitModificarProducto.setText("Modificar Producto");
        mnGestionProducto.add(mnitModificarProducto);

        mnitBorrarProducto.setText("Cambiar Estado");
        mnGestionProducto.add(mnitBorrarProducto);

        mnbrMenu.add(mnGestionProducto);

        setJMenuBar(mnbrMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdPanePrograma)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdPanePrograma)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPedidoActionPerformed
        //Iniciar JFrame para agregar producto
        NuevoPedidoGUI wdNuevoPedido = new NuevoPedidoGUI();
        wdNuevoPedido.setSize(350, 220);
        wdNuevoPedido.setLocation(0, 0);
        pnlWorkbench.removeAll();
        pnlWorkbench.add(wdNuevoPedido, BorderLayout.CENTER);
        pnlWorkbench.revalidate(); //Sirve para reorganizar la jerarquía de elementos Swing.
        pnlWorkbench.repaint(); //Sirve para 'redibujar' la parte gráfica de los elementos Swing.
        //Bloquear botón "Agregar"
        if (btnNuevoPedido.getText().equals("Nuevo Pedido")) {
            btnNuevoPedido.setEnabled(false);
        }
    }//GEN-LAST:event_btnNuevoPedidoActionPerformed

    private void mnitNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitNuevoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnitNuevoProductoActionPerformed

    private void btnBuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDNIActionPerformed
        ConsultarTelefono consT = new ConsultarTelefono(tfdBuscandoDNI.getText(), this);
        consT.setLocationRelativeTo(rootPane);
        consT.setVisible(true);
        setEnabled(false); //Bloquea la ventana principal.
    }//GEN-LAST:event_btnBuscarDNIActionPerformed

    private void tfdBuscandoDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdBuscandoDNIKeyTyped
        String texto = tfdBuscandoDNI.getText();
        //Acción #01
        if (texto.length() == 8) {
            evt.consume();
        } else if (texto.length() > 8) {
            tfdBuscandoDNI.setText("");
            JOptionPane.showMessageDialog(null, "¡No es posible "
                    + "ingresar más de 8 caracteres!", "Ingreso Inválido", 1);
        }
    }//GEN-LAST:event_tfdBuscandoDNIKeyTyped

    private void tfdBuscandoDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdBuscandoDNIKeyReleased
        String texto = tfdBuscandoDNI.getText();
        //Acción #02
        if (texto.length() == 8 & admitirDNI(texto)) {
            btnBuscarDNI.setEnabled(true);
        } else {
            btnBuscarDNI.setEnabled(false);
            if (admitirDNI(texto)) {
                lblBBuscarError.setText("");
            } else {
                lblBBuscarError.setText("Este campo no puede contener letras.");
            }
        }
    }//GEN-LAST:event_tfdBuscandoDNIKeyReleased

    private boolean admitirDNI(String texto) {
        for (char ch : texto.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tablaModelo.setRowCount(0);
        var vector = new String[5];
        String sql = "SELECT C.DNI, C.Nombre, C.Apellido, C.Edad, GROUP_CONCAT(CT.Telefono SEPARATOR ', ')"
                + " AS Telefonos FROM Cliente C INNER JOIN ClienteTelefono CT ON C.IdCliente = CT.IdCliente"
                + " WHERE DNI LIKE ? AND Nombre LIKE ? AND Apellido LIKE ? AND Edad LIKE ? GROUP BY C.DNI, C.Nombre, C.Apellido, C.Edad;";
        try {
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ps.setString(1, tfdDNIBusca.getText() + "%");
            ps.setString(2, tfdNombreBusca.getText() + "%");
            ps.setString(3, tfdApellidoBusca.getText() + "%");
            ps.setString(4, validarSpinner((int) spnEdadBusca.getValue()) + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vector[0] = rs.getString(1);
                vector[1] = rs.getString(2);
                vector[2] = rs.getString(3);
                vector[3] = rs.getString(4);
                vector[4] = rs.getString(5);
                tablaModelo.addRow(vector);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Abrir ventana de Marco
        AñadirCliente ac = new AñadirCliente();
        ac.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        PnlInsertarProducto pip = new PnlInsertarProducto();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private String validarSpinner(int edad) {
        //Si edad es 0 no se toma en cuenta para el filtrado.
        if (edad != 0) {
            return String.valueOf(edad);
        } else {
            return "";
        }
    }

    public static void setEstadoBtnNuevoPedido(boolean estado) {
        btnNuevoPedido.setEnabled(estado);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarDNI;
    private static javax.swing.JButton btnNuevoPedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBBuscarError;
    private javax.swing.JLabel lblOperacionesRecientes;
    private javax.swing.JMenu mnArchivo;
    private javax.swing.JMenu mnGestionProducto;
    private javax.swing.JMenuBar mnbrMenu;
    private javax.swing.JMenuItem mnitBorrarProducto;
    private javax.swing.JMenuItem mnitModificarProducto;
    private javax.swing.JMenuItem mnitNuevoProducto;
    private javax.swing.JPanel pnlOperacionesRecientes;
    private javax.swing.JPanel pnlWorkbench;
    private javax.swing.JLabel pruebaLblTelefono;
    private javax.swing.JScrollPane scrollConsultaCliente;
    private javax.swing.JSpinner spnEdadBusca;
    private javax.swing.JTabbedPane tbdPanePrograma;
    private javax.swing.JTable tblCliente;
    private javax.swing.JPanel tbpnlConsultas;
    private javax.swing.JPanel tbpnlVenta;
    private javax.swing.JTextField tfdApellidoBusca;
    private javax.swing.JTextField tfdBuscandoDNI;
    private javax.swing.JTextField tfdDNIBusca;
    private javax.swing.JTextField tfdNombreBusca;
    // End of variables declaration//GEN-END:variables
}
