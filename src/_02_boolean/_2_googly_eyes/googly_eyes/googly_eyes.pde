 PImage face;
void setup() {
    face = loadImage("face.jpg");
     size(800,600);
    face.resize(width,height);
    
}

void draw() {
  background(face);
  if(mousePressed){
      print(mouseX,mouseY);
  }
      ellipse(347,258,95,85);
    ellipse(477,261,95,85);
}
