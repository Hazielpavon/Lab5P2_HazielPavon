
package Main;


public class Estadios {
  
    private String nombre; 
    private String ciudad; 
    private int capacidad; 

    public Estadios(String nombre, String ciudad, int capacidad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
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

   
    @Override
    public String toString() {
        return "Estadios: " + " \n Nombre = " + nombre + "\n  Ciudad = " + ciudad + "\n Capacidad = " + capacidad; 
    }
            
           
    
    
    
    
    
    
    
    
}
