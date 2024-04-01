package com.mycompany.inventario_tienda_compensar;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * La clase Employee representa a un empleado en una empresa.
 */
public class Employee {
    private String name;                        // El nombre del empleado.
    private String id;                          // El Número de Identificación del empleado.
    private int age;                            // La edad del empleado.
    private String shift;                       // La jornada del empleado.
    private int yearsEmployed;                  // El número de años que el empleado ha trabajado.
    private Date employedDate;                  // La fecha en que el empleado fue contratado.
    private HashMap<String, Double> benefits;   // Los beneficios proporcionados al empleado.

    /**
     * Constructor por defecto. Crea una instanacia de Employee
     */
    public Employee(){
        System.out.println("An employee has been created");
    }

    /**
     * Construye un objeto Employee con los detalles especificados.
     * @param name El nombre del empleado.
     * @param id El Número de identificación del empleado.
     * @param age La edad del empleado.
     * @param shift La jornada del empleado.
     * @param employedDate La fecha en que el empleado fue contratado.
     */
    public Employee(String name, String id, int age, String shift, Date employedDate) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.shift = shift;
        this.employedDate = employedDate;
        calculateYearsEmployed();
        calculateBenefits();
    }

    /**
     * Obtiene la fecha en que el empleado fue contratado.
     * @return La fecha de contratación.
     */
    public Date getEmployedDate() {
        return employedDate;
    }

    /**
     * Establece la fecha en que el empleado fue contratado.
     * @param employedDate La fecha de contratación a establecer.
     */
    public void setEmployedDate(Date employedDate) {
        this.employedDate = employedDate;
    }

    /**
     * Obtiene el nombre del empleado.
     * @return El nombre del empleado.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del empleado.
     * @param name El nombre a establecer.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el ID del empleado.
     * @return El ID del empleado.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID del empleado.
     * @param id El ID a establecer.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene la edad del empleado.
     * @return La edad del empleado.
     */
    public int getAge() {
        return age;
    }

    /**
     * Establece la edad del empleado.
     * @param age La edad a establecer.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Obtiene el turno del empleado.
     * @return El turno del empleado.
     */
    public String getShift() {
        return shift;
    }

    /**
     * Establece el turno del empleado.
     * @param shift El turno a establecer.
     */
    public void setShift(String shift) {
        this.shift = shift;
    }

    /**
     * Obtiene el número de años que el empleado ha trabajado.
     * @return Los años trabajados.
     */
    public int getYearsEmployed() {
        return yearsEmployed;
    }

    /**
     * Obtiene los beneficios proporcionados al empleado.
     * @return Los beneficios.
     */
    public HashMap<String, Double> getBenefits() {
        return benefits;
    }

    /**
     * Calcula los beneficios basados en el número de años trabajados.
     * @return Los beneficios calculados.
     */
    public void calculateBenefits(){
        benefits = new HashMap<>();
        // Se verifica la cantidad de años de empleo del empleado.
        if(yearsEmployed < 1){
            // Si el empleado tiene menos de 1 año de empleo, se asignan los beneficios correspondientes.
            this.benefits.put("Compras Tienda", .15);
            this.benefits.put("Centros Recreacionales", .2);
        } else if(yearsEmployed > 1 && yearsEmployed < 6){
            // Si el empleado tiene entre 1 y 5 años de empleo, se asignan los beneficios correspondientes.
            this.benefits.put("Compras Tienda", .3);
            this.benefits.put("Centros Recreacionales", .3);
        } else {
            // Si el empleado tiene 6 o más años de empleo, se asignan los beneficios correspondientes.
            this.benefits.put("Compras Tienda", .5);
            this.benefits.put("Centros Recreacionales", .6);
        }

    }

    /**
     * Calcula el número de años que el empleado ha trabajado.
     * @return Los años trabajados.
     */
    public void calculateYearsEmployed() {
        this.yearsEmployed = (new Date().getYear() - employedDate.getYear());
    }
}
