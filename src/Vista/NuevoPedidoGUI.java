/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

/**
 *
 * @author Anderson
 */
public class NuevoPedidoGUI extends javax.swing.JPanel {

    /**
     * Creates new form NuevoPedidoPGUI
     */
    public NuevoPedidoGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenerarPedido = new javax.swing.JButton();
        lblListaProductos = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        scrpnListaProductos = new javax.swing.JScrollPane();
        btnCancelarPedido = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnGenerarPedido.setText("Generar Pedido");
        btnGenerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPedidoActionPerformed(evt);
            }
        });

        lblListaProductos.setText("Lista de Productos");

        btnAgregarProducto.setText("+");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        btnCancelarPedido.setText("Cancelar Pedido");
        btnCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGenerarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblListaProductos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarProducto))
                    .addComponent(btnCancelarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrpnListaProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrpnListaProductos)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblListaProductos)
                    .addComponent(btnAgregarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(btnGenerarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarPedido)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPedidoActionPerformed
        //Activar el botón nuevo pedido debido a que se canceló el ingreso
        MainGUI.setEstadoBtnNuevoPedido(true);
        //Borrar y bloquear el ingreso de datos
        btnAgregarProducto.setEnabled(false);
        btnGenerarPedido.setEnabled(false);
        btnCancelarPedido.setEnabled(false);
    }//GEN-LAST:event_btnCancelarPedidoActionPerformed

    private void btnGenerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarPedidoActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCancelarPedido;
    private javax.swing.JButton btnGenerarPedido;
    private javax.swing.JLabel lblListaProductos;
    private javax.swing.JScrollPane scrpnListaProductos;
    // End of variables declaration//GEN-END:variables
}
