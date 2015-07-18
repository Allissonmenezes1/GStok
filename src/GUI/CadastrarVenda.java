package GUI;

import BO.VendaBO;
import DAO.ClienteDAO;
import DAO.ProdutoDAO;
import PO.Cliente;
import PO.Funcionario;
import PO.Produto;
import com.sun.jmx.snmp.BerDecoder;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastrarVenda extends javax.swing.JFrame {

    public CadastrarVenda() {
        initComponents();
        this.func = null;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        descricaoTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        codBarrasTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        quantidadeTextField = new javax.swing.JTextField();
        cancelaButton = new javax.swing.JButton();
        finalizaButton = new javax.swing.JButton();
        adicionarProdutoButton = new javax.swing.JButton();
        totalVendaTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        notaFiscalTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        valorUnitarioTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        subtotalTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Cadastrar Venda");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Descrição:");
        jLabel3.setOpaque(true);

        descricaoTextField.setEditable(false);
        descricaoTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        descricaoTextField.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Total:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Cód. Barras:");

        codBarrasTextField.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        codBarrasTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codBarrasTextFieldKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Quantidade");

        quantidadeTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quantidadeTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantidadeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantidadeTextFieldFocusGained(evt);
            }
        });
        quantidadeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantidadeTextFieldKeyReleased(evt);
            }
        });

        cancelaButton.setText("Cancelar Venda");
        cancelaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaButtonActionPerformed(evt);
            }
        });

        finalizaButton.setText("Finalizar Venda");
        finalizaButton.setEnabled(false);
        finalizaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizaButtonActionPerformed(evt);
            }
        });

        adicionarProdutoButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        adicionarProdutoButton.setText("Adicionar Produto");
        adicionarProdutoButton.setEnabled(false);
        adicionarProdutoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarProdutoButtonActionPerformed(evt);
            }
        });

        totalVendaTextField.setEditable(false);
        totalVendaTextField.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        totalVendaTextField.setFocusable(false);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Comprovante de Venda");

        notaFiscalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.", "Nome", "Val. Unitário", "Qtd", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        notaFiscalTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        notaFiscalTable.setAutoscrolls(false);
        notaFiscalTable.setFocusable(false);
        notaFiscalTable.setRequestFocusEnabled(false);
        notaFiscalTable.setRowHeight(20);
        notaFiscalTable.setShowVerticalLines(false);
        notaFiscalTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(notaFiscalTable);
        if (notaFiscalTable.getColumnModel().getColumnCount() > 0) {
            notaFiscalTable.getColumnModel().getColumn(0).setResizable(false);
            notaFiscalTable.getColumnModel().getColumn(0).setPreferredWidth(120);
            notaFiscalTable.getColumnModel().getColumn(1).setMinWidth(250);
            notaFiscalTable.getColumnModel().getColumn(2).setResizable(false);
            notaFiscalTable.getColumnModel().getColumn(2).setPreferredWidth(90);
            notaFiscalTable.getColumnModel().getColumn(3).setResizable(false);
            notaFiscalTable.getColumnModel().getColumn(3).setPreferredWidth(40);
            notaFiscalTable.getColumnModel().getColumn(4).setMinWidth(90);
        }

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Val. Unitário");

        valorUnitarioTextField.setEditable(false);
        valorUnitarioTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valorUnitarioTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        valorUnitarioTextField.setFocusable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Subtotal");

        subtotalTextField.setEditable(false);
        subtotalTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subtotalTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subtotalTextField.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codBarrasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(323, 323, 323))
                                    .addComponent(descricaoTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(subtotalTextField)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(valorUnitarioTextField)
                                    .addComponent(quantidadeTextField)
                                    .addComponent(adicionarProdutoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(cancelaButton)
                        .addGap(118, 118, 118)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalVendaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finalizaButton)
                        .addGap(91, 91, 91))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codBarrasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantidadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorUnitarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adicionarProdutoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalVendaTextField)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancelaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(finalizaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaButtonActionPerformed
        if(this.func.getGerente()){
            HomeGerente home = new HomeGerente();
            home.setFuncionario(this.func);
            home.setVisible(true);
            this.setVisible(false);
        }
        else{
            HomeFuncionario home = new HomeFuncionario();
            home.setFuncionario(this.func);
            home.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cancelaButtonActionPerformed

    private void finalizaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizaButtonActionPerformed
        String cpfCliente = JOptionPane.showInputDialog(this, "Informe o cpf do cliente");
        ClienteDAO c = new ClienteDAO();
        Cliente cliente;
        if(cpfCliente != null)
            cliente = c.getCliente(cpfCliente);
        else
            cliente = null;
        if(cliente != null){
            if(new VendaBO().realizarVenda(produtos, this.func.getCPF(), cpfCliente)){
                JOptionPane.showMessageDialog(this, "Venda Finalizada com sucesso!");
                CadastrarVenda venda = new CadastrarVenda();
                venda.setFuncionario(this.func);
                venda.setVisible(true);
                this.setVisible(false);
            }
            else
                JOptionPane.showMessageDialog(this, "Venda não finalizada!", null, JOptionPane.ERROR_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this, "Cliente não cadastrado!", null, JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_finalizaButtonActionPerformed

    private void adicionarProdutoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarProdutoButtonActionPerformed
        Produto p = new ProdutoDAO().buscarProduto(codBarrasTextField.getText());
        p.setQuantidade(Integer.parseInt(quantidadeTextField.getText()));
        produtos.add(p);
        DefaultTableModel modelo = (DefaultTableModel) notaFiscalTable.getModel();
        modelo.setRowCount(notaFiscalTable.getRowCount());
        modelo.addRow(new Object[]{p.getCodBarras(), p.getNome() + " " + p.getDescricao(), "R$" + p.getPreco(), p.getQuantidade(), subtotalTextField.getText()});
        finalizaButton.setEnabled(true);
        this.totalVenda+=Double.parseDouble(subtotalTextField.getText().replace("R$ ", "").replace(",", "."));
        this.quantidadeMaxima-= p.getQuantidade();
        totalVendaTextField.setText("R$ "+this.totalVenda);
        codBarrasTextField.setText(null);
        descricaoTextField.setText(null);
        quantidadeTextField.setText(null);
        valorUnitarioTextField.setText(null);
        subtotalTextField.setText(null);
        adicionarProdutoButton.setEnabled(false);
        codBarrasTextField.requestFocus();
    }//GEN-LAST:event_adicionarProdutoButtonActionPerformed

    private void codBarrasTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codBarrasTextFieldKeyReleased
        Produto p = new ProdutoDAO().buscarProduto(codBarrasTextField.getText());
        if(p != null){
            this.quantidadeMaxima = p.getQuantidade();
            for(int i = 0; i < produtos.size(); i++){
                if(produtos.get(i).getCodBarras().equals(codBarrasTextField.getText()))
                    this.quantidadeMaxima -= produtos.get(i).getQuantidade();
            }
            if(this.quantidadeMaxima > 0){
                descricaoTextField.setText(p.getNome()+" "+p.getDescricao());
                valorUnitarioTextField.setText("R$ "+p.getPreco());
                quantidadeTextField.requestFocus();
            }
            else{
                descricaoTextField.setText("");
                valorUnitarioTextField.setText("R$");
                JOptionPane.showMessageDialog(this, "Produto sem estoque!");
            }
        }
        else{
            descricaoTextField.setText("");
            valorUnitarioTextField.setText("R$");
            subtotalTextField.setText("");
            adicionarProdutoButton.setEnabled(false);
            this.quantidadeMaxima = 0;
            
        }
        quantidadeTextField.setText("");
    }//GEN-LAST:event_codBarrasTextFieldKeyReleased

    private void quantidadeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeTextFieldKeyReleased
        if(eNumero(quantidadeTextField.getText())){
            int quantidade = Integer.parseInt(quantidadeTextField.getText());
            if(quantidade > 0 && quantidade <= this.quantidadeMaxima){
                quantidadeTextField.setForeground(Color.black);
                double valorUnitario = Double.parseDouble(valorUnitarioTextField.getText().replace("R$ ", ""));
                subtotalTextField.setText("R$ "+ String.format("%.2f", (quantidade*valorUnitario)));
                adicionarProdutoButton.setEnabled(true);
            }
            else{
                quantidadeTextField.setForeground(Color.red);
                subtotalTextField.setText("");
                adicionarProdutoButton.setEnabled(false);
            }
        }
        else{
            quantidadeTextField.setText("");
            subtotalTextField.setText("");
            adicionarProdutoButton.setEnabled(false);
        }
    }//GEN-LAST:event_quantidadeTextFieldKeyReleased

    private void quantidadeTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantidadeTextFieldFocusGained
        quantidadeTextField.setText("");
        subtotalTextField.setText("");
    }//GEN-LAST:event_quantidadeTextFieldFocusGained

    public void setFuncionario(Funcionario f){
        this.func = new Funcionario(f);
    }
    
    private boolean eNumero(String str){
        try{
          double d = Integer.parseInt(str);
        } catch(NumberFormatException nfe) {
          return false;
        }
        return true;
    }
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(CadastrarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarVenda().setVisible(true);
            }
        });
    }

    private ArrayList<Produto> produtos = new ArrayList();
    private Double totalVenda = 0.0;
    private Funcionario func;
    private int quantidadeMaxima;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarProdutoButton;
    private javax.swing.JButton cancelaButton;
    private javax.swing.JTextField codBarrasTextField;
    private javax.swing.JTextField descricaoTextField;
    private javax.swing.JButton finalizaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable notaFiscalTable;
    private javax.swing.JTextField quantidadeTextField;
    private javax.swing.JTextField subtotalTextField;
    private javax.swing.JTextField totalVendaTextField;
    private javax.swing.JTextField valorUnitarioTextField;
    // End of variables declaration//GEN-END:variables
}
