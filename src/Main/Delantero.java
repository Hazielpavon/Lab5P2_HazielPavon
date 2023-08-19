package Main;

public class Delantero extends Jugador {

    private int ritmoespd;
    private int disparoesp;
    private int regateespd;

    public Delantero(int ritmoespd, int disparoesp, int regateespd, int fisico, int entrada, int vision1, int passing1, int edad, int rating, String nombre1, String pie1) {
        this.ritmoespd = ritmoespd;
        this.disparoesp = disparoesp;
        this.regateespd = regateespd;
    }

    public Delantero() {
    }

    public int getRitmoespd() {
        return ritmoespd;
    }

    public void setRitmoespd(int ritmoespd) {
        this.ritmoespd = ritmoespd;
    }

    public int getDisparoesp() {
        return disparoesp;
    }

    public void setDisparoesp(int disparoesp) {
        this.disparoesp = disparoesp;
    }

    public int getRegateespd() {
        return regateespd;
    }

    public void setRegateespd(int regateespd) {
        this.regateespd = regateespd;
    }

}
