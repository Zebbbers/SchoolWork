public class SquarePyramid implements Shape3D {
 private double length;
 private double height;
 public SquarePyramid() {
 length = 0;
 height = 0;
 }
 public SquarePyramid(double l, double h){}
 public double getLength() { ... }
 public double getHeight() { ... }
 public double getArea() {
 return length * (length + Math.sqrt(length * length + 4 * height * height));
 }
 public double getVolume() {
 return length * length * height / 3.0;
 }
 public String toString() { ... }
 public boolean equals(Object obj) { ... }
} 