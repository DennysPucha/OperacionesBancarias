/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Luis Hidalgo
 */
public class Banco extends javax.swing.JFrame {
    ArrayList<Cliente> listaClientes=new ArrayList<Cliente>();
    ArrayList<String> listaTipoCuenta=new ArrayList<String>();
    DefaultTableModel modelMovs=new DefaultTableModel();
    Cliente cliente;
    Cuenta cuenta;
    
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

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.jpeg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel2.setText("BANCO PRADO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("INGRESO CLIENTE"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Teléfono");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Dirección");

        btnAgregarCliente.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarCliente.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnAgregarCliente.setText("Agregar");
        btnAgregarCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("INGRESO CUENTA"));

        cboCuentaCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Cliente:");

        cboTipoCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Tipo Cuenta:");

        btnAgregarTipoCuenta.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnAgregarTipoCuenta.setText("+");
        btnAgregarTipoCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTipoCuentaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Monto:");

        btnAgregarCuenta.setBackground(new java.awt.Color(204, 204, 204));
        btnAgregarCuenta.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        btnAgregarCuenta.setText("Agregar");
        btnAgregarCuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(23, 23, 23)
                .addComponent(cboCuentaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(cboTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnAgregarTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(txtMontoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnAgregarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cboCuentaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMontoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(8, 8, 8)
                .addComponent(btnAgregarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("OPERACIONES"));

        cboConsultaCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboConsultaClienteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Cliente:");

        cboConsultaTipoCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Tipo Cuenta:");

        cboTipoMovimiento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboTipoMovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEPOSITO", "RETIRO" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Tipo Movimiento");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Monto:");

        btnAgregarMovimiento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregarMovimiento.setText("Realizar Movimiento");
        btnAgregarMovimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel10)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel11)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cboConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cboConsultaTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(cboTipoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtMontoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnAgregarMovimiento))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboConsultaTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboTipoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMontoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

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

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSaldo.setText("$100 Dolares");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("SALDO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel16)
                        .addGap(10, 10, 10)
                        .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(lblSaldo)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        Cliente c=new Cliente();
        c.setNombre(txtNombreCliente.getText());
        c.setTelefono(txtTelefonoCliente.getText());
        c.setDireccion(txtDireccionCliente.getText());
        listaClientes.add(c);
        borrarFormCliente();
        llenarCombosClientes();
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnAgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuentaActionPerformed
        cliente=listaClientes.get(cboCuentaCliente.getSelectedIndex());
        Cuenta cuenta=new Cuenta();
        cuenta.setTipoCuenta(listaTipoCuenta.get(cboTipoCuenta.getSelectedIndex()));
        cuenta.setMontoinicial(Double.parseDouble(txtMontoInicial.getText()));
        cliente.addCuenta(cuenta);
        
        Movimiento m=new Movimiento();
        m.setFechaMovimiento(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        m.setTipoMovimiento("APERTURA");
        m.setMonto(Double.parseDouble(txtMontoInicial.getText()));
        cuenta.addMovimiento(m);
        borrarFormCuenta();
        refrescarComboCuentas();
        verMovimientos();
    }//GEN-LAST:event_btnAgregarCuentaActionPerformed

    public void refrescarComboCuentas(){
        cliente = listaClientes.get(cboConsultaCliente.getSelectedIndex());
        int i=0;
        ArrayList<String> cuentas=new ArrayList<String>();
        for (Cuenta c : cliente.getMiscuentas()) {
            cuentas.add(c.getTipoCuenta());
        }
        cboConsultaTipoCuenta.setModel(new DefaultComboBoxModel(cuentas.toArray()));
    }
    private void btnAgregarTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTipoCuentaActionPerformed
        String tipoCuenta=JOptionPane.showInputDialog(this,"TIPO CUENTA");
        listaTipoCuenta.add(tipoCuenta);
        llenarCombosTipoCuenta();
    }//GEN-LAST:event_btnAgregarTipoCuentaActionPerformed

    private void cboConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboConsultaClienteActionPerformed
        
        refrescarComboCuentas();
        verMovimientos();
        verDatos();
    }//GEN-LAST:event_cboConsultaClienteActionPerformed
    public String aMoneda(double cantidad){
        cantidad=Math.round(cantidad*100.0)/100.0;
        DecimalFormat formato=new DecimalFormat("$ #,###.## USD");
        return formato.format(cantidad);
    }
    
    public void verDatos(){
        cliente=listaClientes.get(cboConsultaCliente.getSelectedIndex());
        lblNombreCliente.setText(cliente.getNombre());
        lblTelefonoCliente.setText(cliente.getTelefono());
        lblDireccionCliente.setText(cliente.getDireccion());
        
        if(cliente.getMiscuentas().size()>0){
            cuenta=cliente.getMiscuentas().get(cboConsultaTipoCuenta.getSelectedIndex());
            lblTipoCuenta.setText(cuenta.getTipoCuenta());
            lblMontoInicial.setText(aMoneda(cuenta.getMontoinicial()));
        }
    }
    public void verMovimientos(){
        
    }
    public void llenarCombosTipoCuenta(){
        Object tipos[]=new Object[listaTipoCuenta.size()];
        int i=0;
        for (String tipo : listaTipoCuenta){
            tipos[i]=tipo;
            i++;
        }
        cboTipoCuenta.setModel(new DefaultComboBoxModel(tipos));
        
    }
    
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
    public void borrarFormCuenta(){
        cboCuentaCliente.setSelectedIndex(0);
        cboTipoCuenta.setSelectedIndex(0);
        txtMontoInicial.setText("");
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
