
package jogo.da.velha;

public class JogoDaVelha extends javax.swing.JFrame {
    int varX = 0;
    int varO = 0;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9 = "";
    int b11, b22, b33, b44, b55, b66, b77, b88, b99 = 0;

    public JogoDaVelha() { 
        initComponents();
        labelRes.setVisible(false);
   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botaoO = new javax.swing.JButton();
        botaoX = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelRes = new javax.swing.JLabel();
        botao10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botao1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botao2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botao3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });

        botao4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        botao6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });

        botao7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });

        botao8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });

        botao9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("OU");

        botaoO.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoO.setText("O");
        botaoO.setPreferredSize(new java.awt.Dimension(45, 34));
        botaoO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOActionPerformed(evt);
            }
        });

        botaoX.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoX.setText("X");
        botaoX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoXActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("COMEÇAR COM ");

        labelRes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelRes.setForeground(new java.awt.Color(153, 0, 153));
        labelRes.setText("--");

        botao10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        botao10.setText("Zerar");
        botao10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(labelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoX, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(botaoO, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoX)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        if (varX == 0 && varO == 0){
            botao2.setText("");
        }
        
        else if (varX %2 == 0 && b22 == 0){
            botao2.setText("X");
            b2 = "X";
            varX++;
            varO++;
            b22++;
        } 
        
        else if (varX %2 != 0 && b22 == 0){
            botao2.setText("O");
            b2 = "O";
            varX++;
            varO++;
            b22++;
        }
        
        if ("X".equals(b1) && "X".equals(b2) && "X".equals(b3)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("O".equals(b1) && "O".equals(b2) && "O".equals(b3)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b4) && "X".equals(b5) && "X".equals(b6)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);    
        }
        else if ("O".equals(b4) && "O".equals(b5) && "O".equals(b6)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b7) && "X".equals(b8) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b7) && "O".equals(b8) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b1) && "X".equals(b4) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b4) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b2) && "X".equals(b5) && "X".equals(b8)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b2) && "O".equals(b5) && "O".equals(b8)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b3) && "X".equals(b6) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b6) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b1) && "X".equals(b5) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b5) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b3) && "X".equals(b5) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b5) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }    
    }//GEN-LAST:event_botao2ActionPerformed

    private void botaoXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoXActionPerformed
        varX += 2;   
    }//GEN-LAST:event_botaoXActionPerformed

    private void botaoOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOActionPerformed
        varO++;
        varX++;
    }//GEN-LAST:event_botaoOActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        if (varX == 0 && varO == 0){
            botao1.setText("");
        }
        
        else if (varX %2 == 0 && b11 == 0){
            botao1.setText("X");
            b1 = "X";
            varX++;
            varO++;
            b11++;
        } 
        
        else if (varX %2 != 0 && b11 == 0){
            botao1.setText("O");
            b1 = "O";
            varX++;
            varO++;
            b11++;
        }
        
        if ("X".equals(b1) && "X".equals(b2) && "X".equals(b3)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("O".equals(b1) && "O".equals(b2) && "O".equals(b3)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b4) && "X".equals(b5) && "X".equals(b6)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);    
        }
        else if ("O".equals(b4) && "O".equals(b5) && "O".equals(b6)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b7) && "X".equals(b8) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b7) && "O".equals(b8) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b1) && "X".equals(b4) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b4) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b2) && "X".equals(b5) && "X".equals(b8)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b2) && "O".equals(b5) && "O".equals(b8)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b3) && "X".equals(b6) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b6) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b1) && "X".equals(b5) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b5) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b3) && "X".equals(b5) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b5) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        if (varX == 0 && varO == 0){
            botao3.setText("");
        }
        
        else if (varX %2 == 0 && b33 == 0){
            botao3.setText("X");
            b3 = "X";
            varX++;
            varO++;
            b33++;   
        } 
        
        else if (varX %2 != 0 && b33 == 0){
            botao3.setText("O");
            b3 = "O";
            varX++;
            varO++;
            b33++;
        }
        
        if ("X".equals(b1) && "X".equals(b2) && "X".equals(b3)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("O".equals(b1) && "O".equals(b2) && "O".equals(b3)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b4) && "X".equals(b5) && "X".equals(b6)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);    
        }
        else if ("O".equals(b4) && "O".equals(b5) && "O".equals(b6)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b7) && "X".equals(b8) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b7) && "O".equals(b8) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b1) && "X".equals(b4) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b4) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b2) && "X".equals(b5) && "X".equals(b8)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b2) && "O".equals(b5) && "O".equals(b8)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b3) && "X".equals(b6) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b6) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b1) && "X".equals(b5) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b5) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b3) && "X".equals(b5) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b5) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        if (varX == 0 && varO == 0){
            botao4.setText("");
        }
        
        else if (varX %2 == 0 && b44 == 0){
            botao4.setText("X");
            b4 = "X";
            varX++;
            varO++;
            b44++;   
        } 
        
        else if (varX %2 != 0 && b44 == 0){
            botao4.setText("O");
            b4 = "O";
            varX++;
            varO++;
            b44++;
        }
        
        if ("X".equals(b1) && "X".equals(b2) && "X".equals(b3)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("O".equals(b1) && "O".equals(b2) && "O".equals(b3)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b4) && "X".equals(b5) && "X".equals(b6)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);    
        }
        else if ("O".equals(b4) && "O".equals(b5) && "O".equals(b6)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b7) && "X".equals(b8) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b7) && "O".equals(b8) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b1) && "X".equals(b4) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b4) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b2) && "X".equals(b5) && "X".equals(b8)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b2) && "O".equals(b5) && "O".equals(b8)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b3) && "X".equals(b6) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b6) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b1) && "X".equals(b5) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b5) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b3) && "X".equals(b5) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b5) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        if (varX == 0 && varO == 0){
            botao5.setText("");
        }
        
        else if (varX %2 == 0 && b55 == 0){
            botao5.setText("X");
            b5 = "X";
            varX++;
            varO++;
            b55++; 
        } 
        
        else if (varX %2 != 0 && b55 == 0){
            botao5.setText("O");
            b5 = "O";
            varX++;
            varO++;
            b55++;
        }
        
        if ("X".equals(b1) && "X".equals(b2) && "X".equals(b3)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("O".equals(b1) && "O".equals(b2) && "O".equals(b3)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b4) && "X".equals(b5) && "X".equals(b6)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);    
        }
        else if ("O".equals(b4) && "O".equals(b5) && "O".equals(b6)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b7) && "X".equals(b8) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b7) && "O".equals(b8) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b1) && "X".equals(b4) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b4) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b2) && "X".equals(b5) && "X".equals(b8)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b2) && "O".equals(b5) && "O".equals(b8)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b3) && "X".equals(b6) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b6) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b1) && "X".equals(b5) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b5) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b3) && "X".equals(b5) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b5) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        if (varX == 0 && varO == 0){
            botao6.setText("");
        }
        
        else if (varX %2 == 0 && b66 == 0){
            botao6.setText("X");
            b6 = "X";
            varX++;
            varO++;
            b66++;
        } 
        
        else if (varX %2 != 0 && b66 == 0){
            botao6.setText("O");
            b6 = "O";
            varX++;
            varO++;
            b66++;
            
        }
        if ("X".equals(b1) && "X".equals(b2) && "X".equals(b3)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("O".equals(b1) && "O".equals(b2) && "O".equals(b3)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b4) && "X".equals(b5) && "X".equals(b6)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);    
        }
        else if ("O".equals(b4) && "O".equals(b5) && "O".equals(b6)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b7) && "X".equals(b8) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b7) && "O".equals(b8) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b1) && "X".equals(b4) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b4) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b2) && "X".equals(b5) && "X".equals(b8)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b2) && "O".equals(b5) && "O".equals(b8)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b3) && "X".equals(b6) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b6) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b1) && "X".equals(b5) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b5) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b3) && "X".equals(b5) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b5) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        if (varX == 0 && varO == 0){
            botao7.setText("");
        }
        
        else if (varX %2 == 0 && b77 == 0){
            botao7.setText("X");
            b7 = "X";
            varX++;
            varO++;
            b77++;
        } 
        
        else if (varX %2 != 0 && b77 == 0){
            botao7.setText("O");
            b7 = "O";
            varX++;
            varO++;
            b77++;
        }
        
        if ("X".equals(b1) && "X".equals(b2) && "X".equals(b3)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("O".equals(b1) && "O".equals(b2) && "O".equals(b3)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b4) && "X".equals(b5) && "X".equals(b6)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);    
        }
        else if ("O".equals(b4) && "O".equals(b5) && "O".equals(b6)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b7) && "X".equals(b8) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b7) && "O".equals(b8) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b1) && "X".equals(b4) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b4) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b2) && "X".equals(b5) && "X".equals(b8)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b2) && "O".equals(b5) && "O".equals(b8)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b3) && "X".equals(b6) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b6) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b1) && "X".equals(b5) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b5) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b3) && "X".equals(b5) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b5) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        if (varX == 0 && varO == 0){
            botao8.setText("");
        }
        
        else if (varX %2 == 0 && b88 == 0){
            botao8.setText("X");
            b8 = "X";
            varX++;
            varO++;
            b88++;
        } 
        
        else if (varX %2 != 0 && b88 == 0){
            botao8.setText("O");
            b8 = "O";
            varX++;
            varO++;
            b88++;
        }
        
        if ("X".equals(b1) && "X".equals(b2) && "X".equals(b3)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("O".equals(b1) && "O".equals(b2) && "O".equals(b3)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b4) && "X".equals(b5) && "X".equals(b6)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);    
        }
        else if ("O".equals(b4) && "O".equals(b5) && "O".equals(b6)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b7) && "X".equals(b8) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b7) && "O".equals(b8) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b1) && "X".equals(b4) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b4) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b2) && "X".equals(b5) && "X".equals(b8)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b2) && "O".equals(b5) && "O".equals(b8)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b3) && "X".equals(b6) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b6) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b1) && "X".equals(b5) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b5) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b3) && "X".equals(b5) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b5) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
    }//GEN-LAST:event_botao8ActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        if (varX == 0 && varO == 0){
            botao9.setText("");
        }
        
        else if (varX %2 == 0 && b99 == 0){
            botao9.setText("X");
            b9 = "X";
            varX++;
            varO++;
            b99++;
        } 
        
        else if (varX %2 != 0 && b99 == 0){
            botao9.setText("O");
            b9 = "O";
            varX++;
            varO++;
            b99++;
        }
        
        if ("X".equals(b1) && "X".equals(b2) && "X".equals(b3)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("O".equals(b1) && "O".equals(b2) && "O".equals(b3)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b4) && "X".equals(b5) && "X".equals(b6)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);    
        }
        else if ("O".equals(b4) && "O".equals(b5) && "O".equals(b6)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);
        }
        else if ("X".equals(b7) && "X".equals(b8) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b7) && "O".equals(b8) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b1) && "X".equals(b4) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b4) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b2) && "X".equals(b5) && "X".equals(b8)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b2) && "O".equals(b5) && "O".equals(b8)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true); 
        }
        else if ("X".equals(b3) && "X".equals(b6) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b6) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b1) && "X".equals(b5) && "X".equals(b9)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b1) && "O".equals(b5) && "O".equals(b9)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("X".equals(b3) && "X".equals(b5) && "X".equals(b7)){
            labelRes.setText("X GANHOU!");
            labelRes.setVisible(true);  
        }
        else if ("O".equals(b3) && "O".equals(b5) && "O".equals(b7)){
            labelRes.setText("O GANHOU!");
            labelRes.setVisible(true);  
        }
    }//GEN-LAST:event_botao9ActionPerformed

    private void botao10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao10ActionPerformed
        varX = 0;
        varO = 0;
        b1 = "";
        b2 = "";
        b3 = "";
        b4 = "";
        b5 = "";
        b6 = "";
        b7 = "";
        b8 = "";
        b9 = "";
        botao1.setText("");
        botao2.setText("");
        botao3.setText("");
        botao4.setText("");
        botao5.setText("");
        botao6.setText("");
        botao7.setText("");
        botao8.setText("");
        botao9.setText("");
        labelRes.setVisible(false);
        b11 = 0;
        b22 = 0;
        b33 = 0;
        b44 = 0;
        b55 = 0;
        b66 = 0;
        b77 = 0;
        b88 = 0;
        b99 = 0;
    }//GEN-LAST:event_botao10ActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao10;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoO;
    private javax.swing.JButton botaoX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelRes;
    // End of variables declaration//GEN-END:variables
}