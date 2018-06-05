
package examen1;


public class Libro {
    
    public static int contador =0;
    private String titulo;
    private Autor autor;
    private int anio;
    private boolean favorito;
    private Autor[] autores;
    
    //*Constructor

    public Libro() {
        contador++;
    }
    
    
    
    //*Metodos Setter y Getter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
    
    //Reescritura de metodo:

    @Override
    public String toString() {
        
       
        return "Titulo:" + titulo +"\n"+
               "Autor: " + autor +"\n"+
               "Año_Pulicacion:" + anio +"\n"+
               "¿Favorito?:" + favorito +"\n";
    }
    
    //*****

    public Autor[] getAutores() {
        return autores;
    }

    public void setAutores(Autor[] autores) {
        this.autores = autores;
    }
    
}
