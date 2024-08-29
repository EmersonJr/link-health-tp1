package screen;

import classes.Usuario;
import classes.database.UsersDB;
import javax.swing.JOptionPane;

public class telaDeLogin extends javax.swing.JFrame {

    /**
     * Creates new form telaDeLogin
     */
    
    private Boolean chcPf = false, chcPj = false, chcDistr = false;
    private UsersDB usersDB;
    
    public telaDeLogin() {
        initComponents();
        
        this.usersDB = new UsersDB();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPaswDistr = new javax.swing.JPasswordField();
        txtCNPJDistr = new javax.swing.JFormattedTextField();
        btnOKDistr = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        txtPaswPf = new javax.swing.JPasswordField();
        btnOKPf = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCNPJpj = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPaswPj = new javax.swing.JPasswordField();
        btnOkPj = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecione um usuário valido.");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/initial_screen.jpg")).getImage());
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(149, 236, 236));
        jTabbedPane1.setForeground(new java.awt.Color(0, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(78, 171, 176));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("CNPJ:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Senha:");

        txtPaswDistr.setBackground(new java.awt.Color(149, 236, 236));
        txtPaswDistr.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtPaswDistr.setForeground(new java.awt.Color(0, 102, 102));

        txtCNPJDistr.setBackground(new java.awt.Color(149, 236, 236));
        txtCNPJDistr.setForeground(new java.awt.Color(0, 102, 102));
        try {
            txtCNPJDistr.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJDistr.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N

        btnOKDistr.setBackground(new java.awt.Color(149, 236, 236));
        btnOKDistr.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnOKDistr.setForeground(new java.awt.Color(0, 102, 102));
        btnOKDistr.setText("OK");
        btnOKDistr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKDistrMouseClicked(evt);
            }
        });
        btnOKDistr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKDistrActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/warehouse_116463.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel1)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnOKDistr))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPaswDistr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCNPJDistr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCNPJDistr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaswDistr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addComponent(btnOKDistr)
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Distribuidor", jPanel2);

        jPanel4.setBackground(new java.awt.Color(78, 171, 176));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Senha:");

        txtCPF.setBackground(new java.awt.Color(149, 236, 236));
        txtCPF.setForeground(new java.awt.Color(0, 102, 102));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        txtPaswPf.setBackground(new java.awt.Color(149, 236, 236));
        txtPaswPf.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        btnOKPf.setBackground(new java.awt.Color(149, 236, 236));
        btnOKPf.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnOKPf.setForeground(new java.awt.Color(0, 102, 102));
        btnOKPf.setText("OK");
        btnOKPf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKPfMouseClicked(evt);
            }
        });
        btnOKPf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKPfActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/msn_user_avatar_person_people_icon_124220.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPaswPf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOKPf)
                .addGap(141, 141, 141))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPaswPf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnOKPf)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Pessoa Física", jPanel4);

        jPanel5.setBackground(new java.awt.Color(78, 171, 176));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("CNPJ:");

        txtCNPJpj.setBackground(new java.awt.Color(149, 236, 236));
        txtCNPJpj.setForeground(new java.awt.Color(0, 102, 102));
        try {
            txtCNPJpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJpj.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Senha:");

        txtPaswPj.setBackground(new java.awt.Color(149, 236, 236));
        txtPaswPj.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtPaswPj.setForeground(new java.awt.Color(0, 102, 102));

        btnOkPj.setBackground(new java.awt.Color(149, 236, 236));
        btnOkPj.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnOkPj.setForeground(new java.awt.Color(0, 102, 102));
        btnOkPj.setText("OK");
        btnOkPj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkPjMouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessmanoutline_102732.png"))); // NOI18N
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCNPJpj, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPaswPj, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnOkPj)
                .addGap(146, 146, 146))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(69, 69, 69)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCNPJpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(67, 67, 67)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPaswPj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnOkPj)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Pessoa Jurídica", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKDistrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKDistrMouseClicked
        
        String patCNPJ = "  .   .   /    -  ";
        String inCNPJ = txtCNPJDistr.getText();
        String inPsw = txtPaswDistr.getText();
        
        if(inCNPJ.equals(patCNPJ)){
            
            JOptionPane.showMessageDialog(null, "Insira um CNPJ valido!", "Erro", JOptionPane.ERROR_MESSAGE);
            txtCNPJDistr.setText(patCNPJ);
            txtPaswDistr.setText("");
            return;
        }
        
        if(inPsw.length() < 5){
            JOptionPane.showMessageDialog(null, "Insira uma senha valida!", "Erro", JOptionPane.ERROR_MESSAGE);
            txtCNPJDistr.setText(patCNPJ);
            txtPaswDistr.setText("");
            return;
        }
        // aqui iremos checar se esse usuário está no banco de dados
        Usuario aux = null;
        try{

            aux = this.usersDB.findOne(inCNPJ, inPsw, 0);
            
            System.out.println(aux);
            
            if(aux == null){
              JOptionPane.showMessageDialog(null, "CNPJ ou senha errados!", "Erro", JOptionPane.ERROR_MESSAGE);
              return;
            }
        }catch(Exception e){
        }
        this.setVisible(false);
        new telaPrincipalDistribuidor(aux).setVisible(true);
    }//GEN-LAST:event_btnOKDistrMouseClicked

    private void btnOKPfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKPfMouseClicked
        String patCPF = "   .   .   -  ";
        String inCPF = txtCPF.getText();
        String inPsw = txtPaswPf.getText();
        
        if(inCPF.equals(patCPF)){
            
            JOptionPane.showMessageDialog(null, "Insira um CPF valido!", "Erro", JOptionPane.ERROR_MESSAGE);
            txtCPF.setText(patCPF);
            txtPaswPf.setText("");
            return;
        }
        
        if(inPsw.length() < 5){
            JOptionPane.showMessageDialog(null, "Insira uma senha valida!", "Erro", JOptionPane.ERROR_MESSAGE);
            txtCPF.setText(patCPF);
            txtPaswPf.setText("");
            return;
        }
        
        // aqui iremos checar se esse usuário está no banco de dados
        
        Usuario aux = null;
        try{

            aux = this.usersDB.findOne(inCPF, inPsw, 1);

            if(aux == null){
              JOptionPane.showMessageDialog(null, "CPF ou senha errados!", "Erro", JOptionPane.ERROR_MESSAGE);
              return;
            }
        }catch(Exception e){
        }
        
        this.setVisible(false);
        new TelaPrincipal(aux).setVisible(true);
    }//GEN-LAST:event_btnOKPfMouseClicked

    private void btnOkPjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkPjMouseClicked
                
        String patCNPJ = "  .   .   /    -  ";
        String inCNPJ = txtCNPJpj.getText();
        String inPsw = txtPaswPj.getText();
        
        if(inCNPJ.equals(patCNPJ)){
            
            JOptionPane.showMessageDialog(null, "Insira um CNPJ valido!", "Erro", JOptionPane.ERROR_MESSAGE);
            txtCNPJpj.setText(patCNPJ);
            txtPaswPj.setText("");
            return;
        }
        
        if(inPsw.length() < 5){
            JOptionPane.showMessageDialog(null, "Insira uma senha valida!", "Erro", JOptionPane.ERROR_MESSAGE);
            txtCNPJpj.setText(patCNPJ);
            txtPaswPj.setText("");
            return;
        }
        
        // aqui iremos checar se esse usuário está no banco de dados
        Usuario aux = null;
        try{

            aux = this.usersDB.findOne(inCNPJ, inPsw, 2);

            if(aux == null){
              JOptionPane.showMessageDialog(null, "CNPJ ou senha errados!", "Erro", JOptionPane.ERROR_MESSAGE);
              return;
            }
        }catch(Exception e){
        }
        
        this.setVisible(false);
        new TelaPrincipal(aux).setVisible(true);
    }//GEN-LAST:event_btnOkPjMouseClicked

    private void btnOKDistrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKDistrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOKDistrActionPerformed

    private void btnOKPfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKPfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOKPfActionPerformed

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
            java.util.logging.Logger.getLogger(telaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaDeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOKDistr;
    private javax.swing.JButton btnOKPf;
    private javax.swing.JButton btnOkPj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JFormattedTextField txtCNPJDistr;
    private javax.swing.JFormattedTextField txtCNPJpj;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JPasswordField txtPaswDistr;
    private javax.swing.JPasswordField txtPaswPf;
    private javax.swing.JPasswordField txtPaswPj;
    // End of variables declaration//GEN-END:variables
}
