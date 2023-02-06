package Items;

public class Arma extends Item {

    private int pa;
    private String tipo;

    public Arma(String nombre, double peso, int valor, int pa, String tipo) {
        super(nombre, peso, valor);
        this.pa = pa;
        this.tipo = tipo;
    }

    public int getPA() {
        return pa;
    }

    public void setPA(int pa) {
        this.pa = pa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
