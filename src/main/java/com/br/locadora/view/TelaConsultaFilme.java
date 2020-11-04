
package com.br.locadora.view;

import com.br.locadora.controller.FilmeController;
import com.br.locadora.exception.ExceptionDao;
import com.br.locadora.model.Filme;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaConsultaFilme extends javax.swing.JFrame {

    private TelaCadastroFilme telacadastroFilme;
    
    public TelaConsultaFilme() {
        initComponents();
    }

  
    public TelaConsultaFilme(TelaCadastroFilme telacadastroFilme){
    
        this.telacadastroFilme = telacadastroFilme;
        initComponents();
    
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanelConsultaFilme = new javax.swing.JPanel();
        jLabelTituloFilme = new javax.swing.JLabel();
        jTextFieldTituloNome = new javax.swing.JTextField();
        jButtonConsultarFilme = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableColsultaFilme = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Busca dFilme");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                FecharJanela(evt);
            }
        });

        jPanelConsultaFilme.setBackground(new java.awt.Color(102, 102, 102));

        jLabelTituloFilme.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabelTituloFilme.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloFilme.setText("Informe Título Filme");

        jTextFieldTituloNome.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jTextFieldTituloNome.setToolTipText("Informe o título do Filme");

        jButtonConsultarFilme.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButtonConsultarFilme.setText("Buscar");
        jButtonConsultarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarFilme(evt);
            }
        });

        jTableColsultaFilme.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTableColsultaFilme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Título", "Gênero", "Sinopse", "Duração"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jTableColsultaFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableColsultaFilmeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableColsultaFilme);

        javax.swing.GroupLayout jPanelConsultaFilmeLayout = new javax.swing.GroupLayout(jPanelConsultaFilme);
        jPanelConsultaFilme.setLayout(jPanelConsultaFilmeLayout);
        jPanelConsultaFilmeLayout.setHorizontalGroup(
            jPanelConsultaFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaFilmeLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelTituloFilme)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldTituloNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonConsultarFilme)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaFilmeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanelConsultaFilmeLayout.setVerticalGroup(
            jPanelConsultaFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaFilmeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelConsultaFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloFilme)
                    .addComponent(jTextFieldTituloNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultarFilme))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabelTitulo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensResouces/icon.png"))); // NOI18N
        jLabelTitulo.setText("Consulta Filme");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanelConsultaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelTitulo)
                .addGap(31, 31, 31)
                .addComponent(jPanelConsultaFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultarFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarFilme
       
        String nome = jTextFieldTituloNome.getText();
        DefaultTableModel tabelaModelo = (DefaultTableModel) jTableColsultaFilme.getModel();
        tabelaModelo.setRowCount(0);
        FilmeController filmeController = new FilmeController();
        
        try {
            ArrayList<Filme> filmes = filmeController.listarFilmes(nome);
            filmes.forEach((Filme filme) ->{
            tabelaModelo.addRow(new Object[]{
                                filme.getCodFilme(),
                                filme.getTitulo(),
                                filme.getGenero(),
                                filme.getSinopse(),
                                filme.getDuracao()
            });
        
        });
            jTableColsultaFilme.setModel(tabelaModelo);
        } catch (ExceptionDao e) {
            
            Logger.getLogger(TelaCadastroFilme.class.getName()).log(Level.SEVERE,null,e);
        }
        
        
    }//GEN-LAST:event_consultarFilme

    private void FecharJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FecharJanela
       this.dispose();
       this.telacadastroFilme.setVisible(true);
    }//GEN-LAST:event_FecharJanela

    private void jTableColsultaFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableColsultaFilmeMouseClicked
        if(evt.getClickCount() == 2){
        
            Integer codFilme = (Integer) jTableColsultaFilme.getModel().getValueAt(jTableColsultaFilme.getSelectedRow(), 0);
            String titulo = (String) jTableColsultaFilme.getModel().getValueAt(jTableColsultaFilme.getSelectedRow(), 1);
            String genero = (String) jTableColsultaFilme.getModel().getValueAt(jTableColsultaFilme.getSelectedRow(), 2);
            String sinopse = (String) jTableColsultaFilme.getModel().getValueAt(jTableColsultaFilme.getSelectedRow(), 3);
            Integer duracao = (Integer) jTableColsultaFilme.getModel().getValueAt(jTableColsultaFilme.getSelectedRow(), 4);
            
            
                this.telacadastroFilme.buscarFilme(codFilme, titulo, genero, sinopse,duracao);
            
            
            
            this.telacadastroFilme.setVisible(true);
            this.dispose();
            
        
        }
    }//GEN-LAST:event_jTableColsultaFilmeMouseClicked

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
            java.util.logging.Logger.getLogger(TelaConsultaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultarFilme;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloFilme;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanelConsultaFilme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableColsultaFilme;
    private javax.swing.JTextField jTextFieldTituloNome;
    // End of variables declaration//GEN-END:variables
}
