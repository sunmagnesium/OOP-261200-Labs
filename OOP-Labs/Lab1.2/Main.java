 public class Main {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.speed(1);
      
        for (int i = 0; i < 60; i++) {
             turtle.down();
             turtle.forward(80);
             turtle.backward(80);
             turtle.up();
             turtle.right(6); 
        }
        turtle.down();
        turtle.setDirection(270);
        turtle.forward(300);
        turtle.backward(100);
        turtle.setDirection(45);
        turtle.forward(50);
        
        for(int i=0;i<35;i++){
            turtle.forward(2);
            turtle.left(5);
        }
        turtle.forward(10);
        turtle.setDirection(270);
        turtle.forward(30);
        turtle.setDirection(45);
        turtle.forward(50);

         turtle.setDirection(45);
         turtle.backward(20);

         turtle.setDirection(70);
         turtle.forward(20);
         turtle.backward(20);

         turtle.setDirection(330);
          turtle.forward(25);
         turtle.backward(25);

          turtle.setDirection(45);
         turtle.backward(20);

         turtle.setDirection(70);
         turtle.forward(38);
         turtle.backward(38);

         turtle.setDirection(330);
          turtle.forward(25);
         turtle.backward(25);

          turtle.setDirection(45);
         turtle.backward(20);

       turtle.setDirection(330);
          turtle.forward(25);
         turtle.backward(25);         

    }
}

    

