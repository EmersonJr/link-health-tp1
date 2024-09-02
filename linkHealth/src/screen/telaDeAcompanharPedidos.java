/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screen;

import classes.Compra;
import classes.Produto;
import classes.Usuario;
import classes.database.ComprasDB;
import classes.database.UsersDB;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author psisn
 */
public class telaDeAcompanharPedidos extends javax.swing.JFrame {

    /**
     * Creates new form telaDeAcompanharPedidos
     */
    private Usuario user;
    private ComprasDB comprDB;
    private ArrayList<Compra> compras;
    private String orderBy = "Padrão";
    private String entregRetir = "Todos";
    private String stat = "Todos";
    private double price =  -1;
    
    public telaDeAcompanharPedidos(Usuario user) {
        
        this.user = user;
        
        initComponents();
        
        btnSeeDetails.setEnabled(false);
        
        this.comprDB = new ComprasDB();
        
        try{
            
           this.compras = this.comprDB.findAll();
        }catch(Exception e){
        }
     
        this.carregarTabela();
    }
    
    public void carregarTabela(){
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Status", "Preço", "Entrega ou retirada"}, 0);
        
        ArrayList<Compra> buys = this.handleCompras();
        
        // se o atributo da compra - entregaOuRetirado for true -> entrga
        // false -> retirada
        
        for(Compra buy : buys){
            Object linha[];
            
            
            String stat = "Cancelado";
            
            if(buy.getStatus() == Compra.fromStringToStatus("PENDENTE"))
                stat = "Pendente";
            
            if(buy.getStatus() == Compra.fromStringToStatus("PAGO"))
                    stat = "Pago";
            
            String entegRetir = buy.isEntregaOuRetirada() ? "Entrega" : "Retirada";
            linha =  new Object[] {
                stat,
                Double.toString(buy.getCarrinhoIni().getTotal()),
                entegRetir
            };
            
            if(stat.compareTo(this.stat) != 0 && this.stat.compareTo("Todos") != 0) continue;
            if(entegRetir.compareTo(this.entregRetir) != 0 && this.entregRetir.compareTo("Todos") != 0) continue;
            if(buy.getCarrinhoIni().getTotal() != this.price && this.price != -1) continue;
            
            modelo.addRow(linha);
        }
        
        tblCompras.setModel(modelo);
    }
    
