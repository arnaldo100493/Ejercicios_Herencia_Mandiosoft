/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Programador extends Funcionario {

    private String lenguajeProgramacion;
    private int horasExtras;
    private int nivelProgramacion;

    public Programador() {
        super();
        this.lenguajeProgramacion = "";
        this.horasExtras = 0;
        this.nivelProgramacion = 0;
    }

    public Programador(String lenguajeProgramacion, int horasExtras, int nivelProgramacion) {
        super();
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
        this.nivelProgramacion = nivelProgramacion;
    }

    public Programador(String nombre, String rut, String direccion, int sueldoBase, String lenguajeProgramacion, int horasExtras, int nivelProgramacion) {
        super(nombre, rut, direccion, sueldoBase, 1);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
        this.nivelProgramacion = nivelProgramacion;
    }

    public Programador(String nombre, String rut, String direccion, int sueldoBase, int tipoFuncionario, String lenguajeProgramacion, int horasExtras, int nivelProgramacion) {
        super(nombre, rut, direccion, sueldoBase, tipoFuncionario);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
        this.nivelProgramacion = nivelProgramacion;
    }

    public Programador(Funcionario funcionario, String lenguajeProgramacion, int horasExtras, int nivelProgramacion) {
        super(funcionario);
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.horasExtras = horasExtras;
        this.nivelProgramacion = nivelProgramacion;
    }

    public Programador(Programador programador) {
        super();
        this.lenguajeProgramacion = programador.getLenguajeProgramacion();
        this.horasExtras = programador.getHorasExtras();
        this.nivelProgramacion = programador.getNivelProgramacion();
    }

    @Override
    public int calcularSueldo() {
        int bonoHorasExtras = 5000 * this.horasExtras;
        int bonoNivelProgramacion = 30000 * this.nivelProgramacion;
        int bonoProyectos = calcularBonoProyectos(20);

        int sueldoTotal = this.sueldoBase + bonoHorasExtras + bonoNivelProgramacion + bonoProyectos;

        return sueldoTotal;
    }

    @Override
    public String getInformacion() {
        return "[PROGRAMADOR:] " + super.getInformacion();
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getNivelProgramacion() {
        return nivelProgramacion;
    }

    public void setNivelProgramacion(int nivelProgramacion) {
        this.nivelProgramacion = nivelProgramacion;
    }

}
