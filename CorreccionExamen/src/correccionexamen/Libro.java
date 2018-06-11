
package correccionexamen;

public class Libro {
    
    public static int incrementar = 0;
    private String titulo;
    private Autor[] autor;
    private int anioPublicacion;
    private boolean favorito;
    
    //*********+

    public Libro() {
    incrementar++;
    
    }
    
    
    //*********

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor[] getAutor() {
        return autor;
    }

    public void setAutor(Autor[] autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }
    
    //******* ToString

    @Override
    public String toString() {
        String autores = "";
        for(int i=0; i<autor.length; i++){
            autores += autor[i]+"\n";
        
        }
        
        return "Titulo: " +titulo+"\n" +
               "Autor/es... " +autores+
               "Año Publicacion: " + anioPublicacion+"\n" +
               "¿Favorito?: " + favorito+"\n";
    }
    
    
}
