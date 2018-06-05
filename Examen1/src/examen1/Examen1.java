
package examen1;

import java.util.Scanner;


public class Examen1 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Libro[] libros = new Libro[10]; //Deben ser hasta 10, y la biblioteca se llena
        Autor[] autores = new Autor[10];
        
        int contador = Libro.contador;
        boolean favorito = false;
        boolean terminar = false;
       
        do{
        //Menu:
        System.out.println("MENU DE OPCIONES");
        System.out.println("1) Ingresar coleccion de libros");
        System.out.println("2) Imprimir favoritos");
        System.out.println("3) Libros del autor...");
        System.out.println("4) Salir");
        System.out.print("Elije una opción: ");
        int opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                if(contador == 2){
                    System.out.println("La biblioteca está llena.");
                    break;
                }else{
                System.out.println("###INFORMACION LIBRO###");
                for(int i=0;  i<libros.length; i++){
                    
                   // Libro librofavorito; //Para almacenar ellibro favorito
                    libros[i] = new Libro();
   
                    System.out.print("Título del libro: ");
                    String tituloLibro = entrada.next();
                    libros[i].setTitulo(tituloLibro);
                    
                    System.out.print("Autor: ");
                    String nombreAutor = entrada.next();
 
                    
                    Autor autor = new Autor();
                    autor.setNombre(nombreAutor);
                    libros[i].setAutor(autor);
                    
                    System.out.print("Año publicacion: ");
                    int anioPublicacion = entrada.nextInt();
                    libros[i].setAnio(anioPublicacion);
 
                    System.out.print("¿Es tu favorito? [S:Si]-[N:No]: ");
                    char esfavorito = entrada.next().charAt(0);
          
                    if(esfavorito == 'S'){
                        favorito = true;
                        libros[i].setFavorito(favorito);
                   
                    
                    }
                    
                    contador++;
                    System.out.println("contador: "+contador);
                    System.out.println("");
                }
                  
             }
                  break;
           
            case 2:
                System.out.println("");
                System.out.println("Lista de favoritos...");
                for(int i=0; i<libros.length; i++){
               
                    System.out.println("Titulo: "+libros[i].getTitulo());
                    System.out.println("Autor: "+libros[i].getAutor());
                    System.out.println("Año_Publicacion: "+libros[i].getAnio());
                    System.out.println("¿Es tu favorito? "+libros[i].isFavorito());
                }
                
                break;
                
            case 3:
                    System.out.println("###INFORMACION AUTORES###");
                    
                    for(int i=0; i<autores.length; i++){
                        System.out.println("Autores Registrados:");
                        System.out.println(libros[i].getAutor());
                        /*
                        do{
                            
                        
                        }while(terminar != true);
                        */
                    }
                    
                break;
                
            case 4:
                    terminar = true;
                break;
               
            default:
                
                break;
                
        
        }
        }while(terminar != true);
        
    }
    
}
