package Personajes;

import java.util.ArrayList;
import Items.Item;
import Items.Pocion;

public abstract class Personaje implements AccionesPersonaje {

    // Propiedades
    private String nombre;
    private int edad;
    private int fuerza;
    private int puntosVida;
    private ArrayList<Item> equipo;

    // Constructor
    public Personaje(String nombre, int edad, int fuerza, int puntosVida, ArrayList<Item> equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.fuerza = fuerza;
        this.puntosVida = puntosVida;
        this.equipo = equipo;
    }

    // Métodos

    public abstract void atacar(Personaje personaje); // Abstracto, funciona diferente en cada personaje

    public boolean equipar(Item item) {
        boolean hayEspacio = false;
        if (this.getEquipo().size() < 10) {
            hayEspacio = true;
            this.getEquipo().add(item);
        } else {
            hayEspacio = false;
            System.out.println("No hay espacio, no se puede añadir " + item.getNombre());
        }
        return hayEspacio;
    };

    public void beber() {
        boolean itemConsumido = false;
        // Recorrer equipo
        for (int i = 0; i < this.getEquipo().size(); i++) {
            if (this.getEquipo().get(i).getClass().getName().equals(Pocion.class.getName())) {
                // Hay poción -> la quito
                this.getEquipo().remove(i);

                // Modifico la vida del personaje
                Pocion pocion = (Pocion) this.getEquipo().get(i);
                this.puntosVida += pocion.getEfecto();

                // Evito el mensaje de error y salgo del bucle
                itemConsumido = true;
                break;
            }

        }

        if (!itemConsumido) {
            System.out.println("No hay consumibles.");
        }
    };

    public void mostrarEquipo() {
        System.out.println(this.getEquipo().toString());
    };

    public String toString() {
        return "Nombre: " + getNombre() + "\nFuerza: " + getFuerza() + "\nEdad: " + getEdad();
    };

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public ArrayList<Item> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Item> equipo) {
        this.equipo = equipo;
    }

}
