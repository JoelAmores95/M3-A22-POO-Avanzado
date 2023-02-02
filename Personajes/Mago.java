package Personajes;

import java.util.ArrayList;

import Items.Item;

public class Mago extends Personaje {

    // Propiedades
    private int puntosMagia;
    private int conocimiento;

    // Constructor
    public Mago(String nombre, int edad, int fuerza, int puntosVida, ArrayList<Item> equipo, int puntosMagia,
            int conocimiento) {

        super(nombre, edad, fuerza, puntosVida, equipo);
        this.puntosMagia = puntosMagia;
        this.conocimiento = conocimiento;
    }

    // Métodos
    @Override
    public void atacar(Personaje personaje) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean equipar(Item item) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void beber() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mostrarEquipo() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }

    // Getters y Setters
    public int getPuntosMagia() {
        return puntosMagia;
    }

    public void setPuntosMagia(int puntosMagia) {
        this.puntosMagia = puntosMagia;
    }

    public int getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(int conocimiento) {
        this.conocimiento = conocimiento;
    }
}
