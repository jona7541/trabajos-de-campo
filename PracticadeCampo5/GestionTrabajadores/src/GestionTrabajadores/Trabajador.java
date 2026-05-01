package GestionTrabajadores;


public class Trabajador {
    private String tipo_documento;
    private String nro_documento;
    private String paterno;
    private String materno;
    private String nombre;
    private String celular;
    private String correo;
    private String regimen_laboral;
    private String sistema_pensionario;
    private String codigo;
    private static int ultimo_correlativo;

    // CONSTRUCTORES (sobrecarga)
    public Trabajador() {
    }

    public Trabajador(String tipo_documento, String regimen_laboral) {
        try {
            this.tipo_documento = tipo_documento;
            this.regimen_laboral = regimen_laboral;
        } catch (Exception e) {
            System.out.println("Error al crear trabajador: " + e.getMessage());
        }
    }

    public Trabajador(String tipo_documento, String nombre, String regimen_laboral) {
        try {
            this.tipo_documento = tipo_documento;
            this.nombre = nombre;
            this.regimen_laboral = regimen_laboral;
        } catch (Exception e) {
            System.out.println("Error al crear trabajador: " + e.getMessage());
        }
    }

    // Constructor con 4 parámetros (sobrecarga extra)
    public Trabajador(String tipo_documento, String nombre,
                      String regimen_laboral, String sistema_pensionario) {
        try {
            this.tipo_documento = tipo_documento;
            this.nombre = nombre;
            this.regimen_laboral = regimen_laboral;
            this.sistema_pensionario = sistema_pensionario;
        } catch (Exception e) {
            System.out.println("Error al crear trabajador: " + e.getMessage());
        }
    }

    // GET Y SET
    public String getTipo_documento() { return tipo_documento; }
    public void setTipo_documento(String tipo_documento) {
        try {
            this.tipo_documento = tipo_documento;
        } catch (Exception e) {
            System.out.println("Error al setear tipo_documento: " + e.getMessage());
        }
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        try {
            this.nombre = nombre;
        } catch (Exception e) {
            System.out.println("Error al setear nombre: " + e.getMessage());
        }
    }

    public String getRegimen_laboral() { return regimen_laboral; }
    public void setRegimen_laboral(String regimen_laboral) {
        try {
            this.regimen_laboral = regimen_laboral;
        } catch (Exception e) {
            System.out.println("Error al setear regimen_laboral: " + e.getMessage());
        }
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getSistema_pensionario() { return sistema_pensionario; }
    public void setSistema_pensionario(String sistema_pensionario) {
        this.sistema_pensionario = sistema_pensionario;
    }

    // MÉTODO ESTÁTICO
    public static String generar_codigo() {
        try {
            ultimo_correlativo++;
            return String.format("T%05d", ultimo_correlativo);
        } catch (Exception e) {
            System.out.println("Error al generar codigo: " + e.getMessage());
            return null;
        }
    }

    // SOBRECARGA DE MÉTODOS verDatos()

    // Sin parámetros — datos básicos
    public void verDatos() {
        try {
            System.out.println("CODIGO: " + codigo
                    + " | TIPO DOC: " + tipo_documento
                    + " | REGIMEN: " + regimen_laboral);
        } catch (Exception e) {
            System.out.println("Error al mostrar datos: " + e.getMessage());
        }
    }

    // Con mensaje personalizado
    public void verDatos(String mensaje) {
        try {
            System.out.println(mensaje);
            verDatos();
        } catch (Exception e) {
            System.out.println("Error al mostrar datos: " + e.getMessage());
        }
    }

    // Con opción de mostrar nombre
    public void verDatos(boolean mostrarNombre) {
        try {
            if (mostrarNombre) {
                System.out.println("NOMBRE: " + nombre);
            }
            verDatos();
        } catch (Exception e) {
            System.out.println("Error al mostrar datos: " + e.getMessage());
        }
    }

    // Con nivel de detalle: 1=básico, 2=con nombre, 3=completo
    public void verDatos(int nivel) {
        try {
            switch (nivel) {
                case 1:
                    verDatos();
                    break;
                case 2:
                    System.out.println("NOMBRE: " + nombre);
                    verDatos();
                    break;
                case 3:
                    System.out.println("NOMBRE: "      + nombre
                            + " | TIPO DOC: "          + tipo_documento
                            + " | REGIMEN: "           + regimen_laboral
                            + " | PENSIONARIO: "       + sistema_pensionario
                            + " | CODIGO: "            + codigo);
                    break;
                default:
                    System.out.println("Nivel invalido. Use 1, 2 o 3.");
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar datos: " + e.getMessage());
        }
    }

    // Con mensaje y nombre
    public void verDatos(String mensaje, boolean mostrarNombre) {
        try {
            System.out.println(mensaje);
            verDatos(mostrarNombre);
        } catch (Exception e) {
            System.out.println("Error al mostrar datos: " + e.getMessage());
        }
    }
}