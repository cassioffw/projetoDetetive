package telas;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import jogo.*;

public class TelaJogo extends javax.swing.JFrame {
    private static final DefaultComboBoxModel suspeitos = new DefaultComboBoxModel();
    private static final DefaultComboBoxModel locais = new DefaultComboBoxModel();
    private static final DefaultComboBoxModel armas = new DefaultComboBoxModel();
    Crime c = new Crime();
    public TelaJogo() {
        initComponents();
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboSuspeitosPalpite = new javax.swing.JComboBox<>();
        comboLocaisPalpite = new javax.swing.JComboBox<>();
        comboArmasPalpite = new javax.swing.JComboBox<>();
        comboSuspeitosAcusado = new javax.swing.JComboBox<>();
        comboLocaisAcusado = new javax.swing.JComboBox<>();
        comboArmasAcusado = new javax.swing.JComboBox<>();
        acusarButton = new javax.swing.JButton();
        palpiteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelPrincipal = new javax.swing.JTextArea();
        retornarTelaInicial = new javax.swing.JButton();
        adivinheLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboSuspeitosPalpite.setModel(suspeitos);

        comboLocaisPalpite.setModel(locais);

        comboArmasPalpite.setModel(armas
        );

        comboSuspeitosAcusado.setModel(suspeitos);

        comboLocaisAcusado.setModel(locais);

        comboArmasAcusado.setModel(armas);

        acusarButton.setText("Acusar");
        acusarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acusarButtonActionPerformed(evt);
            }
        });

        palpiteButton.setText("Palpite");
        palpiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palpiteButtonActionPerformed(evt);
            }
        });

        painelPrincipal.setColumns(20);
        painelPrincipal.setRows(5);
        jScrollPane1.setViewportView(painelPrincipal);

        retornarTelaInicial.setText("Retornar para o inicio");
        retornarTelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarTelaInicialActionPerformed(evt);
            }
        });

        adivinheLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        adivinheLabel.setText("Adivinhe quem é o criminoso.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(palpiteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 385, Short.MAX_VALUE)
                .addComponent(acusarButton)
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addComponent(retornarTelaInicial)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboArmasPalpite, 0, 91, Short.MAX_VALUE)
                    .addComponent(comboSuspeitosPalpite, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboLocaisPalpite, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboSuspeitosAcusado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboLocaisAcusado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboArmasAcusado, 0, 102, Short.MAX_VALUE))
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(adivinheLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adivinheLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboSuspeitosPalpite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSuspeitosAcusado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(comboLocaisPalpite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(comboLocaisAcusado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(comboArmasPalpite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(comboArmasAcusado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acusarButton)
                    .addComponent(palpiteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(retornarTelaInicial))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void palpiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palpiteButtonActionPerformed
        String temp;
        Jogo j = new Jogo();
        temp = j.darPalpite((String)comboSuspeitosPalpite.getSelectedItem(), 
                (String)comboLocaisPalpite.getSelectedItem(), 
                (String)comboArmasPalpite.getSelectedItem());
        setPainel(temp);
    }//GEN-LAST:event_palpiteButtonActionPerformed

    private void acusarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acusarButtonActionPerformed
        Jogo j = new Jogo();
        if (j.acusar((String) comboSuspeitosAcusado.getSelectedItem(), 
          (String) comboLocaisAcusado.getSelectedItem(), 
          (String) comboArmasAcusado.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "PARABÉNS", "Você ganhou!", JOptionPane.INFORMATION_MESSAGE);
        }
        else JOptionPane.showMessageDialog(null, "Infelizmente você perdeu o jogo! ", "Errado! ", JOptionPane.ERROR_MESSAGE);
        acusarButton.setEnabled(false);
        palpiteButton.setEnabled(false);
        adivinheLabel.setText("FIM DE JOGO");
        adivinheLabel.setHorizontalAlignment(SwingConstants.CENTER);
    }//GEN-LAST:event_acusarButtonActionPerformed

    private void retornarTelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarTelaInicialActionPerformed
        TelaInicial ti = new TelaInicial();
        TelaAdmin ta = new TelaAdmin();
        ti.setVisible(true);
        this.dispose();
        ta.limparTudo();
    }//GEN-LAST:event_retornarTelaInicialActionPerformed

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
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaJogo().setVisible(true);
        });
    }
    public void gerarCrime(String criminoso, String local, String arma){
        c.gerarCrime(criminoso, local, arma);
        painelPrincipal.setEditable(false);
    }

    public void addSuspeito(String s){
        TelaJogo.suspeitos.addElement(s);
    }
    public void removeSuspeito(int s){
       TelaJogo.suspeitos.removeElement(suspeitos.getElementAt(s));
       comboSuspeitosPalpite.setModel(suspeitos);
    }
    public void limparSuspeitos(){
        TelaJogo.suspeitos.removeAllElements();
        comboSuspeitosPalpite.setModel(suspeitos);
    }
    public void addLocal(String s){
        TelaJogo.locais.addElement(s);
    }
    public void removeLocal(int s){
        TelaJogo.locais.removeElement(locais.getElementAt(s));
        comboLocaisPalpite.setModel(locais);
    }
    public void limparLocal(){
        TelaJogo.locais.removeAllElements();
        comboLocaisPalpite.setModel(locais);
    }
    public void addArma(String s){
        TelaJogo.armas.addElement(s);
    }
    public void removeArma(int s){
        TelaJogo.armas.removeElement(armas.getElementAt(s));
        comboArmasPalpite.setModel(armas);
    }
    public void limparArma(){
        TelaJogo.armas.removeAllElements();
        comboArmasPalpite.setModel(armas);
    }
    
    public void setPainel(String texto) {
        painelPrincipal.setText(texto);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acusarButton;
    private javax.swing.JLabel adivinheLabel;
    private javax.swing.JComboBox<String> comboArmasAcusado;
    private javax.swing.JComboBox<String> comboArmasPalpite;
    private javax.swing.JComboBox<String> comboLocaisAcusado;
    private javax.swing.JComboBox<String> comboLocaisPalpite;
    private javax.swing.JComboBox<String> comboSuspeitosAcusado;
    private javax.swing.JComboBox<String> comboSuspeitosPalpite;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea painelPrincipal;
    private javax.swing.JButton palpiteButton;
    private javax.swing.JButton retornarTelaInicial;
    // End of variables declaration//GEN-END:variables

}
