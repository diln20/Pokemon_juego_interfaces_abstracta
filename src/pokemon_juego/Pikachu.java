/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pokemon_juego;

/**
 *
 * @author dilan
 */
public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    @Override
    public void atacarPlacaje() {
        System.out.println("Pikachu Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Pikachu Araniazo");    
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Pikachu Mordisco");
    }

    @Override
    public void tacarImpactrueno() {
        System.out.println("Pikachu trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu PunioTrueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Pikachu Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Pikachu RayoCarga");
    }
    
}
