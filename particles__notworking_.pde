ArrayList<Snowflake> snowList;



void setup() {

  size(800,800, FX2D);

  rectMode(CENTER);

  

  snowList = new ArrayList<Snowflake>();

  

  int i = 0;

  while (i < 100) {

    snowList.add( new Snowflake() );

    i = i + 1;

  }

  

  

}



void draw() {

  background(0);

  

  int i = 0;

  while (i < 100) {

    Snowflake mySnowflake = snowList.get(i);

    mySnowflake.act();

    mySnowflake.show();

    i = i + 1;

  }  

  

}
