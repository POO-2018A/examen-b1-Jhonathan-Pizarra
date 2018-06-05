
package examen1;


public class Autor {
    
    private String nombre;
    private String pais;
    
    //*Construct
    
    //*Metodo setter y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    //Sobreesritura

    @Override
    public String toString() {
        
        return  nombre; //No ncesito anda mas del autor
               
    }
    
    
}
