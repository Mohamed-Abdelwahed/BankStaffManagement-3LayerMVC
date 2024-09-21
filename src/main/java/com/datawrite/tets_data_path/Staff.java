package com.datawrite.tets_data_path;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
public class Staff {
    @NotBlank(message = "Emplyee name ca not be empty")
    public String empName;
    @NotBlank(message = "Emplyee Title ca not be empty")
    public String empTitle;
    public double empSalary;
    public String id;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Staff(String empName, String empTitle, double empSalary) {
        this.empName = empName;
        this.empTitle = empTitle;
        this.empSalary = empSalary;
    }


    public Staff() {
        this.id = UUID.randomUUID().toString();
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpTitle() {
        return this.empTitle;
    }

    public void setEmpTitle(String empTitle) {
        this.empTitle = empTitle;
    }

    public double getEmpSalary() {
        return this.empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    
}
