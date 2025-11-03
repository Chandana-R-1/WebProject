// Resizable interface
interface Resizable
 {
void resizeWidth(int width);
void resizeHeight(int height);
}
// Rectangle class implementing Resizable
class Rectangle implements Resizable {
private int width;
private int height;
public Rectangle(int width, int height) {
this.width = width;
this.height = height;
}
public int getWidth() {
return width;
}
public int getHeight() {
return height;
}
@Override
public void resizeWidth(int width) {
if (width > 0) {
this.width = width;
System.out.println("Resized width to " + width);
} else {
System.out.println("Invalid width. Width remains unchanged.");
}
}
@Override
public void resizeHeight(int height) {
if (height > 0) {
this.height = height;
System.out.println("Resized height to " + height);
} else {
System.out.println("Invalid height. Height remains unchanged.");
}
}
@Override
public String toString() {
JAVA Laboratory Manual BCS306A
Dept. Of CSE(IoT, CyS & BCT), EWIT Page 42
return "Rectangle (Width: " + width + ", Height: " + height + ")";
}
}
public class ResizeDemo {
public static void main(String[] args) {
Rectangle rectangle = new Rectangle(5, 7);
System.out.println("Original Rectangle: " + rectangle);
// Resize the rectangle
rectangle.resizeWidth(8);
rectangle.resizeHeight(10);
System.out.println("Resized Rectangle: " + rectangle);
}
}