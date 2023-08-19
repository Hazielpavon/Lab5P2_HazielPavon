
package Main;


public class Defensa extends Jugador {
    
    private int fisicoesp; 
    private int ritmoesp; 
    private int entradaesp; 

    public Defensa(int fisicoesp, int ritmoesp, int entradaesp) {
        this.fisicoesp = fisicoesp;
        this.ritmoesp = ritmoesp;
        this.entradaesp = entradaesp;
    }

    public Defensa(int fisicoesp, int ritmoesp, int entradaesp, String nombre, int edad, String nacionalidad, String pie, int rating, String equipo, int agarre, int lanzamiento, int fisico, int ritmo, int entrada, int vision, int passing, int regate, int disparo) {
        super(nombre, edad, nacionalidad, pie, rating, equipo, agarre, lanzamiento, fisico, ritmo, entrada, vision, passing, regate, disparo);
        this.fisicoesp = fisicoesp;
        this.ritmoesp = ritmoesp;
        this.entradaesp = entradaesp;
    }
    
    

    public Defensa() {
    }

    public int getFisicoesp() {
        return fisicoesp;
    }

    public void setFisicoesp(int fisicoesp) {
        this.fisicoesp = fisicoesp;
    }

    public int getRitmoesp() {
        return ritmoesp;
    }

    public void setRitmoesp(int ritmoesp) {
        this.ritmoesp = ritmoesp;
    }

    public int getEntradaesp() {
        return entradaesp;
    }

    public void setEntradaesp(int entradaesp) {
        this.entradaesp = entradaesp;
    }
    
    
    
    
}
