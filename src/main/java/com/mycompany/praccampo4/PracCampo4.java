/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praccampo4;

/**
 *
 * @author Alonzo Revilla
 */
import java.util.Scanner;
public class PracCampo4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rpta="s";
        ControlEstudiante control = new ControlEstudiante();
        while(rpta.equals("s")){
            System.out.println("Ingrese su nombre");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el apellido paterno");
            String ape_paterno=sc.nextLine();
            System.out.println("Ingrese apellido materno");
            String ape_materno=sc.nextLine();
            System.out.println("Ingrese la carrera");
            String carrera=sc.nextLine();

           
}
}}
