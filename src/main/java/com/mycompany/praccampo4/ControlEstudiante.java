/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praccampo4;

/**
 *
 * @author Alonzo Revilla
 */import java.util.ArrayList;
public class ControlEstudiante {
    ArrayList<Estudiante> lista = new ArrayList();
    public void agregar_estudiante(Estudiante nuevoestudiante){
        lista.add(nuevoestudiante);
    }

    public void listar_estudiantes(){
        for(int i=0;i<lista.size();i++){
            lista.get(i).verDatos();
        }
    }
    
}
