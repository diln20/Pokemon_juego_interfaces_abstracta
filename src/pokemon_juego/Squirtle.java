/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pokemon_juego;

/**
 *
 * @author dilan
 */
public class Squirtle extends Pokemon implements IAgua{

    public Squirtle() {
    }

     
    @Override
    public void atacarPlacaje() {
        System.out.println("Squirtle Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Squirtle Araniazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Squirtle Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle Hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle PistolaAgua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Squirtle Hidropulso");
    }
    
}
