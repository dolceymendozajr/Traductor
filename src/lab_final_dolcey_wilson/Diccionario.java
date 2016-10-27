package lab_final_dolcey_wilson;

import java.awt.HeadlessException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Diccionario extends javax.swing.JFrame {

    public static String default_ingles[] = {"advice", "career", "challenge", "experience",
        "hire", "ideal", "interview", "manager",
        "long", "reward", "salary", "red",
        "skill", "tall", "happy", "create",
        "curious", "encourage", "fact", "logical",
        "measure", "original", "piece", "prove",
        "solve", "study", "arrest", "bill", "team",
        "fake", "illegal", "ink", "nervous", "prevent",
        "scanner", "technology", "block", "civilized",
        "enforce", "expert", "manners", "push", "rude",
        "manage", "concentrate", "creative", "factory",
        "flavor", "generation", "income",
        "professional", "quit", "blue", "taste",
        "achieve", "avoid", "distractions", "factors",
        "dark", "goals"};
    public static String default_español[] = {"consejo", "carrera", "desafío", "experiencia",
        "contratar", "ideal", "entrevista", "gerente",
        "largo", "recompensa", "sueldo", "rojo",
        "habilidad", "alto", "feliz", "crear",
        "curioso", "alentar", "hecho", "lógico",
        "medida", "original", "pieza", "probar",
        "resolver", "estudio", "detención", "factura", "equipo",
        "falso", "ilegal", "tinta", "nervioso", "prevenir",
        "escáner", "tecnología", "bloque", "civilizado",
        "reforzar", "experto", "costumbres", "presionar", "grosero",
        "administrar", "concentrado", "creativo", "fábrica",
        "sabor", "generación", "ingresos",
        "profesional", "salir", "azúl", "gusto",
        "lograr", "evitar", "distracciones", "factores",
        "oscuro", "objetivos"};

    public static String p_ingles[] = new String[1000];
    public static String p_español[] = new String[1000];
    public String cadena;
    public int lim = 0;
    public final int p_lim = 100;

//    CONSTRUCTOR
    public Diccionario() {
        for (int i = 0; i < default_ingles.length; i++) {
            p_ingles[i] = default_ingles[i];
            p_español[i] = default_español[i];
        }
        boolean sw = true;
        lim = p_lim;
        while (sw) {
            try {
                String limite;
                limite = JOptionPane.showInputDialog(null, "Escriba el limite de palabras (Mayor o igual que 100)", "Cambio de limite", JOptionPane.QUESTION_MESSAGE);
                if ((limite != null) && (!limite.isEmpty())) {
                    lim = Integer.parseInt(limite);
                    if (lim < 100 || lim > 1000) {
                        JOptionPane.showMessageDialog(null, "Debe ingresar un valor mayor que 100 & menor que 1000");
                        continue;
                    }
                    sw = false;
                }
                if (limite == null) {
                    sw = false;
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor entero");
            }
        }
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea_trad1 = new javax.swing.JTextArea();
        lbl_i1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_trad2 = new javax.swing.JTextArea();
        lbl_i2 = new javax.swing.JLabel();
        btn_change = new javax.swing.JButton();
        btn_trans = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_cifrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 18)); // NOI18N
        jLabel2.setText("Made by:");

        jLabel3.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 18)); // NOI18N
        jLabel3.setText("Wilson Tovar Angulo");

        jLabel4.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 18)); // NOI18N
        jLabel4.setText("Dolcey Mendoza Anaya");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diccionario");
        setName("Diccionario"); // NOI18N
        setResizable(false);

        txtarea_trad1.setColumns(20);
        txtarea_trad1.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 18)); // NOI18N
        txtarea_trad1.setRows(5);
        jScrollPane2.setViewportView(txtarea_trad1);

        lbl_i1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 24)); // NOI18N
        lbl_i1.setText("INGLES");

        jLabel1.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 48)); // NOI18N
        jLabel1.setText("DICCIONARIO");

        txtarea_trad2.setColumns(20);
        txtarea_trad2.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 18)); // NOI18N
        txtarea_trad2.setRows(5);
        jScrollPane1.setViewportView(txtarea_trad2);

        lbl_i2.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 24)); // NOI18N
        lbl_i2.setText("ESPAÑOL");

        btn_change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab_final_dolcey_wilson/change.png"))); // NOI18N
        btn_change.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_change.setMaximumSize(new java.awt.Dimension(60, 60));
        btn_change.setMinimumSize(new java.awt.Dimension(60, 60));
        btn_change.setPreferredSize(new java.awt.Dimension(60, 60));
        btn_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changeActionPerformed(evt);
            }
        });

        btn_trans.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 18)); // NOI18N
        btn_trans.setText("TRADUCIR");
        btn_trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 18)); // NOI18N
        jButton1.setText("Insertar Palabras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_cifrar.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 14)); // NOI18N
        btn_cifrar.setText("CIFRAR TRAD.");
        btn_cifrar.setEnabled(false);
        btn_cifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cifrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 18)); // NOI18N
        jLabel5.setText("Made by:");

        jLabel6.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 18)); // NOI18N
        jLabel6.setText("Wilson Tovar Agudelo");

        jLabel7.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 18)); // NOI18N
        jLabel7.setText("Dolcey Mendoza Anaya");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(btn_change, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 314, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(btn_trans, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btn_cifrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(199, 199, 199)
                            .addComponent(jLabel1)
                            .addGap(161, 161, 161))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(lbl_i1)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_i2))
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(btn_change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btn_cifrar)
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_trans))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_i2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_i1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(144, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    AL PRESIONAR EL BOTON CAMBIAR
    private void btn_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changeActionPerformed
        String temp_lbl = lbl_i1.getText();
        lbl_i1.setText(lbl_i2.getText());
        lbl_i2.setText(temp_lbl);

        btn_cifrar.setEnabled(false);
    }//GEN-LAST:event_btn_changeActionPerformed

