/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.locadora.view;

import com.br.locadora.controller.ClienteController;
import com.br.locadora.exception.ExceptionDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaCadastroCliente extends javax.swing.JFrame {

    private Integer codCliente =0;
    public TelaCadastroCliente() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloCliente = new javax.swing.JLabel();
        jPanelCadastroCliente = new javax.swing.JPanel();
        jLabelDataNascimento = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome1 = new javax.swing.JLabel();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jLabelCpf = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jButtonSalvar1 = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vídeo Locadora");
        setResizable(false);

        jLabelTituloCliente.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelTituloCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensResouces/icon.png"))); // NOI18N
        jLabelTituloCliente.setText("Cadastro de Cliente");

        jPanelCadastroCliente.setBackground(new java.awt.Color(153, 153, 153));
        jPanelCadastroCliente.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelDataNascimento.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDataNascimento.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataNascimento.setText("Data de Nascimento:");

        jTextFieldNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabelNome1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNome1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelNome1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome1.setText("Nome:");

        try {
            jFormattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataNascimento.setText("  -");
        jFormattedTextFieldDataNascimento.setToolTipText("");
        jFormattedTextFieldDataNascimento.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        jLabelCpf.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCpf.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelCpf.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCpf.setText("CPF:");

        jLabelEmail.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("E-mail:");

        jLabelEndereco.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEndereco.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEndereco.setText("Endereço:");

        try {
            jFormattedTextFieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCpf.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        jTextFieldEndereco.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jTextFieldEmail.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jButtonConsultar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirtelaConsultarCliente(evt);
            }
        });

        jButtonSalvar1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButtonSalvar1.setText("Salvar");
        jButtonSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvar1ActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");

        jButtonCancelar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");

        jButtonExcluir.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroClienteLayout = new javax.swing.GroupLayout(jPanelCadastroCliente);
        jPanelCadastroCliente.setLayout(jPanelCadastroClienteLayout);
        jPanelCadastroClienteLayout.setHorizontalGroup(
            jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addComponent(jButtonLimpar)
                        .addGap(22, 22, 22)
                        .addComponent(jButtonCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addGap(19, 19, 19))
                    .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome1)
                            .addComponent(jLabelCpf)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelEndereco))
                        .addGap(30, 30, 30)
                        .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(jButtonSalvar1)
                    .addContainerGap(586, Short.MAX_VALUE)))
        );
        jPanelCadastroClienteLayout.setVerticalGroup(
            jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroClienteLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome1))
                .addGap(30, 30, 30)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDataNascimento))
                .addGap(30, 30, 30)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpf)
                    .addComponent(jFormattedTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonExcluir))
                .addGap(28, 28, 28))
            .addGroup(jPanelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroClienteLayout.createSequentialGroup()
                    .addContainerGap(341, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar1)
                    .addGap(26, 26, 26)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabelTituloCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabelTituloCliente)
                .addGap(18, 18, 18)
                .addComponent(jPanelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvar1ActionPerformed
       
        boolean sucesso;
        
        try {
            ClienteController clienteController = new ClienteController();
            
            
            if(this.codCliente == 0){
                  sucesso =  clienteController.cadastratCliente(jTextFieldNome.getText(), jFormattedTextFieldCpf.getText()
                    ,jTextFieldEmail.getText(),jTextFieldEndereco.getText(),jFormattedTextFieldDataNascimento.getText());
            
            }else{
                
                 sucesso =  clienteController.alterarCliente(this.codCliente, jTextFieldNome.getText(), jFormattedTextFieldCpf.getText()
                    ,jTextFieldEmail.getText(),jTextFieldEndereco.getText(),jFormattedTextFieldDataNascimento.getText());
            }
            
            if(sucesso){
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
            
            }else{
                
                JOptionPane.showMessageDialog(null, "Campos Não preenchidos Corretamente");
                    
                }
            
            
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_jButtonSalvar1ActionPerformed

    private void abrirtelaConsultarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirtelaConsultarCliente
            TelaConsultaCliente telaConsultaCliente = new TelaConsultaCliente(this);
            this.setVisible(false);
            telaConsultaCliente.setVisible(true);
            
    }//GEN-LAST:event_abrirtelaConsultarCliente

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        boolean sucesso;
        
        ClienteController clienteController = new ClienteController();
        try {
           sucesso =  clienteController.excluirCliente(this.codCliente);
           
           if(sucesso){
               JOptionPane.showMessageDialog(null, "Cliente Excluído com Sucesso");
               this.limparTela();
           
           }else{
               JOptionPane.showMessageDialog(null, "Selecione um Cliente");
           }
        } catch (ExceptionDao ex) {
            
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed
   
    
    public void buscarCliente(Integer codClliente, String nome, String cpf, String email, String endereco, Date dtnascimento) {
       
        codClliente = codClliente;
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        
        
        this.jTextFieldNome.setText(nome);
        this.jTextFieldEmail.setText(email);
        this.jFormattedTextFieldCpf.setText(cpf);
        this.jTextFieldEndereco.setText(endereco);
        this.jFormattedTextFieldDataNascimento.setText(dataFormatada.format(dtnascimento));
        this.codCliente = codClliente;
        
        
        
    }
    
    private void limparTela(){
        jTextFieldNome.setText("");
        jFormattedTextFieldDataNascimento.setText("");
        jFormattedTextFieldCpf.setText("");
        jTextFieldEmail.setText("");
        jTextFieldEndereco.setText("");
    }
    
    private void limparTelaCadastroCliente(java.awt.event.MouseEvent evt){
    this.limparTela();
    
    }
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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar1;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JLabel jLabelTituloCliente;
    private javax.swing.JPanel jPanelCadastroCliente;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

   
}
