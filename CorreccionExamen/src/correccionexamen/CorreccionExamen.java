
package correccionexamen;

import java.util.Scanner;

public class CorreccionExamen {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        boolean terminar = false;
        boolean favorito = false;
        int contador = 0;
        Libro[] biblioteca = new Libro[3]; //máx. 10

      
        
        do{
        System.out.println("MENU DE OPCIONES");
        System.out.println("1) Ingresar una colección de libros (máx.10)");
        System.out.println("2) Imprimir favoritos");
        System.out.println("3) Autores");
        System.out.println("4) Salir");
        System.out.print("Escoge una opcion: ");
        int opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                //Ingresar un nuevo libro
                if(contador == biblioteca.length){
                    System.out.println("La biblioteca está llena...");
                    System.out.println("");
                    
                }else{
                    
                    for(int i=0; i<biblioteca.length; i++){
                    biblioteca[i] = new Libro();
                    //autores[i] = new Autor(); 
                    
                     System.out.println("###Libro ["+(i+1)+"]###");
                    
                     System.out.print("¿Titulo del libro?: ");
                     String tituloLibro = entrada.next();
                     biblioteca[i].setTitulo(tituloLibro);

                    Autor[] autores = new Autor[1]; //Un autor x cada libro
                    for(int j=0; j<autores.length; j++){
                       autores[j] = new Autor(); 
                       System.out.print("¿Autor?: ");
                       String nombreAutor = entrada.next();
                       autores[j].setNombre(nombreAutor);

                       System.out.print("¿Pais del autor?: ");
                       String paisAutor = entrada.next();
                       autores[j].setPais(paisAutor);
                    
                    }
                    
                    biblioteca[i].setAutor(autores);
                    
                    System.out.print("¿Año de publicación?: ");
                    int anioLibro = entrada.nextInt();
                    biblioteca[i].setAnioPublicacion(anioLibro);
                    
                    System.out.print("¿Es tu favorito? [S:Si || N:No]: ");
                    char esfavorito = entrada.next().charAt(0);
                    
                        if(esfavorito == 'S'){
                            favorito = true;
                            biblioteca[i].setFavorito(favorito);
                            
                        }
                    
                     System.out.println("");
                     contador++;
                     
                 
                    }
                   
                    
                    }
            
                break;
           case 2:
               if(contador == 0){
                   System.out.println("No has ingresado ningún libro todavía...");
               }else{
                //Imprimri favoritos
               System.out.println("Esta es tu colección de libros favoritos!!");
               for(int i=0; i<biblioteca.length; i++){
                   
                       if(biblioteca[i].isFavorito() == true){
                           System.out.println("Libro "+(i+1)+"...");
                           System.out.println(biblioteca[i]);
                           System.out.println("....................................");
                           
                        }
                    }
                }
                break;
            case 3:
                //Autores ingresados
                boolean salir = false;
                do{
                System.out.println("Lo autores ingresados...");
                for(int i=0; i<biblioteca.length; i++){
                        System.out.println("Autor ["+(i+1)+"]:"+biblioteca[i].getAutor()[0].getNombre());
                  
                }
                System.out.println("");
                System.out.print("¿De qué autor quiere ver la colección?: ");
                int eleccion = entrada.nextInt();
                
                if(eleccion == 1){
                System.out.println("El autor ["+(eleccion)+"] registra los siguientes libros..");
                System.out.println(biblioteca[0]);
                }
                if(eleccion == 2){
                System.out.println("El autor ["+(eleccion)+"] registra los siguientes libros..");
                System.out.println(biblioteca[1]);
                }
                if(eleccion == 3){
                System.out.println("El autor ["+(eleccion)+"] registra los siguientes libros..");
                System.out.println(biblioteca[2]);
                }
                
                System.out.print("¿Deseas volver al menu? [S:Si || N:No]");
                char volver = entrada.next().charAt(0);
                
                //Salir al menu
                if(volver == 'S'){
                    salir = true;
                }
                
                }while(salir != true);
              
                break;
            case 4:
                System.out.println("Ok, adios");
                terminar = true;
                break;
            default:
                System.out.println("Opción no valida...");
                break;
        
      
        }
        
        
        
        }while(terminar != true);
    }
    
}
