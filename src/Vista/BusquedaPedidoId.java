package Vista;

import DataAccessObject.DetallePedidoDAO;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BusquedaPedidoId extends javax.swing.JFrame {
    
    public BusquedaPedidoId() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollBuscaPedido = new javax.swing.JScrollPane();
        tblBuscaPedido = new javax.swing.JTable();
        btnBuscaPedido = new javax.swing.JToggleButton();
        tfdBuscaPedido = new javax.swing.JTextField();
        lblBuscarIdPorPedido = new javax.swing.JLabel();
        lblBuscaPedido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18))); // NOI18N

        tblBuscaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Cantidad", "Precio Unitario", "Precio Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollBuscaPedido.setViewportView(tblBuscaPedido);
        if (tblBuscaPedido.getColumnModel().getColumnCount() > 0) {
            tblBuscaPedido.getColumnModel().getColumn(0).setMaxWidth(60);
        }

        btnBuscaPedido.setText("BUSCAR");
        btnBuscaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaPedidoActionPerformed(evt);
            }
        });

        tfdBuscaPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdBuscaPedidoKeyTyped(evt);
            }
        });

        lblBuscarIdPorPedido.setText("Buscar por ID del pedido: ");

        lblBuscaPedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollBuscaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBuscarIdPorPedido)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfdBuscaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnBuscaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBuscaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBuscarIdPorPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfdBuscaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollBuscaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
DefaultTableModel dtm = null;
    private void btnBuscaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaPedidoActionPerformed
        try {
            dtm = (DefaultTableModel) tblBuscaPedido.getModel();
            ResultSet detalleDAO = new DetallePedidoDAO().buscarPorIdCliente(Integer.parseInt(tfdBuscaPedido.getText().toString()));
            
            if (!detalleDAO.next()) {
                lblBuscaPedido.setText("RESULTADO NO ENCONTRADO:");
                lblBuscaPedido.setForeground(Color.RED);
                dtm.setRowCount(0);
                return; 
            }
            lblBuscaPedido.setText("RESULTADO DE PEDIDO:");
            lblBuscaPedido.setForeground(Color.BLUE);
            
            String[] lista = new String[5];
            dtm.setRowCount(0);
            do {
                lista[0] = String.valueOf(detalleDAO.getInt(1));
                lista[1] = detalleDAO.getString(2);
                lista[2] = String.valueOf(detalleDAO.getInt(3));
                lista[3] = String.valueOf(detalleDAO.getFloat(4));
                lista[4] = String.valueOf(detalleDAO.getFloat(5));
                dtm.addRow(lista);
            } while (detalleDAO.next());
        } catch (SQLException ex) {
            Logger.getLogger(BusquedaPedidoId.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBuscaPedidoActionPerformed

    private void tfdBuscaPedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdBuscaPedidoKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si el carácter es un dígito numérico
        if (!Character.isDigit(caracter)) {
            evt.consume();
            return;
        }
        String texto = tfdBuscaPedido.getText();
        if (texto.length() == 1000) {
            evt.consume();
        } else if (texto.length() > 1000) {
            tfdBuscaPedido.setText("");
            JOptionPane.showMessageDialog(null, "¡No es posible ingresar más de " + 1000
                    + " caracteres!", "Ingreso Inválido", 1);
        }

    }//GEN-LAST:event_tfdBuscaPedidoKeyTyped

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
            java.util.logging.Logger.getLogger(BusquedaPedidoId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaPedidoId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaPedidoId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaPedidoId.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaPedidoId().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBuscaPedido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBuscaPedido;
    private javax.swing.JLabel lblBuscarIdPorPedido;
    private javax.swing.JScrollPane scrollBuscaPedido;
    private javax.swing.JTable tblBuscaPedido;
    private javax.swing.JTextField tfdBuscaPedido;
    // End of variables declaration//GEN-END:variables
}
