package telas;
import javax.swing.JOptionPane;
import java.util.Random;
public class TelaInicial extends javax.swing.JFrame {
   TelaAdmin ta = new TelaAdmin();
   Random r = new Random();
   public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeJogo = new javax.swing.JLabel();
        buttonIniciar = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        configJogo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeJogo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        nomeJogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeJogo.setText("DETETIVE");
        nomeJogo.setToolTipText("");

        buttonIniciar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        buttonIniciar.setText("INICIAR");
        buttonIniciar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonIniciar.setFocusPainted(false);
        buttonIniciar.setFocusable(false);
        buttonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciarActionPerformed(evt);
            }
        });

        buttonSair.setBackground(new java.awt.Color(255, 255, 255));
        buttonSair.setText("Sair");
        buttonSair.setBorder(null);
        buttonSair.setFocusPainted(false);
        buttonSair.setHideActionText(true);
        buttonSair.setRequestFocusEnabled(false);
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        configJogo.setText("Configurar Jogo");
        configJogo.setFocusPainted(false);
        configJogo.setFocusable(false);
        configJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configJogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(nomeJogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(configJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 255, Short.MAX_VALUE)
                .addComponent(buttonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(nomeJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(configJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(buttonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIniciarActionPerformed
       TelaAdmin ta = new TelaAdmin();
       
       if (ta.getArmas().isEmpty() || ta.getSuspeitos().isEmpty() || ta.getLocais().isEmpty()){
           JOptionPane.showMessageDialog(null, "Você deve configurar a partida. ", "Erro", JOptionPane.ERROR_MESSAGE);
       }
       else{
           TelaJogo td = new TelaJogo();
           td.gerarCrime((String)ta.getSuspeitos().getElementAt(r.nextInt(ta.getSuspeitos().getSize())), 
                   (String)ta.getLocais().getElementAt(r.nextInt(ta.getLocais().getSize())), 
                   (String) ta.getArmas().getElementAt(r.nextInt(ta.getArmas().getSize())));
           td.setVisible(true);
           JOptionPane.showMessageDialog(null, "Um crime foi cometido! ", "", JOptionPane.WARNING_MESSAGE);
           this.dispose();
       }
    }//GEN-LAST:event_buttonIniciarActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonSairActionPerformed

    private void configJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configJogoActionPerformed
        ta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_configJogoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaInicial().setVisible(true);
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonIniciar;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton configJogo;
    private javax.swing.JLabel nomeJogo;
    // End of variables declaration//GEN-END:variables
}
