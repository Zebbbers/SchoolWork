public class RectangularPrism implements Shape3D {
 private double length;
 private double width;
 private double height;
 public RectangularPrism(){
   length = 0;
   width = 0;
   height = 0;
 }
 public RectangularPrism(double l, double w, double h){
   length = l;
   width = w;
   height = h;
 }
 
 public double getLength(){
 
 }
 
 public double getWidth() {
 
 }
 
 public double getHeight() {
 
 }
 
 public double getArea() {
 return 2 * (length * width + width * height + length * height);
 }
 public double getVolume() {
 return length * width * height;
 }
 public String toString() { ... }
 public boolean equals(Object obj) { ... }
}