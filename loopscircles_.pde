size(800,800);
stroke(255);
strokeWeight (3);
background (0);
fill(0);


int x = 0;
int y = 0;


while( y <= 800 ) {
  
int w = 100;
  while (w>0) {
   
    ellipse(x, y, w, w);
    w = w - 20;
  }

  x = x+100;
  if (x > 800) {
    if (x == 900) {
      x = 50;
    } else {
      x =0;
    }
  
    y= y+50;

  }
}
