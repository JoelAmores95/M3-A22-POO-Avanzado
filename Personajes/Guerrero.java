package Personajes;

import java.util.ArrayList;

import Items.Item;

public class Guerrero extends Personaje{

    private double pesoMaximo;

    public Guerrero(String nombre, int edad, int fuerza, int puntosVida, ArrayList<Item> equipo, double pesoMaximo) {
        super(nombre, edad, fuerza, puntosVida, equipo);
        
        this.pesoMaximo = pesoMaximo;
    }

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

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
    
}
