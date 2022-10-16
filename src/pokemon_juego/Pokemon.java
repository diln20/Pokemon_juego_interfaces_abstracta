package pokemon_juego;

/**
 *
 * @author dilan
 */
public abstract class Pokemon {
    protected int num_pokedex;
    protected String nombrePokemon;
    protected int pesoPokemon;
    protected String sexo;
    protected int temporadaqueAparece;
    
    
    public abstract void atacarPlacaje();
    public abstract void atacarAraniazo();
    public abstract void atacarMordisco();
}
