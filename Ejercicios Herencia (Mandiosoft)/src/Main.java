/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Main {

    public static Console c = new Console("Mandiosoft");

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mandiosoft mandiosoft = new Mandiosoft();

        menu();
        c.println("Ingrese una opción:");
        int opcion = c.readInt();
        while (opcion != 0) {
            if (opcion == 1) {
                // Ingreso Funcionario
                c.println("Ingrese el nombre:");
                String nombre = c.readString();
                c.println("Ingrese el rut:");
                String rut = c.readString();
                c.println("Ingrese la dirección:");
                String direccion = c.readString();
                c.println("Ingrese el sueldo base:");
                int sueldoBase = c.readInt();
                c.println("Ingrese  el tipo de funcionario: ([1] Programador [2] Analista [3] Ingeniero)");
                int tipoFuncionario = c.readInt();

                if (tipoFuncionario == 1) {
                    c.clear();
                    c.println("Ingrese el lenguaje de programación:");
                    String lenguajeProgramacion = c.readString();
                    c.println("Ingrese las horas extras:");
                    int horasExtras = c.readInt();
                    c.println("Ingrese el nivel de programacion: ([1] Rookie [2] Intermedio [3] Avanzado [4] Experto)");
                    int nivelProgramacion = c.readInt();
                    c.println(mandiosoft.agregarProgramador(nombre, rut, direccion, sueldoBase, lenguajeProgramacion, horasExtras, nivelProgramacion));

                }

                if (tipoFuncionario == 2) {
                    c.clear();
                    c.println("Ingrese los años de experiencia:");
                    int aniosExperiencia = c.readInt();

                    c.println(mandiosoft.agregarAnalista(nombre, rut, direccion, sueldoBase, aniosExperiencia));

                }

                if (tipoFuncionario == 3) {
                    c.clear();
                    c.println("Ingrese el título:");
                    String titulo = c.readString();
                    c.println("Ingrese las cargas familiares:");
                    int cargasFamiliares = c.readInt();

                    c.println(mandiosoft.agregarIngeniero(nombre, rut, direccion, sueldoBase, titulo, cargasFamiliares));

                }

            }

            // Ingresar Proyecto.
            if (opcion == 2) {
                c.clear();
                c.println("Ingrese el código:");
                int codigoProyecto = c.readInt();
                c.println("Ingrese el nombre:");
                String nombreProyecto = c.readString();
                c.println("Ingrese la duración en meses:");
                int duracionProyecto = c.readInt();
                c.println("Ingrese el costo total del proyecto:");
                int costoTotal = c.readInt();
                c.println(mandiosoft.agregarProyecto(codigoProyecto, nombreProyecto, duracionProyecto, costoTotal));

            }

            // Asignar Funcionario.
            if (opcion == 3) {
                c.clear();
                c.println("Ingrese el código del proyecto:");
                int codigoProyecto = c.readInt();
                c.println("Ingrese el rut del programador:");
                String rutProgramador = c.readString();
                c.println("Ingrese el rut del analista:");
                String rutAnalista = c.readString();
                c.println("Ingrese el rut del ingeniero:");
                String rutIngeniero = c.readString();
                c.println(mandiosoft.asignarFuncionariosProyecto(codigoProyecto, rutProgramador, rutAnalista, rutIngeniero));

            }

            if (opcion == 4) {
                c.clear();
                c.println(mandiosoft.getListadoProyectos());
            }

            if (opcion == 5) {
                c.clear();
                c.println(mandiosoft.getListadoFuncionarios());
            }

            if (opcion == 6) {
                c.clear();
                c.println("Ingrese el código del proyecto:");
                int codigoProyecto = c.readInt();
                c.println(mandiosoft.getInformacionProyecto(codigoProyecto));
            }

            if (opcion == 7) {
                c.clear();
                c.println("Ingrese el rut del funcionario:");
                String rutFuncionario = c.readString();
                c.println(mandiosoft.getInformacionFuncionario(rutFuncionario));
            }

            c.println("");
            menu();
            c.println("Ingrese una opción:");
            opcion = c.readInt();

        }
        c.close();

    }

    public static void menu() {
        c.println("[1] Ingresar Funcionario.");
        c.println("[2] Ingresar Proyecto.");
        c.println("[3] Asignar Funcionarios a Proyectos.");
        c.println("[4] Listado de Proyectos.");
        c.println("[5] Listado de Funcionarios.");
        c.println("[6] Mostrar Proyecto.");
        c.println("[7] Mostrar Funcionario.");
        c.println("[0] Salir.");

    }
}
