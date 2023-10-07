
package pantallas;

public class FrameRegistrarAsistencia extends javax.swing.JFrame {
    
    private ListaAsistencia padre;
    
    public FrameRegistrarAsistencia() {
        initComponents();
    }
    
    public FrameRegistrarAsistencia (ListaAsistencia padre) {
        initComponents();
        this.padre = padre;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanRegistroAsistencia = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        PantxtCodigoCarpeta = new javax.swing.JPanel();
        txtCodigoCarpeta = new javax.swing.JTextField();
        lblCodigoCarpeta = new javax.swing.JLabel();
        PantxtClase = new javax.swing.JPanel();
        txtClase = new javax.swing.JTextField();
        lblClase = new javax.swing.JLabel();
        PantxtNombre = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        PantxtAsistencia = new javax.swing.JPanel();
        txtAsistencia = new javax.swing.JTextField();
        lblAsistencia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanRegistroAsistencia.setBackground(new java.awt.Color(255, 255, 255));

        lblTítulo.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        lblTítulo.setText("[Asistencia del Estudiante]");

        PantxtCodigoCarpeta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigoCarpeta.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtCodigoCarpeta.setForeground(new java.awt.Color(102, 102, 102));
        txtCodigoCarpeta.setText("codigoCarpeta");
        txtCodigoCarpeta.setBorder(null);
        PantxtCodigoCarpeta.add(txtCodigoCarpeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 20));

        lblCodigoCarpeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Textbox.png"))); // NOI18N
        PantxtCodigoCarpeta.add(lblCodigoCarpeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PantxtClase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtClase.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtClase.setForeground(new java.awt.Color(102, 102, 102));
        txtClase.setText("clase");
        txtClase.setBorder(null);
        PantxtClase.add(txtClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 20));

        lblClase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Textbox.png"))); // NOI18N
        PantxtClase.add(lblClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PantxtNombre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtNombre.setText("nombre");
        txtNombre.setBorder(null);
        PantxtNombre.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 20));

        lblNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Textbox.png"))); // NOI18N
        PantxtNombre.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        PantxtAsistencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAsistencia.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtAsistencia.setForeground(new java.awt.Color(102, 102, 102));
        txtAsistencia.setText("asistencia");
        txtAsistencia.setBorder(null);
        PantxtAsistencia.add(txtAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 20));

        lblAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Textbox.png"))); // NOI18N
        PantxtAsistencia.add(lblAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout PanRegistroAsistenciaLayout = new javax.swing.GroupLayout(PanRegistroAsistencia);
        PanRegistroAsistencia.setLayout(PanRegistroAsistenciaLayout);
        PanRegistroAsistenciaLayout.setHorizontalGroup(
            PanRegistroAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanRegistroAsistenciaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(PanRegistroAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PantxtAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTítulo)
                    .addComponent(PantxtCodigoCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanRegistroAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(PantxtClase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanRegistroAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PanRegistroAsistenciaLayout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addComponent(PantxtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        PanRegistroAsistenciaLayout.setVerticalGroup(
            PanRegistroAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanRegistroAsistenciaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblTítulo)
                .addGap(18, 18, 18)
                .addComponent(PantxtCodigoCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PantxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PantxtClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(PantxtAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(PanRegistroAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanRegistroAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanRegistroAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        String codigoCarpeta = txtCodigoCarpeta.getText();
        String clase = txtClase.getText();
        String nombre = txtNombre.getText();
        String asistencia = txtAsistencia.getText();

        Estudiante estudiante = new Estudiante (codigoCarpeta, nombre, clase,asistencia);

        this.padre.AgregarEstudiantes(estudiante);
        cerrar();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        cerrar();
    }//GEN-LAST:event_btnCancelarMouseClicked
    
    private void cerrar() {
        this.padre.setLocationRelativeTo(this);
        this.padre.setVisible(true);
        this.setVisible(false);
        
        this.setVisible(true);
        this.dispose();
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameRegistrarAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanRegistroAsistencia;
    private javax.swing.JPanel PantxtAsistencia;
    private javax.swing.JPanel PantxtClase;
    private javax.swing.JPanel PantxtCodigoCarpeta;
    private javax.swing.JPanel PantxtNombre;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel lblAsistencia;
    private javax.swing.JLabel lblClase;
    private javax.swing.JLabel lblCodigoCarpeta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JTextField txtAsistencia;
    private javax.swing.JTextField txtClase;
    private javax.swing.JTextField txtCodigoCarpeta;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
