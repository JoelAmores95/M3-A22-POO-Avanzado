package Items;

public class Pocion extends Item {

    // Propiedades
    private String descripcion;
    private int efecto;

    // Constructor
    public Pocion(String nombre, int peso, int valor, String descripcion, int efecto) {
        super(nombre, peso, valor);
        this.descripcion = descripcion;
        this.efecto = efecto;
    }

    // Getters y setters

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEfecto() {
        return efecto;
    }

    public void setEfecto(int efecto) {
        this.efecto = efecto;
    }

}
