package Vista;

import BusinessObject.Cliente;
import BusinessObject.ClienteTelefono;
import DataAccessObject.ClienteDAO;
import DataAccessObject.ClienteTelefonoDAO;
import javax.swing.table.DefaultTableModel;

public class ModificarTelefono extends javax.swing.JFrame {

    private String dniBusca;

    public ModificarTelefono(String dniBusca) {
        this.dniBusca = dniBusca;
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

        lblTelefono = new javax.swing.JLabel();
        scrollTelefono = new javax.swing.JScrollPane();
        tblTelefono = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Teléfonos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTelefono.setText("Teléfono(s) Registrados");

        tblTelefono.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTelefono.getTableHeader().setReorderingAllowed(false);
        scrollTelefono.setViewportView(tblTelefono);
        if (tblTelefono.getColumnModel().getColumnCount() > 0) {
            tblTelefono.getColumnModel().getColumn(0).setMinWidth(180);
            tblTelefono.getColumnModel().getColumn(0).setPreferredWidth(200);
            tblTelefono.getColumnModel().getColumn(0).setMaxWidth(220);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefono)
                    .addComponent(scrollTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Lo primero es sacar el id del cliente por el DNI.
        Cliente cliente = new ClienteDAO().buscarDNI(dniBusca);
        int idCliente = cliente.getIdCliente();
        String nombreCliente = cliente.getNombre() + " " + cliente.getApellido();
        var lista = new ClienteTelefonoDAO().buscarId(idCliente);
        var vector = new String[2];

        DefaultTableModel tablaModelo = (DefaultTableModel) tblTelefono.getModel();
        tablaModelo.setRowCount(0);      

        for (ClienteTelefono entidad : lista) {
            vector[0] = nombreCliente;
            vector[1] = entidad.lista()[1];
            tablaModelo.addRow(vector);
        }
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JScrollPane scrollTelefono;
    private javax.swing.JTable tblTelefono;
    // End of variables declaration//GEN-END:variables
}
