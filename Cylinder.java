public class Cylinder extends CircularShapeWithHeight {
 public Cylinder(){
   super();
 }
 public Cylinder(double r, double h){
   super(r, h);
 }
 
 public double getArea(){
  return getCrossSectionPerimeter() * getHeight() + 2 * getCrossSectionArea();
 }
 
 public double getVolume(){
  return getCrossSectionArea() * getHeight();
 }
 
 public String toString(){
  return "This is a Cylinder, the area is: " + getArea() + " the volume is: " + getVolume();
 }
 
 public boolean equals(Object obj) {
        if (!(obj instanceof CircularCone)){
    return false;
        }
        CircularCone cc = (CircularCone) obj;
    return getRadius() == cc.getRadius() && getHeight() ==cc.getHeight();

    }
}