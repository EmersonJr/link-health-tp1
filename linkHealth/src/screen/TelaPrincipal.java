/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screen;

import classes.PessoaFisica;
import classes.PessoaJuridica;
import classes.Usuario;

/**
 *
 * @author emers
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipalPJ
     */
    
    private Usuario user;
    
    public TelaPrincipal(Usuario inUser) {
        
        this.user = inUser;
        initComponents();
        getContentPane().setBackground(new java.awt.Color(149, 236, 236));
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        btnPerfil = new javax.swing.JButton();
        btnCarrinho = new javax.swing.JButton();
        btnCatalogo = new javax.swing.JButton();
        btnAcompPedi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bem-vindo(a)!!!");
        setAutoRequestFocus(false);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/initial_screen.jpg")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(78, 171, 176));

        btnPerfil.setBackground(new java.awt.Color(149, 236, 236));
        btnPerfil.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnPerfil.setForeground(new java.awt.Color(0, 102, 102));
        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-profile_icon-icons.com_71302_1.png"))); // NOI18N
        btnPerfil.setText("Perfil");
        btnPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPerfilMouseClicked(evt);
            }
        });
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnCarrinho.setBackground(new java.awt.Color(149, 236, 236));
        btnCarrinho.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCarrinho.setForeground(new java.awt.Color(0, 102, 102));
        btnCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/supermarketcart_89153.png"))); // NOI18N
        btnCarrinho.setText("Carrinho");
        btnCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarrinhoMouseClicked(evt);
            }
        });

        btnCatalogo.setBackground(new java.awt.Color(149, 236, 236));
        btnCatalogo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCatalogo.setForeground(new java.awt.Color(0, 102, 102));
        btnCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/catalog_icon_215654.png"))); // NOI18N
        btnCatalogo.setText("Catalogo");
        btnCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCatalogoMouseClicked(evt);
            }
        });
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });

        btnAcompPedi.setBackground(new java.awt.Color(149, 236, 236));
        btnAcompPedi.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAcompPedi.setForeground(new java.awt.Color(0, 102, 102));
        btnAcompPedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shoppingbag_5096.png"))); // NOI18N
        btnAcompPedi.setText("Acompanhar pedidos");
        btnAcompPedi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcompPediMouseClicked(evt);
            }
        });
        btnAcompPedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcompPediActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAcompPedi)
                    .addComponent(btnPerfil)
                    .addComponent(btnCatalogo)
                    .addComponent(btnCarrinho))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnPerfil)
                .addGap(28, 28, 28)
                .addComponent(btnCatalogo)
                .addGap(27, 27, 27)
                .addComponent(btnCarrinho)
                .addGap(31, 31, 31)
                .addComponent(btnAcompPedi)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseClicked

        if(this.user instanceof PessoaJuridica){

            new telaDePerfilPJ((PessoaJuridica)(this.user)).setVisible(true);
            return;
        }
        
        if(this.user instanceof PessoaFisica){
            
            new telaDePerfilPF((PessoaFisica)(this.user)).setVisible(true);
            return;
        }
    }//GEN-LAST:event_btnPerfilMouseClicked

    private void btnCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatalogoMouseClicked
        new telaDeCatalogo(this.user).setVisible(true);
    }//GEN-LAST:event_btnCatalogoMouseClicked

    private void btnCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarrinhoMouseClicked
        new telaDeCarrinho(user).setVisible(true);
    }//GEN-LAST:event_btnCarrinhoMouseClicked

    private void btnAcompPediMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcompPediMouseClicked
        new telaDeAcompanharPedidos(this.user).setVisible(true);
    }//GEN-LAST:event_btnAcompPediMouseClicked

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        
       
        if(this.user instanceof PessoaJuridica){
            
            new telaDePerfilPJ((PessoaJuridica)(this.user)).setVisible(true);
            return;
        }
        
        if(this.user instanceof PessoaFisica){
            
            new telaDePerfilPF((PessoaFisica)(this.user)).setVisible(true);
            return;
        }
        
        //TODO: add the Perfil Screen of the Distribuidor
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void btnAcompPediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcompPediActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcompPediActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcompPedi;
    private javax.swing.JButton btnCarrinho;
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
