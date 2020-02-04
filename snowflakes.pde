

class Snowflake {

  

  //1. Instance variables: the data that each snowflake

  //                       needs to keep track of.

  float X, Y, size, speed, vx, vy;

  

  //2. Constructor(s): initializes the instance variables.

  //   Rules: no return type (void), name matches class

  Snowflake() {

    X = mouseX;

    Y = mouseY;

    vx = random(-10,10);

    vy = random (-10, 10);
    
    

  }

  

  //3. Behaviour Functions: functions that describe how

  //                        Snowflakes act and look.

  void act() {
      
      X = X + vx;
      Y = Y + vy;
      
      if (X < 0 || X > width || Y < 0 || Y > height) {
        X = mouseX;
        Y= mouseY;
      }

    

  }

  

  void show() {

    rect(X, Y, size, size);

  }



}
