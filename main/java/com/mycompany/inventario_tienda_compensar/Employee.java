package com.mycompany.inventario_tienda_compensar;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Employee {
    private String name;
    private String id;
    private int age;
    private String shift;
    private int yearsEmployed;
    private Date employedDate;
    private HashMap<String, Double> benefits;

    public Employee(String name, String id, int age, String shift, Date employedDate) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.shift = shift;
        this.employedDate = employedDate;
        this.yearsEmployed = calculateYearsEmployed();
        this.benefits = calculateBenefits();
    }

    public Date getEmployedDate() {
        return employedDate;
    }

    public void setEmployedDate(Date employedDate) {
        this.employedDate = employedDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public int getYearsEmployed() {
        return yearsEmployed;
    }


    public HashMap<String, Double> getBenefits() {
        return benefits;
    }

    private HashMap<String, Double> calculateBenefits(){
        HashMap<String, Double> tempBenefits = new HashMap<>();
        if(yearsEmployed < 1){
            tempBenefits.put("Compras Tienda", .15);
            tempBenefits.put("Centros Recreacionales", .2);
        }else if(yearsEmployed > 1 && yearsEmployed < 6){
            tempBenefits.put("Compras Tienda", .3);
            tempBenefits.put("Centros Recreacionales", .3);
        }else{
            tempBenefits.put("Compras Tienda", .5);
            tempBenefits.put("Centros Recreacionales", .6);
        }
        return tempBenefits;
    }

    private int calculateYearsEmployed() {
        return employedDate.getYear() - new Date().getYear();
    }
}
