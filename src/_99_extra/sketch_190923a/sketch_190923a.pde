void draw(){  
fill(#FF0000);
background(#030000);
ellipse(300, 300, 300, 300);
fill(#79380F);
rect(275, 100, 50, 50);

if(mousePressed){
  noStroke();
  fill(#030100);
  ellipse(150, 300, 100, 100);
}
}
void setup(){
  size(600, 600);
}
