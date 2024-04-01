package com.mycompany.inventario_tienda_compensar;

import java.util.HashMap;
import java.util.Map;

/**
 * Representa un producto con sus atributos y métodos asociados.
 */
public class Product {
    private String name;            // Nombre del producto
    private String type;            // Tipo de producto
    private int totalUnits;         // Total de unidades del producto
    private double unitaryValue;    // Valor unitario del producto
    private double iva;             // Impuesto al Valor Agregado (IVA) aplicado al producto
    private double totalValue;      // Valor total del producto

    /**
     * Constructor por defecto. Crea una instancia de Product.
     */
    public Product(){
        System.out.println("A product has been created");
    }

    /**
     * Constructor parametrizado. Crea una instancia de Product con los valores dados.
     * @param name Nombre del producto.
     * @param type Tipo de producto.
     * @param totalUnits Total de unidades del producto.
     * @param unitaryValue Valor unitario del producto.
     */
    public Product(String name, String type, int totalUnits, double unitaryValue) {
        this.name = name;
        this.type = type;
        this.totalUnits = totalUnits;
        this.unitaryValue = unitaryValue;
        this.iva = calculateIva();
        this.totalValue = calculateTotalValue();
    }

    /**
     * Establece el nombre del producto.
     * @param name El nombre del producto a establecer.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el nombre del producto.
     * @return El nombre del producto.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el tipo de producto.
     * @param type El tipo de producto a establecer.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Obtiene el tipo de producto.
     * @return El tipo de producto.
     */
    public String getType() {
        return type;
    }

    /**
     * Establece el total de unidades del producto.
     * @param totalUnits El total de unidades del producto a establecer.
     */
    public void setTotalUnits(int totalUnits) {
        this.totalUnits = totalUnits;
    }

    /**
     * Obtiene el total de unidades del producto.
     * @return El total de unidades del producto.
     */
    public int getTotalUnits() {
        return totalUnits;
    }

    /**
     * Establece el valor unitario del producto.
     * @param unitaryValue El valor unitario del producto a establecer.
     */
    public void setUnitaryValue(double unitaryValue) {
        this.unitaryValue = unitaryValue;
    }

    /**
     * Obtiene el valor unitario del producto.
     * @return El valor unitario del producto.
     */
    public double getUnitaryValue() {
        return unitaryValue;
    }

    /**
     * Establece el impuesto al valor agregado (IVA) aplicado al producto.
     * @param iva El valor del IVA a establecer.
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    /**
     * Obtiene el impuesto al valor agregado (IVA) aplicado al producto.
     * @return El valor del IVA aplicado al producto.
     */
    public double getIva() {
        return iva;
    }

    /**
     * Establece el valor total del producto.
     * @param totalValue El valor total del producto a establecer.
     */
    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    /**
     * Obtiene el valor total del producto.
     * @return El valor total del producto.
     */
    public double getTotalValue() {
        return totalValue;
    }

    /**
     * Calcula el impuesto al valor agregado (IVA) del producto basado en su tipo.
     * @return El valor del IVA.
     */
    protected double calculateIva() {
        final Map<String, Double> IVA_VALUES = new HashMap<>();
        IVA_VALUES.put("Aseo", 0.19);
        IVA_VALUES.put("Papelería", 0.09);
        IVA_VALUES.put("Víveres", 0.15);
        IVA_VALUES.put("Productos para Mascotas", 0.16);
        IVA_VALUES.put("Otros", 0.1);
        return IVA_VALUES.getOrDefault(type, 0.0);
    }


    /**
     * Calcula el valor total del producto, incluyendo el impuesto al valor agregado (IVA).
     * @return El valor total del producto.
     */
    protected double calculateTotalValue() {
        return (unitaryValue * (1 + iva)) * totalUnits;
    }

    /**
     * Representación en forma de cadena de texto del objeto Product.
     * @return La representación en forma de cadena de texto.
     */
    @Override
    public String toString() {
        return String.format("Nombre: %s\nTipo: %s\nTotal Unidades: %d\nValor Unitario: %.2f\nIVA: %.2f\nValor Total: %.2f",
                name, type, totalUnits, unitaryValue, iva, totalValue);
    }

}
