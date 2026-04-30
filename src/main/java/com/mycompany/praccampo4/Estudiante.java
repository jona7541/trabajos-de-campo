/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praccampo4;

/**
 *
 * @author Alonzo Revilla
 */
public class Estudiante {
    private String nommbre;
    private String paterno;
    private String materno;
    private String carrera;

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void verDatos(){
        System.out.println("Estudiante NOMBRE: "+this.nommbre+" PATERNO:"+
                this.paterno+" MATERNO: "+this.materno+" CARRERA: "+this.carrera);
}}
