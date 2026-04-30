/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicadecampo1;

/**
 *
 * @author jhona
 */
public class Practicadecampo1 {

    public static void main(String[] args) {
        persona p1= new persona();
        p1.tipo_documento= "DNI";
        p1.nro_docuemnto= "75729341";
        p1.paterno=" Diaz";
        p1.materno= "Arribasplata";
        p1.nombre= "John";
        p1.edad=21;
        
        p1.verDatos();
        
        persona p2= new persona();
        p2.tipo_documento= "CE";
        p2.nro_docuemnto= "75748256";
        p2.paterno= "Vasquez";
        p2.materno= "Rivera";
        p2.nombre= "Maria";
        p2.edad=40;
        p2.verDatos();
        
        persona p3= new persona();
        p3.tipo_documento= "DNI";
        p3.nro_docuemnto= "75729341";
        p3.paterno= "Campos";
        p3.materno= "Aliaga";
        p3.nombre= "Luna";
        p3.edad=71;
        p3.verDatos();
    }
}
