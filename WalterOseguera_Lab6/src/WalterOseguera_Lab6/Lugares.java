package WalterOseguera_Lab6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lugares {
    private String Nombre;
    private String Direccion;
    private int NivelSeguridad;
    private ArrayList<Carreteras> Entrada = new ArrayList();
    private ArrayList<Carreteras> Salida = new ArrayList();
    private ArrayList TipoLugar = new ArrayList();

    public Lugares() {
    }

    public Lugares(String Nombre, String Direccion, int NivelSeguridad) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.NivelSeguridad = NivelSeguridad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        if (NivelSeguridad >= 0 && NivelSeguridad <= 10) {
            this.Direccion = Direccion;
        } else {
            JOptionPane.showMessageDialog(null, "El nivel de seguridad es de cero a diez.");
        }
    }

    public int getNivelSeguridad() {
        return NivelSeguridad;
    }

    public void setNivelSeguridad(int NivelSeguridad) {
        this.NivelSeguridad = NivelSeguridad;
    }

    public ArrayList<Carreteras> getEntrada() {
        return Entrada;
    }

    public void setEntrada(ArrayList<Carreteras> Entrada) {
        this.Entrada = Entrada;
    }

    public ArrayList<Carreteras> getSalida() {
        return Salida;
    }

    public void setSalida(ArrayList<Carreteras> Salida) {
        this.Salida = Salida;
    }

    public ArrayList getTipoLugar() {
        return TipoLugar;
    }

    public void setTipoLugar(ArrayList TipoLugar) {
        this.TipoLugar = TipoLugar;
    }
    
}