import java.util.ArrayList;

import Items.Arma;
import Items.Item;
import Items.Pocion;
import Personajes.Mago;

public class Programa {
    public static void main(String[]args) {

        // Creación de Items
        Item cofre = new Item("Cofre", 3.1, 5000);
        Item anilloDeRubi = new Item("Anillo de Rubí", 0.02, 2300);

        // System.out.println(cofre.toString());
        // System.out.println(anilloDeRubi.toString());

        // Creación de Armas
        Item espada = new Arma("Espada Larga", 3.1, 5000, 6, "Melee");
        Item varita = new Arma("Varita mágica", 0.125, 3200, 3, "Mágico");
        Item arco = new Arma("Arco de Marfil", 1, 2800, 2, "Distancia");

        // System.out.println(espada.toString());
        // System.out.println(varita.toString());
        // System.out.println(arco.toString());

        // Creación de Pociones
        Item hidromiel = new Pocion("Hidromiel", 0.2, 200, "Poción de vida", 2);
        Item veneno = new Pocion("Veneno de escorpión", 0.125, 3200, "Es veneno, malo", -1);

        // System.out.println(hidromiel.toString());
        // System.out.println(veneno.toString());

        // Creación Magos
        ArrayList<Item> equipoMago1 = new ArrayList<Item>();
        equipoMago1.add(anilloDeRubi);
        equipoMago1.add(hidromiel);
        ArrayList<Item> equipoMago2 = new ArrayList<Item>();

        Mago benalisses = new Mago("Benalisses", 90, 3, 18, equipoMago1, 26, 12);
        Mago pedralba = new Mago("Pedralba", 120, 4, 15, equipoMago2, 21, 9);

        System.out.println(benalisses.toString());
        System.out.println(pedralba.toString());
    }
}
