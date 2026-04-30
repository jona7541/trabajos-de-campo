/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicadecampo1;

/**
 *
 * @author jhona
 */
public class persona {
    String tipo_documento;
    String nro_docuemnto;
    String paterno;
    String nombre;
    String materno;
    int edad;
    
    void verDatos(){
      System.out.println("OBJETO TIPODOC: " + this.tipo_documento + "NRODO: "+ this.nro_docuemnto + "PATERNO:" + this.paterno + "MATERNO" + "NOMBRE:" + this.nombre + "EDAD:"+ this.edad);      
    }
}
