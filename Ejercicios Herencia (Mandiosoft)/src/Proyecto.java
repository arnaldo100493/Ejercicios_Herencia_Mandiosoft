/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Proyecto {

    private int codigo;
    private String nombre;
    private int duracionMeses;
    private int costoTotal;
    private Programador programador;
    private Analista analista;
    private Ingeniero ingeniero;

    public Proyecto() {
        this.codigo = 0;
        this.nombre = "";
        this.duracionMeses = 0;
        this.analista = null;
        this.programador = null;
        this.ingeniero = null;
    }

    public Proyecto(int codigo, String nombre, int duracionMeses, int costoTotal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracionMeses = duracionMeses;
        this.costoTotal = costoTotal;
        this.analista = null;
        this.programador = null;
        this.ingeniero = null;
    }

    public Proyecto(int codigo, String nombre, int duracionMeses, int costoTotal, Programador programador, Analista analista, Ingeniero ingeniero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracionMeses = duracionMeses;
        this.costoTotal = costoTotal;
        this.programador = programador;
        this.analista = analista;
        this.ingeniero = ingeniero;
    }

    public Proyecto(Proyecto proyecto) {
        this.codigo = proyecto.getCodigo();
        this.nombre = proyecto.getNombre();
        this.duracionMeses = proyecto.getDuracionMeses();
        this.costoTotal = proyecto.getCostoTotal();
        this.programador = proyecto.getProgramador();
        this.analista = proyecto.getAnalista();
        this.ingeniero = proyecto.getIngeniero();
    }

    public int getBono(int porcentaje) {
        return this.getCostoMensual() * porcentaje / 100;
    }

    public String getInformacion() {
        String costos = "";
        costos += "(Costo Total: $)" + this.costoTotal + "). ";
        costos += "(Costo Mensual: $)" + this.getCostoMensual() + "). ";
        return "[CODIGO: " + this.codigo + "] " + "[NOMBRE: " + this.nombre + "]" + "[COSTOS: " + costos + "]";
    }

    public String getListadoFuncionarios() {
        String nombreProgramador = "Sin definir.";
        String nombreAnalista = "Sin definir.";
        String nombreIngeniero = "Sin definir.";
        if (this.programador != null) {
            nombreProgramador = this.programador.getNombre();
        }
        if (this.analista != null) {
            nombreAnalista = this.analista.getNombre();
        }
        if (this.ingeniero != null) {
            nombreIngeniero = this.ingeniero.getNombre();
        }

        String s = "";
        s += "\nProgramador: " + nombreProgramador;
        s += "\nAnalista: " + nombreAnalista;
        s += "\nIngeniero: " + nombreIngeniero;
        return s;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getCostoMensual() {
        if (this.duracionMeses > 0) {
            return this.costoTotal / this.duracionMeses;
        }
        return 0;
    }

    public Programador getProgramador() {
        return programador;
    }

    public void setProgramador(Programador programador) {
        this.programador = programador;
    }

    public Analista getAnalista() {
        return analista;
    }

    public void setAnalista(Analista analista) {
        this.analista = analista;
    }

    public Ingeniero getIngeniero() {
        return ingeniero;
    }

    public void setIngeniero(Ingeniero ingeniero) {
        this.ingeniero = ingeniero;
    }

}
