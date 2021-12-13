package telas;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TelaAdmin extends javax.swing.JFrame {
    private static DefaultListModel suspeitos = new DefaultListModel();
    private static DefaultListModel locais = new DefaultListModel();
    private static DefaultListModel armas = new DefaultListModel();
     TelaJogo tj = new TelaJogo();
    
    public DefaultListModel getSuspeitos() {
        return suspeitos;
    }

    public void setSuspeitos(DefaultListModel suspeitos) {
        TelaAdmin.suspeitos = suspeitos;
    }

    public DefaultListModel getLocais() {
        return locais;
    }

    public void setLocais(DefaultListModel locais) {
        TelaAdmin.locais = locais;
    }

    public DefaultListModel getArmas() {
        return armas;
    }

    public void setArmas(DefaultListModel armas) {
        TelaAdmin.armas = armas;
    }
    public TelaAdmin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSuspeitos = new javax.swing.JList<>();
        suspeitosJtext = new javax.swing.JTextField();
        addSuspeitos = new javax.swing.JButton();
        removerSuspeitos = new javax.swing.JButton();
        limparListaSuspeitos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaLocais = new javax.swing.JList<>();
        removerLocais = new javax.swing.JButton();
        limparLocais = new javax.swing.JButton();
        adicionarLocal = new javax.swing.JButton();
        locaisJtext = new javax.swing.JTextField();
        removerArmas = new javax.swing.JButton();
        limparArmas = new javax.swing.JButton();
        addArma = new javax.swing.JButton();
        armasJtext = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaArmas = new javax.swing.JList<>();
        labelSuspeitos = new javax.swing.JLabel();
        labelLocais = new javax.swing.JLabel();
        labelArmas = new javax.swing.JLabel();
        salvarButton = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listaSuspeitos);

        addSuspeitos.setText("Adicionar");
        addSuspeitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSuspeitosActionPerformed(evt);
            }
        });

        removerSuspeitos.setText("Remover");
        removerSuspeitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerSuspeitosActionPerformed(evt);
            }
        });

        limparListaSuspeitos.setText("Limpar");
        limparListaSuspeitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparListaSuspeitosActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listaLocais);

        removerLocais.setText("Remover");
        removerLocais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerLocaisActionPerformed(evt);
            }
        });

        limparLocais.setText("Limpar");
        limparLocais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparLocaisActionPerformed(evt);
            }
        });

        adicionarLocal.setText("Adicionar");
        adicionarLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarLocalActionPerformed(evt);
            }
        });

        locaisJtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaisJtextActionPerformed(evt);
            }
        });

        removerArmas.setText("Remover");
        removerArmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerArmasActionPerformed(evt);
            }
        });

        limparArmas.setText("Limpar");
        limparArmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparArmasActionPerformed(evt);
            }
        });

        addArma.setText("Adicionar");
        addArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addArmaActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(listaArmas);

        labelSuspeitos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelSuspeitos.setText("SUSPEITOS");

        labelLocais.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelLocais.setText("LOCAIS");

        labelArmas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelArmas.setText("ARMAS");

        salvarButton.setText("SALVAR");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(suspeitosJtext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(limparListaSuspeitos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removerSuspeitos)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(addSuspeitos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(locaisJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adicionarLocal)
                            .addComponent(removerLocais)
                            .addComponent(limparLocais, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(labelSuspeitos, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(labelLocais, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(armasJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(removerArmas)
                                    .addComponent(addArma)
                                    .addComponent(limparArmas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(labelArmas)))
                        .addGap(0, 84, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLocais)
                    .addComponent(labelArmas)
                    .addComponent(labelSuspeitos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removerLocais)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limparLocais, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removerSuspeitos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(limparListaSuspeitos))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(removerArmas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(limparArmas)
                                        .addGap(73, 73, 73)
                                        .addComponent(salvarButton))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(locaisJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(adicionarLocal))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(suspeitosJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addSuspeitos))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(armasJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addArma)))))
                .addGap(22, 22, 22))
        );

        setSize(new java.awt.Dimension(775, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addSuspeitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSuspeitosActionPerformed
        if (suspeitos.contains(suspeitosJtext.getText())){
            JOptionPane.showMessageDialog(null, "Este suspeito já foi adicionado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else if (suspeitosJtext.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String temp = suspeitosJtext.getText();
            suspeitos.addElement(temp);
            listaSuspeitos.setModel(suspeitos);
            tj.addSuspeito(temp);
            suspeitosJtext.setText(null);
        }
    }//GEN-LAST:event_addSuspeitosActionPerformed

    private void removerSuspeitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerSuspeitosActionPerformed
        if (listaSuspeitos.getSelectedIndex()< 0){
            JOptionPane.showMessageDialog(null, "Selecione alguém para ser removido. ", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int temp = listaSuspeitos.getSelectedIndex();
            suspeitos.remove(temp);
            listaSuspeitos.setModel(suspeitos);
            tj.removeSuspeito(temp);
        }
    }//GEN-LAST:event_removerSuspeitosActionPerformed

    private void limparListaSuspeitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparListaSuspeitosActionPerformed
        suspeitos.clear();
        listaSuspeitos.setModel(suspeitos);
        tj.limparSuspeitos();
    }//GEN-LAST:event_limparListaSuspeitosActionPerformed

    private void locaisJtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaisJtextActionPerformed
        
    }//GEN-LAST:event_locaisJtextActionPerformed

    private void limparLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparLocaisActionPerformed
        locais.clear();
        listaLocais.setModel(locais);
        tj.limparLocal();
    }//GEN-LAST:event_limparLocaisActionPerformed

    private void limparArmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparArmasActionPerformed
        armas.clear();
        listaArmas.setModel(armas);
        tj.limparArma();
    }//GEN-LAST:event_limparArmasActionPerformed

    private void addArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addArmaActionPerformed
        if (armas.contains(armasJtext.getText())){
            JOptionPane.showMessageDialog(null, "Esta arma já foi adicionada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else if (armasJtext.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String temp = armasJtext.getText();
            armas.addElement(temp);
            listaArmas.setModel(armas);
            armasJtext.setText(null);
            tj.addArma(temp);
        }
    }//GEN-LAST:event_addArmaActionPerformed

    private void removerArmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerArmasActionPerformed
        if (listaArmas.getSelectedIndex()< 0){
                JOptionPane.showMessageDialog(null, "Selecione alguma arma para ser removida.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int temp = listaArmas.getSelectedIndex();
            armas.remove(temp);
            listaArmas.setModel(armas);
            tj.removeArma(temp);
        }
    }//GEN-LAST:event_removerArmasActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        if (armas.isEmpty() || locais.isEmpty() || suspeitos.isEmpty()){
                JOptionPane.showMessageDialog(null, "Você deve preencher todos os itens! ", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            TelaInicial ti = new TelaInicial();
            ti.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void adicionarLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarLocalActionPerformed
        if (locais.contains(locaisJtext.getText())){
                JOptionPane.showMessageDialog(null, "Este local já foi adicionado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else if (locaisJtext.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "O campo está vazio!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String temp = locaisJtext.getText();
            locais.addElement(temp);
            listaLocais.setModel(locais);
            locaisJtext.setText(null);
            tj.addLocal(temp);
        }
    }//GEN-LAST:event_adicionarLocalActionPerformed

    private void removerLocaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerLocaisActionPerformed
       if (listaLocais.getSelectedIndex()< 0){
                JOptionPane.showMessageDialog(null, "Selecione algum local para remover.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int temp = listaLocais.getSelectedIndex();
            locais.remove(listaLocais.getSelectedIndex());
            listaLocais.setModel(locais);
            tj.removeLocal(temp);
        }
    }//GEN-LAST:event_removerLocaisActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaAdmin().setVisible(true);
        });
    }
    public void limparTudo(){
        suspeitos.clear();
        armas.clear();
        locais.clear();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addArma;
    private javax.swing.JButton addSuspeitos;
    private javax.swing.JButton adicionarLocal;
    private javax.swing.JTextField armasJtext;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelArmas;
    private javax.swing.JLabel labelLocais;
    private javax.swing.JLabel labelSuspeitos;
    private javax.swing.JButton limparArmas;
    private javax.swing.JButton limparListaSuspeitos;
    private javax.swing.JButton limparLocais;
    private javax.swing.JList<String> listaArmas;
    private javax.swing.JList<String> listaLocais;
    private javax.swing.JList<String> listaSuspeitos;
    private javax.swing.JTextField locaisJtext;
    private javax.swing.JButton removerArmas;
    private javax.swing.JButton removerLocais;
    private javax.swing.JButton removerSuspeitos;
    private javax.swing.JButton salvarButton;
    private javax.swing.JTextField suspeitosJtext;
    // End of variables declaration//GEN-END:variables
}
