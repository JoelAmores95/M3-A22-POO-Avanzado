import java.util.ArrayList;
import java.util.Collections;

import Items.Arma;
import Items.Item;
import Items.Pocion;
import Personajes.Guerrero;
import Personajes.Mago;

public class Programa {

    public final static String ARMA_MELEE = "Melee";
    public final static String ARMA_MAGIA = "Mágica";
    public final static String ARMA_DISTANCIA = "Distancia";

    public static void main(String[] args) {

        // Creación de Items
        Item cofre = new Item("Cofre", 3.1, 5000);
        Item anilloDeRubi = new Item("Anillo de Rubí", 0.02, 2300);

        // Mostrar objectos
        System.out.println("\n-------Objetos-------\n");
        System.out.println(cofre.toString());
        System.out.println("---------------------");
        System.out.println(anilloDeRubi.toString());

        // Creación de Armas
        Item espada = new Arma("Espada Larga", 3.1, 5000, 6, ARMA_MELEE);
        Item varita = new Arma("Varita mágica", 0.125, 3200, 3, ARMA_MAGIA);
        Item arco = new Arma("Arco de Marfil", 1, 2800, 2, ARMA_DISTANCIA);

        System.out.println("\n-------Armas-------\n");
        System.out.println(espada.toString());
        System.out.println("---------------------");
        System.out.println(varita.toString());
        System.out.println("---------------------");
        System.out.println(arco.toString());

        // Creación de Pociones
        Item hidromiel = new Pocion("Hidromiel", 0.2, 200, "Poción de vida", 2);
        Item veneno = new Pocion("Veneno de escorpión", 0.125, 3200, "Es veneno, malo", -1);
        Item veneno2 = new Pocion("Veneno de escorpión +", 0.125, 4200, "Es veneno, peor", -2);
        Item veneno3 = new Pocion("Veneno de escorpión ++", 0.150, 4200, "Es veneno, aun peor", -3);
        Item hidromiel2 = new Pocion("Super Hidromiel", 0.15, 4200, "Poción de vida fuerte", 20);

        System.out.println("\n-------Pociones-------\n");
        System.out.println(hidromiel.toString());
        System.out.println("---------------------");
        System.out.println(veneno.toString());

        // Creación Magos
        ArrayList<Item> equipoMago1 = new ArrayList<Item>();
        ArrayList<Item> equipoMago2 = new ArrayList<Item>();
        equipoMago1.add(anilloDeRubi);
        equipoMago1.add(hidromiel);
        equipoMago1.add(varita);

        Mago benalisses = new Mago("Benalisses", 90, 3, 18, equipoMago1, 26, 12);
        Mago pedralba = new Mago("Pedralba", 120, 4, 15, equipoMago2, 21, 9);

        System.out.println("\n-------Magos-------\n");
        System.out.println(benalisses.toString());
        System.out.println("---------------------");
        System.out.println(pedralba.toString());

        // Creación Guerreros
        ArrayList<Item> equipoGuerrero1 = new ArrayList<Item>();
        ArrayList<Item> equipoGuerrero2 = new ArrayList<Item>();
        ArrayList<Item> equipoGuerrero3 = new ArrayList<Item>();
        equipoGuerrero1.add(arco);
        equipoGuerrero2.add(espada);
        equipoGuerrero2.add(cofre);
        // Para el test
        equipoGuerrero3.add(veneno);
        equipoGuerrero3.add(veneno);
        equipoGuerrero3.add(veneno2);
        equipoGuerrero3.add(veneno3);
        equipoGuerrero3.add(varita);
        equipoGuerrero3.add(hidromiel2);

        Guerrero argelaga = new Guerrero("Argelaga", 35, 12, 20, equipoGuerrero1, 120);
        Guerrero matoll = new Guerrero("Matoll", 42, 15, 22, equipoGuerrero2, 112);
        Guerrero ceboVeneno = new Guerrero("Cebo Veneno", 60, 20, 300, equipoGuerrero3, 70);

        System.out.println("\n-------Guerreros-------\n");
        System.out.println(argelaga.toString());
        System.out.println("---------------------");
        System.out.println(matoll.toString());
        System.out.println("---------------------");
        System.out.println(ceboVeneno.toString());

        // Ataques
        System.out.println("\n-------Atacar-------\n");
        // Melee
        System.out.println("\n-------Guerrero Melee-------\n");
        matoll.atacar(argelaga);
        System.out.println("---------------------");
        // Distancia
        System.out.println("\n-------Guerrero Distancia-------\n");
        argelaga.atacar(matoll);
        System.out.println("---------------------");
        // Mágico
        System.out.println("\n-------Mago con Varita-------\n");
        benalisses.atacar(matoll);
        System.out.println("---------------------");
        // Guerrero sin arma
        System.out.println("\n-------Guerrero sin arma-------\n");
        ceboVeneno.atacar(pedralba);
        System.out.println("---------------------");
        // Mago sin arma
        System.out.println("\n-------Mago sin arma-------\n");
        pedralba.atacar(ceboVeneno);

        // Beber
        
        System.out.println("\n-------Inventario Incial Poción-------\n");
        ceboVeneno.mostrarEquipo();

        System.out.println("\n-------Consumir Poción-------\n");
        System.out.println("PV iniciales: " + ceboVeneno.getPuntosVida());
        ceboVeneno.beber();
        System.out.println("PV finales: " + ceboVeneno.getPuntosVida());
        
        System.out.println("\n-------Inventario Final Poción-------\n");
        ceboVeneno.mostrarEquipo();
       

        // Saturar el equipo
        System.out.println("\n-------Saturar de veneno-------\n");
        for (int i = 0; i < matoll.getEquipo().size() - 1; i++) {
            matoll.equipar(veneno);
        }
        matoll.mostrarEquipo();

        // Ordenar equipo
        System.out.println("\n-------Ordenar Equipo-------\n");
        ceboVeneno.mostrarEquipo();

        System.out.println("\n-------Ordenado-------\n");
        Collections.sort(ceboVeneno.getEquipo());
        ceboVeneno.mostrarEquipo();

    }
}