//    AL PRESIONAR EL BOTON DE TRADUCIR
    private void btn_transActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transActionPerformed
        try {
            cadena = txtarea_trad1.getText();
            String[] arreglo = cadena.split(",");

            if (arreglo.length > 4) {
                JOptionPane.showMessageDialog(null, "Máximo 4 palabras", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtarea_trad1.setText("");
            } else {
                if (lbl_i1.getText().equalsIgnoreCase("INGLES")) {
                    txtarea_trad2.setText(traduce_to_Español(arreglo));
                }
                if (lbl_i1.getText().equalsIgnoreCase("ESPAÑOL")) {
                    txtarea_trad2.setText(traduce_to_Ingles(arreglo));
                }
                if (!txtarea_trad2.getText().isEmpty()) // PERMITE PRESIONAR EL BOTON CIFRAR TRAD. SI SE TRADUJO ALGO 
                {
                    btn_cifrar.setEnabled(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al digitar los textos a traducir", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_transActionPerformed

//    AL PRESIONAR EL BOTON INSERTAR:
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean sw = true;
        int n = 0;
        while (sw) {
            try {
                String entrada = JOptionPane.showInputDialog(null, "Numero de palabras: ", "Numero palabras", JOptionPane.QUESTION_MESSAGE);
                if ((entrada != null) && (!entrada.isEmpty())) {
                    n = Integer.parseInt(entrada);
                    if ((n <= 0) || (n > lim)) {
                        JOptionPane.showMessageDialog(null, "Debe ingresar un valor mayor que 0 y menor que " + (lim - 60));
                        continue;
                    }
                    sw = false;
                }
                if (entrada == null) {
                    sw = false;
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico");
            }
        }

        InsertarPalabra(n);
    }//GEN-LAST:event_jButton1ActionPerformed

//    AL PRESIONAR EL BOTON CIFRAR TRAD.
    private void btn_cifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cifrarActionPerformed
        Pattern patt1 = Pattern.compile("[a-zA-Z]");
        Pattern patt2 = Pattern.compile("[ñáéíóú]");
        Matcher matt;
        int a = 0;
        
        Cifrado cifrado = new Cifrado();
        String[] letras = txtarea_trad2.getText().split(",");
        String clave = "";
        String temp = "";
        temp = JOptionPane.showInputDialog(rootPane, "Escriba la contraseña para encriptar por Vigenère", "CONTRASEÑA", JOptionPane.INFORMATION_MESSAGE);
        
        
        for (int i = 0; i < temp.length(); i++) {
            matt = patt1.matcher(temp.substring(i, i +1));
            if (matt.matches()) {
                a++;
            } else {
                matt = patt2.matcher(temp.substring(i, i + 1));
                if (matt.matches())
                    a++;
            }
        }
        
        if (temp.equals(""))
            JOptionPane.showMessageDialog(rootPane, "La clave no puede estar vacía", "ERROR", JOptionPane.ERROR_MESSAGE);
        else if (a < temp.length())
            JOptionPane.showMessageDialog(rootPane, "La clave solo puede contener letras", "ERROR", JOptionPane.ERROR_MESSAGE);
        else {
            try {
                Cifrado.pasarPalabras(letras, temp);
                cifrado.setVisible(true); 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error. Verifique que la contraseña y el texto a cifrar está bien escrito", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }  
        
    }//GEN-LAST:event_btn_cifrarActionPerformed

//    SUBRUTINA INSERTAR PALABRAS
    void InsertarPalabra(int n) {
        String tempp;
        boolean sw;
        int i = default_ingles.length;

        while (i < default_ingles.length + n) {
            tempp = JOptionPane.showInputDialog(null, "Palabra en ingles:", "Ingresar palabra " + i, JOptionPane.INFORMATION_MESSAGE);
            sw = false;
            for (String p_ingle : p_ingles) {
                if (tempp.equalsIgnoreCase(p_ingle)) {
                    JOptionPane.showMessageDialog(rootPane, "La palabra ya se encuentra en el diccionario", "Palabra no agregada", JOptionPane.ERROR_MESSAGE);
                    i--;
                    sw = true;
                }
            }

            if (sw == false) {
                p_ingles[i] = tempp;
                p_español[i] = JOptionPane.showInputDialog(null, "Palabra en español:", "Ingresar palabra " + i, JOptionPane.INFORMATION_MESSAGE);
            }

            i++;
        }
    }

//    FUNCION TRADUCIR A ESPAÑOL
    String traduce_to_Español(String[] ing) {
        String trad = "";
        for (String ing1 : ing) {
            for (int j = 0; j < p_ingles.length; j++) {
                if (ing1.equalsIgnoreCase(p_ingles[j])) {
                    if (!trad.isEmpty()) {
                        trad = trad + "," + p_español[j];
                    } else {
                        trad = p_español[j];
                    }
                }
            }
        }
        return trad;
    }

//    FUNCION TRADUCIR A INGLES
    String traduce_to_Ingles(String[] esp) {
        String trad = "";
        for (String esp1 : esp) {
            for (int j = 0; j < p_español.length; j++) {
                if (esp1.equalsIgnoreCase(p_español[j])) {
                    if (!trad.isEmpty()) {
                        trad = trad + "," + p_ingles[j];
                    } else {
                        trad = p_ingles[j];
                    }
                }
            }
        }
        return trad;
    }

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
            java.util.logging.Logger.getLogger(Diccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diccionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_change;
    private javax.swing.JButton btn_cifrar;
    private javax.swing.JButton btn_trans;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_i1;
    private javax.swing.JLabel lbl_i2;
    private javax.swing.JTextArea txtarea_trad1;
    public static javax.swing.JTextArea txtarea_trad2;
    // End of variables declaration//GEN-END:variables
}