    public ArrayList<Compra> handleCompras(){
        
        ArrayList<Compra> retorno = (ArrayList<Compra>) compras.clone();
        
        
        Collections.sort(retorno, new Comparator<Compra>() {
            @Override
            public int compare(Compra a, Compra b) {
                if(orderBy.equals("Mais Caro")) return a.getCarrinhoIni().getTotal() > b.getCarrinhoIni().getTotal() ? -1 : 1;
                if(orderBy.equals("Mais Barato"))  return a.getCarrinhoIni().getTotal() < b.getCarrinhoIni().getTotal() ? -1 : 1;
                return (a.getCarrinhoIni().getTotal() - b.getCarrinhoIni().getTotal()) < 0 ? -1 : 1;
            }
        });
         
        return retorno;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompras = new javax.swing.JTable();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cboxOrder = new javax.swing.JComboBox<>();
        btnPesquisar = new javax.swing.JButton();
        btnOK = new javax.swing.JButton();
        cboxStatus = new javax.swing.JComboBox<>();
        cboxEntrRetir = new javax.swing.JComboBox<>();
        btnSeeDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(149, 236, 236));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(149, 236, 236));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status do Pedido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(78, 171, 176));

        lblStatus.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(0, 102, 102));
        lblStatus.setText("Status:");

        lblTipo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(0, 102, 102));
        lblTipo.setText("Tipo de Entrega:");

        tblCompras.setBackground(new java.awt.Color(78, 171, 176));
        tblCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Status", "Preço", "Entrega ou retirada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class
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
        tblCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblComprasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCompras);

        lblPreco.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(0, 102, 102));
        lblPreco.setText("Preço Total:");

        txtPreco.setEditable(false);
        txtPreco.setBackground(new java.awt.Color(78, 171, 176));
        txtPreco.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtPreco.setForeground(new java.awt.Color(0, 102, 102));
        txtPreco.setEnabled(false);
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Ordenar:");

        cboxOrder.setBackground(new java.awt.Color(78, 171, 176));
        cboxOrder.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cboxOrder.setForeground(new java.awt.Color(0, 102, 102));
        cboxOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padrão", "Mais caro", "Mais barato" }));
        cboxOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxOrderActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(78, 171, 176));
        btnPesquisar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(0, 102, 102));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnOK.setBackground(new java.awt.Color(78, 171, 176));
        btnOK.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnOK.setForeground(new java.awt.Color(0, 102, 102));
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        cboxStatus.setBackground(new java.awt.Color(78, 171, 176));
        cboxStatus.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cboxStatus.setForeground(new java.awt.Color(0, 102, 102));
        cboxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Pendente", "Pago", "Cancelado" }));
        cboxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxStatusActionPerformed(evt);
            }
        });

        cboxEntrRetir.setBackground(new java.awt.Color(78, 171, 176));
        cboxEntrRetir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cboxEntrRetir.setForeground(new java.awt.Color(0, 102, 102));
        cboxEntrRetir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Entrega", "Retirada" }));
        cboxEntrRetir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxEntrRetirActionPerformed(evt);
            }
        });

        btnSeeDetails.setBackground(new java.awt.Color(78, 171, 176));
        btnSeeDetails.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnSeeDetails.setForeground(new java.awt.Color(0, 102, 102));
        btnSeeDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye_visible_hide_hidden_show_icon_145988.png"))); // NOI18N
        btnSeeDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPreco)
                        .addGap(34, 34, 34)
                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnPesquisar)
                        .addGap(27, 27, 27)
                        .addComponent(btnOK)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeeDetails))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboxEntrRetir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStatus)
                            .addComponent(cboxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cboxOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(cboxEntrRetir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSeeDetails))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOK)
                            .addComponent(btnPesquisar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        this.btnPesquisar.setEnabled(false);
        this.cboxEntrRetir.setEnabled(false);
        this.cboxOrder.setEnabled(false);
        this.cboxStatus.setEnabled(false);
        this.btnOK.setEnabled(true);
        this.txtPreco.setEnabled(true);

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void cboxOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxOrderActionPerformed

        this.orderBy = this.cboxOrder.getSelectedItem().toString();

        this.carregarTabela();
    }//GEN-LAST:event_cboxOrderActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed

    }//GEN-LAST:event_txtPrecoActionPerformed

    private void cboxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxStatusActionPerformed
        
        this.stat = this.cboxStatus.getSelectedItem().toString();
        
        this.carregarTabela();
    }//GEN-LAST:event_cboxStatusActionPerformed

    private void cboxEntrRetirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxEntrRetirActionPerformed
        
        this.entregRetir = this.cboxEntrRetir.getSelectedItem().toString();
        
        this.carregarTabela();
    }//GEN-LAST:event_cboxEntrRetirActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        
        String inNum = this.txtPreco.getText();
        
        double preco = -1;
        try {
            
            preco = Double.parseDouble(inNum);
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Insira um preço valido!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        this.price = preco;
        this.btnPesquisar.setEnabled(true);
        this.cboxEntrRetir.setEnabled(true);
        this.cboxOrder.setEnabled(true);
        this.cboxStatus.setEnabled(true);
        this.btnOK.setEnabled(false);
        this.txtPreco.setEnabled(false);
        this.carregarTabela();
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnSeeDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeDetailsActionPerformed
        Compra _compra = this.compras.get(tblCompras.getSelectedRow());
        
        new telaDetalhesPedido(_compra).setVisible(true);
    }//GEN-LAST:event_btnSeeDetailsActionPerformed

    private void tblComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComprasMouseClicked
        int i = tblCompras.getSelectedRow();
        if(i >= 0 && i < this.compras.size())
        {
            btnSeeDetails.setEnabled(true);
            
        }
    }//GEN-LAST:event_tblComprasMouseClicked

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
            java.util.logging.Logger.getLogger(telaDeAcompanharPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDeAcompanharPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDeAcompanharPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDeAcompanharPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDeAcompanharPedidos(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSeeDetails;
    private javax.swing.JComboBox<String> cboxEntrRetir;
    private javax.swing.JComboBox<String> cboxOrder;
    private javax.swing.JComboBox<String> cboxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTable tblCompras;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
