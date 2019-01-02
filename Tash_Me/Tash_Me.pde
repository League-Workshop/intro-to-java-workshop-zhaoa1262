  PImage mustache;

PImage friend;



void setup () {  
  
     friend = loadImage("friend.jpg");
   mustache = loadImage("Mustache.png");

size(800, 700);

friend.resize(800,700);

}

void draw () {
 background (friend);
   image(mustache, 400, 300);


  
  
  
}