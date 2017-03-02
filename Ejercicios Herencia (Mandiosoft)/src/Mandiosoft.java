/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Mandiosoft {

    private ListadoFuncionarios listadoFuncionarios;
    private ListadoProyectos listadoProyectos;

    public Mandiosoft() {
        this.listadoFuncionarios = new ListadoFuncionarios();
        this.listadoProyectos = new ListadoProyectos();
    }

    public String agregarProgramador(String nombre, String rut, String direccion, int sueldoBase, String lenguajeProgramacion, int horasExtras, int nivelProgramacion) {
        Funcionario funcionario = new Programador(nombre, rut, direccion, sueldoBase, lenguajeProgramacion, horasExtras, nivelProgramacion);
        return this.listadoFuncionarios.agregarFuncionario(funcionario);
    }

    public String agregarAnalista(String nombre, String rut, String direccion, int sueldoBase, int aniosExperiencia) {
        Funcionario funcionario = new Analista(nombre, rut, direccion, sueldoBase, aniosExperiencia);
        return this.listadoFuncionarios.agregarFuncionario(funcionario);
    }

    public String agregarIngeniero(String nombre, String rut, String direccion, int sueldoBase, String titulo, int cargasFamiliares) {
        Funcionario funcionario = new Ingeniero(nombre, rut, direccion, sueldoBase, titulo, cargasFamiliares);
        return this.listadoFuncionarios.agregarFuncionario(funcionario);
    }

    public String agregarProyecto(int codigo, String nombre, int duracionMeses, int costoTotal) {
        Proyecto proyecto = new Proyecto(codigo, nombre, duracionMeses, costoTotal);
        return this.listadoProyectos.agregarProyecto(proyecto);
    }

    public String asignarFuncionariosProyecto(int codigoProyecto, String rutProgramador, String rutAnalista, String rutIngeniero) {
        String s = "";
        Proyecto proyecto = this.listadoProyectos.buscarProyecto(codigoProyecto);
        if (proyecto != null) {
            Programador programador = this.listadoFuncionarios.buscarProgramador(rutProgramador);
            Analista analista = this.listadoFuncionarios.buscarAnalista(rutAnalista);
            Ingeniero ingeniero = this.listadoFuncionarios.buscarIngeniero(rutIngeniero);

            if (programador != null) {
                if (analista != null) {
                    if (ingeniero != null) {
                        proyecto.setProgramador(programador);
                        proyecto.setAnalista(analista);
                        proyecto.setIngeniero(ingeniero);

                        programador.agregarProyecto(proyecto);
                        analista.agregarProyecto(proyecto);
                        ingeniero.agregarProyecto(proyecto);

                        s = "Asignación Exitosa.";

                    } else {
                        s = "Ingeniero no encontrado.";
                    }
                } else {
                    s = "Analista no encontrado.";
                }
            } else {
                s = "Programador no encontrado.";
            }

        } else {
            s = "Proyecto no encontrado.";
        }
        return s;
    }

    public String getListadoProyectos() {
        return this.listadoProyectos.imprimirProyectos();
    }

    public String getListadoFuncionarios() {
        return this.listadoFuncionarios.imprimirFuncionarios();
    }

    public String getInformacionProyecto(int codigoProyecto) {
        Proyecto proyecto = this.listadoProyectos.buscarProyecto(codigoProyecto);
        if (proyecto != null) {
            return proyecto.getListadoFuncionarios();
        }
        return "Proyecto no encontrado.";
    }

    public String getInformacionFuncionario(String rutFuncionario) {
        Funcionario funcionario = this.listadoFuncionarios.buscarFuncionario(rutFuncionario);
        if (funcionario != null) {
            return funcionario.getListadoProyectos();
        }
        return "Funcionario no encontrado.";
    }

}
