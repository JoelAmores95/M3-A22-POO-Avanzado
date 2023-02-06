package Personajes;

import java.util.ArrayList;
import Items.Item;

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
    public abstract void atacar(Personaje personaje);
    public abstract boolean equipar(Item item);
    public abstract void beber();
    public abstract void mostrarEquipo();

    public String toString(){
        return "Nombre: " + getNombre() + "\nFuerza: "+ getFuerza() + "\nEdad: " + getEdad();
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
