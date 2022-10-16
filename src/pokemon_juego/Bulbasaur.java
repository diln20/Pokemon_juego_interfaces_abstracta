/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon_juego;

/**
 *
 * @author dilan
 */
public class Bulbasaur extends Pokemon  implements IPlanta{

    public Bulbasaur() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println(" Bulbasaur placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Bulbasaur araniazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Bulbasaur Mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur  Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur  Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulbasaur HojaAfilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasaur LatigoCepa");
    }
    
}
