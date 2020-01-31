ArrayList<Spike> mySpikes;

void setup() {
  size(800, 800);
  noFill();
  
  mySpikes = new ArrayList<Spike>();
  
  int i = 0;
  while (i< 100) {
    mySpikes.add(new Spike() );
    i = i +1;
  }
  background(255);
}


void draw() {
  //no background: white fading circles
 // background(255);
  
  int i = 0;
  while (i < 100) {
    Spike sp = mySpikes.get(i);
    sp.act();
    sp.show();
    i=i+1;
    
  
}
}
