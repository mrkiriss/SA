public class Lesson2p62 {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 1);
        Rectangle rectangle = new Rectangle(10, 10, 1, 1);
        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        circle.resize(2);
        rectangle.resize(2);
        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
        circle.move(2,3);
        rectangle.move(2,3);
        System.out.println(circle);
        System.out.println();
        System.out.println(rectangle);
    }
}
abstract class Figure{
    float x,y;
    Figure(float x, float y){
        this.x=x;
        this.y=y;
    }
    abstract float getArea();
    abstract float getPerimeter();

}

interface Moveable{
    void move(float dx, float dy);
    void resize(float koeff);
}

class Rectangle extends Figure implements Moveable{
    float height, width, size=1;

    Rectangle(float x, float y, float height, float width){
        super(x,y);
        this.height=height;
        this.width=width;
    }

    float getArea(){
        return height*width;
    }
    float getPerimeter(){
        return 2*(height+width);
    }
    public void move(float dx, float dy){
        x+=dx;
        y+=dy;
    }
    public void resize(float koeff){
        size=koeff;
        height*=size;
        width*=size;
    }
    public String toString(){
        return ("Rectangle\nCenter: ("+String.valueOf(x+0.5*size)+", "+String.valueOf(y+0.5*size)+")\nHeight: "+String.valueOf(height)+"\nWidth: "+String.valueOf(width));
    }
}
class Circle extends Figure{
    float radius;

    Circle(float x, float y, float radius){
        super(x,y);
        this.radius=radius;
    }

    float getArea(){
        return (float) (3.1415927*radius*radius);
    }
    float getPerimeter(){
        return (float) (2*3.1415927*radius);
    }
    public void move(float dx, float dy){
        x+=dx;
        y+=dy;
    }
    public void resize(float koeff){
        radius*=koeff;
    }
    public String toString(){
        return ("Circle\nCenter: ("+String.valueOf(x)+", "+String.valueOf(y)+") \nRadius: "+String.valueOf(radius));
    }
}