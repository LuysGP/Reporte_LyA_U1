
package arboles_binarios;

import arbol.Arbol;
public class frmPrinicipal extends javax.swing.JFrame {

    Arbol arbolito;

    public frmPrinicipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtaN4 = new javax.swing.JTextField();
        jtaN6 = new javax.swing.JTextField();
        jtaN7 = new javax.swing.JTextField();
        jtaN1 = new javax.swing.JTextField();
        jtaN3 = new javax.swing.JTextField();
        jtaN5 = new javax.swing.JTextField();
        jtaN8 = new javax.swing.JTextField();
        jtaN2 = new javax.swing.JTextField();
        jtaN9 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPre = new javax.swing.JButton();
        btnPost = new javax.swing.JButton();
        btnIn = new javax.swing.JButton();
        btnContruir = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jtaN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 60, 40));

        jtaN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtaN6ActionPerformed(evt);
            }
        });
        jPanel1.add(jtaN6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 60, 40));

        jtaN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtaN7ActionPerformed(evt);
            }
        });
        jPanel1.add(jtaN7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 60, 40));
        jPanel1.add(jtaN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 60, 40));
        jPanel1.add(jtaN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 60, 40));
        jPanel1.add(jtaN5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 60, 40));
        jPanel1.add(jtaN8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 60, 40));
        jPanel1.add(jtaN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 60, 40));
        jPanel1.add(jtaN9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 60, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Expresion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, 124, 23));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arboles_binarios/img/Arbol_binario.PNG"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 820, 470));

        btnPre.setText("PreOrden");
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });
        jPanel1.add(btnPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, 124, 38));

        btnPost.setText("PostOrden");
        btnPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostActionPerformed(evt);
            }
        });
        jPanel1.add(btnPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 120, 38));

        btnIn.setText("InOrden");
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });
        jPanel1.add(btnIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 124, 38));

        btnContruir.setText("Construir Arbol");
        btnContruir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContruirActionPerformed(evt);
            }
        });
        jPanel1.add(btnContruir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, 124, 38));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 820, 93));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Arboles Binarios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(478, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(406, 406, 406))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("5*1/3-2*9");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostActionPerformed
        cargarArbol();
        jTextField1.setText(arbolito.posOrden(arbolito.getRaiz()));
    }//GEN-LAST:event_btnPostActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jtaN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtaN6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtaN6ActionPerformed

    private void jtaN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtaN7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtaN7ActionPerformed

    private void btnContruirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContruirActionPerformed
        jtaN1.setText("-");
        jtaN2.setText("/");
        jtaN3.setText("*");
        jtaN4.setText("*");
        jtaN5.setText("3");
        jtaN6.setText("2");
        jtaN7.setText("9");
        jtaN8.setText("5");
        jtaN9.setText("1");
    }//GEN-LAST:event_btnContruirActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        cargarArbol();
        jTextField1.setText(arbolito.preOrden(arbolito.getRaiz()));
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed
        cargarArbol();
        jTextField1.setText(arbolito.inOrden(arbolito.getRaiz()));
    }//GEN-LAST:event_btnInActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrinicipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrinicipal().setVisible(true);
            }
        });
    }
    
    public void cargarArbol(){
        arbolito = new Arbol(jtaN1.getText());
        
        //Nivel1
        arbolito.insertIzquierda(jtaN2.getText(), arbolito.getRaiz());
        arbolito.insertarDerecha(jtaN3.getText(), arbolito.getRaiz());
        
        //Nivel2
        arbolito.insertIzquierda(jtaN4.getText(), arbolito.getRaiz().getIzquierda());
        arbolito.insertarDerecha(jtaN5.getText(), arbolito.getRaiz().getIzquierda());
        arbolito.insertIzquierda(jtaN6.getText(), arbolito.getRaiz().getDerecha());
        arbolito.insertarDerecha(jtaN7.getText(), arbolito.getRaiz().getDerecha());
        
        //Nivel3
        arbolito.insertIzquierda(jtaN8.getText(), arbolito.getRaiz().getIzquierda().getIzquierda());
        arbolito.insertarDerecha(jtaN9.getText(), arbolito.getRaiz().getIzquierda().getIzquierda());
        
        //
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContruir;
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnPost;
    private javax.swing.JButton btnPre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jtaN1;
    private javax.swing.JTextField jtaN2;
    private javax.swing.JTextField jtaN3;
    private javax.swing.JTextField jtaN4;
    private javax.swing.JTextField jtaN5;
    private javax.swing.JTextField jtaN6;
    private javax.swing.JTextField jtaN7;
    private javax.swing.JTextField jtaN8;
    private javax.swing.JTextField jtaN9;
    // End of variables declaration//GEN-END:variables
}
