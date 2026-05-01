
package GestionTrabajadores;


import java.util.ArrayList;

public class GestionTrabajadores {
    public static void main(String[] args) {

        // COLECCIÓN
        ArrayList<Trabajador> lista = new ArrayList<>();

        // ── CREAR TRABAJADORES ────────────────────────────────────

        // Objeto 1 — constructor 3 parámetros
        try {
            Trabajador t1 = new Trabajador("DNI", "Juan", "CAS");
            t1.setCodigo(Trabajador.generar_codigo());
            lista.add(t1);
            System.out.println("Trabajador 1 creado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al crear trabajador 1: " + e.getMessage());
        }

        // Objeto 2 — constructor 3 parámetros
        try {
            Trabajador t2 = new Trabajador("CE", "Ana", "PLANILLA");
            t2.setCodigo(Trabajador.generar_codigo());
            lista.add(t2);
            System.out.println("Trabajador 2 creado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al crear trabajador 2: " + e.getMessage());
        }

        // Objeto 3 — constructor vacío + setters
        try {
            Trabajador t3 = new Trabajador();
            t3.setTipo_documento("DNI");
            t3.setNombre("Luis");
            t3.setRegimen_laboral("CAS");
            t3.setCodigo(Trabajador.generar_codigo());
            lista.add(t3);
            System.out.println("Trabajador 3 creado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al crear trabajador 3: " + e.getMessage());
        }

        // Objeto 4 — constructor 4 parámetros (sobrecarga extra)
        try {
            Trabajador t4 = new Trabajador("DNI", "Maria", "PLANILLA", "AFP");
            t4.setCodigo(Trabajador.generar_codigo());
            lista.add(t4);
            System.out.println("Trabajador 4 creado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al crear trabajador 4: " + e.getMessage());
        }

        // ── RECORRER COLECCIÓN — DEMO SOBRECARGA verDatos() ───────

        System.out.println("\n-- Listado con verDatos() --");
        for (Trabajador t : lista) {
            t.verDatos();
            System.out.println("----------------------");
        }

        System.out.println("\n-- Listado con verDatos(boolean) --");
        for (Trabajador t : lista) {
            t.verDatos(true);
            System.out.println("----------------------");
        }

        System.out.println("\n-- Listado con verDatos(String) --");
        for (Trabajador t : lista) {
            t.verDatos("-> Detalle del trabajador:");
            System.out.println("----------------------");
        }

        System.out.println("\n-- Listado con verDatos(int nivel) --");
        for (Trabajador t : lista) {
            t.verDatos(3);
            System.out.println("----------------------");
        }

        System.out.println("\n-- Listado con verDatos(String, boolean) --");
        for (Trabajador t : lista) {
            t.verDatos("-> Registro:", true);
            System.out.println("----------------------");
        }

        System.out.println("\nTotal trabajadores: " + lista.size());
    }
}