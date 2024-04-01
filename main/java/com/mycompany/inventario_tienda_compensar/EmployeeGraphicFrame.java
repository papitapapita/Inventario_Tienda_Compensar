/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.inventario_tienda_compensar;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author manyd
 */
public class EmployeeGraphicFrame extends javax.swing.JInternalFrame {

    int dayShiftEmployees;
    int nightShiftEmployees;
    /**
     * Creates new form EmployeeGraphicFrame
     */
    public EmployeeGraphicFrame() {
        initComponents();
    }

    public EmployeeGraphicFrame(int dayShiftEmployees, int nightShiftEmployees){
        this.dayShiftEmployees = dayShiftEmployees;
        this.nightShiftEmployees = nightShiftEmployees;
        initComponents();
    }

    public void paint(Graphics g){
        super.paint(g);
        int totalEmployees = dayShiftEmployees + nightShiftEmployees;
        int dayShiftGrades = dayShiftEmployees * 360 / totalEmployees;
        int nightShiftGrades = nightShiftEmployees * 360 / totalEmployees;

        g.setColor(Color.RED);
        g.fillArc(80,80, 200,200, 0, dayShiftGrades);
        g.fillRect(300,120,20,20);
        g.drawString(String.format("%d Empleados Jornada Diurna",dayShiftEmployees),325,135);

        g.setColor(Color.BLACK);
        g.fillArc(80,80, 200,200, dayShiftGrades, nightShiftGrades);
        g.fillRect(300,150,20,20);
        g.drawString(String.format("%d Empleados Jornada Nocturna",nightShiftEmployees),325,165);

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

        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
