
package correccionexamen;


public class Autor {
    
    private String nombre;
    private String pais;
    
    ///********
    
    //******
    
    
    
    
    //******

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
    
    
    //*************++

    @Override
    public String toString() {
        
        return "\n"+"Nombre del Autor: "+ nombre +"\n"+
               "Pais: " + pais;
    }
    
    
    
}
