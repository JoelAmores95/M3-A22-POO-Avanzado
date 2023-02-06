import java.util.ArrayList;

import Items.Arma;
import Items.Item;
import Items.Pocion;
import Personajes.Guerrero;
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
        ArrayList<Item> equipoMago2 = new ArrayList<Item>();
        equipoMago1.add(anilloDeRubi);
        equipoMago1.add(hidromiel);
        equipoMago1.add(varita);
        
        Mago benalisses = new Mago("Benalisses", 90, 3, 18, equipoMago1, 26, 12);
        Mago pedralba = new Mago("Pedralba", 120, 4, 15, equipoMago2, 21, 9);

        // System.out.println(benalisses.toString());
        // System.out.println(pedralba.toString());

        // Creación Guerreros
        ArrayList<Item> equipoGuerrero1 = new ArrayList<Item>();
        ArrayList<Item> equipoGuerrero2 = new ArrayList<Item>();
        equipoGuerrero1.add(arco);
        equipoGuerrero2.add(espada);
        equipoGuerrero2.add(cofre);

        Guerrero argelaga = new Guerrero("Argelaga", 35, 12, 20, equipoGuerrero1, 120);
        Guerrero matoll = new Guerrero("Matoll",  42, 15, 22, equipoGuerrero2, 112);

        // System.out.println(argelaga.toString());
        // System.out.println(matoll.toString());

        // Ataques
        // Melee
        matoll.atacar(argelaga);
        // Distancia
        argelaga.atacar(matoll);
        // Mágico
        benalisses.atacar(matoll);
    }
}
