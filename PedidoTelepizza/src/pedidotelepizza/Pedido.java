/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidotelepizza;

import java.awt.Component;
import java.util.LinkedList;
import javax.swing.DefaultListModel;

/**
 *
 * @author alumno
 */
public class Pedido extends javax.swing.JFrame {

    /**
     * Creates new form Pedido
     */
    public Pedido() {
        initComponents();
        componentes2(false);
        this.vPizzas = new LinkedList();
        this.ingredientes = new LinkedList();
        modeloLista = new DefaultListModel();
        jList1.setModel(modeloLista);
        modeloPedido = new DefaultListModel();
        jList2.setModel(modeloPedido);
        crearPizzas();
    }

    private void componentes1(boolean hab) {
        Component[] v = jPanel1.getComponents();
        for (Component c : v) {
            c.setEnabled(hab);
        }

    }

    private void componentes2(boolean hab) {
        Component[] v = jPanel2.getComponents();
        for (Component c : v) {
            c.setEnabled(hab);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldObservaciones = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jRadioButtonDomicilio = new javax.swing.JRadioButton();
        jRadioButtonRecoger = new javax.swing.JRadioButton();
        jButtonComenzar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelPrecio = new javax.swing.JLabel();
        jButtonTerminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxNombre = new javax.swing.JComboBox<>();
        jComboBoxTam = new javax.swing.JComboBox<>();
        jComboBoxIngrediente1 = new javax.swing.JComboBox<>();
        jButtonPizza = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jButtonEliminarIngrediente = new javax.swing.JButton();
        jButtonAñadirIngrediente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Teléfono:");

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jTextFieldObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldObservacionesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Observaciones:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Dirección:");

        jTextFieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonDomicilio);
        jRadioButtonDomicilio.setText("Domicilio");

        buttonGroup1.add(jRadioButtonRecoger);
        jRadioButtonRecoger.setText("Recoger");

        jButtonComenzar.setText("Comenzar Pedido");
        jButtonComenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonComenzarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonDomicilio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonRecoger)
                                .addGap(19, 19, 19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(jButtonComenzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldObservaciones)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonDomicilio)
                            .addComponent(jRadioButtonRecoger))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonTerminar.setText("Terminar Pedido");
        jButtonTerminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTerminarMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Otros Ingredientes");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Elige la pizza");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Elige el tamaño");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("TU PEDIDO");

        jComboBoxNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNombreActionPerformed(evt);
            }
        });

        jComboBoxTam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecciona -", "Mediana", "Familiar" }));

        jButtonPizza.setText("Añadir Pizza");
        jButtonPizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPizzaMouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Ingredientes");

        jButtonEliminarIngrediente.setText("Eliminar");
        jButtonEliminarIngrediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEliminarIngredienteMouseClicked(evt);
            }
        });

        jButtonAñadirIngrediente.setText("Añadir");
        jButtonAñadirIngrediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAñadirIngredienteMouseClicked(evt);
            }
        });

        jScrollPane3.setViewportView(jList2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxTam, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonPizza)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButtonTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxIngrediente1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(jButtonEliminarIngrediente)
                            .addComponent(jButtonAñadirIngrediente))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBoxIngrediente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAñadirIngrediente)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButtonPizza)
                                        .addGap(18, 18, 18)))
                                .addComponent(jButtonTerminar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonEliminarIngrediente)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldObservacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldObservacionesActionPerformed

    private void jTextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionActionPerformed

    private void jButtonComenzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonComenzarMouseClicked

        if (!(jTextFieldNombre.getText().isEmpty() && jTextFieldDireccion.getText().isEmpty() && jTextFieldTelefono.getText().isEmpty()) && (jRadioButtonDomicilio.isSelected() || jRadioButtonRecoger.isSelected())) {
            componentes2(true);
            componentes1(false);
        }
    }//GEN-LAST:event_jButtonComenzarMouseClicked

    private void jComboBoxNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNombreActionPerformed
        String nombrePizza = (String) jComboBoxNombre.getSelectedItem();
        modeloLista.clear();
        for (Pizza i : vPizzas) {
            if (i.getNombre().equalsIgnoreCase(nombrePizza)) {
                for (String x : i.getIngredientes()) {
                    modeloLista.addElement(x);
                }
            }
        }


    }//GEN-LAST:event_jComboBoxNombreActionPerformed

    private void jButtonAñadirIngredienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAñadirIngredienteMouseClicked

        if (!jComboBoxIngrediente1.getSelectedItem().equals("- Seleccionar -")) {
            modeloLista.addElement(jComboBoxIngrediente1.getSelectedItem());
        }
    }//GEN-LAST:event_jButtonAñadirIngredienteMouseClicked

    private void jButtonEliminarIngredienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarIngredienteMouseClicked

        modeloLista.remove(jList1.getSelectedIndex());

    }//GEN-LAST:event_jButtonEliminarIngredienteMouseClicked

    private void jButtonPizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPizzaMouseClicked

        float precio = 0;

        LinkedList<String> ing = new LinkedList();
        for (int i = 0; i < modeloLista.size(); i++) {
            ing.add((String) modeloLista.getElementAt(i));
        }
        Pizza p = new Pizza((String) jComboBoxNombre.getSelectedItem(), ing);
        modeloPedido.addElement(p);

        if (modeloPedido.size() == 1 && jRadioButtonRecoger.isSelected()) {
            jLabelPrecio.setText("9,95€");
        } else if (modeloPedido.size() == 2 && jRadioButtonRecoger.isSelected()) {
            jLabelPrecio.setText("18,95€");
        } else if (modeloPedido.size() == 3 && jRadioButtonRecoger.isSelected()) {
            jLabelPrecio.setText("21€");
        } else if (modeloPedido.size() == 1 && jRadioButtonDomicilio.isSelected()) {
            jLabelPrecio.setText("12,95€");
        } else if (modeloPedido.size() == 2 && jRadioButtonDomicilio.isSelected()) {
            jLabelPrecio.setText("20,95");
        } else if (modeloPedido.size() == 3 && jRadioButtonDomicilio.isSelected()) {
            jLabelPrecio.setText("24€");
        }

        if (modeloPedido.size() > 3 && jRadioButtonRecoger.isSelected()) {
            precio = 21;
            precio += 9.95;
            jLabelPrecio.setText(String.valueOf(precio));
        } else if (modeloPedido.size() > 3 && jRadioButtonDomicilio.isSelected()) {
            precio = 24;
            precio += 12.95;
            jLabelPrecio.setText(String.valueOf(precio));
        }

    }//GEN-LAST:event_jButtonPizzaMouseClicked

    private void jButtonTerminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTerminarMouseClicked

        Recibo r = new Recibo(modeloPedido, jLabelPrecio.getText());
        r.setLocationRelativeTo(this);
        r.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButtonTerminarMouseClicked

    private void crearPizzas() {

        LinkedList<String> ingp1 = new LinkedList();
        LinkedList<String> ingp2 = new LinkedList();
        LinkedList<String> ingp3 = new LinkedList();
        LinkedList<String> ingp4 = new LinkedList();
        LinkedList<String> ingp5 = new LinkedList();

        ingredientes.add("- Seleccionar -");
        ingredientes.add("Bacon");
        ingredientes.add("Pollo");
        ingredientes.add("Ternera");
        ingredientes.add("Champiñon");
        ingredientes.add("Cebolla");

        for (int i = 0; i < ingredientes.size(); i++) {
            jComboBoxIngrediente1.addItem(ingredientes.get(i));
        }
        ingp1.add("Bacon");
        ingp1.add("Pollo");
        ingp1.add("Ternera");

        ingp2.add("Bacon");
        ingp2.add("Champiñon");

        ingp3.add("4 Quesos");

        ingp4.add("Bacon");
        ingp4.add("Bacon Crispy");

        ingp5.add("");

        Pizza pi1 = new Pizza("Barbacoa", ingp1);
        Pizza pi2 = new Pizza("Carbonara", ingp2);
        Pizza pi3 = new Pizza("4 Quesos", ingp3);
        Pizza pi4 = new Pizza("Bacon Crispy", ingp4);
        Pizza pi5 = new Pizza("Al Gusto", ingp5);

        vPizzas.add(pi1);
        vPizzas.add(pi2);
        vPizzas.add(pi3);
        vPizzas.add(pi4);
        vPizzas.add(pi5);

        for (int i = 0; i < vPizzas.size(); i++) {
            jComboBoxNombre.addItem(vPizzas.get(i).getNombre());
        }

    }

    private DefaultListModel modeloPedido;
    private DefaultListModel modeloLista;
    private LinkedList<Pizza> vPizzas;
    private LinkedList<String> ingredientes;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAñadirIngrediente;
    private javax.swing.JButton jButtonComenzar;
    private javax.swing.JButton jButtonEliminarIngrediente;
    private javax.swing.JButton jButtonPizza;
    private javax.swing.JButton jButtonTerminar;
    private javax.swing.JComboBox<String> jComboBoxIngrediente1;
    private javax.swing.JComboBox<String> jComboBoxNombre;
    private javax.swing.JComboBox<String> jComboBoxTam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonDomicilio;
    private javax.swing.JRadioButton jRadioButtonRecoger;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldObservaciones;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}