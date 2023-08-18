
package Main;


public class Estadios {
  
    private String nombre; 
    private String ciudad; 
    private int capacidad; 
    private String equipo; 

    public Estadios(String nombre, String ciudad, int capacidad, String equipo) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.equipo = equipo;
    }

    public Estadios() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Estadios: " + " \n Nombre = " + nombre + "\n  Ciudad = " + ciudad + "\n Capacidad = " + capacidad + "\n Equipo = " + equipo;
    }
            
           
    
    
    
    
    
    
    
    
}
