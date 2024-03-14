package com.mycompany.inventario_tienda_compensar;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private String name;
    private String type;
    private int totalUnits;
    private double unitaryValue;
    private double iva;
    private double totalValue;

    public Product(){
        System.out.println("A product has been created");
    }

    public Product(String name, String type, int totalUnits, double unitaryValue) {
        this.name = name;
        this.type = type;
        this.totalUnits = totalUnits;
        this.unitaryValue = unitaryValue;
        this.iva = calculateIva();
        this.totalValue = calculateTotalValue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(int totalUnits) {
        this.totalUnits = totalUnits;
    }

    public double getUnitaryValue() {
        return unitaryValue;
    }

    public void setUnitaryValue(double unitaryValue) {
        this.unitaryValue = unitaryValue;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    protected double calculateIva(){
        final Map<String, Double> IVA_VALUES = new HashMap<>();
        IVA_VALUES.put("Aseo", .19);
        IVA_VALUES.put("Papelería", .09);
        IVA_VALUES.put("Víveres", .15);
        IVA_VALUES.put("Productos para Mascotas", .16);
        IVA_VALUES.put("Otros", .1);
        return IVA_VALUES.get(type);
    }

    protected double calculateTotalValue(){
        return unitaryValue * totalUnits;
    }

}
