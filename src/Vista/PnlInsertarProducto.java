package Vista;

import BusinessObject.Producto;
import DataAccessObject.ProductoDAO;
import Persistencia.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PnlInsertarProducto extends javax.swing.JPanel {

    DefaultTableModel dtm;

    public PnlInsertarProducto() {
        initComponents();
        dtm = (DefaultTableModel) JTabla.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfdNombre = new javax.swing.JTextField();
        snrPrecio = new javax.swing.JSpinner();
        comboxCategoría = new javax.swing.JComboBox<>();
        chboxVentaConReceta = new javax.swing.JCheckBox();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPaneDescripcion = new javax.swing.JTextArea();
        jlVerificar = new javax.swing.JLabel();
        pnlTablaRegistroProducto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(168, 168, 168), 1, true), "Añadir Producto"));

        jLabel1.setText("Nombre");

        jLabel2.setText("Descripcion");

        jLabel4.setText("Precio");

        jLabel3.setText("Categoría");

        tfdNombre.setEnabled(false);

        snrPrecio.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.1f), Float.valueOf(0.1f), Float.valueOf(99999.0f), Float.valueOf(0.1f)));
        snrPrecio.setEnabled(false);

        comboxCategoría.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Sin Categoria>" }));
        comboxCategoría.setEnabled(false);
        comboxCategoría.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxCategoríaActionPerformed(evt);
            }
        });
        comboxCategoría.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                comboxCategoríaPropertyChange(evt);
            }
        });

        chboxVentaConReceta.setText("Venta con receta");

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

        txtPaneDescripcion.setColumns(20);
        txtPaneDescripcion.setLineWrap(true);
        txtPaneDescripcion.setRows(5);
        txtPaneDescripcion.setEnabled(false);
        jScrollPane3.setViewportView(txtPaneDescripcion);

        jlVerificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlVerificar.setText("------------");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(tfdNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboxCategoría, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(snrPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(chboxVentaConReceta))))
                        .addGap(13, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jlVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(14, 14, 14))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(snrPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboxCategoría, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chboxVentaConReceta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jlVerificar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlTablaRegistroProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168, 168, 168)), "Tabla Registro"));

        JTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Requiere Receta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JTabla);

        javax.swing.GroupLayout pnlTablaRegistroProductoLayout = new javax.swing.GroupLayout(pnlTablaRegistroProducto);
        pnlTablaRegistroProducto.setLayout(pnlTablaRegistroProductoLayout);
        pnlTablaRegistroProductoLayout.setHorizontalGroup(
            pnlTablaRegistroProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaRegistroProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTablaRegistroProductoLayout.setVerticalGroup(
            pnlTablaRegistroProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTablaRegistroProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Visualizar Registro Completo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlTablaRegistroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlTablaRegistroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (btnNuevo.getText().trim().equalsIgnoreCase("nuevo")) {
            CambiarFuncion("Cancelar", true);
        } else {
            CambiarFuncion("Nuevo", false);
        }
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void CambiarFuncion(String texto, boolean opcion) {
        tfdNombre.setEnabled(opcion);
        txtPaneDescripcion.setEnabled(opcion);
        snrPrecio.setEnabled(opcion);
        chboxVentaConReceta.setEnabled(opcion);
        comboxCategoría.setEnabled(opcion);
        btnGuardar.setEnabled(opcion);
        btnNuevo.setText(texto);
    }

    private void limpiar() {
        tfdNombre.setText(null);
        txtPaneDescripcion.setText(null);
        snrPrecio.setValue(0.1);
        chboxVentaConReceta.setSelected(false);
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!tfdNombre.getText().trim().isEmpty() & !txtPaneDescripcion.getText().trim().isEmpty()) {
            String seleccion = comboxCategoría.getSelectedItem().toString();
            String sql = "SELECT TP.IdTipoProducto FROM TipoProducto TP WHERE TP.Nombre = ?;";
            Producto prod = new Producto();
            try {
                //Obtener IdTipoProducto gracias al combox.
                PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
                ps.setString(1, seleccion);
                ResultSet rs = ps.executeQuery();
                var vector = new String[3];
                if (rs.next()) {
                    //Carga a Producto
                    prod.setIdTipoProducto(rs.getInt(1));
                    prod.setNombre(tfdNombre.getText());
                    prod.setDescripcion(txtPaneDescripcion.getText());
                    prod.setVentaConReceta(chboxVentaConReceta.isSelected());
                    prod.setPrecio((float) snrPrecio.getValue());
                    prod.setActivo(true);
                    //Carga a Tabla
                    vector[0] = prod.getNombre();
                    vector[1] = String.valueOf(prod.getPrecio());
                    vector[2] = String.valueOf(prod.isVentaConReceta());
                    dtm.addRow(vector);
                }
            } catch (SQLException ex) {
                System.out.println("Error: " + ex.toString());
            } finally {
                limpiar();
                CambiarFuncion("Nuevo", false);
                ProductoDAO pdao = new ProductoDAO();
                pdao.insertar(prod);
                jlVerificar.setText("SE AGREGO EXITOSAMENTE");
            }
        } else {
            JOptionPane.showMessageDialog(this, "¡Asegúrese de no dejar ningún campo vacío!", "Campo Vacío", 2);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void refreshTablaRegistroProducto() {
        String sql = "SELECT Nombre, Precio, VentaConReceta FROM Producto;";
        try {
            PreparedStatement ps = Conexion.conexionMySQL().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            var vector = new String[3];
            dtm.setRowCount(0);
            while (rs.next()) {
                vector[0] = rs.getString(1);
                vector[1] = rs.getString(2);
                vector[2] = rs.getString(3);
                dtm.addRow(vector);
            }
        } catch (SQLException ex) {
            System.out.println("Error en método 'refreshTablaRegistroProducto': " + ex.toString());
        }
    }

    private void comboxCategoríaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxCategoríaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxCategoríaActionPerformed

    private void comboxCategoríaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_comboxCategoríaPropertyChange
        // TODO add your handling code here:
        /*if ((boolean) evt.getNewValue()) {
            System.out.println("ESTÁ FUNCIONANDOOOO");
        }*/
    }//GEN-LAST:event_comboxCategoríaPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        refreshTablaRegistroProducto();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTabla;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox chboxVentaConReceta;
    private javax.swing.JComboBox<String> comboxCategoría;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jlVerificar;
    private javax.swing.JPanel pnlTablaRegistroProducto;
    private javax.swing.JSpinner snrPrecio;
    private javax.swing.JTextField tfdNombre;
    private javax.swing.JTextArea txtPaneDescripcion;
    // End of variables declaration//GEN-END:variables
}
