package banco;

import ch.aplu.turtle.Turtle;


/**
 *
 * @author Equipo
 */
public class POO_Figuras {
   private final  Turtle joe;
   
   public POO_Figuras(){
     this.joe =  new Turtle();
    
   }
   
    public void dibujar_cuadrado(){
        
    int ladoc=50;
       int anguloc=90;
        
         for(int i=0;i<4;i++){
         joe.penDown();
      joe.forward(ladoc);joe.right(anguloc);
      joe.penUp();
  
   }   joe.forward(ladoc*2);
    }
    
    public void dibujar_pentagono(){
     
   
       int ladoc=50;
       int anguloc=70;
       
      for(int i=0;i<5;i++){
         joe.penDown();
      joe.forward(ladoc);joe.right(anguloc);
      joe.penUp();
   }
   } 
     public void dibujar_triangulo(){
         
       int ladoc=70;
       int anguloc=120;
     joe.penUp();  
     joe.right(90);
     joe.back(ladoc);
       for(int i=0;i<3;i++){
         joe.penDown();
      joe.back(ladoc);joe.left(anguloc);
      joe.penUp();
   }
       joe.forward(27);
   } 
   
   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       POO_Figuras e = new POO_Figuras();

      e.dibujar_triangulo();
      
      e.dibujar_cuadrado();
      
      e.dibujar_pentagono();

       
    }
}