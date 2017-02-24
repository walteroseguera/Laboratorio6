package WalterOseguera_Lab6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DCarretera = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BCrearCarretera = new javax.swing.JButton();
        BCancelarCarretera = new javax.swing.JButton();
        TFCodigo = new javax.swing.JTextField();
        TFKilometros = new javax.swing.JTextField();
        CBLugarInicio = new javax.swing.JComboBox<>();
        CBLugarFinal = new javax.swing.JComboBox<>();
        TPInicio = new javax.swing.JTabbedPane();
        PLugares = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TFNombre = new javax.swing.JTextField();
        TFDireccion = new javax.swing.JTextField();
        TFNivelSeguridad = new javax.swing.JTextField();
        CBTipoLugar = new javax.swing.JComboBox<>();
        BCarretera = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        BRestaurante = new javax.swing.JButton();
        BCancha = new javax.swing.JButton();
        CBEntrada = new javax.swing.JComboBox<>();
        CBSalida = new javax.swing.JComboBox<>();
        BCrearLugar = new javax.swing.JButton();
        BSalir = new javax.swing.JButton();
        PTabla = new javax.swing.JPanel();
        PTree = new javax.swing.JPanel();

        jLabel8.setText("Código: ");

        jLabel9.setText("Kilométros: ");

        jLabel10.setText("Lugar de inicio: ");

        jLabel11.setText("Lugar de final: ");

        BCrearCarretera.setText("Crear Carretera");

        BCancelarCarretera.setText("Cancelar");

        javax.swing.GroupLayout DCarreteraLayout = new javax.swing.GroupLayout(DCarretera.getContentPane());
        DCarretera.getContentPane().setLayout(DCarreteraLayout);
        DCarreteraLayout.setHorizontalGroup(
            DCarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DCarreteraLayout.createSequentialGroup()
                .addGroup(DCarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DCarreteraLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(BCrearCarretera)
                        .addGap(54, 54, 54)
                        .addComponent(BCancelarCarretera))
                    .addGroup(DCarreteraLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(DCarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(40, 40, 40)
                        .addGroup(DCarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFCodigo)
                            .addComponent(TFKilometros)
                            .addComponent(CBLugarInicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBLugarFinal, 0, 100, Short.MAX_VALUE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        DCarreteraLayout.setVerticalGroup(
            DCarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DCarreteraLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(DCarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(DCarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TFKilometros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(DCarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CBLugarInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(DCarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CBLugarFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(DCarreteraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCrearCarretera)
                    .addComponent(BCancelarCarretera))
                .addGap(36, 36, 36))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema");

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Dirección: ");

        jLabel3.setText("Nivel de Seguridad: ");

        jLabel4.setText("Carretera entrada: ");

        jLabel5.setText("Carretera salida: ");

        jLabel6.setText("Tipo de Lugar: ");

        CBTipoLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Carretera", "Restaurante", "Cancha" }));
        CBTipoLugar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBTipoLugarItemStateChanged(evt);
            }
        });

        BCarretera.setText("Carretera");
        BCarretera.setEnabled(false);
        BCarretera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCarreteraMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Crear un tipo de lugar: ");

        BRestaurante.setText("Restaurante");
        BRestaurante.setEnabled(false);

        BCancha.setText("Cancha");
        BCancha.setEnabled(false);

        CBEntrada.setEnabled(false);

        CBSalida.setEnabled(false);

        BCrearLugar.setText("Crear Lugar");

        BSalir.setText("Salir");
        BSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PLugaresLayout = new javax.swing.GroupLayout(PLugares);
        PLugares.setLayout(PLugaresLayout);
        PLugaresLayout.setHorizontalGroup(
            PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PLugaresLayout.createSequentialGroup()
                .addGroup(PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PLugaresLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PLugaresLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(BCarretera)
                                .addGap(39, 39, 39)
                                .addComponent(BRestaurante)
                                .addGap(42, 42, 42)
                                .addComponent(BCancha))
                            .addGroup(PLugaresLayout.createSequentialGroup()
                                .addGroup(PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(46, 46, 46)
                                .addGroup(PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFNivelSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBTipoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PLugaresLayout.createSequentialGroup()
                                .addGroup(PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(47, 47, 47)
                                .addGroup(PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CBEntrada, 0, 100, Short.MAX_VALUE)
                                    .addComponent(CBSalida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BCrearLugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))))
                    .addGroup(PLugaresLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel7)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        PLugaresLayout.setVerticalGroup(
            PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PLugaresLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFNivelSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CBTipoLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGroup(PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PLugaresLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BCarretera)
                            .addComponent(BRestaurante)
                            .addComponent(BCancha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(CBEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PLugaresLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BCrearLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(PLugaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CBSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        TPInicio.addTab("Crear Lugares", PLugares);

        javax.swing.GroupLayout PTablaLayout = new javax.swing.GroupLayout(PTabla);
        PTabla.setLayout(PTablaLayout);
        PTablaLayout.setHorizontalGroup(
            PTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        PTablaLayout.setVerticalGroup(
            PTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        TPInicio.addTab("Listar en Tabla", PTabla);

        javax.swing.GroupLayout PTreeLayout = new javax.swing.GroupLayout(PTree);
        PTree.setLayout(PTreeLayout);
        PTreeLayout.setHorizontalGroup(
            PTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
        );
        PTreeLayout.setVerticalGroup(
            PTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
        );

        TPInicio.addTab("Listar JList y JTree", PTree);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TPInicio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TPInicio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CBTipoLugarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBTipoLugarItemStateChanged
        if (CBTipoLugar.getSelectedIndex() == 1) {
            BCarretera.setEnabled(true);
            BCancha.setEnabled(false);
            BRestaurante.setEnabled(false);
        } else if (CBTipoLugar.getSelectedIndex() == 2){
            BCarretera.setEnabled(false);
            BCancha.setEnabled(false);
            BRestaurante.setEnabled(true);
        } else if (CBTipoLugar.getSelectedIndex() == 3) {
            BCarretera.setEnabled(false);
            BCancha.setEnabled(true);
            BRestaurante.setEnabled(false);
        }
    }//GEN-LAST:event_CBTipoLugarItemStateChanged

    private void BSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BSalirMouseClicked
        JOptionPane.showConfirmDialog(this, "¿Desea cerrar el programa?");
        if (JOptionPane.OK_OPTION == 0) {
            JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
            dispose();
        }
    }//GEN-LAST:event_BSalirMouseClicked

    private void BCarreteraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCarreteraMouseClicked
        DCarretera.setModal(true);
        DCarretera.pack();
        DCarretera.setLocationRelativeTo(this);
        DCarretera.setVisible(true);
    }//GEN-LAST:event_BCarreteraMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCancelarCarretera;
    private javax.swing.JButton BCancha;
    private javax.swing.JButton BCarretera;
    private javax.swing.JButton BCrearCarretera;
    private javax.swing.JButton BCrearLugar;
    private javax.swing.JButton BRestaurante;
    private javax.swing.JButton BSalir;
    private javax.swing.JComboBox<String> CBEntrada;
    private javax.swing.JComboBox<String> CBLugarFinal;
    private javax.swing.JComboBox<String> CBLugarInicio;
    private javax.swing.JComboBox<String> CBSalida;
    private javax.swing.JComboBox<String> CBTipoLugar;
    private javax.swing.JDialog DCarretera;
    private javax.swing.JPanel PLugares;
    private javax.swing.JPanel PTabla;
    private javax.swing.JPanel PTree;
    private javax.swing.JTextField TFCodigo;
    private javax.swing.JTextField TFDireccion;
    private javax.swing.JTextField TFKilometros;
    private javax.swing.JTextField TFNivelSeguridad;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTabbedPane TPInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
    ArrayList<Lugares> Lugares = new ArrayList();
}