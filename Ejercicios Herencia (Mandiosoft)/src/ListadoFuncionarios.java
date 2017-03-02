
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
public class ListadoFuncionarios {

    private List<Funcionario> listadoFuncionarios;

    public ListadoFuncionarios() {
        this.listadoFuncionarios = new LinkedList<>();
    }

    public String agregarFuncionario(Funcionario funcionario) {
        this.listadoFuncionarios.add(funcionario);
        return "Funcionario Ingresado.";
    }

    public String imprimirFuncionarios() {
        String s = "";
        Iterator<Funcionario> iterator = this.listadoFuncionarios.iterator();
        while (iterator.hasNext()) {
            Funcionario funcionario = (Funcionario) iterator.next();
            s += "\n" + funcionario.getInformacion();
        }
        return s;
    }

    public Funcionario buscarFuncionario(String rutFuncionario) {
        Iterator<Funcionario> iterator = this.listadoFuncionarios.iterator();
        while (iterator.hasNext()) {
            Funcionario funcionario = (Funcionario) iterator.next();
            if (funcionario.getRut().equals(rutFuncionario)) {
                return funcionario;
            }
        }
        return null;
    }

    public Programador buscarProgramador(String rutProgramador) {
        Funcionario funcionario = this.buscarFuncionario(rutProgramador);
        if (funcionario instanceof Programador) {
            return (Programador) funcionario;
        }
        return null;
    }

    public Analista buscarAnalista(String rutAnalista) {
        Funcionario funcionario = this.buscarFuncionario(rutAnalista);
        if (funcionario instanceof Analista) {
            return (Analista) funcionario;
        }
        return null;
    }

    public Ingeniero buscarIngeniero(String rutIngeniero) {
        Funcionario funcionario = this.buscarFuncionario(rutIngeniero);
        if (funcionario instanceof Ingeniero) {
            return (Ingeniero) funcionario;
        }
        return null;
    }

}
