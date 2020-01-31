class Spike { 

  //instance variables
  float x, y;
  //speed, 
  float size;
  float a = 0;
  float c;

 
  

  //constructor 
  Spike() {
//    c = random(0, 255);
    x = random(0, width);
    y = random(0, height);
    size = random(0, 200);
   // speed =-2;
  }

  //behaviour functions
  void act() {
    c = random(0, 255);
    if (size>0) {
      size = size - 2;
      //size goes smaller for ellipses as they grow up 
      y = y-3;
  //  size = size+speed;
   // if (size> 20) {
     // x = random(0, width);
    //  y = random(0, height);
    //  size = 0;
    }
  }

    void show() { 
      stroke(0);
      fill(c,0,0);
      ellipse(x, y, size, size);
      a = map(size, 0, 200, 255, 0);
    //  stroke(0, a);
    //  y = y - 1;
    //  ellipse(x, y, size, size/2);
    }
  }
