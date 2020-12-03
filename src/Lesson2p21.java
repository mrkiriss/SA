public class Lesson2p21 {
    public static void main(String[] args) {
    Fraction f1=new Fraction(5,7);
    Fraction f2=new Fraction(2,7);
    Fraction res1=f1.subFraction(f2);
    Fraction res2=f1.divideByFraction(f2);
    Fraction res3=f1.multiplyByFraction(f2);
    res1.print();
    res2.print();
    res3.print();
    }
}

class Fraction {
    int numerator;// Числитель
    int denominator = 1;// Знаменатель

    public Fraction(int numerator, int denominator){
        if (denominator == 0){
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction subFraction(Fraction obj){
        Fraction rtrn=  new Fraction(this.numerator * obj.denominator - obj.numerator * this.denominator, this.denominator * obj.denominator);
        rtrn.normalization();
        return rtrn;
    }
    public Fraction divideByFraction(Fraction obj){
        Fraction rtrn=   new Fraction(this.numerator * obj.denominator, obj.numerator * this.denominator);
        rtrn.normalization();
        return rtrn;
    }
    public Fraction multiplyByFraction(Fraction obj){
        Fraction rtrn=  new Fraction(this.numerator * obj.numerator, this.denominator * obj.denominator);
        rtrn.normalization();
        return rtrn;
    }
    public void print(){
        System.out.println(numerator+"/"+denominator);
    }

    private int gcd(int numerator, int denominator){
        while (numerator != 0 && denominator != 0) {
            if (numerator > denominator) {
                numerator %= denominator;
            } else {
                denominator %= numerator;
            }
        }
        return numerator + denominator;
    }
    private void normalization(){
        int n = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= n;
        denominator /= n;
    }
}