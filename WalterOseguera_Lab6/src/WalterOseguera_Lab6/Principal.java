package WalterOseguera_Lab6;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
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
        DRestaurante = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CBCategoria = new javax.swing.JComboBox<>();
        TFCalificacion = new javax.swing.JTextField();
        BCrearResta = new javax.swing.JButton();
        BCancelarResta = new javax.swing.JButton();
        DCanchas = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        CBCategoriaCancha = new javax.swing.JComboBox<>();
        BCrearCan = new javax.swing.JButton();
        BCancelarCan = new javax.swing.JButton();
        CBEstado = new javax.swing.JComboBox<>();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        PTree = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        jLabel8.setText("Código: ");

        jLabel9.setText("Kilométros: ");

        jLabel10.setText("Lugar de inicio: ");

        jLabel11.setText("Lugar de final: ");

        BCrearCarretera.setText("Crear Carretera");
        BCrearCarretera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCrearCarreteraMouseClicked(evt);
            }
        });

        BCancelarCarretera.setText("Cancelar");
        BCancelarCarretera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCancelarCarreteraMouseClicked(evt);
            }
        });

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

        jLabel12.setText("Categoría: ");

        jLabel13.setText("Calificación: ");

        CBCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chino", "Mexicano", "Italiano", "Comida rápida" }));

        BCrearResta.setText("Crear Restaurante");

        BCancelarResta.setText("Cancelar");
        BCancelarResta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCancelarRestaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DRestauranteLayout = new javax.swing.GroupLayout(DRestaurante.getContentPane());
        DRestaurante.getContentPane().setLayout(DRestauranteLayout);
        DRestauranteLayout.setHorizontalGroup(
            DRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DRestauranteLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(DRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DRestauranteLayout.createSequentialGroup()
                        .addComponent(BCrearResta)
                        .addGap(44, 44, 44)
                        .addComponent(BCancelarResta))
                    .addGroup(DRestauranteLayout.createSequentialGroup()
                        .addGroup(DRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(60, 60, 60)
                        .addGroup(DRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        DRestauranteLayout.setVerticalGroup(
            DRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DRestauranteLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(DRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(CBCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(DRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TFCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(DRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCrearResta)
                    .addComponent(BCancelarResta))
                .addGap(29, 29, 29))
        );

        jLabel14.setText("Categoría: ");

        jLabel15.setText("Estado: ");

        CBCategoriaCancha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Football", "Básquet", "Tenis", "Volleyball" }));

        BCrearCan.setText("Crear Cancha");
        BCrearCan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCrearCanMouseClicked(evt);
            }
        });

        BCancelarCan.setText("Cancelar");
        BCancelarCan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCancelarCanMouseClicked(evt);
            }
        });

        CBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reservada", "Disponible" }));

        javax.swing.GroupLayout DCanchasLayout = new javax.swing.GroupLayout(DCanchas.getContentPane());
        DCanchas.getContentPane().setLayout(DCanchasLayout);
        DCanchasLayout.setHorizontalGroup(
            DCanchasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DCanchasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(DCanchasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DCanchasLayout.createSequentialGroup()
                        .addComponent(BCrearCan)
                        .addGap(18, 18, 18)
                        .addComponent(BCancelarCan))
                    .addGroup(DCanchasLayout.createSequentialGroup()
                        .addGroup(DCanchasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(27, 27, 27)
                        .addGroup(DCanchasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CBCategoriaCancha, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CBEstado, 0, 100, Short.MAX_VALUE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        DCanchasLayout.setVerticalGroup(
            DCanchasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DCanchasLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(DCanchasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(CBCategoriaCancha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(DCanchasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(DCanchasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCrearCan)
                    .addComponent(BCancelarCan))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema");

        TPInicio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TPInicioStateChanged(evt);
            }
        });

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Dirección: ");

        jLabel3.setText("Nivel de Seguridad: ");

        jLabel4.setText("Carretera entrada: ");

        jLabel5.setText("Carretera salida: ");

        jLabel6.setText("Tipo de Lugar: ");

        CBTipoLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Casa", "Carretera", "Restaurante", "Cancha" }));
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
        BRestaurante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BRestauranteMouseClicked(evt);
            }
        });

        BCancha.setText("Cancha");
        BCancha.setEnabled(false);
        BCancha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCanchaMouseClicked(evt);
            }
        });

        CBEntrada.setEnabled(false);

        CBSalida.setEnabled(false);

        BCrearLugar.setText("Crear Lugar");
        BCrearLugar.setEnabled(false);
        BCrearLugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BCrearLugarMouseClicked(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Dirección", "Nivel de Seguridad", "Observación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jLabel16.setText("Categoría: ");

        javax.swing.GroupLayout PTablaLayout = new javax.swing.GroupLayout(PTabla);
        PTabla.setLayout(PTablaLayout);
        PTablaLayout.setHorizontalGroup(
            PTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PTablaLayout.createSequentialGroup()
                .addGroup(PTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PTablaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE))
                    .addGroup(PTablaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel16)
                        .addGap(71, 71, 71)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PTablaLayout.setVerticalGroup(
            PTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PTablaLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(PTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        TPInicio.addTab("Listar en Tabla", PTabla);

        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jTree1);

        javax.swing.GroupLayout PTreeLayout = new javax.swing.GroupLayout(PTree);
        PTree.setLayout(PTreeLayout);
        PTreeLayout.setHorizontalGroup(
            PTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PTreeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        PTreeLayout.setVerticalGroup(
            PTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PTreeLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(PTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(140, Short.MAX_VALUE))
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
        if (CBTipoLugar.getSelectedIndex() == 0) {
            BCrearLugar.setEnabled(true);
            BCarretera.setEnabled(false);
            BCancha.setEnabled(false);
            BRestaurante.setEnabled(false);
        }
        else if (CBTipoLugar.getSelectedIndex() == 1) {
            BCrearLugar.setEnabled(true);
            BCarretera.setEnabled(false);
            BCancha.setEnabled(false);
            BRestaurante.setEnabled(false);
        } else if (CBTipoLugar.getSelectedIndex() == 2) {
            BCrearLugar.setEnabled(false);
            BCarretera.setEnabled(true);
            BCancha.setEnabled(false);
            BRestaurante.setEnabled(false);
        } else if (CBTipoLugar.getSelectedIndex() == 3){
            BCrearLugar.setEnabled(false);
            BCarretera.setEnabled(false);
            BCancha.setEnabled(false);
            BRestaurante.setEnabled(true);
        } else if (CBTipoLugar.getSelectedIndex() == 4) {
            BCrearLugar.setEnabled(false);
            BCarretera.setEnabled(false);
            BCancha.setEnabled(true);
            BRestaurante.setEnabled(false);
        }
    }//GEN-LAST:event_CBTipoLugarItemStateChanged

    private void BSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BSalirMouseClicked
        dispose();
    }//GEN-LAST:event_BSalirMouseClicked

    private void BCarreteraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCarreteraMouseClicked
        if ("".equals(TFCodigo.getText()) && "".equals(TFDireccion.getText()) && "".equals(TFNivelSeguridad.getText())) {
            JOptionPane.showMessageDialog(this, "Debe de llenar los campos de arriba");
        } else {
            DefaultComboBoxModel Modelo1 = new DefaultComboBoxModel();
            DefaultComboBoxModel Modelo2 = new DefaultComboBoxModel();
            for (int i = 0; i < Lugares.size(); i++) {
                Modelo1.addElement(Lugares.get(i).getNombre());
                Modelo2.addElement(Lugares.get(i).getNombre());
            }
            CBLugarInicio.setModel(Modelo1);
            CBLugarFinal.setModel(Modelo2);
            DCarretera.setModal(true);
            DCarretera.pack();
            DCarretera.setLocationRelativeTo(this);
            DCarretera.setVisible(true);
        }
    }//GEN-LAST:event_BCarreteraMouseClicked

    private void BCrearLugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCrearLugarMouseClicked
        try {
            String Nombre, Direccion, TipoLugar;
            int NivelSeguridad;
            
            Nombre = TFNombre.getText();
            Direccion = TFDireccion.getText();
            NivelSeguridad = Integer.parseInt(TFNivelSeguridad.getText());
            TipoLugar = CBTipoLugar.getSelectedItem().toString();
            Lugares.add(new Lugares(Nombre, Direccion, NivelSeguridad, new Carreteras(), new Carreteras(), CBTipoLugar.getSelectedItem().toString()));
            JOptionPane.showMessageDialog(this, "Se ha creado el Lugar");
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error: " + e.getMessage());
        }
    }//GEN-LAST:event_BCrearLugarMouseClicked

    private void BRestauranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BRestauranteMouseClicked
        if ("".equals(TFCodigo.getText()) && "".equals(TFDireccion.getText()) && "".equals(TFNivelSeguridad.getText())) {
            JOptionPane.showMessageDialog(this, "Debe de llenar los campos de arriba");
        } else {
            DRestaurante.setModal(true);
            DRestaurante.pack();
            DRestaurante.setLocationRelativeTo(this);
            DRestaurante.setVisible(true);
        }
    }//GEN-LAST:event_BRestauranteMouseClicked

    private void BCanchaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCanchaMouseClicked
        if ("".equals(TFCodigo.getText()) && "".equals(TFDireccion.getText()) && "".equals(TFNivelSeguridad.getText())) {
            JOptionPane.showMessageDialog(this, "Debe de llenar los campos de arriba");
        } else {
            DCanchas.setModal(true);
            DCanchas.pack();
            DCanchas.setLocationRelativeTo(this);
            DCanchas.setVisible(true);
        }
    }//GEN-LAST:event_BCanchaMouseClicked

    private void TPInicioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TPInicioStateChanged
        if (TPInicio.getSelectedIndex() == 1){
            DefaultComboBoxModel Modelo = new DefaultComboBoxModel();
            for (Lugares Temp : Lugares) {
                Modelo.addElement(Temp);
            }
            CBCategoria.setModel(Modelo);
        }
    }//GEN-LAST:event_TPInicioStateChanged

    private void BCrearCarreteraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCrearCarreteraMouseClicked
        try {
            int Codigo;
            double Kilometros;
            Lugares LInicio = new Lugares(), LFinal = new Lugares();
            LInicio.getNombre();
            CBLugarInicio.setToolTipText(LFinal.getNombre());
            Codigo = Integer.parseInt(TFCodigo.getText());
            Kilometros = Double.parseDouble(TFKilometros.getText());
            Lugares.add(new Carreteras(Codigo, Kilometros, LInicio, LFinal, TFNombre.getText(), TFDireccion.getText(), Integer.parseInt(TFNivelSeguridad.getText()), new Carreteras(), new Carreteras(), CBTipoLugar.getSelectedItem().toString()));
            JOptionPane.showMessageDialog(this, "Se ha creado la carretera");
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error: " + e.getMessage());
        }
    }//GEN-LAST:event_BCrearCarreteraMouseClicked

    private void BCancelarCarreteraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCancelarCarreteraMouseClicked
        this.DCarretera.dispose();
    }//GEN-LAST:event_BCancelarCarreteraMouseClicked

    private void BCancelarRestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCancelarRestaMouseClicked
        this.DRestaurante.dispose();
    }//GEN-LAST:event_BCancelarRestaMouseClicked

    private void BCancelarCanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCancelarCanMouseClicked
        this.DCanchas.dispose();
    }//GEN-LAST:event_BCancelarCanMouseClicked

    private void BCrearCanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BCrearCanMouseClicked
        try {
            String Categoria, Estado;
            Categoria = CBCategoriaCancha.getSelectedItem().toString();
            Estado = CBEstado.getSelectedItem().toString();
            Lugares.add(new Canchas(Categoria, Estado, TFNombre.getText(), TFDireccion.getText(), Integer.parseInt(TFNivelSeguridad.getText()), new Carreteras(), new Carreteras(), CBTipoLugar.getSelectedItem().toString()));
            JOptionPane.showMessageDialog(this, "Se ha creado la cancha");
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error: " + e.getMessage());
        }
    }//GEN-LAST:event_BCrearCanMouseClicked

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
    private javax.swing.JButton BCancelarCan;
    private javax.swing.JButton BCancelarCarretera;
    private javax.swing.JButton BCancelarResta;
    private javax.swing.JButton BCancha;
    private javax.swing.JButton BCarretera;
    private javax.swing.JButton BCrearCan;
    private javax.swing.JButton BCrearCarretera;
    private javax.swing.JButton BCrearLugar;
    private javax.swing.JButton BCrearResta;
    private javax.swing.JButton BRestaurante;
    private javax.swing.JButton BSalir;
    private javax.swing.JComboBox<String> CBCategoria;
    private javax.swing.JComboBox<String> CBCategoriaCancha;
    private javax.swing.JComboBox<String> CBEntrada;
    private javax.swing.JComboBox<String> CBEstado;
    private javax.swing.JComboBox<String> CBLugarFinal;
    private javax.swing.JComboBox<String> CBLugarInicio;
    private javax.swing.JComboBox<String> CBSalida;
    private javax.swing.JComboBox<String> CBTipoLugar;
    private javax.swing.JDialog DCanchas;
    private javax.swing.JDialog DCarretera;
    private javax.swing.JDialog DRestaurante;
    private javax.swing.JPanel PLugares;
    private javax.swing.JPanel PTabla;
    private javax.swing.JPanel PTree;
    private javax.swing.JTextField TFCalificacion;
    private javax.swing.JTextField TFCodigo;
    private javax.swing.JTextField TFDireccion;
    private javax.swing.JTextField TFKilometros;
    private javax.swing.JTextField TFNivelSeguridad;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTabbedPane TPInicio;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
    ArrayList<Lugares> Lugares = new ArrayList();
}