/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author hapav
 */
public class Portero extends Jugador {

    private int agarreesp;
    private int lanzamientoesp;
    private int passingesp;

    public Portero(int agarreesp, int lanzamientoesp, int passingesp, int edadPortero, int rating, String nombre1, int agarre, int lanzamiento, int fisico, int ritmo, int entrada) {
        this.agarreesp = agarreesp;
        this.lanzamientoesp = lanzamientoesp;
        this.passingesp = passingesp;
    }

    public Portero() {
    }

    public int getAgarreesp() {
        return agarreesp;
    }

    public void setAgarreesp(int agarreesp) {
        this.agarreesp = agarreesp;
    }

    public int getLanzamientoesp() {
        return lanzamientoesp;
    }

    public void setLanzamientoesp(int lanzamientoesp) {
        this.lanzamientoesp = lanzamientoesp;
    }

    public int getPassingesp() {
        return passingesp;
    }

    public void setPassingesp(int passingesp) {
        this.passingesp = passingesp;
    }

}
