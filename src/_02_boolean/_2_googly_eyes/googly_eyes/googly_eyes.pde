 PImage face;
void setup() {
    face = loadImage("face.jpg");
     size(800,600);
    face.resize(width,height);
    
}
int x=0;
int y=0;
void draw() {
  background(face);
  if(mousePressed){
      print(mouseX,mouseY);
  }
  fill(#FFFCFC);
      ellipse(347,258,95,85);
    ellipse(477,261,95,85);
   //--------------------------------------------------------------------------------- 
  //----------------------------------------------------------------------------------
    if(mouseX>300 && mouseX<395){
      if(mouseY>211 && mouseY<306){
        x=mouseX;
        y=mouseY;
      }
    }
    fill(#030303);
    ellipse(x ,y,45,40);
    ellipse(x +130,y,45,40);
    
}
