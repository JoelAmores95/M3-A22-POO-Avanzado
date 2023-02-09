package Items;

public class Item implements Comparable<Item> {

  // Propiedades
  private String nombre;
  private double peso;
  private int valor;

  // Constructor
  public Item(String nombre, double peso, int valor) {
    this.nombre = nombre;
    this.peso = peso;
    this.valor = valor;
  }

  // Métodos
  public String toString() {
    return "\nNombre: " + getNombre() + "\nPeso: " + getPeso() + "\nValor: " + getValor() + "\n";
  }

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

  @Override
  public int compareTo(Item o) {
    if (this.valor != o.valor) {
      // De mayor a menor
      return Integer.compare(o.valor, this.valor);
    } else if (this.peso != o.peso) {
      // De menor a mayor
      return Double.compare(this.peso, o.peso);
    } else {
      return this.nombre.compareTo(o.nombre);
    }
  }
}
