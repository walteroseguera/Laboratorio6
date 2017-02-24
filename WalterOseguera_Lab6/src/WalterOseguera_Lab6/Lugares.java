package WalterOseguera_Lab6;

import javax.swing.JOptionPane;

public class Lugares {
    private String Nombre;
    private String Direccion;
    private int NivelSeguridad;
    private Carreteras Entrada;
    private Carreteras Salida;
    private String TipoLugar;

    public Lugares() {
    }

    public Lugares(String Nombre, String Direccion, int NivelSeguridad, Carreteras Entrada, Carreteras Salida, String TipoLugar) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.NivelSeguridad = NivelSeguridad;
        this.Entrada = Entrada;
        this.Salida = Salida;
        this.TipoLugar = TipoLugar;
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

    public Carreteras getEntrada() {
        return Entrada;
    }

    public void setEntrada(Carreteras Entrada) {
        this.Entrada = Entrada;
    }

    public Carreteras getSalida() {
        return Salida;
    }

    public void setSalida(Carreteras Salida) {
        this.Salida = Salida;
    }

    public String getTipoLugar() {
        return TipoLugar;
    }

    public void setTipoLugar(String TipoLugar) {
        this.TipoLugar = TipoLugar;
    }

    @Override
    public String toString() {
        return TipoLugar;
    }
    
}