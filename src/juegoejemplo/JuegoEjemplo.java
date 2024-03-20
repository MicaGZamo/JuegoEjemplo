
package juegoejemplo;


public class JuegoEjemplo {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        Auto ford = new Auto("rojo", 10,5);
        Escena escena1=new Escena(ford);
        
        Auto chevrolet = new Auto("verde",20,3);
        Escena escena2 = new Escena(chevrolet);
        
                      
        System.out.println("--------- COMIENZA EL JUEGO ---------");
        escena1.jugar();
      
        System.out.println("bye");
       
        
        
    }
    
}
