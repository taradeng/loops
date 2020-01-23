int x = 0;

size(800,800);
translate(400, 400);

colorMode(HSB);

int h = 0;
stroke(0);
strokeWeight(1);

int i = 0;
while (i<10000) {
  fill(h, 255, 255, 127);
  ellipse(x, 0, 100, 100);
  rotate(radians(2));
  i=i+1;
  x= x+1;
  
}
