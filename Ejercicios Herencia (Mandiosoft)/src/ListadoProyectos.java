
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FABAME
 */
public class ListadoProyectos {

    private List<Proyecto> listadoProyectos;

    public ListadoProyectos() {
        this.listadoProyectos = new LinkedList<>();
    }

    public String agregarProyecto(Proyecto proyecto) {
        this.listadoProyectos.add(proyecto);
        return "Proyecto Ingresado.";
    }

    public String imprimirProyectos() {
        String s = "";
        Iterator<Proyecto> iterator = this.listadoProyectos.iterator();
        while (iterator.hasNext()) {
            Proyecto proyecto = (Proyecto) iterator.next();
            s += "\n" + proyecto.getInformacion();
        }
        return s;
    }

    public Proyecto buscarProyecto(int codigoProyecto) {
        Iterator<Proyecto> iterator = this.listadoProyectos.iterator();
        while (iterator.hasNext()) {
            Proyecto proyecto = (Proyecto) iterator.next();
            if (proyecto.getCodigo() == codigoProyecto) {
                return proyecto;
            }
        }
        return null;
    }

    public int calcularBono(int porcentaje) {
        int bono = 0;
        Iterator<Proyecto> iterator = this.listadoProyectos.iterator();
        while (iterator.hasNext()) {
            Proyecto proyecto = (Proyecto) iterator.next();
            bono += proyecto.getBono(porcentaje);
        }
        return bono;
    }

}
