package lab_final_dolcey_wilson;

import javax.swing.JOptionPane;

public class Cifrado extends javax.swing.JFrame {
    static String[] palabras;
    static String pass;
    static int i = 0;
    static String[] binarios;
    
    public Cifrado() {
        initComponents();
        setLocationRelativeTo(null);
        
        btn_Siguiente.setText("VER PALABRAS");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Propio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Palabra = new javax.swing.JTextField();
        txt_Propio_Vigenere = new javax.swing.JTextField();
        btn_Siguiente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Propio_Vigenere_BInario = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        jLabel1.setText("PALABRA");

        jLabel2.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 16)); // NOI18N
        jLabel2.setText("PROPIO");

        jLabel4.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 16)); // NOI18N
        jLabel4.setText("VIGENÉRE");

        txt_Propio.setEditable(false);
        txt_Propio.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 16)); // NOI18N
        jLabel5.setText("BINARIO");

        txt_Palabra.setEditable(false);
        txt_Palabra.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 30)); // NOI18N

        txt_Propio_Vigenere.setEditable(false);
        txt_Propio_Vigenere.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 16)); // NOI18N

        btn_Siguiente.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        btn_Siguiente.setText("SIGUIENTE PALABRA");
        btn_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SiguienteActionPerformed(evt);
            }
        });

        txt_Propio_Vigenere_BInario.setColumns(20);
        txt_Propio_Vigenere_BInario.setRows(5);
        txt_Propio_Vigenere_BInario.setEnabled(false);
        jScrollPane1.setViewportView(txt_Propio_Vigenere_BInario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txt_Propio, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                    .addComponent(txt_Propio_Vigenere)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(154, 154, 154))
                    .addComponent(txt_Palabra)
                    .addComponent(jScrollPane1)
                    .addComponent(btn_Siguiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Propio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Propio_Vigenere, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Siguiente)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SiguienteActionPerformed
        if (i < palabras.length) {
            btn_Siguiente.setText("Sig. Palabra");
            
            txt_Palabra.setText(palabras[i]);
            txt_Propio.setText(MetodoEncript.encrip(palabras[i]));
            txt_Propio_Vigenere.setText(EncriptarVigenere.Encript(txt_Propio.getText(), pass));
        } else {
            JOptionPane.showMessageDialog(this, "No hay más palabras por mostrar", "ERROR", JOptionPane.ERROR_MESSAGE);
            btn_Siguiente.setEnabled(false);
        }
        i++;
        
        
    }//GEN-LAST:event_btn_SiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(Cifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cifrado().setVisible(true);
            }
        });
    }   
    
    public static void PasarDatos(String[] pals, String clave) {
        i = 0;
        palabras = pals;
        pass = clave;

    }
    
    public static void UnirBinario(String[] todas_palabras, int i) {

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_Siguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txt_Palabra;
    public static javax.swing.JTextField txt_Propio;
    public static javax.swing.JTextField txt_Propio_Vigenere;
    private javax.swing.JTextArea txt_Propio_Vigenere_BInario;
    // End of variables declaration//GEN-END:variables
}
