/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.locadora.view;

import com.br.locadora.controller.AtorController;
import com.br.locadora.controller.FilmeController;
import javax.swing.JOptionPane;

/**
 *
 * @author procopio
 */
public class TelaCadastroAtor extends javax.swing.JFrame {

    private Integer codAtor =0;
    public TelaCadastroAtor() {
        initComponents();
    }
    
    public void buscarAtor(Integer codAtor, String nome, String nacionalidade){
        
        this.codAtor = codAtor;
        jTextFieldNome.setText(nome);
        jComboBoxNacionalidade.getModel().setSelectedItem(nacionalidade);
    
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCadastroAtor = new javax.swing.JLabel();
        jPanelPrincipal = new javax.swing.JPanel();
        jLabelnacionalidade = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome1 = new javax.swing.JLabel();
        jComboBoxNacionalidade = new javax.swing.JComboBox<>();
        jButtonSalvar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vídeo Locadora ");
        setResizable(false);

        jLabelCadastroAtor.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelCadastroAtor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensResouces/icon.png"))); // NOI18N
        jLabelCadastroAtor.setText("Cadastro Ator");

        jPanelPrincipal.setBackground(new java.awt.Color(153, 153, 153));
        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelnacionalidade.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelnacionalidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelnacionalidade.setText("Nacionalidade:");

        jTextFieldNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabelNome1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNome1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome1.setText("Nome:");

        jComboBoxNacionalidade.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jComboBoxNacionalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Nacionalidade", "Português", "Indiano", "Inglês" }));
        jComboBoxNacionalidade.setToolTipText("");

        jButtonSalvar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonConsultar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaConsultaAtor(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");

        jButtonCancelar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");

        jButtonApagar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButtonApagar.setText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNome1)
                            .addComponent(jLabelnacionalidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jButtonSalvar)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonLimpar)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonCancelar)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonApagar)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome1)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelnacionalidade)
                    .addComponent(jComboBoxNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonApagar))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabelCadastroAtor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelCadastroAtor)
                .addGap(18, 18, 18)
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        String nome = jTextFieldNome.getText();
        String nacionalidade = jComboBoxNacionalidade.getSelectedItem().toString();
        boolean sucesso;
        
        try {
            AtorController atorController = new AtorController();
            
            if(this.codAtor == 0){
                 sucesso = atorController.cadastrarAtor(nome, nacionalidade);
            }else{
             sucesso = atorController.alterarAtor(codAtor, nome, nacionalidade);
            }
            
            if(sucesso == true){
            
                JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível realizar cadastro");

            }
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void abrir_telaConsultaAtor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaConsultaAtor
      TelaConsultaAtor telaConsultaAtor = new TelaConsultaAtor(this);
      this.setVisible(false);
      telaConsultaAtor.setVisible(true);
      
      
    }//GEN-LAST:event_abrir_telaConsultaAtor

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        boolean sucesso;
        
        
    }//GEN-LAST:event_jButtonApagarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAtor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxNacionalidade;
    private javax.swing.JLabel jLabelCadastroAtor;
    private javax.swing.JLabel jLabelNome1;
    private javax.swing.JLabel jLabelnacionalidade;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
