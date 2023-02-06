package Personajes;

import java.util.ArrayList;

import Items.Arma;
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
    public void atacar(Personaje atacado) {
        boolean ataca = false;
        for (int i = 0; i < this.getEquipo().size(); i++) {
            // Miro que el item sea un arma
            if (this.getEquipo().get(i).getClass().getName().equals(Arma.class.getName())) {
                Arma arma = (Arma) this.getEquipo().get(i);
                // System.out.println(arma.getTipo());
                System.out.println(
                        this.getNombre() + " causa " + arma.getPA() + " puntos de daño a " + atacado.getNombre());
                ataca = true;
            }
        }
        if (!ataca) {
            System.out.println(this.getNombre() + " causa 0 puntos de daño a " + atacado.getNombre());
        }
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
