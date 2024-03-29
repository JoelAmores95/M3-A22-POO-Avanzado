package Personajes;

import java.util.ArrayList;

import Items.Arma;
import Items.Item;

public class Guerrero extends Personaje {

    // Propiedades
    private double pesoMaximo;

    // Constructor
    public Guerrero(String nombre, int edad, int fuerza, int puntosVida, ArrayList<Item> equipo, double pesoMaximo) {
        super(nombre, edad, fuerza, puntosVida, equipo);

        this.pesoMaximo = pesoMaximo;
    }

    // Métodos

    @Override
    public void atacar(Personaje atacado) {
        boolean ataca = false;
        // Recorro el equipo
        for (int i = 0; i < this.getEquipo().size(); i++) {
            // Miro que el item sea un arma
            if (this.getEquipo().get(i).getClass().getName().equals(Arma.class.getName())) {
                // Hay un arma
                Arma arma = (Arma) this.getEquipo().get(i);
                // Miro el tipo
                String tipoArma = arma.getTipo();
                String mensaje;
                switch(tipoArma){
                    case "Melee" :
                    mensaje = "¡¡" + this.getNombre() + " causa " + (arma.getPA() + 1) + " puntos de daño a "+ atacado.getNombre() + "!!";
                    break;
                    case "Distancia" :
                    mensaje = "¡" + this.getNombre() + " causa " + arma.getPA() + " puntos de daño a "+ atacado.getNombre() + "!";
                    break;
                    default:
                    mensaje = this.getNombre() + " causa 1 punto de daño a "+ atacado.getNombre() + "...";
                    break;
                }
                ataca = true;
                System.out.println(mensaje);
            }
        }
        if (!ataca) {
            System.out.println(this.getNombre() + " causa 1 punto de daño a "+ atacado.getNombre() + "...");
        }
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

}
