/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public abstract class Funcionario {

    protected String nombre;
    protected String rut;
    protected String direccion;
    protected int sueldoBase;
    protected int tipoFuncionario;
    protected ListadoProyectos listadoProyectos;

    public Funcionario() {
        this.nombre = "";
        this.rut = "";
        this.direccion = "";
        this.sueldoBase = 0;
        this.tipoFuncionario = 0;
        this.listadoProyectos = new ListadoProyectos();
    }

    public Funcionario(String nombre, String rut, String direccion, int sueldoBase, int tipoFuncionario) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.sueldoBase = sueldoBase;
        this.tipoFuncionario = tipoFuncionario;
        this.listadoProyectos = new ListadoProyectos();
    }

    public Funcionario(Funcionario funcionario) {
        this.nombre = funcionario.getNombre();
        this.rut = funcionario.getRut();
        this.direccion = funcionario.getDireccion();
        this.sueldoBase = funcionario.getSueldoBase();
        this.tipoFuncionario = funcionario.getTipoFuncionario();
        this.listadoProyectos = new ListadoProyectos();
    }

    public abstract int calcularSueldo();

    public int calcularBonoProyectos(int porcentaje) {
        return this.listadoProyectos.calcularBono(porcentaje);
    }

    public String agregarProyecto(Proyecto proyecto) {
        return this.listadoProyectos.agregarProyecto(proyecto);
    }

    public String getInformacion() {
        String sueldo = " (SUELDO: $" + this.calcularSueldo() + "). ";
        return "[NOMBRE: " + this.nombre + "] " + "[RUT: " + this.rut + "] " + "[SUELDO: " + sueldo;
    }

    public String getListadoProyectos() {
        return this.listadoProyectos.imprimirProyectos();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(int tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

}
