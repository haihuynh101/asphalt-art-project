import org.code.neighborhood.*;
public class FlowerPainter extends MuralPainter {



public void paintFlower(){
paintStem();
  paintTop();
  paintInsideTop();


  
}


  public void paintStem(){
  // Moves and  turns right and left to get to the middle 
turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    move();
    move();
    move();
    //paint a line 4 blocks black
    paintLine("black", 4);
    turnLeft();
move();
    //gives our painter paint 
      setPaint(9999); 
    paint("black");
turnRight();
move();
      setPaint(9999);
    paint("black");
    turnLeft();
move();
     setPaint(9999);
    paint("black");
turnRight();
turnLeft();
    move();
    turnRight();
    move();
    paint("black");
turnLeft();
    move();
turnLeft();
    paintLine("black", 3);
turnLeft();
move();
     setPaint(9999);
    
    paint("black");
turnLeft();
    move();
    //starts to paint the inside of the bottom green
    paint("green");
move();
     setPaint(9999);
    
    paint("green");
    turnRight();
    move();
    turnRight();
    move();
    paintLine("green", 1);
     setPaint(9999);
    
    paint("green");
turnLeft();
    
    move();
  
    paint("green");
    turnRight();
    move();
    turnRight();
    //starts painting the stem 
    paintLine("black", 6);
turnLeft();
    move();
turnLeft();
    move();
    paintLine("black", 6);
    turnRight();
    move();
    turnRight();
    move();
     setPaint(9999);

    paint("green");
turnLeft();
    move();
    paint("green");
    paint("black");
    move();
    paint("black");
    turnRight();
    move();
    paint("black");
    turnRight();
    move();
    paintLine("green", 2);
turnLeft();
    move();
turnLeft();
    move();
     setPaint(9999);
    
    paint("black");
    move();
    paint("green");
    
    paintLine("green", 2);
     setPaint(9999);
    


        paint("black");
    turnRight();
    move();
    turnRight();
   
  
  
    
    paintLine("black", 3);
    
  

  
    




    
  }
   


  
  public void  paintTop (){
    //Turns left once and moves forward three times
turnLeft();
    move();
    move();
    move();
    turnRight();
    //paint a black line 4 blocks
    paintLine("black", 4);
    turnLeft();
    move();
         setPaint(9999);

    paint("black");
move();
    turnRight();
 move();
turnLeft();
    paint("black");
move();
    paint("black");
move();
    paint("black");
move();
    turnLeft();
  move();
    paint("black");
    move();
    paint("black");
    move();
    paint("black");
    move();
      turnLeft();
    move();
    paint("black");
    turnRight();
    turnRight();
    move();
      turnLeft();
    move();
         setPaint(9999);
    
    paint("black");
    move();
    paint("black");
    move();
      turnLeft();
    move();
    paintLine("black", 3);
turnLeft();
    move();
         setPaint(9999);
    
    paint("black");



    
    }


  public void  paintInsideTop (){


move();
    //paints the inside of the flower red 4 lines forward
    
    paintLine("red",4);

turnLeft();
    move();
    turnLeft();
    //paints the inside of the flower red 6 lines forward
    
    paintLine("red",6);
    turnRight();
    move();
    turnRight();
    move();
    //paints the inside of the flower red 6 lines forward
    
    paintLine("red",6);
    turnLeft();
    move();
    turnLeft();
    move();
    //paints the inside of the flower red 3 lines forward
  
    paintLine("red",3);
    move();
    //paints the inside of the flower red 2 lines forward
    
    paintLine("red",2);
    
    

  }


}
    
