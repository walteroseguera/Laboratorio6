package WalterOseguera_Lab6;

public class Restaurantes extends Lugares {
    private String Categoria;
    private int Calificacion;

    public Restaurantes() {
        super();
    }

    public Restaurantes(String Categoria, int Calificacion) {
        this.Categoria = Categoria;
        this.Calificacion = Calificacion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }
    
}