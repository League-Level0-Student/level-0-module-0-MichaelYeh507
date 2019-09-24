void draw(){  
fill(#FF0000);
//face
background(#030000);
ellipse(300, 300, 300, 300);

//eyes
fill(#FFFEFC);
ellipse(250, 200, 50, 50);
fill(#FFFEFC);
ellipse(350, 200, 50, 50);

fill(#050400);
ellipse(250, 200, 25, 25);
fill(#050400);
ellipse(350, 200, 25, 25);

fill(#FFB700);
ellipse(300, 275, 50, 50);

if(mousePressed){
  noStroke();
  fill(#030100);
  ellipse(300, 375, 100, 100);
  fill(#FF8103);
ellipse(250, 200, 50, 50);
fill(#FF8103);
ellipse(350, 200, 50, 50);
}
}
void setup(){
  size(600, 600);
}
