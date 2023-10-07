
package pantallas;
import entidades.Asistencia;
import entidades.Estudiante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class ListaAsistencia extends javax.swing.JFrame {
    private GestorClases padre;
    
    private List<Estudiante> estudiantes = new ArrayList<Estudiante>();
    private DefaultListModel listaEstudiantes = new DefaultListModel();
    
    public ListaAsistencia() {
        initComponents();
    }
    
    public ListaAsistencia(GestorClases padre) {
        initComponents();
        this.padre = padre;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanPrincipal = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        PantxtBuscar = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblBuscar = new javax.swing.JLabel();
        PanListaGestor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEstudiantes = new javax.swing.JList<>();
        lblGestor = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnRegistrarAsistencia = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblTítulo.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        lblTítulo.setText("Lista de Asistencia: [Turno de la Clase]");

        PantxtBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscar.setText("Buscar");
        txtBuscar.setBorder(null);
        PantxtBuscar.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Lupa.png"))); // NOI18N
        PantxtBuscar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 37));

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Textbox.png"))); // NOI18N
        PantxtBuscar.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanListaGestor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstEstudiantes.setBorder(null);
        lstEstudiantes.setFont(new java.awt.Font("Lato", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(lstEstudiantes);

        PanListaGestor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 160));

        lblGestor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Panel.png"))); // NOI18N
        PanListaGestor.add(lblGestor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnSalir.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        btnRegistrarAsistencia.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        btnRegistrarAsistencia.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/RegistrarAsistencia.png"))); // NOI18N
        btnRegistrarAsistencia.setText("Registrar Asistencia");
        btnRegistrarAsistencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarAsistenciaMouseClicked(evt);
            }
        });

        BtnBuscar.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Buscar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanPrincipalLayout = new javax.swing.GroupLayout(PanPrincipal);
        PanPrincipal.setLayout(PanPrincipalLayout);
        PanPrincipalLayout.setHorizontalGroup(
            PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanPrincipalLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTítulo)
                    .addGroup(PanPrincipalLayout.createSequentialGroup()
                        .addComponent(PantxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnBuscar))
                    .addGroup(PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanPrincipalLayout.createSequentialGroup()
                            .addComponent(btnSalir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(PanListaGestor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        PanPrincipalLayout.setVerticalGroup(
            PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanPrincipalLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblTítulo)
                .addGap(18, 18, 18)
                .addGroup(PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanPrincipalLayout.createSequentialGroup()
                        .addComponent(PantxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanListaGestor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarAsistencia)
                            .addComponent(btnSalir)))
                    .addComponent(BtnBuscar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        cerrar();
    }//GEN-LAST:event_btnSalirMouseClicked
    
    
    private void cerrar() {
        this.padre.setLocationRelativeTo(this);
        this.padre.setVisible(true);
        this.setVisible(false);
        
        this.setVisible(true);
        this.dispose();
    }
    private void btnRegistrarAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarAsistenciaMouseClicked
        FrameRegistrarAsistencia pantalla = new FrameRegistrarAsistencia(this);
        pantalla.setLocationRelativeTo(this);
        pantalla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarAsistenciaMouseClicked

    private void BtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseClicked
        txtBuscar.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent e) {
            }

            public void removeUpdate(DocumentEvent e) {
                if (txtBuscar.getText().trim().isEmpty()) {
                    lstEstudiantes.setModel(listaEstudiantes);
                }
            }

            public void changedUpdate(DocumentEvent e) {
            }
        });
        
        String textoBusqueda = txtBuscar.getText().trim().toLowerCase();

        if (textoBusqueda.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                    "Ingrese el término que desee buscar ", 
                    "Campo de búsqueda vacío", 
                    JOptionPane.WARNING_MESSAGE
            );
        } else {
            DefaultListModel resultadosModel = new DefaultListModel(); 

            for (Estudiante estudiante : estudiantes) {
                String codigoCur = 
                        estudiante.getCodigoCarpeta().toLowerCase(); 
                
                String nombreCur =
                        estudiante.getNombreEst().toLowerCase();
            
                if (codigoCur.contains(textoBusqueda) || 
                        nombreCur.contains(textoBusqueda))
                {
                    resultadosModel.addElement(
                            estudiante.getTextoEst()); 
                }
            }
        
            if (resultadosModel.isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                        "No se encontraron resultados"
                                + " para la búsqueda.",
                        "Sin resultados", 
                        JOptionPane.INFORMATION_MESSAGE
                );
            
                // Restablece el modelo original
                lstEstudiantes.setModel(listaEstudiantes);
            } else {
                // Configura el modelo de resultados
                lstEstudiantes.setModel(resultadosModel);
            }
        }
    }//GEN-LAST:event_BtnBuscarMouseClicked
    
    
    public void AgregarEstudiantes(Estudiante curso){
        estudiantes.add(estudiante);
        listaEstudiantes.addElement(estudiante.getTextoEst());
        lstEstudiantes.setModel(listaEstudiantes);
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaAsistencia().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnBuscar;
    private javax.swing.JPanel PanListaGestor;
    private javax.swing.JPanel PanPrincipal;
    private javax.swing.JPanel PantxtBuscar;
    private javax.swing.JLabel btnRegistrarAsistencia;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblGestor;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JList<String> lstEstudiantes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
