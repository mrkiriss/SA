import java.util.Locale;

public class Lesson2p22 {
    public static void main(String[] args) {
        Time time = new Time(3600);
        System.out.println(time);
    }
}

class Vector2D{
    public double vX;
    public double vY;
    static int count=0;

    Vector2D(){
        vX=1;
        vY=1;
        count++;
    }
    Vector2D(double vX, double vY){
        this.vX=vX;
        this.vY=vY;
        count++;
    }
    Vector2D(Vector2D v){
        this.vX=v.vX;
        this.vY=v.vY;
        count++;
    }

    double length(){
        return Math.pow(vX*vX+vY*vY,0.5);
    }
    void add(Vector2D v){
        this.vX+=v.vX;
        this.vY+=v.vY;
    }
    void sub(Vector2D v){
        this.vX-=v.vX;
        this.vY-=v.vY;
    }
    void scale(double scaleFactor){
        this.vX*=scaleFactor;
        this.vY*=scaleFactor;
    }
    void normalized(){
        double length=length();
        this.vX/=length;
        this.vY/=length;
    }
    double dotProduct(Vector2D v){
        return (this.vX*v.vX+this.vY*v.vY);
    }
    void print(){
        System.out.println('('+String.format(Locale.US, "%.2f", vX)+", "+String.format(Locale.US, "%.2f", vY)+')');
    }
}

class Time {
    int hour, min, sec;

    Time (int sec){
        this.hour=sec/3600;
        this.min=(sec/60)%60;
        this.sec=sec%60;
    }

    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}