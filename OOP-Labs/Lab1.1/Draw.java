public class Draw {
  
    public static void main(String[] args) {
        Turtle turtle = new Turtle();

        //rectangle
        for (int i = 0; i < 4; i++) {
            turtle.forward(100);
            turtle.left(90);
        }

         turtle.up();
         turtle.forward(200); 
         turtle.down();

       //triangle
        for (int i = 0; i < 3; i++) {
            turtle.forward(100);
            turtle.left(120);
        }

         turtle.up();
         turtle.forward(200);
         turtle.down();
       
       //circle
        for (int i = 0; i < 360; i++) {
             turtle.forward(1);
             turtle.left(1);
        }

    }
}

     

   
