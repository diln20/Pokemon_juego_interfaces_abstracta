
package pokemon_juego;

/**
 *
 * @author dilan
 */
public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    
    @Override
    public void atacarPlacaje() {
        System.out.println("Chamander Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println(" Chamander Araniazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Chamander Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Chamander PunioFuego ");    }

    @Override
    public void atacarAscuas() {
        System.out.println("Chamander Ascuas " );
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Chamander Lanzallamas");    
    }
    
}
