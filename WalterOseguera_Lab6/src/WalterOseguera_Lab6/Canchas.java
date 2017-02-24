package WalterOseguera_Lab6;

public class Canchas extends Lugares {
    private String Categoria;
    private String Estado;

    public Canchas() {
        super();
    }

    public Canchas(String Categoria, String Estado) {
        this.Categoria = Categoria;
        this.Estado = Estado;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}