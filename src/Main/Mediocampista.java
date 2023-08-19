
package Main;


public class Mediocampista extends Jugador{
    
    private int visionesp; 
    private int passingespmedio; 
    private int regateesp;

    public Mediocampista(int visionesp, int passingespmedio, int regateesp, int fisico, int ritmo, int entrada, int edad, int rating, String nombre1, String pie1) {
        this.visionesp = visionesp;
        this.passingespmedio = passingespmedio;
        this.regateesp = regateesp;
    }

    public int getVisionesp() {
        return visionesp;
    }

    public void setVisionesp(int visionesp) {
        this.visionesp = visionesp;
    }

    public int getPassingespmedio() {
        return passingespmedio;
    }

    public void setPassingespmedio(int passingespmedio) {
        this.passingespmedio = passingespmedio;
    }

    public int getRegateesp() {
        return regateesp;
    }

    public void setRegateesp(int regateesp) {
        this.regateesp = regateesp;
    }
           
    
    
    
    
}
