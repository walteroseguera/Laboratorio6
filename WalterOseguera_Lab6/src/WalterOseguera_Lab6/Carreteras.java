package WalterOseguera_Lab6;

public class Carreteras extends Lugares {
    private int Codigo;
    private double Kilometros;
    private Lugares LugarInicio;
    private Lugares LugarFinal;

    public Carreteras() {
        super();
    }

    public Carreteras(int Codigo, double Kilometros, Lugares LugarInicio, Lugares LugarFinal) {
        this.Codigo = Codigo;
        this.Kilometros = Kilometros;
        this.LugarInicio = LugarInicio;
        this.LugarFinal = LugarFinal;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public double getKilometros() {
        return Kilometros;
    }

    public void setKilometros(double Kilometros) {
        this.Kilometros = Kilometros;
    }
    
}