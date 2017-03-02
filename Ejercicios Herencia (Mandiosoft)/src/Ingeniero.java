/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Ingeniero extends Funcionario {

    private String titulo;
    private int cargasFamiliares;

    public Ingeniero() {
        super();
        this.titulo = "";
        this.cargasFamiliares = 0;
    }

    public Ingeniero(String titulo, int cargasFamiliares) {
        super();
        this.titulo = titulo;
        this.cargasFamiliares = cargasFamiliares;
    }

    public Ingeniero(String nombre, String rut, String direccion, int sueldoBase, String titulo, int cargasFamiliares) {
        super(nombre, rut, direccion, sueldoBase, 3);
        this.titulo = titulo;
        this.cargasFamiliares = cargasFamiliares;
    }

    public Ingeniero(String nombre, String rut, String direccion, int sueldoBase, int tipoFuncionario, String titulo, int cargasFamiliares) {
        super(nombre, rut, direccion, sueldoBase, tipoFuncionario);
        this.titulo = titulo;
        this.cargasFamiliares = cargasFamiliares;
    }

    public Ingeniero(Funcionario funcionario, String titulo, int cargasFamiliares) {
        super(funcionario);
        this.titulo = titulo;
        this.cargasFamiliares = cargasFamiliares;
    }

    public Ingeniero(Ingeniero ingeniero) {
        super();
        this.titulo = ingeniero.getTitulo();
        this.cargasFamiliares = ingeniero.getCargasFamiliares();
    }

    @Override
    public int calcularSueldo() {
        int bonoFamilia = 8000 * this.cargasFamiliares;
        int bonoProyectos = calcularBonoProyectos(30);

        int sueldoTotal = this.sueldoBase + bonoFamilia + bonoProyectos;

        return sueldoTotal;
    }

    @Override
    public String getInformacion() {
        return "[INGENIERO: ]" + super.getInformacion();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCargasFamiliares() {
        return cargasFamiliares;
    }

    public void setCargasFamiliares(int cargasFamiliares) {
        this.cargasFamiliares = cargasFamiliares;
    }

}
