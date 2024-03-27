/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.inventario_tienda_compensar;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author manyd
 */
public class ProductsInterface extends javax.swing.JInternalFrame {

    // Los productos que se van agregando gradualmente
    ArrayList<Product> products = new ArrayList<>();
    /**
     * Creates new form productsInterface
     */
    public ProductsInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        productNameInput = new javax.swing.JTextField();
        productTypeInput = new javax.swing.JComboBox<>();
        totalUnitsInput = new javax.swing.JSpinner();
        unitaryValueInput = new javax.swing.JTextField();
        addProductBtn = new javax.swing.JButton();
        editProductBtn = new javax.swing.JButton();
        deleteProductBtn = new javax.swing.JButton();
        saveModificationBtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Registro Producto");
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo", "Unidades", "Valor Uni.", "IVA", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productsTable);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre Producto");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tipo de Producto");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cantidad Unidades");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Valor Unitario");

        productTypeInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aseo", "Papelería", "Víveres", "Productos para Mascotas", "Otros" }));

        totalUnitsInput.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        addProductBtn.setText("Agregar Producto");
        addProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBtnActionPerformed(evt);
            }
        });

        editProductBtn.setText("Editar Producto");
        editProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProductBtnActionPerformed(evt);
            }
        });

        deleteProductBtn.setText("Borrar Producto");
        deleteProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductBtnActionPerformed(evt);
            }
        });

        saveModificationBtn.setText("Guardar Edición");
        saveModificationBtn.setEnabled(false);
        saveModificationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveModificationBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(editProductBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteProductBtn)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addProductBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveModificationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(productNameInput)
                            .addComponent(productTypeInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalUnitsInput)
                            .addComponent(unitaryValueInput))))
                .addGap(257, 257, 257))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(productNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productTypeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalUnitsInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(unitaryValueInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addProductBtn)
                    .addComponent(saveModificationBtn))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editProductBtn)
                    .addComponent(deleteProductBtn))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Maneja el evento de clic en el botón para agregar un producto.
     * Realiza las siguientes acciones:
     * 1. Agrega un nuevo producto.
     * 2. Limpia los campos de entrada.
     * @param evt El evento de acción que desencadenó este método.
     */
    private void addProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductBtnActionPerformed
        addProduct();
        clearFields();
    }//GEN-LAST:event_addProductBtnActionPerformed

    int selectedModificationRow = 0;
    /**
     * Realiza la acción de edición de un producto.
     * Obtiene la fila seleccionada, carga los datos del producto en los campos de entrada y habilita el botón de guardar modificación.
     * @param evt El evento de acción que desencadenó este método.
     */
    private void editProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProductBtnActionPerformed
        selectedModificationRow = editProduct();
    }//GEN-LAST:event_editProductBtnActionPerformed

    /**
     * Realiza la acción de eliminación de un producto.
     * Elimina el producto seleccionado de la lista y de la tabla de productos.
     * @param evt El evento de acción que desencadenó este método.
     */
    private void deleteProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductBtnActionPerformed
        deleteProduct();
    }//GEN-LAST:event_deleteProductBtnActionPerformed

    /**
     * Realiza la acción de guardar la modificación del producto.
     * @param evt El evento de acción que desencadenó este método.
     */
    private void saveModificationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveModificationBtnActionPerformed
        saveModification();
    }//GEN-LAST:event_saveModificationBtnActionPerformed

    /**
     * Agrega un nuevo producto a la lista de productos y actualiza la tabla de productos.
     */
    private void addProduct(){
        try{
            // Obtener el modelo de tabla de productos
            DefaultTableModel productsModelTable = (DefaultTableModel) productsTable.getModel();

            // Obtener los datos del nuevo producto de los campos de entrada
            String name = productNameInput.getText();
            String type = productTypeInput.getSelectedItem().toString();
            int totalUnits = Integer.parseInt(totalUnitsInput.getValue().toString());
            double unitaryValue = Double.parseDouble(unitaryValueInput.getText());

            // Validar si los campos están vacíos o si los valores son menores o iguales a cero
            if(name.isEmpty()){
                throw new IllegalArgumentException("El nombre del producto es obligatorio");
            }
            if (totalUnits <= 0 || unitaryValue <= 0) {
                throw new IllegalArgumentException("Las unidades y el valor unitario deben ser mayores a cero");
            }

            // Crear una instancia del producto con los datos proporcionados
            Product product = new Product(name, type, totalUnits, unitaryValue);

            // Añadir el producto a la lista de productos
            products.add(product);

            // Formatear los datos del producto para mostrar en la tabla
            DecimalFormat decimalFormat = new DecimalFormat();
            Object[] rowData = {
                    product.getName(),
                    product.getType(),
                    decimalFormat.format(product.getTotalUnits()),
                    decimalFormat.format(product.getUnitaryValue()),
                    String.format("%.2f%%", product.getIva()*100),
                    decimalFormat.format(product.getTotalValue())
            };

            // Añadir la fila del producto a la tabla de productos
            productsModelTable.addRow(rowData);
        }catch (IllegalArgumentException e) {
            // Manejar la excepción si se ingresan valores incorrectos en los campos o si los campos están vacíos
            JOptionPane.showMessageDialog(rootPane, "Ingrese un valor válido.\n" + e.getMessage());
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
     * Limpia los campos de entrada.
     */
    private void clearFields() {
        // Establece el nombre del producto como vacío
        productNameInput.setText("");

        // Establece el valor predeterminado de las unidades como 0
        totalUnitsInput.setValue(0);

        // Establece el valor predeterminado del valor unitario como 0
        unitaryValueInput.setText("0");
    }

    /**
     * Edita un producto seleccionado en la tabla de productos.
     * @return El índice de la fila seleccionada.
     */
    private int editProduct(){
        int selectedRow = productsTable.getSelectedRow();
        if(selectedRow == -1)
            // No hay fila seleccionada, no se realiza ninguna acción
            return -1;
        try{
            // Obtiene el producto seleccionado
            Product tempProduct = products.get(selectedRow);

            // Carga los datos del producto en los campos de entrada
            productNameInput.setText(tempProduct.getName());
            productTypeInput.setSelectedItem(tempProduct.getType());
            totalUnitsInput.setValue(tempProduct.getTotalUnits());
            unitaryValueInput.setText(String.valueOf(tempProduct.getUnitaryValue()));

            // Habilita el botón de guardar modificación y deshabilita el botón de agregar producto
            saveModificationBtn.setEnabled(true);
            addProductBtn.setEnabled(false);

            return selectedRow;
        } catch (IndexOutOfBoundsException e) {
            // Si la fila seleccionada está fuera del rango, no se realiza ninguna acción
            return -1;
        }
    }

    /**
     * Elimina un producto seleccionado de la lista y de la tabla de productos.
     */
    private void deleteProduct(){
        int selectedRow = productsTable.getSelectedRow();
        if(selectedRow == -1){
            // No hay fila seleccionada, no se realiza ninguna acción
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar una fila");
            return;
        }

        try{
            // Elimina el producto seleccionado de la lista
            products.remove(selectedRow);

            // Elimina la fila correspondiente de la tabla de productos
            DefaultTableModel productsModelTable = (DefaultTableModel) productsTable.getModel();
            productsModelTable.removeRow(selectedRow);
        }catch(IndexOutOfBoundsException e) {
            // Si la fila seleccionada está fuera del rango, no se realiza ninguna acción
            System.out.println(e.getMessage());
        }
    }

    /**
     * Guarda la modificación del producto y actualiza la tabla de productos.
     */
    private void saveModification(){
        try{
            // Obtiene el producto que se está modificando
            Product tempProduct = products.get(selectedModificationRow);

            // Actualiza los datos del producto con los valores de los campos de entrada
            tempProduct.setName(productNameInput.getText());
            tempProduct.setType(productTypeInput.getSelectedItem().toString());
            tempProduct.setTotalUnits(Integer.parseInt(totalUnitsInput.getValue().toString()));
            tempProduct.setUnitaryValue(Double.parseDouble(unitaryValueInput.getText()));
            tempProduct.calculateIva();
            tempProduct.calculateTotalValue();

            // Formatea los valores numéricos
            DecimalFormat decimalFormat = new DecimalFormat();

            // Actualiza los valores en la tabla de productos
            DefaultTableModel productsTableModel = (DefaultTableModel) productsTable.getModel();
            productsTableModel.setValueAt(tempProduct.getName(), selectedModificationRow, 0);
            productsTableModel.setValueAt(tempProduct.getType(), selectedModificationRow, 1);
            productsTableModel.setValueAt(decimalFormat.format(tempProduct.getTotalUnits()), selectedModificationRow, 2);
            productsTableModel.setValueAt(decimalFormat.format(tempProduct.getUnitaryValue()), selectedModificationRow, 3);
            productsTableModel.setValueAt(String.format("%.2f%%", tempProduct.getIva()*100), selectedModificationRow, 4);
            productsTableModel.setValueAt(decimalFormat.format(tempProduct.getTotalValue()), selectedModificationRow, 5);

            // Deshabilita el botón de guardar modificación y habilita el botón de agregar producto
            saveModificationBtn.setEnabled(false);
            addProductBtn.setEnabled(true);

            // Limpia los campos de entrada
            clearFields();
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese valores válidos para las unidades y el valor unitario.");
            System.err.println("Error: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(rootPane, "No se pudo guardar la modificación.");
            System.err.println("Error: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductBtn;
    private javax.swing.JButton deleteProductBtn;
    private javax.swing.JButton editProductBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField productNameInput;
    private javax.swing.JComboBox<String> productTypeInput;
    private javax.swing.JTable productsTable;
    private javax.swing.JButton saveModificationBtn;
    private javax.swing.JSpinner totalUnitsInput;
    private javax.swing.JTextField unitaryValueInput;
    // End of variables declaration//GEN-END:variables
}
