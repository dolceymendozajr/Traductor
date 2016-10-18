package lab_final_dolcey_wilson;

import javax.swing.JOptionPane;

public class Diccionario extends javax.swing.JFrame {

    public static String p_ingles[] = new String[1000];

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

    public static String p_español[] = new String[1000];

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
                String limite = "";
                limite = JOptionPane.showInputDialog(null, "Escriba el limite de palabras (Mayor o igual que 100)", "Cambio de limite", JOptionPane.QUESTION_MESSAGE);
                if ((limite != null) && (!limite.isEmpty())) {
                    lim = Integer.parseInt(limite);
                    if (lim < 100) {
                        JOptionPane.showMessageDialog(null, "Debe ingresar un valor mayor que 100");
                        continue;
                    }
                    sw = false;
                }
                if (limite == null) {
                    sw = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor entero");
            }
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_i1 = new javax.swing.JLabel();
        lbl_i2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_trad2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea_trad1 = new javax.swing.JTextArea();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 3), new java.awt.Dimension(0, 3), new java.awt.Dimension(32767, 3));
        btn_trans = new javax.swing.JButton();
        btn_change = new javax.swing.JButton();
        btn_insert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diccionario");
        setBackground(new java.awt.Color(51, 51, 51));
        setIconImages(null);
        setLocation(new java.awt.Point(250, 250));
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("HP Simplified", 1, 48)); // NOI18N
        jLabel1.setText("DICCIONARIO");

        lbl_i1.setFont(new java.awt.Font("HP Simplified Light", 1, 18)); // NOI18N
        lbl_i1.setText("INGLES");

        lbl_i2.setFont(new java.awt.Font("HP Simplified Light", 1, 18)); // NOI18N
        lbl_i2.setText("ESPAÑOL");

        txtarea_trad2.setColumns(20);
        txtarea_trad2.setFont(new java.awt.Font("HP Simplified Light", 0, 14)); // NOI18N
        txtarea_trad2.setRows(5);
        jScrollPane1.setViewportView(txtarea_trad2);

        txtarea_trad1.setColumns(20);
        txtarea_trad1.setFont(new java.awt.Font("HP Simplified Light", 0, 14)); // NOI18N
        txtarea_trad1.setRows(5);
        jScrollPane2.setViewportView(txtarea_trad1);

        btn_trans.setFont(new java.awt.Font("HP Simplified Light", 1, 18)); // NOI18N
        btn_trans.setText("TRADUCIR");
        btn_trans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transActionPerformed(evt);
            }
        });

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

        btn_insert.setFont(new java.awt.Font("HP Simplified Light", 0, 12)); // NOI18N
        btn_insert.setText("Insertar palabras");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lbl_i1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_change, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_i2))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_insert)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_trans, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_insert)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_i2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_i1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btn_trans)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>                        

    private void btn_transActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try {
            cadena = txtarea_trad1.getText();
            String[] arreglo = cadena.split(",");
            if ("INGLES".equals(lbl_i1.getText())) {
                txtarea_trad2.setText(traduce_to_Español(arreglo));
            }
            if ("ESPAÑOL".equals(lbl_i1.getText())) {
                txtarea_trad2.setText(traduce_to_Ingles(arreglo));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al digitar los textos a traducir", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }                                         

    private void btn_changeActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String temp_txtarea, temp_lbl;

        temp_lbl = lbl_i1.getText();
        lbl_i1.setText(lbl_i2.getText());
        lbl_i2.setText(temp_lbl);

        temp_txtarea = txtarea_trad1.getText();
        txtarea_trad1.setText(txtarea_trad2.getText());
        txtarea_trad2.setText(temp_txtarea);
    }                                          

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {                                           
        boolean sw = true;
        int n = 0;
        while (sw) {
            try {
                String entrada = JOptionPane.showInputDialog(null, "Numero de palabras: ", "Numero palabras", JOptionPane.QUESTION_MESSAGE);
                if ((entrada != null) && (!entrada.isEmpty())) {
                    n = Integer.parseInt(entrada);
                    if (n < 0) {
                        JOptionPane.showMessageDialog(null, "Debe ingresar un valor mayor que 0");
                        continue;
                    }
                    sw = false;
                }
                if (entrada == null) {
                    sw = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico");
            }
        }
        System.out.println(p_ingles.length);
        if (n != 0) {
            for (int i = default_ingles.length; i < (default_ingles.length + n); i++) {
                p_ingles[i] = JOptionPane.showInputDialog(null, "Palabra en ingles:", "Ingresar palabra", JOptionPane.INFORMATION_MESSAGE);
            }
        }
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

    String traduce_to_Español(String[] ing) {
        String trad = "";
        for (int i = 0; i < ing.length; i++) {
            for (int j = 0; j < p_ingles.length; j++) {
                if (ing[i].equals(p_ingles[j])) {
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

    String traduce_to_Ingles(String[] esp) {
        String trad = "";
        for (int i = 0; i < esp.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (esp[i].equals(p_español[j])) {
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

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_change;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_trans;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_i1;
    private javax.swing.JLabel lbl_i2;
    private javax.swing.JTextArea txtarea_trad1;
    private javax.swing.JTextArea txtarea_trad2;
    // End of variables declaration                   
}
