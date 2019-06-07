/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.sorveteria;

/**
 *
 * @author Raryagnes
 */
public class TelaMenu2 extends javax.swing.JFrame {
    
    String tipo = new String();
    
    public TelaMenu2(String ator) {
        
        tipo = ator;
        System.out.println(ator);
        
        initComponents();
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
        btn_Cadastro = new javax.swing.JButton();
        btn_Editar = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        lbl_Imagem = new javax.swing.JLabel();
        btn_Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Cadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Cadastro.setText("Cadastrar");
        btn_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadastroActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 121, -1));

        btn_Editar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 121, -1));

        btn_Buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Buscar.setText("Buscar");
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 121, -1));

        btn_Excluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Excluir.setText("Excluir");
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 121, -1));

        lbl_Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/sorveteria/logo_retina.png"))); // NOI18N
        jPanel1.add(lbl_Imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 390, 370));

        btn_Voltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Voltar.setText("Voltar");
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadastroActionPerformed
        Menu menu = new Menu();
        
        if (tipo.equals("Cliente")) {
            TelaClienteCadastro cliente = new TelaClienteCadastro();
            cliente.setLocationRelativeTo(null);
            cliente.setVisible(true);
        } else if (tipo.equals("Produto")) {
            TelaCadastroVendas produto = new TelaCadastroVendas();
            produto.setLocationRelativeTo(null);
            produto.setVisible(true);
            
        } else if (tipo.equals("Estoque")) {
            TelaCadastroEstoque estoque = new TelaCadastroEstoque();
            estoque.setLocationRelativeTo(null);
            estoque.setVisible(true);
            
        }
    }//GEN-LAST:event_btn_CadastroActionPerformed

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed
        
        Menu menu = new Menu();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_VoltarActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        
        TelaBuscar buscar = new TelaBuscar();
        buscar.setLocationRelativeTo(null);
        buscar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        if (tipo.equals("Cliente")) {
            TelaClienteEditar editarC = new TelaClienteEditar();
            editarC.setLocationRelativeTo(null);
            editarC.setVisible(true);
            this.setVisible(false);
        } else if (tipo.equals("Produto")) {
            TelaEditarVendas editarV = new TelaEditarVendas();
            editarV.setLocationRelativeTo(null);
            editarV.setVisible(true);
            this.setVisible(false);
            
        } else if (tipo.equals("Estoque")) {
            TelaEditarEstoque editarE = new TelaEditarEstoque();
            editarE.setLocationRelativeTo(null);
            editarE.setVisible(true);
            this.setVisible(false);
            
            
        }
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        TelaBuscar buscar = new TelaBuscar();
        buscar.setLocationRelativeTo(null);
        buscar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_ExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu2("Cliente").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Cadastro;
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Imagem;
    // End of variables declaration//GEN-END:variables
}