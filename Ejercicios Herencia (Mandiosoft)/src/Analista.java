/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Analista extends Funcionario {

    private int aniosExperiencia;

    public Analista() {
        super();
        this.aniosExperiencia = 0;
    }

    public Analista(int aniosExperiencia) {
        super();
        this.aniosExperiencia = aniosExperiencia;
    }

    public Analista(String nombre, String rut, String direccion, int sueldoBase, int aniosExperiencia) {
        super(nombre, rut, direccion, sueldoBase, 2);
        this.aniosExperiencia = aniosExperiencia;
    }

    public Analista(String nombre, String rut, String direccion, int sueldoBase, int tipoFuncionario, int aniosExperiencia) {
        super(nombre, rut, direccion, sueldoBase, tipoFuncionario);
        this.aniosExperiencia = aniosExperiencia;
    }

    public Analista(Funcionario funcionario, int aniosExperiencia) {
        super(funcionario);
        this.aniosExperiencia = aniosExperiencia;
    }

    public Analista(Analista analista) {
        super();
        this.aniosExperiencia = analista.getAniosExperiencia();
    }

    @Override
    public int calcularSueldo() {
        int bonoExperiencia = 5000 * this.aniosExperiencia;
        int bonoProyectos = calcularBonoProyectos(25);

        int sueldoTotal = this.sueldoBase + bonoExperiencia + bonoProyectos;

        return sueldoTotal;
    }

    @Override
    public String getInformacion() {
        return "[ANALISTA:] " + super.getInformacion();
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

}
