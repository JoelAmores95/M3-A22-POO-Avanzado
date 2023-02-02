package Items;

public abstract class Item {

  // Propiedades
  private String nombre;
  private double peso;
  private int valor;

  // Constructor
  public Item(String nombre, int peso, int valor) {
    this.nombre = nombre;
    this.peso = peso;
    this.valor = valor;
  }

  // Métodos
  public String getNombre() {
    return nombre;
  }

  public double getPeso() {
    return peso;
  }

  public int getValor() {
    return valor;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }
}
