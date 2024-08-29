/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package screen;

import classes.Distribuidor;
import classes.Usuario;
import classes.database.UsersDB;
import javax.swing.JOptionPane;

/**
 *
 * @author Notebook
 */
public class telaDePerfilDistribuidor extends javax.swing.JFrame {

    /**
     * Creates new form telaDePerfilDistribuidor
     */
    
    Distribuidor user;
    UsersDB userDB;
    public telaDePerfilDistribuidor(Distribuidor user) {
        this.user = user;
        this.userDB = new UsersDB();
        initComponents();
        
        this.txtCNPJ.setEnabled(false);
        this.txtName.setEnabled(false);
        this.hasAcceptPF.setEnabled(false);
        this.btnSubmit.setEnabled(false);
        this.excludeBTN.setEnabled(true);
        this.editButton.setEnabled(true);
        // setando as informações do usuário
        
        this.txtCNPJ.setText(this.user.getCnpj());
        this.txtName.setText(this.user.getNome());
        this.hasAcceptPF.setSelected(this.user.isAceitaPessoaFisica());

        
        
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        editButton = new javax.swing.JButton();
        excludeBTN = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hasAcceptPF = new javax.swing.JRadioButton();
        txtCNPJ = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(149, 236, 236));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-profile_icon-icons.com_71302.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Perfil Distribuidor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(78, 171, 176));

        editButton.setBackground(new java.awt.Color(149, 236, 236));
        editButton.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(0, 102, 102));
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3643749-edit-pen-pencil-write-writing_113397.png"))); // NOI18N
        editButton.setText("Editar");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        excludeBTN.setBackground(new java.awt.Color(149, 236, 236));
        excludeBTN.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        excludeBTN.setForeground(new java.awt.Color(0, 102, 102));
        excludeBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lixeira_menor.png"))); // NOI18N
        excludeBTN.setText("Excluir");
        excludeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excludeBTNActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(149, 236, 236));
        btnSubmit.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 102, 102));
        btnSubmit.setText("OK");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Nome:");

        txtName.setBackground(new java.awt.Color(149, 236, 236));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("CNPJ:");

        hasAcceptPF.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        hasAcceptPF.setForeground(new java.awt.Color(0, 102, 102));
        hasAcceptPF.setText("Aceita pessoa física:");
        hasAcceptPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasAcceptPFActionPerformed(evt);
            }
        });

        txtCNPJ.setBackground(new java.awt.Color(149, 236, 236));
        txtCNPJ.setForeground(new java.awt.Color(0, 102, 102));
        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCNPJActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtName))
                            .addComponent(hasAcceptPF)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(editButton)
                        .addGap(34, 34, 34)
                        .addComponent(excludeBTN)
                        .addGap(34, 34, 34)
                        .addComponent(btnSubmit)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(hasAcceptPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(btnSubmit)
                    .addComponent(excludeBTN))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hasAcceptPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasAcceptPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasAcceptPFActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String patCnpj  = "  .   .   /    -  ";
        String inCNPJ = this.txtCNPJ.getText();
        String inNome = this.txtName.getText();
        Boolean inAcceptPF = this.hasAcceptPF.isSelected();
        
        if(inCNPJ.contains(" ")){
            JOptionPane.showMessageDialog(null, "Insira um CNPJ valido!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(inNome.equals("")){
            JOptionPane.showMessageDialog(null, "O campo de Nome não pode estar vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        this.user.setCnpj(inCNPJ);
        this.user.setAceitaPessoaFisica(inAcceptPF);
        this.user.setNome(inNome);
        
        try{
            this.userDB.update(this.user);
        } catch(Exception e){
            System.out.println(e);
        }
        
        // trazendo os espaços de input para o estado original
        
        this.txtCNPJ.setEnabled(false);
        this.txtName.setEnabled(false);
        this.hasAcceptPF.setEnabled(false);
        this.editButton.setEnabled(true);
        this.excludeBTN.setEnabled(true);
        this.btnSubmit.setEnabled(false);
        
        // resetando as informações do usuário
        
        this.txtCNPJ.setText(user.getCnpj());
        this.txtName.setText(user.getNome());
        this.hasAcceptPF.setSelected(user.isAceitaPessoaFisica());
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        this.txtCNPJ.setEnabled(true);
        this.txtName.setEnabled(true);
        this.hasAcceptPF.setEnabled(true);
        this.editButton.setEnabled(true);
        this.excludeBTN.setEnabled(false);
        this.btnSubmit.setEnabled(false);
    }//GEN-LAST:event_editButtonActionPerformed

    private void txtCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCNPJActionPerformed

    private void excludeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excludeBTNActionPerformed
        try{
            this.userDB.deleteUsuario(this.user.getId());
        } catch(Exception e){

            System.out.println(e);
        }

        System.exit(0);
    }//GEN-LAST:event_excludeBTNActionPerformed

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
            java.util.logging.Logger.getLogger(telaDePerfilDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDePerfilDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDePerfilDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDePerfilDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDePerfilDistribuidor(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton editButton;
    private javax.swing.JButton excludeBTN;
    private javax.swing.JRadioButton hasAcceptPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
