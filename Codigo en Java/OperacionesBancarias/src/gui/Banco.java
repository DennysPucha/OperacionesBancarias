/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Luis Hidalgo
 */
public class Banco extends javax.swing.JFrame {
    ArrayList<Cliente> listaClientes=new ArrayList<Cliente>();
    
    DefaultTableModel modelMovs=new DefaultTableModel();
    
    public Banco() {
        initComponents();
        this.setTitle("BANCO PRADO");
        Image img=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo.jpeg"));
        this.setIconImage(img);
        lblLogo.setIcon(new ImageIcon(img.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));
        this.setLocationRelativeTo(null);
        modelMovs.addColumn("CUENTA");
        modelMovs.addColumn("FECHA");
        modelMovs.addColumn("TIPO");
        modelMovs.addColumn("MONTO");
        tblMovimientos.setModel(modelMovs);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        btnAgregarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cboCuentaCliente = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboTipoCuenta = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnAgregarTipoCuenta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtMontoInicial = new javax.swing.JTextField();
        btnAgregarCuenta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cboConsultaCliente = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cboConsultaTipoCuenta = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cboTipoMovimiento = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMontoMovimiento = new javax.swing.JTextField();
        btnAgregarMovimiento = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblTelefonoCliente = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblTipoCuenta = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblMontoInicial = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovimientos = new javax.swing.JTable();
        lblSaldo = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.jpeg"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 61, 178, 195));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel2.setText("BANCO PRADO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("INGRESO CLIENTE"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 190, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Teléfono");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        jPanel1.add(txtTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 190, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Dirección");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel1.add(txtDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 190, -1));

        btnAgregarCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarCliente.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnAgregarCliente.setText("Agregar");
        btnAgregarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 280, 195));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("INGRESO CUENTA"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboCuentaCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(cboCuentaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 24, 120, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Cliente:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, -1, -1));

        cboTipoCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(cboTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 60, 120, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Tipo Cuenta:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        btnAgregarTipoCuenta.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnAgregarTipoCuenta.setText("+");
        btnAgregarTipoCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(btnAgregarTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 20, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Monto:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, -1));
        jPanel2.add(txtMontoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 150, -1));

        btnAgregarCuenta.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarCuenta.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnAgregarCuenta.setText("Agregar");
        btnAgregarCuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 110, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 250, 195));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("OPERACIONES"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboConsultaCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel3.add(cboConsultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Cliente:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        cboConsultaTipoCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel3.add(cboConsultaTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Tipo Cuenta:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        cboTipoMovimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboTipoMovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEPOSITO", "RETIRO" }));
        jPanel3.add(cboTipoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 120, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Tipo Movimiento");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Monto:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 80, -1));
        jPanel3.add(txtMontoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 150, -1));

        btnAgregarMovimiento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarMovimiento.setText("Realizar Movimiento");
        btnAgregarMovimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(btnAgregarMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 274, 750, 130));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("INFORMACIÓN CUENTA"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Nombre");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 33, -1, -1));

        lblNombreCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 160, 20));

        jLabel15.setText("Teléfono");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        lblTelefonoCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(lblTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 160, 20));

        jLabel17.setText("Dirección");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lblDireccionCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(lblDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 160, 20));

        jLabel19.setText("Tipo de Cuenta");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, -1));

        lblTipoCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(lblTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 180, 20));

        jLabel21.setText("Monto Inicial");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lblMontoInicial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel4.add(lblMontoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 150, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 409, 260, 290));

        tblMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblMovimientos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 409, 480, 250));

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSaldo.setText("$100 Dolares");
        getContentPane().add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 680, 100, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("SALDO:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 680, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnAgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuentaActionPerformed
        Cliente c=new Cliente();
        c.setNombre(txtNombreCliente.getText());
        c.setTelefono(txtTelefonoCliente.getText());
        c.setDireccion(txtDireccionCliente.getText());
        listaClientes.add(c);
        borrarFormCliente();
        llenarCombosClientes();
    }//GEN-LAST:event_btnAgregarCuentaActionPerformed

    public void llenarCombosClientes(){
        Object clientes[]=new Object[listaClientes.size()];
        int i=0;
        for (Cliente c : listaClientes){
            clientes[i]=c.getNombre();
            i++;
        }
        cboCuentaCliente.setModel(new DefaultComboBoxModel(clientes));
        cboConsultaCliente.setModel(new DefaultComboBoxModel(clientes));
    }
    public void borrarFormCliente(){
        txtNombreCliente.setText("");
        txtTelefonoCliente.setText("");
        txtDireccionCliente.setText("");
        
    }
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
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarCuenta;
    private javax.swing.JButton btnAgregarMovimiento;
    private javax.swing.JButton btnAgregarTipoCuenta;
    private javax.swing.JComboBox<String> cboConsultaCliente;
    private javax.swing.JComboBox<String> cboConsultaTipoCuenta;
    private javax.swing.JComboBox<String> cboCuentaCliente;
    private javax.swing.JComboBox<String> cboTipoCuenta;
    private javax.swing.JComboBox<String> cboTipoMovimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMontoInicial;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTelefonoCliente;
    private javax.swing.JLabel lblTipoCuenta;
    private javax.swing.JTable tblMovimientos;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtMontoInicial;
    private javax.swing.JTextField txtMontoMovimiento;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
