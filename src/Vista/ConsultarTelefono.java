package Vista;

import DataAccessObject.ClienteDAO;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class ConsultarTelefono extends javax.swing.JFrame {

    private DefaultTableModel tablaModelo;
    private JFrame ejecutor;
    private String dniBusca;

    public ConsultarTelefono(String dniBusca, JFrame ejecutor) {
        initComponents();
        this.dniBusca = dniBusca;
        this.ejecutor = ejecutor;
        tablaModelo = (DefaultTableModel) tblTelefono.getModel();
        try {
            iniciarConsulta();
        } catch (SQLException ex) {
            System.out.println("Error en el método 'iniciarConsulta': " + ex.toString());
        }
        rootPane.setEnabled(false);
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
        btnGuardarCambios = new javax.swing.JButton();
        lblNombreCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Teléfonos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                activarVentanaMain(evt);
            }
        });

        lblTelefono.setText("Teléfono(s) Registrados de:");

        tblTelefono.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Telefono"
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
            tblTelefono.getColumnModel().getColumn(0).setMinWidth(40);
            tblTelefono.getColumnModel().getColumn(0).setPreferredWidth(30);
            tblTelefono.getColumnModel().getColumn(0).setMaxWidth(20);
            tblTelefono.getColumnModel().getColumn(1).setResizable(false);
        }

        btnGuardarCambios.setText("Guardar");
        btnGuardarCambios.setEnabled(false);

        lblNombreCliente.setText("Nombre por Defecto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreCliente)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(scrollTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardarCambios)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTelefono)
                            .addGap(90, 90, 90))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(scrollTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarCambios)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void activarVentanaMain(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_activarVentanaMain
        //ZZZZ
        ejecutor.toFront();
        ejecutor.setEnabled(true);
    }//GEN-LAST:event_activarVentanaMain

    private void iniciarConsulta() throws SQLException {
        //Inicializar
        var rsTelefonos = new ClienteDAO().buscarPorDNI(dniBusca);
        var vector = new String[2];
        int cont = 1;
        if(rsTelefonos.next()) lblNombreCliente.setText(rsTelefonos.getString(1));
        tablaModelo.setRowCount(0);
        //Proceso
        while (rsTelefonos.next()) {
            vector[0] = String.valueOf(cont);
            vector[1] = rsTelefonos.getString(2);
            cont++;
            tablaModelo.addRow(vector);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JScrollPane scrollTelefono;
    private javax.swing.JTable tblTelefono;
    // End of variables declaration//GEN-END:variables
}