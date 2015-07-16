package GUI;

import javax.swing.JOptionPane;

public class HomeGerente extends javax.swing.JFrame {


    public HomeGerente() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cadastroProdutoButton = new javax.swing.JButton();
        vendaButton = new javax.swing.JButton();
        cadastroFuncionarioButton = new javax.swing.JButton();
        relatóriosButton = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cadastroClienteButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        buscaProdutoButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cadastrarMarcaButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cadastrarCategoriaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("GSTOK - Gerente");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Cadastrar Funcionário");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Cadastrar Produto");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Vender Produto");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Relatórios de Vendas");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        cadastroProdutoButton.setText("ok");
        cadastroProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroProdutoButtonActionPerformed(evt);
            }
        });

        vendaButton.setText("ok");
        vendaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendaButtonActionPerformed(evt);
            }
        });

        cadastroFuncionarioButton.setText("ok");
        cadastroFuncionarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroFuncionarioButtonActionPerformed(evt);
            }
        });

        relatóriosButton.setText("ok");
        relatóriosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatóriosButtonActionPerformed(evt);
            }
        });

        sair.setText("sair");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Cadastrar Cliente");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        cadastroClienteButton.setText("ok");
        cadastroClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroClienteButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Buscar Produto");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        buscaProdutoButton.setText("ok");
        buscaProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaProdutoButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Cadastrar Marca");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        cadastrarMarcaButton.setText("ok");
        cadastrarMarcaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarMarcaButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Cadastrar Categoria");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        cadastrarCategoriaButton.setText("ok");
        cadastrarCategoriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarCategoriaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastroProdutoButton)
                            .addComponent(cadastroFuncionarioButton)
                            .addComponent(cadastroClienteButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(buscaProdutoButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(cadastrarCategoriaButton)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(sair))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vendaButton)
                            .addComponent(cadastrarMarcaButton)
                            .addComponent(relatóriosButton))
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sair)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscaProdutoButton))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroClienteButton))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroProdutoButton))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroFuncionarioButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cadastrarCategoriaButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarMarcaButton)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vendaButton)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relatóriosButton))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroProdutoButtonActionPerformed
       CadastrarProduto cadastro = new CadastrarProduto();
       cadastro.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_cadastroProdutoButtonActionPerformed

    private void vendaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendaButtonActionPerformed

    private void cadastroFuncionarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroFuncionarioButtonActionPerformed
        CadastrarFuncionario cadastro = new CadastrarFuncionario();
        cadastro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cadastroFuncionarioButtonActionPerformed

    private void relatóriosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatóriosButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relatóriosButtonActionPerformed

    private void cadastroClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroClienteButtonActionPerformed
        CadastrarCliente cadastro = new CadastrarCliente();
        cadastro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cadastroClienteButtonActionPerformed

    private void buscaProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaProdutoButtonActionPerformed
        ConsultarProduto consulta = new ConsultarProduto();
        consulta.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_buscaProdutoButtonActionPerformed

    private void cadastrarCategoriaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarCategoriaButtonActionPerformed
        String categoria = null;
        categoria = JOptionPane.showInputDialog("Informe nova categoria");
        //CHAMAR FUNÇÃO PARA CADASTRO DE CATEGORIA
    }//GEN-LAST:event_cadastrarCategoriaButtonActionPerformed

    private void cadastrarMarcaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarMarcaButtonActionPerformed
       String marca = null;
       marca = JOptionPane.showInputDialog("Informe o nome da marca");
       //CHAMAR FUNÇÃO PARA CADASTRO DE MARCA
    }//GEN-LAST:event_cadastrarMarcaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomeGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscaProdutoButton;
    private javax.swing.JButton cadastrarCategoriaButton;
    private javax.swing.JButton cadastrarMarcaButton;
    private javax.swing.JButton cadastroClienteButton;
    private javax.swing.JButton cadastroFuncionarioButton;
    private javax.swing.JButton cadastroProdutoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton relatóriosButton;
    private javax.swing.JButton sair;
    private javax.swing.JButton vendaButton;
    // End of variables declaration//GEN-END:variables
}
