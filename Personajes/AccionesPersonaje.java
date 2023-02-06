package Personajes;

import Items.Item;

public interface AccionesPersonaje {
    
    public boolean equipar(Item item);

    public void atacar(Personaje atacado);

    public void beber();

    public void mostrarEquipo();
}
