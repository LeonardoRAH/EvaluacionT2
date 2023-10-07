
package pantallas;

public class GestorClases extends javax.swing.JFrame {
    
    
    public GestorClases() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanPrincipal = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        btnMañana = new javax.swing.JLabel();
        btnTarde = new javax.swing.JLabel();
        btnNoche = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblTítulo.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        lblTítulo.setText("Gestor de Clases");

        btnMañana.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        btnMañana.setForeground(new java.awt.Color(255, 255, 255));
        btnMañana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Mañana.png"))); // NOI18N
        btnMañana.setText("Mañana");
        btnMañana.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMañana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMañanaMouseClicked(evt);
            }
        });

        btnTarde.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        btnTarde.setForeground(new java.awt.Color(255, 255, 255));
        btnTarde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Tarde.png"))); // NOI18N
        btnTarde.setText("Agregar");
        btnTarde.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTarde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTardeMouseClicked(evt);
            }
        });

        btnNoche.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        btnNoche.setForeground(new java.awt.Color(255, 255, 255));
        btnNoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Noche.png"))); // NOI18N
        btnNoche.setText("Noche");
        btnNoche.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNoche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNocheMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanPrincipalLayout = new javax.swing.GroupLayout(PanPrincipal);
        PanPrincipal.setLayout(PanPrincipalLayout);
        PanPrincipalLayout.setHorizontalGroup(
            PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanPrincipalLayout.createSequentialGroup()
                .addGroup(PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanPrincipalLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblTítulo))
                    .addGroup(PanPrincipalLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTarde)
                            .addComponent(btnMañana)
                            .addComponent(btnNoche))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PanPrincipalLayout.setVerticalGroup(
            PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanPrincipalLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblTítulo)
                .addGap(18, 18, 18)
                .addComponent(btnMañana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTarde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNoche)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMañanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMañanaMouseClicked
        ListaAsistencia pantalla = new ListaAsistencia(this);
        pantalla.setLocationRelativeTo(this);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMañanaMouseClicked

    private void btnTardeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTardeMouseClicked
       ListaAsistencia pantalla = new ListaAsistencia(this);
        pantalla.setLocationRelativeTo(this);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTardeMouseClicked

    private void btnNocheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNocheMouseClicked
        ListaAsistencia pantalla = new ListaAsistencia(this);
        pantalla.setLocationRelativeTo(this);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNocheMouseClicked

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
            java.util.logging.Logger.getLogger(GestorClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestorClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestorClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestorClases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestorClases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanPrincipal;
    private javax.swing.JLabel btnMañana;
    private javax.swing.JLabel btnNoche;
    private javax.swing.JLabel btnTarde;
    private javax.swing.JLabel lblTítulo;
    // End of variables declaration//GEN-END:variables
}
